/*
 * Copyright (c) G42 Technologies Co., Ltd. 2021-2021. All rights reserved.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.g42cloud.sdk.core.internal;

import com.g42cloud.sdk.core.Constants;
import com.g42cloud.sdk.core.exception.ClientRequestException;
import com.g42cloud.sdk.core.exception.SdkErrorMessage;
import com.g42cloud.sdk.core.exception.SdkException;
import com.g42cloud.sdk.core.exception.ServiceResponseException;
import com.g42cloud.sdk.core.http.HttpClient;
import com.g42cloud.sdk.core.http.HttpMethod;
import com.g42cloud.sdk.core.http.HttpRequest;
import com.g42cloud.sdk.core.http.HttpResponse;
import com.g42cloud.sdk.core.internal.model.CreateTemporaryAccessKeyInEcsResponse;
import com.g42cloud.sdk.core.internal.model.CreateTokenWithIdTokenResponse;
import com.g42cloud.sdk.core.internal.model.Credential;
import com.g42cloud.sdk.core.internal.model.GetIdTokenAuthParams;
import com.g42cloud.sdk.core.internal.model.GetIdTokenIdScopeBody;
import com.g42cloud.sdk.core.internal.model.GetIdTokenIdTokenBody;
import com.g42cloud.sdk.core.internal.model.GetIdTokenRequestBody;
import com.g42cloud.sdk.core.internal.model.GetIdTokenScopeDomainOrProjectBody;
import com.g42cloud.sdk.core.utils.ExceptionUtils;
import com.g42cloud.sdk.core.utils.JsonUtils;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class Iam {
    public static final String EXPIRED_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    private static final String SECURITY_KEY_URL = "http://169.254.169.254/openstack/latest/securitykey";

    private static final String CREATE_TOKEN_WITH_ID_TOKEN_URI = "/v3.0/OS-AUTH/id-token/tokens";



    public static Credential getCredentialFromMetadata() {
        OkHttpClient client = new OkHttpClient.Builder().connectTimeout(3, TimeUnit.SECONDS).build();
        Request request = new Request.Builder().url(SECURITY_KEY_URL).get().build();
        Response response = null;
        String body = null;
        int statusCode;
        try {
            response = client.newCall(request).execute();
            statusCode = response.code();
            if (Objects.nonNull(response.body())) {
                body = response.body().string();
            }
        } catch (IOException e) {
            throw new SdkException(e);
        } finally {
            if (response != null && response.body() != null) {
                response.body().close();
            }
        }
        if (statusCode >= 400) {
            throw new ClientRequestException(statusCode, new SdkErrorMessage(String.valueOf(statusCode), body));
        }
        CreateTemporaryAccessKeyInEcsResponse resp =
                JsonUtils.toObject(body, CreateTemporaryAccessKeyInEcsResponse.class);

        if (Objects.isNull(resp) || Objects.isNull(resp.getCredential())) {
            throw new SdkException("failed to get credentials in metadata");
        }

        return resp.getCredential();
    }

    private static GetIdTokenRequestBody getCreateTokenWithIdTokenRequestBody(
            String idToken, GetIdTokenIdScopeBody scope) {
        GetIdTokenIdTokenBody idTokenBody = new GetIdTokenIdTokenBody().withId(idToken);
        GetIdTokenAuthParams idTokenAuthParams = new GetIdTokenAuthParams().withIdToken(idTokenBody).withScope(scope);
        return new GetIdTokenRequestBody().withAuth(idTokenAuthParams);
    }

    private static HttpRequest getCreateTokenWithIdTokenRequest(
            String iamEndpoint, String idpId, GetIdTokenRequestBody body) {
        HttpRequest.HttpRequestBuilder builder =
                HttpRequest.newBuilder()
                        .withEndpoint(iamEndpoint)
                        .withContentType(Constants.MEDIATYPE.APPLICATION_JSON_UTF8)
                        .withMethod(HttpMethod.POST)
                        .withPath(CREATE_TOKEN_WITH_ID_TOKEN_URI)
                        .withBodyAsString(JsonUtils.toJSON(body));
        builder.addHeader(Constants.X_IDP_ID, idpId);

        return builder.build();
    }

    public static HttpRequest getProjectTokenWithIdTokenRequest(
            String iamEndpoint, String idpId, String idToken, String projectId) {
        GetIdTokenScopeDomainOrProjectBody project = new GetIdTokenScopeDomainOrProjectBody().withId(projectId);
        GetIdTokenIdScopeBody scopeBody = new GetIdTokenIdScopeBody().withProject(project);
        GetIdTokenRequestBody body = getCreateTokenWithIdTokenRequestBody(idToken, scopeBody);
        return getCreateTokenWithIdTokenRequest(iamEndpoint, idpId, body);
    }

    public static HttpRequest getDomainTokenWithIdTokenRequest(
            String iamEndpoint, String idpId, String idToken, String domainId) {
        GetIdTokenScopeDomainOrProjectBody domain = new GetIdTokenScopeDomainOrProjectBody().withId(domainId);
        GetIdTokenIdScopeBody scopeBody = new GetIdTokenIdScopeBody().withDomain(domain);
        GetIdTokenRequestBody body = getCreateTokenWithIdTokenRequestBody(idToken, scopeBody);
        return getCreateTokenWithIdTokenRequest(iamEndpoint, idpId, body);
    }

    public static CreateTokenWithIdTokenResponse createTokenWithIdToken(HttpClient client, HttpRequest request) {
        HttpResponse httpResponse = client.syncInvokeHttp(request);
        if (httpResponse.getStatusCode() >= 400) {
            throw ServiceResponseException.mapException(
                    httpResponse.getStatusCode(), ExceptionUtils.extractErrorMessage(httpResponse));
        }

        CreateTokenWithIdTokenResponse response =
                JsonUtils.toObject(httpResponse.getBodyAsString(), CreateTokenWithIdTokenResponse.class);
        if (Objects.isNull(response)) {
            throw new SdkException("failed to get token with idpId and idToken");
        }
        response.setHttpStatusCode(httpResponse.getStatusCode());

        String token = httpResponse.getHeader(Constants.X_SUBJECT_TOKEN);
        if (Objects.isNull(token)) {
            throw new SdkException("failed to get X-Subject-Token");
        }
        response.setSubjectToken(token);

        if (Objects.isNull(response.getToken()) || Objects.isNull(response.getToken().getExpiresAt())) {
            throw new SdkException("failed to get expired time");
        }

        return response;
    }
}
