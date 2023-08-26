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

package com.g42cloud.sdk.core.auth;

import com.g42cloud.sdk.core.Constants;
import com.g42cloud.sdk.core.HcClient;
import com.g42cloud.sdk.core.exception.SdkException;
import com.g42cloud.sdk.core.http.HttpClient;
import com.g42cloud.sdk.core.http.HttpRequest;
import com.g42cloud.sdk.core.internal.Iam;
import com.g42cloud.sdk.core.internal.InnerIamMeta;
import com.g42cloud.sdk.core.internal.model.CreateTokenWithIdTokenResponse;
import com.g42cloud.sdk.core.internal.model.KeystoneCreateProjectRequest;
import com.g42cloud.sdk.core.internal.model.KeystoneCreateProjectResponse;
import com.g42cloud.sdk.core.internal.model.KeystoneListAuthDomainsRequest;
import com.g42cloud.sdk.core.internal.model.KeystoneListAuthDomainsResponse;
import com.g42cloud.sdk.core.internal.model.KeystoneListProjectsRequest;
import com.g42cloud.sdk.core.internal.model.KeystoneListProjectsResponse;
import com.g42cloud.sdk.core.internal.model.KeystoneListRegionsRequest;
import com.g42cloud.sdk.core.internal.model.KeystoneListRegionsResponse;
import com.g42cloud.sdk.core.utils.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author G42Cloud_SDK
 */
public class BasicCredentials extends AbstractCredentials<BasicCredentials> {

    private String projectId;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * @param projectId id of project showed in console
     * @return BasicCredentials
     */
    public BasicCredentials withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    Map<String, Object> getPathParams() {
        Map<String, Object> pathParam = new LinkedHashMap<>();
        if (Objects.nonNull(projectId)) {
            pathParam.put(Constants.PROJECT_ID, projectId);
        }
        return pathParam;
    }

    @Override
    public CompletableFuture<ICredential> processAuthParams(HcClient hcClient, String regionId) {
        return CompletableFuture.supplyAsync(() -> {
            if (!StringUtils.isEmpty(getIdpId()) || !StringUtils.isEmpty(getIdTokenFile())) {
                if (StringUtils.isEmpty(getIdpId())) {
                    throw new SdkException("idpId is required when using idpId&idTokenFile");
                } else if (StringUtils.isEmpty(getIdTokenFile())) {
                    throw new SdkException("idTokenFile is required when using idpId&idTokenFile");
                }
                if (StringUtils.isEmpty(projectId)) {
                    throw new SdkException("projectId is required when using idpId&idTokenFile");
                }
            }

            if (!StringUtils.isEmpty(projectId)) {
                return this;
            }

            // Confirm if current ak has been cached in AuthCache, key of authMap is ak+regionId
            String akWithName = getAk() + regionId;
            if (Objects.nonNull(AuthCache.getAuth(akWithName))
                    && !StringUtils.isEmpty(AuthCache.getAuth(akWithName))) {
                projectId = AuthCache.getAuth(akWithName);
                return this;
            }

            String iamEndpoint = StringUtils.isEmpty(getIamEndpoint()) ? getDefaultIamEndpoint() : getIamEndpoint();
            HcClient inner = hcClient.overrideEndpoints(Collections.singletonList(iamEndpoint));

            Function<HttpRequest, Boolean> derivedPredicate = getDerivedPredicate();
            setDerivedPredicate(null);

            KeystoneListProjectsRequest request = new KeystoneListProjectsRequest().withName(regionId);
            KeystoneListProjectsResponse response = inner.syncInvokeHttp(request, InnerIamMeta.KEYSTONE_LIST_PROJECTS);
            if (Objects.isNull(response)) {
                throw new SdkException(
                        "Failed to get project id, " + "please input project id when initializing BasicCredentials");
            }
            if (response.getProjects().size() == 1) {
                projectId = response.getProjects().get(0).getId();
            } else {
                projectId = keystoneCreateProject(inner, regionId);
            }
            AuthCache.putAuth(akWithName, projectId);

            setDerivedPredicate(derivedPredicate);

            return this;
        }, hcClient.getHttpConfig().getExecutorService());
    }

    private String keystoneCreateProject(HcClient client, String regionId) {
        List<String> supportedRegions = getSupportedRegions(client);
        if (Objects.isNull(supportedRegions) || supportedRegions.size() == 0) {
            throw new SdkException("failed to list regions");
        }
        if (!supportedRegions.contains(regionId)) {
            throw new SdkException("the region input is not supported to create project automatically");
        }

        String domainId = getDomainId(client);
        if (StringUtils.isEmpty(domainId)) {
            throw new SdkException("No domain id found, please select one of the following solutions:\n\t"
                    + "1. Manually specify domain_id when initializing the credentials.\n\t"
                    + "2. Use the domain account to grant the current account permissions of the IAM service.\n\t"
                    + "3. Use AK/SK of the domain account.");
        }

        return getCreateProjectId(client, regionId, domainId);
    }

    private List<String> getSupportedRegions(HcClient hcClient) {
        final String publicRegionType = "public";
        KeystoneListRegionsRequest request = new KeystoneListRegionsRequest();
        KeystoneListRegionsResponse response = hcClient.syncInvokeHttp(request, InnerIamMeta.KEYSTONE_LIST_REGIONS);
        if (Objects.isNull(response)) {
            throw new SdkException("failed to list all regions");
        }

        return response.getRegions().stream().map(region -> {
            if (publicRegionType.equals(region.getType())) {
                return region.getId();
            }
            return null;
        }).filter(Objects::nonNull).collect(Collectors.toList());
    }

    private String getDomainId(HcClient hcClient) {
        KeystoneListAuthDomainsRequest request = new KeystoneListAuthDomainsRequest();
        KeystoneListAuthDomainsResponse response = hcClient.syncInvokeHttp(request,
                InnerIamMeta.KEYSTONE_LIST_AUTH_DOMAINS);
        if (Objects.isNull(response)) {
            throw new SdkException("No domain id found, please select one of the following solutions:\n\t"
                    + "1. Manually specify domain_id when initializing the credentials.\n\t"
                    + "2. Use the domain account to grant the current account permissions of the IAM service.\n\t"
                    + "3. Use AK/SK of the domain account.");
        }
        return response.getDomains().get(0).getId();
    }

    private String getCreateProjectId(HcClient hcClient, String regionId, String domainId) {
        GlobalCredentials globalCredentials = new GlobalCredentials().withAk(getAk()).withSk(getSk())
                .withDomainId(domainId);
        HcClient innerGlobal = hcClient.overrideCredential(globalCredentials);
        KeystoneCreateProjectRequest request = new KeystoneCreateProjectRequest()
                .withBody(body -> body.withProject(project -> {
                    project.withName(regionId);
                    project.withDomainId(domainId);
                }));
        KeystoneCreateProjectResponse response = innerGlobal.syncInvokeHttp(request,
                InnerIamMeta.KEYSTONE_CREATE_PROJECT);

        if (Objects.isNull(response.getProject())) {
            throw new SdkException("failed to create project");
        }
        return response.getProject().getId();
    }

    @Override
    public CompletableFuture<HttpRequest> processAuthRequest(HttpRequest httpRequest, HttpClient httpClient) {
        return CompletableFuture.completedFuture(syncProcessAuthRequest(httpRequest, httpClient));
    }

    @Override
    public HttpRequest syncProcessAuthRequest(HttpRequest httpRequest, HttpClient httpClient) {
        HttpRequest.HttpRequestBuilder builder = httpRequest.builder().addAutoFilledPathParam(getPathParams());

        if (needUpdateAuthToken()) {
            updateAuthTokenByIdToken(httpClient);
        } else if (needUpdateSecurityToken()) {
            updateSecurityTokenFromMetadata();
        }

        if (Objects.nonNull(getProjectId())) {
            builder.addHeader(Constants.X_PROJECT_ID, projectId);
        }

        if (Objects.nonNull(authToken)) {
            builder.addHeader(Constants.X_AUTH_TOKEN, authToken);
            return builder.build();
        }

        if (Objects.nonNull(getSecurityToken())) {
            builder.addHeader(Constants.X_SECURITY_TOKEN, getSecurityToken());
        }

        if (Objects.nonNull(httpRequest.getContentType())
                && !httpRequest.getContentType().startsWith(Constants.MEDIATYPE.APPLICATION_JSON)) {
            builder.addHeader(Constants.X_SDK_CONTENT_SHA256, Constants.UNSIGNED_PAYLOAD);
        }

        Map<String, String> headers;
        if (isDerivedAuth(httpRequest)) {
            headers = DerivedAKSKSigner.sign(builder.build(), this);
        } else if (httpRequest.getSigningAlgorithm() == SigningAlgorithm.HMAC_SHA256) {
            headers = AKSKSigner.sign(builder.build(), this);
        } else if (httpRequest.getSigningAlgorithm() == SigningAlgorithm.HMAC_SM3) {
            headers = SM3AKSKSigner.sign(builder.build(), this);
        } else {
            throw new SdkException("Failed to sign the request");
        }

        builder.addHeaders(headers);
        return builder.build();
    }

    @Override
    public void processDerivedAuthParams(String derivedAuthServiceName, String regionId) {
        if (this.derivedAuthServiceName == null) {
            this.derivedAuthServiceName = derivedAuthServiceName;
        }

        if (this.regionId == null) {
            this.regionId = regionId;
        }
    }

    @Override
    protected void updateAuthTokenByIdToken(HttpClient httpClient) {
        String iamEndpoint = StringUtils.isEmpty(getIamEndpoint()) ? Constants.DEFAULT_IAM_ENDPOINT : getIamEndpoint();
        HttpRequest httpRequest = Iam.getProjectTokenWithIdTokenRequest(
                iamEndpoint, getIdpId(), getIdToken(), projectId);
        CreateTokenWithIdTokenResponse response = Iam.createTokenWithIdToken(httpClient, httpRequest);
        authToken = response.getSubjectToken();
        try {
            String expiredTime = response.getToken().getExpiresAt().replace("000Z", "Z");
            expiredAt = new SimpleDateFormat(Iam.EXPIRED_DATE_FORMAT).parse(expiredTime).getTime();
        } catch (ParseException e) {
            throw new SdkException(e);
        }
    }

    @Override
    public BasicCredentials deepClone() {
        BasicCredentials credentials = new BasicCredentials()
                .withProjectId(projectId)
                .withAk(getAk())
                .withSk(getSk())
                .withIdpId(getIdpId())
                .withIdTokenFile(getIdTokenFile())
                .withDerivedPredicate(getDerivedPredicate())
                .withIamEndpoint(getIamEndpoint())
                .withSecurityToken(getSecurityToken());

        credentials.processDerivedAuthParams(derivedAuthServiceName, regionId);
        return credentials;
    }
}
