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

import com.g42cloud.sdk.core.region.Region;
import com.g42cloud.sdk.core.utils.StringUtils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * TestRegion 为基础类，被 TestRegionEndpoint 和 TestRegionWithoutId 用例使用
 */
public class TestRegion {
    public static final String SERVICE_ENDPOINT = "http://127.0.0.1:10086";
    public static final String TEST_ENDPOINT = "https://test.g42cloud.com";
    public static final String TEST_ENDPOINT_WITHOUT_SCHEME = "test.g42cloud.com";

    public static final Region CN_NORTH_7 = new Region("cn-north-7", SERVICE_ENDPOINT);
    public static final Region CN_NORTH_201 = new Region("cn-north-201", SERVICE_ENDPOINT);
    public static final Region CN_NORTH_400 = new Region("cn-north-400", SERVICE_ENDPOINT);

    private static final Map<String, Region> STATIC_FIELDS = createStaticFields();

    private static Map<String, Region> createStaticFields() {
        Map<String, Region> map = new HashMap<>();
        map.put("cn-north-7", CN_NORTH_7);
        map.put("cn-north-201", CN_NORTH_201);
        map.put("cn-north-400", CN_NORTH_400);
        return Collections.unmodifiableMap(map);
    }

    public static Region valueOf(String regionId) {
        if (StringUtils.isEmpty(regionId)) {
            throw new IllegalArgumentException("Unexpected empty parameter: regionId.");
        }
        Region result = STATIC_FIELDS.get(regionId);
        if (Objects.nonNull(result)) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected regionId: " + regionId);
    }
}
