package com.g42cloud.sdk.ces.v2;

import com.g42cloud.sdk.ces.v2.model.AddAlarmRuleResourcesRequest;
import com.g42cloud.sdk.ces.v2.model.AddAlarmRuleResourcesResponse;
import com.g42cloud.sdk.ces.v2.model.BatchDeleteAlarmRulesRequest;
import com.g42cloud.sdk.ces.v2.model.BatchDeleteAlarmRulesResponse;
import com.g42cloud.sdk.ces.v2.model.BatchEnableAlarmRulesRequest;
import com.g42cloud.sdk.ces.v2.model.BatchEnableAlarmRulesResponse;
import com.g42cloud.sdk.ces.v2.model.CreateAlarmRulesRequest;
import com.g42cloud.sdk.ces.v2.model.CreateAlarmRulesResponse;
import com.g42cloud.sdk.ces.v2.model.DeleteAlarmRuleResourcesRequest;
import com.g42cloud.sdk.ces.v2.model.DeleteAlarmRuleResourcesResponse;
import com.g42cloud.sdk.ces.v2.model.ListAgentDimensionInfoRequest;
import com.g42cloud.sdk.ces.v2.model.ListAgentDimensionInfoResponse;
import com.g42cloud.sdk.ces.v2.model.ListAlarmHistoriesRequest;
import com.g42cloud.sdk.ces.v2.model.ListAlarmHistoriesResponse;
import com.g42cloud.sdk.ces.v2.model.ListAlarmRulePoliciesRequest;
import com.g42cloud.sdk.ces.v2.model.ListAlarmRulePoliciesResponse;
import com.g42cloud.sdk.ces.v2.model.ListAlarmRuleResourcesRequest;
import com.g42cloud.sdk.ces.v2.model.ListAlarmRuleResourcesResponse;
import com.g42cloud.sdk.ces.v2.model.ListAlarmRulesRequest;
import com.g42cloud.sdk.ces.v2.model.ListAlarmRulesResponse;
import com.g42cloud.sdk.ces.v2.model.UpdateAlarmRulePoliciesRequest;
import com.g42cloud.sdk.ces.v2.model.UpdateAlarmRulePoliciesResponse;
import com.g42cloud.sdk.core.ClientBuilder;
import com.g42cloud.sdk.core.HcClient;
import com.g42cloud.sdk.core.invoker.SyncInvoker;

public class CesClient {

    protected HcClient hcClient;

    public CesClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CesClient> newBuilder() {
        ClientBuilder<CesClient> clientBuilder = new ClientBuilder<>(CesClient::new);
        return clientBuilder;
    }

    public AddAlarmRuleResourcesResponse addAlarmRuleResources(AddAlarmRuleResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.addAlarmRuleResources);
    }

    public SyncInvoker<AddAlarmRuleResourcesRequest, AddAlarmRuleResourcesResponse> addAlarmRuleResourcesInvoker(
        AddAlarmRuleResourcesRequest request) {
        return new SyncInvoker<AddAlarmRuleResourcesRequest, AddAlarmRuleResourcesResponse>(request,
            CesMeta.addAlarmRuleResources, hcClient);
    }

    public BatchDeleteAlarmRulesResponse batchDeleteAlarmRules(BatchDeleteAlarmRulesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.batchDeleteAlarmRules);
    }

    public SyncInvoker<BatchDeleteAlarmRulesRequest, BatchDeleteAlarmRulesResponse> batchDeleteAlarmRulesInvoker(
        BatchDeleteAlarmRulesRequest request) {
        return new SyncInvoker<BatchDeleteAlarmRulesRequest, BatchDeleteAlarmRulesResponse>(request,
            CesMeta.batchDeleteAlarmRules, hcClient);
    }

    public BatchEnableAlarmRulesResponse batchEnableAlarmRules(BatchEnableAlarmRulesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.batchEnableAlarmRules);
    }

    public SyncInvoker<BatchEnableAlarmRulesRequest, BatchEnableAlarmRulesResponse> batchEnableAlarmRulesInvoker(
        BatchEnableAlarmRulesRequest request) {
        return new SyncInvoker<BatchEnableAlarmRulesRequest, BatchEnableAlarmRulesResponse>(request,
            CesMeta.batchEnableAlarmRules, hcClient);
    }

    public CreateAlarmRulesResponse createAlarmRules(CreateAlarmRulesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.createAlarmRules);
    }

    public SyncInvoker<CreateAlarmRulesRequest, CreateAlarmRulesResponse> createAlarmRulesInvoker(
        CreateAlarmRulesRequest request) {
        return new SyncInvoker<CreateAlarmRulesRequest, CreateAlarmRulesResponse>(request, CesMeta.createAlarmRules,
            hcClient);
    }

    public DeleteAlarmRuleResourcesResponse deleteAlarmRuleResources(DeleteAlarmRuleResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.deleteAlarmRuleResources);
    }

    public SyncInvoker<DeleteAlarmRuleResourcesRequest, DeleteAlarmRuleResourcesResponse> deleteAlarmRuleResourcesInvoker(
        DeleteAlarmRuleResourcesRequest request) {
        return new SyncInvoker<DeleteAlarmRuleResourcesRequest, DeleteAlarmRuleResourcesResponse>(request,
            CesMeta.deleteAlarmRuleResources, hcClient);
    }

    public ListAgentDimensionInfoResponse listAgentDimensionInfo(ListAgentDimensionInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listAgentDimensionInfo);
    }

    public SyncInvoker<ListAgentDimensionInfoRequest, ListAgentDimensionInfoResponse> listAgentDimensionInfoInvoker(
        ListAgentDimensionInfoRequest request) {
        return new SyncInvoker<ListAgentDimensionInfoRequest, ListAgentDimensionInfoResponse>(request,
            CesMeta.listAgentDimensionInfo, hcClient);
    }

    public ListAlarmHistoriesResponse listAlarmHistories(ListAlarmHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listAlarmHistories);
    }

    public SyncInvoker<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse> listAlarmHistoriesInvoker(
        ListAlarmHistoriesRequest request) {
        return new SyncInvoker<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse>(request,
            CesMeta.listAlarmHistories, hcClient);
    }

    public ListAlarmRulePoliciesResponse listAlarmRulePolicies(ListAlarmRulePoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listAlarmRulePolicies);
    }

    public SyncInvoker<ListAlarmRulePoliciesRequest, ListAlarmRulePoliciesResponse> listAlarmRulePoliciesInvoker(
        ListAlarmRulePoliciesRequest request) {
        return new SyncInvoker<ListAlarmRulePoliciesRequest, ListAlarmRulePoliciesResponse>(request,
            CesMeta.listAlarmRulePolicies, hcClient);
    }

    public ListAlarmRuleResourcesResponse listAlarmRuleResources(ListAlarmRuleResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listAlarmRuleResources);
    }

    public SyncInvoker<ListAlarmRuleResourcesRequest, ListAlarmRuleResourcesResponse> listAlarmRuleResourcesInvoker(
        ListAlarmRuleResourcesRequest request) {
        return new SyncInvoker<ListAlarmRuleResourcesRequest, ListAlarmRuleResourcesResponse>(request,
            CesMeta.listAlarmRuleResources, hcClient);
    }

    public ListAlarmRulesResponse listAlarmRules(ListAlarmRulesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listAlarmRules);
    }

    public SyncInvoker<ListAlarmRulesRequest, ListAlarmRulesResponse> listAlarmRulesInvoker(
        ListAlarmRulesRequest request) {
        return new SyncInvoker<ListAlarmRulesRequest, ListAlarmRulesResponse>(request, CesMeta.listAlarmRules,
            hcClient);
    }

    public UpdateAlarmRulePoliciesResponse updateAlarmRulePolicies(UpdateAlarmRulePoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.updateAlarmRulePolicies);
    }

    public SyncInvoker<UpdateAlarmRulePoliciesRequest, UpdateAlarmRulePoliciesResponse> updateAlarmRulePoliciesInvoker(
        UpdateAlarmRulePoliciesRequest request) {
        return new SyncInvoker<UpdateAlarmRulePoliciesRequest, UpdateAlarmRulePoliciesResponse>(request,
            CesMeta.updateAlarmRulePolicies, hcClient);
    }

}
