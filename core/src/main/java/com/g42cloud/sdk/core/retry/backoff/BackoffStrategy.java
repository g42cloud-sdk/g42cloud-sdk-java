/*
 * Copyright (c) G42 Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package com.g42cloud.sdk.core.retry.backoff;

import com.g42cloud.sdk.core.retry.RetryContext;

/**
 * @author G42Cloud_SDK
 */
public interface BackoffStrategy {
    BackoffStrategy NO_BACKOFF = new BackoffStrategy() {
        @Override
        public <S> long computeDelayBeforeNextRetry(RetryContext<S> context) {
            return 0;
        }
    };

    /**
     * Compute wait duration between two retried requests.
     *
     * @param <S> type of response
     * @param context the context which stored retry related information
     * @return milliseconds to wait
     */
    <S> long computeDelayBeforeNextRetry(RetryContext<S> context);
}
