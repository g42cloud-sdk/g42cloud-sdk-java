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

package com.g42cloud.sdk.core.http;

import com.g42cloud.sdk.core.exception.SdkException;

import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * @param <ReqT>
 * @param <FieldT>
 * @author G42Cloud_SDK
 */
public class FieldImpl<ReqT, FieldT> implements Field<ReqT, FieldT> {
    String name;

    LocationType locationType;

    FieldExistence existence;

    Class<FieldT> fieldType;

    Class<?> innerContainerType;

    Function<ReqT, FieldT> reader;

    BiConsumer<ReqT, FieldT> writer;

    Function<ReqT, Boolean> isValueProvidedFunc;

    public FieldImpl(String name, LocationType locationType, FieldExistence existence, Class<FieldT> fieldType) {
        this.name = Objects.requireNonNull(name, "name cannot be null");
        this.locationType = Objects.requireNonNull(locationType, "locationType cannot be null");
        this.existence = Objects.requireNonNull(existence, "existence cannot be null");
        this.fieldType = Objects.requireNonNull(fieldType, "fieldType cannot be null");
        this.isValueProvidedFunc = null;
        this.reader = null;
        this.writer = null;
    }

    public <T> FieldImpl<ReqT, FieldT> withInnerContainerType(Class<T> innerContainerType) {
        this.innerContainerType = innerContainerType;
        return this;
    }

    public FieldImpl<ReqT, FieldT> withReader(Function<ReqT, FieldT> valueReader) {
        Objects.requireNonNull(valueReader, "valueReader cannot be null");
        this.reader = valueReader;
        return this;
    }

    public FieldImpl<ReqT, FieldT> withWriter(BiConsumer<ReqT, FieldT> writer) {
        this.writer = writer;
        return this;
    }

    public FieldImpl<ReqT, FieldT> withValueProvideTest(Function<ReqT, Boolean> valuePresenceTester) {
        this.isValueProvidedFunc = valuePresenceTester;
        return this;
    }

    public FieldImpl<ReqT, FieldT> withMarshaller(Function<ReqT, FieldT> valueReader, BiConsumer<ReqT, FieldT> writer) {
        return this.withReader(valueReader).withWriter(writer);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public LocationType getLocation() {
        return locationType;
    }

    @Override
    public FieldExistence getExistence() {
        return existence;
    }

    @Override
    public Class<FieldT> getFieldType() {
        return fieldType;
    }

    @Override
    public Class<?> getInnerContainerType() {
        return this.innerContainerType;
    }

    @Override
    public Optional<FieldT> readValue(ReqT request) {
        FieldT value = reader.apply(request);
        if (value == null) {
            if (existence == FieldExistence.NULL_IGNORE) {
                return Optional.empty();
            } else {
                throw new SdkException(
                    "request field " + name + " read null value. existence is: " + existence.toString());
            }
        } else {
            if (existence == FieldExistence.NON_NULL_NON_EMPTY && value.getClass() == String.class
                && ((String) value).isEmpty()) {
                throw new SdkException(
                    "request field " + name + " read empty value. not allowed by " + existence);
            }
            return Optional.of(value);
        }
    }

    @Override
    public Optional<FieldT> readValueNoValidation(ReqT request) {
        FieldT value = reader.apply(request);
        return value == null ? Optional.empty() : Optional.of(value);
    }

    @Override
    public void writeValue(ReqT request, FieldT value, Class<FieldT> clazz) {
        // 由于可能存在外部转型，因此输入类型并不能完全值得信任
        writeValueSafe(request, value, clazz);
    }

    @Override
    @SuppressWarnings("unchecked")
    public void writeValueSafe(ReqT request, Object value, Class<?> clazz) {
        if (fieldType.isAssignableFrom(clazz)) {
            writer.accept(request, (FieldT) value);
        } else {
            FieldT enumValue = tryFindEnumField(value, clazz).orElseThrow(() -> new SdkException(
                "input value " + value + " with class " + clazz.getSimpleName()
                    + " is not compatible with expected class " + fieldType.getSimpleName()));
            writer.accept(request, enumValue);
        }
    }

    @Override
    public boolean isValueProvided(ReqT request) {
        if (isValueProvidedFunc != null) {
            return isValueProvidedFunc.apply(request);
        } else {
            throw new SdkException("isValueProvided bad call");
        }
    }

    /**
     * 如果客户端请求对应到服务端的path变量定义为enum，则会走到这个分支。允许这种兼容
     *
     * @param value 取值
     * @param clazz 输入的取值的类型
     * @param <T> 输入取值类型参数
     * @return 如果是enum且匹配上了值，则返回匹配的enum field，否则返回empty。
     */
    private <T> Optional<FieldT> tryFindEnumField(Object value, Class<T> clazz) {
        if (!(fieldType.isEnum() && clazz.isAssignableFrom(String.class))) {
            return Optional.empty();
        }

        FieldT[] enumValues = fieldType.getEnumConstants();
        if (enumValues == null) {
            return Optional.empty();
        }

        for (FieldT enumValue : enumValues) {
            if (enumValue.toString().equals(value)) {
                return Optional.of(enumValue);
            }
        }

        return Optional.empty();
    }
}
