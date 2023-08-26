package com.g42cloud.sdk.cts.v3;

import com.g42cloud.sdk.core.ClientBuilder;
import com.g42cloud.sdk.core.HcClient;
import com.g42cloud.sdk.core.invoker.AsyncInvoker;
import com.g42cloud.sdk.cts.v3.model.CreateNotificationRequest;
import com.g42cloud.sdk.cts.v3.model.CreateNotificationResponse;
import com.g42cloud.sdk.cts.v3.model.CreateTrackerRequest;
import com.g42cloud.sdk.cts.v3.model.CreateTrackerResponse;
import com.g42cloud.sdk.cts.v3.model.DeleteNotificationRequest;
import com.g42cloud.sdk.cts.v3.model.DeleteNotificationResponse;
import com.g42cloud.sdk.cts.v3.model.DeleteTrackerRequest;
import com.g42cloud.sdk.cts.v3.model.DeleteTrackerResponse;
import com.g42cloud.sdk.cts.v3.model.ListNotificationsRequest;
import com.g42cloud.sdk.cts.v3.model.ListNotificationsResponse;
import com.g42cloud.sdk.cts.v3.model.ListQuotasRequest;
import com.g42cloud.sdk.cts.v3.model.ListQuotasResponse;
import com.g42cloud.sdk.cts.v3.model.ListTracesRequest;
import com.g42cloud.sdk.cts.v3.model.ListTracesResponse;
import com.g42cloud.sdk.cts.v3.model.ListTrackersRequest;
import com.g42cloud.sdk.cts.v3.model.ListTrackersResponse;
import com.g42cloud.sdk.cts.v3.model.UpdateNotificationRequest;
import com.g42cloud.sdk.cts.v3.model.UpdateNotificationResponse;
import com.g42cloud.sdk.cts.v3.model.UpdateTrackerRequest;
import com.g42cloud.sdk.cts.v3.model.UpdateTrackerResponse;

import java.util.concurrent.CompletableFuture;

public class CtsAsyncClient {

    protected HcClient hcClient;

    public CtsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CtsAsyncClient> newBuilder() {
        ClientBuilder<CtsAsyncClient> clientBuilder = new ClientBuilder<>(CtsAsyncClient::new);
        return clientBuilder;
    }

    public CompletableFuture<CreateNotificationResponse> createNotificationAsync(CreateNotificationRequest request) {
        return hcClient.asyncInvokeHttp(request, CtsMeta.createNotification);
    }

    public AsyncInvoker<CreateNotificationRequest, CreateNotificationResponse> createNotificationAsyncInvoker(
        CreateNotificationRequest request) {
        return new AsyncInvoker<CreateNotificationRequest, CreateNotificationResponse>(request,
            CtsMeta.createNotification, hcClient);
    }

    public CompletableFuture<CreateTrackerResponse> createTrackerAsync(CreateTrackerRequest request) {
        return hcClient.asyncInvokeHttp(request, CtsMeta.createTracker);
    }

    public AsyncInvoker<CreateTrackerRequest, CreateTrackerResponse> createTrackerAsyncInvoker(
        CreateTrackerRequest request) {
        return new AsyncInvoker<CreateTrackerRequest, CreateTrackerResponse>(request, CtsMeta.createTracker, hcClient);
    }

    public CompletableFuture<DeleteNotificationResponse> deleteNotificationAsync(DeleteNotificationRequest request) {
        return hcClient.asyncInvokeHttp(request, CtsMeta.deleteNotification);
    }

    public AsyncInvoker<DeleteNotificationRequest, DeleteNotificationResponse> deleteNotificationAsyncInvoker(
        DeleteNotificationRequest request) {
        return new AsyncInvoker<DeleteNotificationRequest, DeleteNotificationResponse>(request,
            CtsMeta.deleteNotification, hcClient);
    }

    public CompletableFuture<DeleteTrackerResponse> deleteTrackerAsync(DeleteTrackerRequest request) {
        return hcClient.asyncInvokeHttp(request, CtsMeta.deleteTracker);
    }

    public AsyncInvoker<DeleteTrackerRequest, DeleteTrackerResponse> deleteTrackerAsyncInvoker(
        DeleteTrackerRequest request) {
        return new AsyncInvoker<DeleteTrackerRequest, DeleteTrackerResponse>(request, CtsMeta.deleteTracker, hcClient);
    }

    public CompletableFuture<ListNotificationsResponse> listNotificationsAsync(ListNotificationsRequest request) {
        return hcClient.asyncInvokeHttp(request, CtsMeta.listNotifications);
    }

    public AsyncInvoker<ListNotificationsRequest, ListNotificationsResponse> listNotificationsAsyncInvoker(
        ListNotificationsRequest request) {
        return new AsyncInvoker<ListNotificationsRequest, ListNotificationsResponse>(request, CtsMeta.listNotifications,
            hcClient);
    }

    public CompletableFuture<ListQuotasResponse> listQuotasAsync(ListQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, CtsMeta.listQuotas);
    }

    public AsyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasAsyncInvoker(ListQuotasRequest request) {
        return new AsyncInvoker<ListQuotasRequest, ListQuotasResponse>(request, CtsMeta.listQuotas, hcClient);
    }

    public CompletableFuture<ListTracesResponse> listTracesAsync(ListTracesRequest request) {
        return hcClient.asyncInvokeHttp(request, CtsMeta.listTraces);
    }

    public AsyncInvoker<ListTracesRequest, ListTracesResponse> listTracesAsyncInvoker(ListTracesRequest request) {
        return new AsyncInvoker<ListTracesRequest, ListTracesResponse>(request, CtsMeta.listTraces, hcClient);
    }

    public CompletableFuture<ListTrackersResponse> listTrackersAsync(ListTrackersRequest request) {
        return hcClient.asyncInvokeHttp(request, CtsMeta.listTrackers);
    }

    public AsyncInvoker<ListTrackersRequest, ListTrackersResponse> listTrackersAsyncInvoker(
        ListTrackersRequest request) {
        return new AsyncInvoker<ListTrackersRequest, ListTrackersResponse>(request, CtsMeta.listTrackers, hcClient);
    }

    public CompletableFuture<UpdateNotificationResponse> updateNotificationAsync(UpdateNotificationRequest request) {
        return hcClient.asyncInvokeHttp(request, CtsMeta.updateNotification);
    }

    public AsyncInvoker<UpdateNotificationRequest, UpdateNotificationResponse> updateNotificationAsyncInvoker(
        UpdateNotificationRequest request) {
        return new AsyncInvoker<UpdateNotificationRequest, UpdateNotificationResponse>(request,
            CtsMeta.updateNotification, hcClient);
    }

    public CompletableFuture<UpdateTrackerResponse> updateTrackerAsync(UpdateTrackerRequest request) {
        return hcClient.asyncInvokeHttp(request, CtsMeta.updateTracker);
    }

    public AsyncInvoker<UpdateTrackerRequest, UpdateTrackerResponse> updateTrackerAsyncInvoker(
        UpdateTrackerRequest request) {
        return new AsyncInvoker<UpdateTrackerRequest, UpdateTrackerResponse>(request, CtsMeta.updateTracker, hcClient);
    }

}
