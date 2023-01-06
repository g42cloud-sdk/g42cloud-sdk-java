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

package com.g42cloud.sdk.core;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.g42cloud.sdk.core.exception.SdkException;

import java.io.IOException;
import java.io.InputStream;
import java.util.function.Consumer;

/**
 * @author G42Cloud_SDK
 */
public class SdkStreamResponse extends SdkResponse {

    @JsonIgnore
    private InputStream body;

    /**
     * 解析http响应body，用于content-type是application/bson或application/octet-stream的响应
     * @param inputStream http response body
     */
    public void parseBody(InputStream inputStream) {
        this.body = inputStream;
    }

    public void consumeDownloadStream(Consumer<InputStream> consumer) {
        try (InputStream inputStream = this.body) {
            consumer.accept(inputStream);
        } catch (IOException e) {
            throw new SdkException(e);
        }
    }
}
