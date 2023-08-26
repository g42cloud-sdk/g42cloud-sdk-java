/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.g42cloud.sdk.ecs.v2;

import com.fasterxml.jackson.databind.module.SimpleModule;
import com.g42cloud.sdk.ecs.v2.model.ServerImage;

public class EcsCustomModule extends SimpleModule {
    private static final long serialVersionUID = 1L;

    public EcsCustomModule() {
        super("EcsCustomModule");
        this.addDeserializer(ServerImage.class, new EcsServerImageDeSerializer());
    }
}
