package com.g42cloud.sdk.cts.v3;

import com.g42cloud.sdk.core.ClientBuilder;
import com.g42cloud.sdk.core.HcClient;
import com.g42cloud.sdk.core.invoker.SyncInvoker;
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

public class CtsClient {

    protected HcClient hcClient;

    public CtsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CtsClient> newBuilder() {
        ClientBuilder<CtsClient> clientBuilder = new ClientBuilder<>(CtsClient::new);
        return clientBuilder;
    }

    public CreateNotificationResponse createNotification(CreateNotificationRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.createNotification);
    }

    public SyncInvoker<CreateNotificationRequest, CreateNotificationResponse> createNotificationInvoker(
        CreateNotificationRequest request) {
        return new SyncInvoker<CreateNotificationRequest, CreateNotificationResponse>(request,
            CtsMeta.createNotification, hcClient);
    }

    public CreateTrackerResponse createTracker(CreateTrackerRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.createTracker);
    }

    public SyncInvoker<CreateTrackerRequest, CreateTrackerResponse> createTrackerInvoker(CreateTrackerRequest request) {
        return new SyncInvoker<CreateTrackerRequest, CreateTrackerResponse>(request, CtsMeta.createTracker, hcClient);
    }

    public DeleteNotificationResponse deleteNotification(DeleteNotificationRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.deleteNotification);
    }

    public SyncInvoker<DeleteNotificationRequest, DeleteNotificationResponse> deleteNotificationInvoker(
        DeleteNotificationRequest request) {
        return new SyncInvoker<DeleteNotificationRequest, DeleteNotificationResponse>(request,
            CtsMeta.deleteNotification, hcClient);
    }

    public DeleteTrackerResponse deleteTracker(DeleteTrackerRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.deleteTracker);
    }

    public SyncInvoker<DeleteTrackerRequest, DeleteTrackerResponse> deleteTrackerInvoker(DeleteTrackerRequest request) {
        return new SyncInvoker<DeleteTrackerRequest, DeleteTrackerResponse>(request, CtsMeta.deleteTracker, hcClient);
    }

    public ListNotificationsResponse listNotifications(ListNotificationsRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.listNotifications);
    }

    public SyncInvoker<ListNotificationsRequest, ListNotificationsResponse> listNotificationsInvoker(
        ListNotificationsRequest request) {
        return new SyncInvoker<ListNotificationsRequest, ListNotificationsResponse>(request, CtsMeta.listNotifications,
            hcClient);
    }

    public ListQuotasResponse listQuotas(ListQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.listQuotas);
    }

    public SyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasInvoker(ListQuotasRequest request) {
        return new SyncInvoker<ListQuotasRequest, ListQuotasResponse>(request, CtsMeta.listQuotas, hcClient);
    }

    public ListTracesResponse listTraces(ListTracesRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.listTraces);
    }

    public SyncInvoker<ListTracesRequest, ListTracesResponse> listTracesInvoker(ListTracesRequest request) {
        return new SyncInvoker<ListTracesRequest, ListTracesResponse>(request, CtsMeta.listTraces, hcClient);
    }

    public ListTrackersResponse listTrackers(ListTrackersRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.listTrackers);
    }

    public SyncInvoker<ListTrackersRequest, ListTrackersResponse> listTrackersInvoker(ListTrackersRequest request) {
        return new SyncInvoker<ListTrackersRequest, ListTrackersResponse>(request, CtsMeta.listTrackers, hcClient);
    }

    public UpdateNotificationResponse updateNotification(UpdateNotificationRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.updateNotification);
    }

    public SyncInvoker<UpdateNotificationRequest, UpdateNotificationResponse> updateNotificationInvoker(
        UpdateNotificationRequest request) {
        return new SyncInvoker<UpdateNotificationRequest, UpdateNotificationResponse>(request,
            CtsMeta.updateNotification, hcClient);
    }

    public UpdateTrackerResponse updateTracker(UpdateTrackerRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.updateTracker);
    }

    public SyncInvoker<UpdateTrackerRequest, UpdateTrackerResponse> updateTrackerInvoker(UpdateTrackerRequest request) {
        return new SyncInvoker<UpdateTrackerRequest, UpdateTrackerResponse>(request, CtsMeta.updateTracker, hcClient);
    }

}
