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

package com.g42cloud.sdk.core.region;

import com.g42cloud.sdk.core.Constants;
import com.g42cloud.sdk.core.exception.SdkException;
import com.g42cloud.sdk.core.utils.PathUtils;
import com.g42cloud.sdk.core.utils.StringUtils;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.SafeConstructor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public class ProfileRegionCache {
    private static final String REGIONS_FILE_REG = "^[a-zA-Z0-9._ -]+\\.(yml|yaml)$";

    private static final String DEFAULT_REGIONS_FILE_NAME = "regions.yaml";

    private static final String REGIONS_FILE_ENV = "G42CLOUD_SDK_REGIONS_FILE";

    private static final ProfileRegionCache INSTANCE = createInstance();

    protected final Map<String, Region> value;

    private ProfileRegionCache(Map<String, Region> value) {
        this.value = value;
    }

    protected static ProfileRegionCache getInstance() {
        return INSTANCE;
    }

    private static ProfileRegionCache createInstance() {
        String regionsFilePath = getRegionsFilePath();
        if (Objects.isNull(regionsFilePath) || !PathUtils.isPathExist(regionsFilePath)) {
            return new ProfileRegionCache(Collections.unmodifiableMap(new LinkedHashMap<>()));
        }

        try {
            File file = new File(regionsFilePath).getCanonicalFile();
            if (!isValidRegionsFile(file)) {
                throw new SdkException(String.format("invalid regions file path: '%s'", regionsFilePath));
            }
            Map<String, Region> result = resolveRegions(file.getCanonicalPath());
            return new ProfileRegionCache(Collections.unmodifiableMap(result));
        } catch (IOException e) {
            throw new SdkException(String.format("failed to resolve file '%s'", regionsFilePath), e);
        }
    }

    private static Map<String, Region> resolveRegions(String filepath) {
        Map<String, Region> result = new LinkedHashMap<>();
        Yaml yaml = new Yaml(new SafeConstructor());
        Map<?, ?> map;
        try (FileInputStream inputStream = new FileInputStream(filepath)) {
            Object obj = yaml.load(inputStream);
            if (obj instanceof Map) {
                map = (Map<?, ?>) obj;
            } else {
                return result;
            }
        } catch (IOException e) {
            throw new SdkException(String.format("failed to resolve file '%s'", filepath), e);
        }

        Iterator<? extends Map.Entry<?, ?>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<?, ?> next = iterator.next();
            if (!(next.getValue() instanceof List)) {
                continue;
            }
            for (Object o : (List<?>) next.getValue()) {
                if (!(o instanceof Map)) {
                    continue;
                }
                Map<?, ?> regionMap = (Map<?, ?>) o;
                String id = (String) regionMap.get("id");
                String endpoint = (String) regionMap.get("endpoint");
                if (!StringUtils.isEmpty(id) && !StringUtils.isEmpty(endpoint)) {
                    result.put(next.getKey().toString().toUpperCase(Locale.ROOT) + id, new Region(id, endpoint));
                }
            }
        }
        return result;
    }

    private static String getRegionsFilePath() {
        String regionsFile = System.getenv(REGIONS_FILE_ENV);
        if (!StringUtils.isEmpty(regionsFile)) {
            return regionsFile;
        }

        String userHomePath = PathUtils.getUserHomePath();
        return StringUtils.isEmpty(userHomePath) ? null : userHomePath + File.separator
                + Constants.DEFAULT_PROFILE_DIR_NAME + File.separator + DEFAULT_REGIONS_FILE_NAME;
    }

    private static boolean isValidRegionsFile(File file) {
        if (!file.getName().matches(REGIONS_FILE_REG)) {
            return false;
        }
        return PathUtils.isValidFile(file);
    }
}
