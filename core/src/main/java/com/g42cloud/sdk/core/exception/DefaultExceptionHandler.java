package com.g42cloud.sdk.core.exception;

import com.g42cloud.sdk.core.Constants;
import com.g42cloud.sdk.core.http.HttpRequest;
import com.g42cloud.sdk.core.http.HttpResponse;
import com.g42cloud.sdk.core.utils.ExceptionUtils;

public class DefaultExceptionHandler implements ExceptionHandler {
    @Override
    public void handleException(HttpRequest httpRequest, HttpResponse httpResponse) {
        if (httpResponse.getStatusCode() >= Constants.StatusCode.CLIENT_ERROR) {
            throw ServiceResponseException.mapException(httpResponse.getStatusCode(),
                    ExceptionUtils.extractErrorMessage(httpResponse));
        }
    }
}
