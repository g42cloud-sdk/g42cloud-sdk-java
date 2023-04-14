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

import com.g42cloud.sdk.core.Constants.MEDIATYPE;
import com.g42cloud.sdk.core.http.HttpResponse;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author G42Cloud_SDK
 */
public class DefaultHttpResponse implements HttpResponse {

    private static final Logger logger = LoggerFactory.getLogger(DefaultHttpResponse.class);

    private Response response;

    private String strBody;

    private static final String[] SHOULD_READ_BODY_CONTENT_TYPES = new String[]{
            MEDIATYPE.APPLICATION_JSON,
            MEDIATYPE.APPLICATION_XML,
            MEDIATYPE.TEXT
    };

    private DefaultHttpResponse(Response response) {
        this.response = response;
        if (shouldReadBody()) {
            try {
                strBody = response.body().string();
            } catch (IOException e) {
                logger.error("Read http response body error!", e);
            }
        }
    }

    private boolean shouldReadBody() {
        if (Objects.isNull(response.body())) {
            return false;
        }
        if (Objects.isNull(response.body().contentType())) {
            return response.body().contentLength() != 0;
        }

        String contentType = response.body().contentType().toString();
        for (String shouldReadBodyContentType : SHOULD_READ_BODY_CONTENT_TYPES) {
            if (contentType.startsWith(shouldReadBodyContentType)) {
                return true;
            }
        }
        return false;
    }

    static DefaultHttpResponse wrap(Response response) {
        return new DefaultHttpResponse(response);
    }

    @Override
    public int getStatusCode() {
        return response.code();
    }

    @Override
    public String getContentType() {
        return Objects.isNull(response.body()) || Objects.isNull(response.body().contentType())
                ? null
                : response.body().contentType().toString();
    }

    @Override
    public long getContentLength() {
        return Objects.isNull(this.response.body()) || this.response.body().contentLength() < 0
                ? 0
                : this.response.body().contentLength();
    }

    @Override
    public Map<String, List<String>> getHeaders() {
        return DefaultHttpUtils.headersToMap(response.headers());
    }

    @Override
    public String getBodyAsString() {
        return strBody;
    }

    @Override
    public InputStream getBody() {
        return response.body().byteStream();
    }

    @Override
    public String getHeader(String name) {
        return response.header(name);
    }
}