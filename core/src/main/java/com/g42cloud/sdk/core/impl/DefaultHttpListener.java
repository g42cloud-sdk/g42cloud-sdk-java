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

package com.g42cloud.sdk.core.impl;

import static com.g42cloud.sdk.core.Constants.SDK_EXCHANGE;

import com.g42cloud.sdk.core.Constants;
import com.g42cloud.sdk.core.HttpListener;
import com.g42cloud.sdk.core.exchange.ApiTimer;
import com.g42cloud.sdk.core.exchange.SdkExchange;
import com.g42cloud.sdk.core.exchange.SdkExchangeCache;
import com.g42cloud.sdk.core.http.HttpConfig;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * @author G42Cloud_SDK
 */
public class DefaultHttpListener implements Interceptor {
    private List<HttpListener> httpListeners;

    public DefaultHttpListener(HttpConfig httpConfig) {
        this.httpListeners = httpConfig.getHttpListeners();
    }

    @Override
    public Response intercept(Chain chain) throws IOException {

        Request request = chain.request();
        SdkExchange exchange = SdkExchangeCache.getExchange(request.header(SDK_EXCHANGE));
        exchange = Objects.isNull(exchange) ? new SdkExchange() : exchange;
        request = request.newBuilder().removeHeader(SDK_EXCHANGE).build();

        exchange.withApiTimer(ApiTimer::start);

        if (Objects.nonNull(httpListeners)) {
            preRequest(request, exchange);
        }
        Response response = chain.proceed(request.newBuilder().removeHeader(SDK_EXCHANGE).build());

        exchange.withApiTimer(ApiTimer::end);

        if (Objects.nonNull(httpListeners)) {
            return postResponse(response, exchange);
        }

        return response;
    }

    public void preRequest(Request request, SdkExchange sdkExchange) throws IOException {

        String reqBody;
        if (Objects.nonNull(request.body()) && Objects.nonNull(request.body().contentType()) && (
            request.body().contentType().toString().startsWith(Constants.MEDIATYPE.APPLICATION_JSON) || request.body()
                .contentType()
                .toString()
                .startsWith(Constants.MEDIATYPE.TEXT))) {
            Buffer buffer = new Buffer();
            request.body().writeTo(buffer);
            reqBody = buffer.readUtf8();
        } else if (Objects.nonNull(request.body()) && Objects.nonNull(request.body().contentType()) && request.body()
            .contentType()
            .toString()
            .equals(Constants.MEDIATYPE.APPLICATION_OCTET_STREAM)) {
            reqBody = request.body().contentLength() > 0 || request.body().contentLength() == -1 ? "******" : null;
        } else {
            reqBody = null;
        }

        String finalReqBody = reqBody;
        HttpListener.RequestListener requestListener = new HttpListener.RequestListener() {

            @Override
            public String httpMethod() {
                return request.method();
            }

            @Override
            public String uri() {
                return request.url().toString();
            }

            @Override
            public Map<String, List<String>> headers() {
                return DefaultHttpUtils.headersToMap(request.headers());
            }

            @Override
            public Optional<String> body() {
                return Objects.isNull(finalReqBody) ? Optional.empty() : Optional.of(finalReqBody);
            }

            @Override
            public SdkExchange exchange() {
                return sdkExchange;
            }
        };
        this.httpListeners.forEach(httpListener -> httpListener.preRequest(requestListener));

    }

    public Response postResponse(Response response, SdkExchange sdkExchange) throws IOException {

        Request request = response.request();
        Response.Builder responseBuilder = response.newBuilder();
        String respBody;
        if (Objects.nonNull(response.body()) && Objects.nonNull(response.body().contentType()) && (
            response.body().contentType().toString().startsWith(Constants.MEDIATYPE.APPLICATION_JSON) || response.body()
                .contentType()
                .toString()
                .startsWith(Constants.MEDIATYPE.TEXT))) {
            respBody = response.body().string();
            responseBuilder.body(ResponseBody.create(response.body().contentType(), respBody));
        } else if (Objects.nonNull(response.body()) && Objects.nonNull(response.body().contentType()) && response.body()
            .contentType()
            .toString()
            .equals(Constants.MEDIATYPE.APPLICATION_OCTET_STREAM)) {
            respBody = response.body().contentLength() > 0 || response.body().contentLength() == -1 ? "******" : null;
        } else {
            respBody = null;
        }

        String finalRespBody = respBody;
        HttpListener.ResponseListener responseListener = new HttpListener.ResponseListener() {
            @Override
            public String httpMethod() {
                return request.method();
            }

            @Override
            public String uri() {
                return request.url().toString();
            }

            @Override
            public Map<String, List<String>> headers() {
                return DefaultHttpUtils.headersToMap(response.headers());
            }

            @Override
            public Optional<String> body() {
                return Objects.isNull(finalRespBody) ? Optional.empty() : Optional.of(finalRespBody);
            }

            @Override
            public int statusCode() {
                return response.code();
            }

            @Override
            public SdkExchange exchange() {
                return sdkExchange;
            }
        };
        this.httpListeners.forEach(httpListener -> httpListener.postResponse(responseListener));
        return responseBuilder.build();
    }
}
