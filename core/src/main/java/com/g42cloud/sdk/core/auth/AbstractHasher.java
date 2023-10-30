/*
 * Copyright (c) G42 Technologies Co., Ltd. 2023-2023. All rights reserved.
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

import com.g42cloud.sdk.core.utils.BinaryUtils;

abstract class AbstractHasher {
    protected abstract byte[] hash(byte[] data);

    protected abstract byte[] hmac(byte[] data, byte[] key);

    protected String hashHexString(byte[] data) {
        return BinaryUtils.toHex(hash(data));
    }

}
