package com.g42cloud.sdk.core.exception;

import com.g42cloud.sdk.core.http.HttpRequest;
import com.g42cloud.sdk.core.http.HttpResponse;

public interface ExceptionHandler {
    void handleException(HttpRequest httpRequest, HttpResponse httpResponse) throws ServiceResponseException;
}
