package com.g42cloud.sdk.ces.v1;

import com.g42cloud.sdk.ces.v1.model.BatchListMetricDataRequest;
import com.g42cloud.sdk.ces.v1.model.BatchListMetricDataResponse;
import com.g42cloud.sdk.ces.v1.model.CreateAlarmRequest;
import com.g42cloud.sdk.ces.v1.model.CreateAlarmResponse;
import com.g42cloud.sdk.ces.v1.model.CreateAlarmTemplateRequest;
import com.g42cloud.sdk.ces.v1.model.CreateAlarmTemplateResponse;
import com.g42cloud.sdk.ces.v1.model.CreateEventsRequest;
import com.g42cloud.sdk.ces.v1.model.CreateEventsResponse;
import com.g42cloud.sdk.ces.v1.model.CreateMetricDataRequest;
import com.g42cloud.sdk.ces.v1.model.CreateMetricDataResponse;
import com.g42cloud.sdk.ces.v1.model.CreateResourceGroupRequest;
import com.g42cloud.sdk.ces.v1.model.CreateResourceGroupResponse;
import com.g42cloud.sdk.ces.v1.model.DeleteAlarmRequest;
import com.g42cloud.sdk.ces.v1.model.DeleteAlarmResponse;
import com.g42cloud.sdk.ces.v1.model.DeleteAlarmTemplateRequest;
import com.g42cloud.sdk.ces.v1.model.DeleteAlarmTemplateResponse;
import com.g42cloud.sdk.ces.v1.model.DeleteResourceGroupRequest;
import com.g42cloud.sdk.ces.v1.model.DeleteResourceGroupResponse;
import com.g42cloud.sdk.ces.v1.model.ListAlarmHistoriesRequest;
import com.g42cloud.sdk.ces.v1.model.ListAlarmHistoriesResponse;
import com.g42cloud.sdk.ces.v1.model.ListAlarmTemplatesRequest;
import com.g42cloud.sdk.ces.v1.model.ListAlarmTemplatesResponse;
import com.g42cloud.sdk.ces.v1.model.ListAlarmsRequest;
import com.g42cloud.sdk.ces.v1.model.ListAlarmsResponse;
import com.g42cloud.sdk.ces.v1.model.ListEventDetailRequest;
import com.g42cloud.sdk.ces.v1.model.ListEventDetailResponse;
import com.g42cloud.sdk.ces.v1.model.ListEventsRequest;
import com.g42cloud.sdk.ces.v1.model.ListEventsResponse;
import com.g42cloud.sdk.ces.v1.model.ListMetricsRequest;
import com.g42cloud.sdk.ces.v1.model.ListMetricsResponse;
import com.g42cloud.sdk.ces.v1.model.ListResourceGroupRequest;
import com.g42cloud.sdk.ces.v1.model.ListResourceGroupResponse;
import com.g42cloud.sdk.ces.v1.model.ShowAlarmRequest;
import com.g42cloud.sdk.ces.v1.model.ShowAlarmResponse;
import com.g42cloud.sdk.ces.v1.model.ShowEventDataRequest;
import com.g42cloud.sdk.ces.v1.model.ShowEventDataResponse;
import com.g42cloud.sdk.ces.v1.model.ShowMetricDataRequest;
import com.g42cloud.sdk.ces.v1.model.ShowMetricDataResponse;
import com.g42cloud.sdk.ces.v1.model.ShowQuotasRequest;
import com.g42cloud.sdk.ces.v1.model.ShowQuotasResponse;
import com.g42cloud.sdk.ces.v1.model.ShowResourceGroupRequest;
import com.g42cloud.sdk.ces.v1.model.ShowResourceGroupResponse;
import com.g42cloud.sdk.ces.v1.model.UpdateAlarmActionRequest;
import com.g42cloud.sdk.ces.v1.model.UpdateAlarmActionResponse;
import com.g42cloud.sdk.ces.v1.model.UpdateAlarmRequest;
import com.g42cloud.sdk.ces.v1.model.UpdateAlarmResponse;
import com.g42cloud.sdk.ces.v1.model.UpdateAlarmTemplateRequest;
import com.g42cloud.sdk.ces.v1.model.UpdateAlarmTemplateResponse;
import com.g42cloud.sdk.ces.v1.model.UpdateResourceGroupRequest;
import com.g42cloud.sdk.ces.v1.model.UpdateResourceGroupResponse;
import com.g42cloud.sdk.core.ClientBuilder;
import com.g42cloud.sdk.core.HcClient;
import com.g42cloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CesAsyncClient {

    protected HcClient hcClient;

    public CesAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CesAsyncClient> newBuilder() {
        ClientBuilder<CesAsyncClient> clientBuilder = new ClientBuilder<>(CesAsyncClient::new);
        return clientBuilder;
    }

    public CompletableFuture<BatchListMetricDataResponse> batchListMetricDataAsync(BatchListMetricDataRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.batchListMetricData);
    }

    public AsyncInvoker<BatchListMetricDataRequest, BatchListMetricDataResponse> batchListMetricDataAsyncInvoker(
        BatchListMetricDataRequest request) {
        return new AsyncInvoker<BatchListMetricDataRequest, BatchListMetricDataResponse>(request,
            CesMeta.batchListMetricData, hcClient);
    }

    public CompletableFuture<CreateAlarmResponse> createAlarmAsync(CreateAlarmRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.createAlarm);
    }

    public AsyncInvoker<CreateAlarmRequest, CreateAlarmResponse> createAlarmAsyncInvoker(CreateAlarmRequest request) {
        return new AsyncInvoker<CreateAlarmRequest, CreateAlarmResponse>(request, CesMeta.createAlarm, hcClient);
    }

    public CompletableFuture<CreateAlarmTemplateResponse> createAlarmTemplateAsync(CreateAlarmTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.createAlarmTemplate);
    }

    public AsyncInvoker<CreateAlarmTemplateRequest, CreateAlarmTemplateResponse> createAlarmTemplateAsyncInvoker(
        CreateAlarmTemplateRequest request) {
        return new AsyncInvoker<CreateAlarmTemplateRequest, CreateAlarmTemplateResponse>(request,
            CesMeta.createAlarmTemplate, hcClient);
    }

    public CompletableFuture<CreateEventsResponse> createEventsAsync(CreateEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.createEvents);
    }

    public AsyncInvoker<CreateEventsRequest, CreateEventsResponse> createEventsAsyncInvoker(
        CreateEventsRequest request) {
        return new AsyncInvoker<CreateEventsRequest, CreateEventsResponse>(request, CesMeta.createEvents, hcClient);
    }

    public CompletableFuture<CreateMetricDataResponse> createMetricDataAsync(CreateMetricDataRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.createMetricData);
    }

    public AsyncInvoker<CreateMetricDataRequest, CreateMetricDataResponse> createMetricDataAsyncInvoker(
        CreateMetricDataRequest request) {
        return new AsyncInvoker<CreateMetricDataRequest, CreateMetricDataResponse>(request, CesMeta.createMetricData,
            hcClient);
    }

    public CompletableFuture<CreateResourceGroupResponse> createResourceGroupAsync(CreateResourceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.createResourceGroup);
    }

    public AsyncInvoker<CreateResourceGroupRequest, CreateResourceGroupResponse> createResourceGroupAsyncInvoker(
        CreateResourceGroupRequest request) {
        return new AsyncInvoker<CreateResourceGroupRequest, CreateResourceGroupResponse>(request,
            CesMeta.createResourceGroup, hcClient);
    }

    public CompletableFuture<DeleteAlarmResponse> deleteAlarmAsync(DeleteAlarmRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.deleteAlarm);
    }

    public AsyncInvoker<DeleteAlarmRequest, DeleteAlarmResponse> deleteAlarmAsyncInvoker(DeleteAlarmRequest request) {
        return new AsyncInvoker<DeleteAlarmRequest, DeleteAlarmResponse>(request, CesMeta.deleteAlarm, hcClient);
    }

    public CompletableFuture<DeleteAlarmTemplateResponse> deleteAlarmTemplateAsync(DeleteAlarmTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.deleteAlarmTemplate);
    }

    public AsyncInvoker<DeleteAlarmTemplateRequest, DeleteAlarmTemplateResponse> deleteAlarmTemplateAsyncInvoker(
        DeleteAlarmTemplateRequest request) {
        return new AsyncInvoker<DeleteAlarmTemplateRequest, DeleteAlarmTemplateResponse>(request,
            CesMeta.deleteAlarmTemplate, hcClient);
    }

    public CompletableFuture<DeleteResourceGroupResponse> deleteResourceGroupAsync(DeleteResourceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.deleteResourceGroup);
    }

    public AsyncInvoker<DeleteResourceGroupRequest, DeleteResourceGroupResponse> deleteResourceGroupAsyncInvoker(
        DeleteResourceGroupRequest request) {
        return new AsyncInvoker<DeleteResourceGroupRequest, DeleteResourceGroupResponse>(request,
            CesMeta.deleteResourceGroup, hcClient);
    }

    public CompletableFuture<ListAlarmHistoriesResponse> listAlarmHistoriesAsync(ListAlarmHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listAlarmHistories);
    }

    public AsyncInvoker<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse> listAlarmHistoriesAsyncInvoker(
        ListAlarmHistoriesRequest request) {
        return new AsyncInvoker<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse>(request,
            CesMeta.listAlarmHistories, hcClient);
    }

    public CompletableFuture<ListAlarmTemplatesResponse> listAlarmTemplatesAsync(ListAlarmTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listAlarmTemplates);
    }

    public AsyncInvoker<ListAlarmTemplatesRequest, ListAlarmTemplatesResponse> listAlarmTemplatesAsyncInvoker(
        ListAlarmTemplatesRequest request) {
        return new AsyncInvoker<ListAlarmTemplatesRequest, ListAlarmTemplatesResponse>(request,
            CesMeta.listAlarmTemplates, hcClient);
    }

    public CompletableFuture<ListAlarmsResponse> listAlarmsAsync(ListAlarmsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listAlarms);
    }

    public AsyncInvoker<ListAlarmsRequest, ListAlarmsResponse> listAlarmsAsyncInvoker(ListAlarmsRequest request) {
        return new AsyncInvoker<ListAlarmsRequest, ListAlarmsResponse>(request, CesMeta.listAlarms, hcClient);
    }

    public CompletableFuture<ListEventDetailResponse> listEventDetailAsync(ListEventDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listEventDetail);
    }

    public AsyncInvoker<ListEventDetailRequest, ListEventDetailResponse> listEventDetailAsyncInvoker(
        ListEventDetailRequest request) {
        return new AsyncInvoker<ListEventDetailRequest, ListEventDetailResponse>(request, CesMeta.listEventDetail,
            hcClient);
    }

    public CompletableFuture<ListEventsResponse> listEventsAsync(ListEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listEvents);
    }

    public AsyncInvoker<ListEventsRequest, ListEventsResponse> listEventsAsyncInvoker(ListEventsRequest request) {
        return new AsyncInvoker<ListEventsRequest, ListEventsResponse>(request, CesMeta.listEvents, hcClient);
    }

    public CompletableFuture<ListMetricsResponse> listMetricsAsync(ListMetricsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listMetrics);
    }

    public AsyncInvoker<ListMetricsRequest, ListMetricsResponse> listMetricsAsyncInvoker(ListMetricsRequest request) {
        return new AsyncInvoker<ListMetricsRequest, ListMetricsResponse>(request, CesMeta.listMetrics, hcClient);
    }

    public CompletableFuture<ListResourceGroupResponse> listResourceGroupAsync(ListResourceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listResourceGroup);
    }

    public AsyncInvoker<ListResourceGroupRequest, ListResourceGroupResponse> listResourceGroupAsyncInvoker(
        ListResourceGroupRequest request) {
        return new AsyncInvoker<ListResourceGroupRequest, ListResourceGroupResponse>(request, CesMeta.listResourceGroup,
            hcClient);
    }

    public CompletableFuture<ShowAlarmResponse> showAlarmAsync(ShowAlarmRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.showAlarm);
    }

    public AsyncInvoker<ShowAlarmRequest, ShowAlarmResponse> showAlarmAsyncInvoker(ShowAlarmRequest request) {
        return new AsyncInvoker<ShowAlarmRequest, ShowAlarmResponse>(request, CesMeta.showAlarm, hcClient);
    }

    public CompletableFuture<ShowEventDataResponse> showEventDataAsync(ShowEventDataRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.showEventData);
    }

    public AsyncInvoker<ShowEventDataRequest, ShowEventDataResponse> showEventDataAsyncInvoker(
        ShowEventDataRequest request) {
        return new AsyncInvoker<ShowEventDataRequest, ShowEventDataResponse>(request, CesMeta.showEventData, hcClient);
    }

    public CompletableFuture<ShowMetricDataResponse> showMetricDataAsync(ShowMetricDataRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.showMetricData);
    }

    public AsyncInvoker<ShowMetricDataRequest, ShowMetricDataResponse> showMetricDataAsyncInvoker(
        ShowMetricDataRequest request) {
        return new AsyncInvoker<ShowMetricDataRequest, ShowMetricDataResponse>(request, CesMeta.showMetricData,
            hcClient);
    }

    public CompletableFuture<ShowQuotasResponse> showQuotasAsync(ShowQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.showQuotas);
    }

    public AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasAsyncInvoker(ShowQuotasRequest request) {
        return new AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse>(request, CesMeta.showQuotas, hcClient);
    }

    public CompletableFuture<ShowResourceGroupResponse> showResourceGroupAsync(ShowResourceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.showResourceGroup);
    }

    public AsyncInvoker<ShowResourceGroupRequest, ShowResourceGroupResponse> showResourceGroupAsyncInvoker(
        ShowResourceGroupRequest request) {
        return new AsyncInvoker<ShowResourceGroupRequest, ShowResourceGroupResponse>(request, CesMeta.showResourceGroup,
            hcClient);
    }

    public CompletableFuture<UpdateAlarmResponse> updateAlarmAsync(UpdateAlarmRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.updateAlarm);
    }

    public AsyncInvoker<UpdateAlarmRequest, UpdateAlarmResponse> updateAlarmAsyncInvoker(UpdateAlarmRequest request) {
        return new AsyncInvoker<UpdateAlarmRequest, UpdateAlarmResponse>(request, CesMeta.updateAlarm, hcClient);
    }

    public CompletableFuture<UpdateAlarmActionResponse> updateAlarmActionAsync(UpdateAlarmActionRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.updateAlarmAction);
    }

    public AsyncInvoker<UpdateAlarmActionRequest, UpdateAlarmActionResponse> updateAlarmActionAsyncInvoker(
        UpdateAlarmActionRequest request) {
        return new AsyncInvoker<UpdateAlarmActionRequest, UpdateAlarmActionResponse>(request, CesMeta.updateAlarmAction,
            hcClient);
    }

    public CompletableFuture<UpdateAlarmTemplateResponse> updateAlarmTemplateAsync(UpdateAlarmTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.updateAlarmTemplate);
    }

    public AsyncInvoker<UpdateAlarmTemplateRequest, UpdateAlarmTemplateResponse> updateAlarmTemplateAsyncInvoker(
        UpdateAlarmTemplateRequest request) {
        return new AsyncInvoker<UpdateAlarmTemplateRequest, UpdateAlarmTemplateResponse>(request,
            CesMeta.updateAlarmTemplate, hcClient);
    }

    public CompletableFuture<UpdateResourceGroupResponse> updateResourceGroupAsync(UpdateResourceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.updateResourceGroup);
    }

    public AsyncInvoker<UpdateResourceGroupRequest, UpdateResourceGroupResponse> updateResourceGroupAsyncInvoker(
        UpdateResourceGroupRequest request) {
        return new AsyncInvoker<UpdateResourceGroupRequest, UpdateResourceGroupResponse>(request,
            CesMeta.updateResourceGroup, hcClient);
    }

}
