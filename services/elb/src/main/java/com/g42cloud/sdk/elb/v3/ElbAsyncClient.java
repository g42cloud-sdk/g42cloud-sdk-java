package com.g42cloud.sdk.elb.v3;

import com.g42cloud.sdk.core.ClientBuilder;
import com.g42cloud.sdk.core.HcClient;
import com.g42cloud.sdk.core.invoker.AsyncInvoker;
import com.g42cloud.sdk.elb.v3.model.BatchCreateMembersRequest;
import com.g42cloud.sdk.elb.v3.model.BatchCreateMembersResponse;
import com.g42cloud.sdk.elb.v3.model.BatchDeleteIpListRequest;
import com.g42cloud.sdk.elb.v3.model.BatchDeleteIpListResponse;
import com.g42cloud.sdk.elb.v3.model.BatchDeleteMembersRequest;
import com.g42cloud.sdk.elb.v3.model.BatchDeleteMembersResponse;
import com.g42cloud.sdk.elb.v3.model.BatchUpdatePoliciesPriorityRequest;
import com.g42cloud.sdk.elb.v3.model.BatchUpdatePoliciesPriorityResponse;
import com.g42cloud.sdk.elb.v3.model.ChangeLoadbalancerChargeModeRequest;
import com.g42cloud.sdk.elb.v3.model.ChangeLoadbalancerChargeModeResponse;
import com.g42cloud.sdk.elb.v3.model.CountPreoccupyIpNumRequest;
import com.g42cloud.sdk.elb.v3.model.CountPreoccupyIpNumResponse;
import com.g42cloud.sdk.elb.v3.model.CreateCertificateRequest;
import com.g42cloud.sdk.elb.v3.model.CreateCertificateResponse;
import com.g42cloud.sdk.elb.v3.model.CreateHealthMonitorRequest;
import com.g42cloud.sdk.elb.v3.model.CreateHealthMonitorResponse;
import com.g42cloud.sdk.elb.v3.model.CreateIpGroupRequest;
import com.g42cloud.sdk.elb.v3.model.CreateIpGroupResponse;
import com.g42cloud.sdk.elb.v3.model.CreateL7PolicyRequest;
import com.g42cloud.sdk.elb.v3.model.CreateL7PolicyResponse;
import com.g42cloud.sdk.elb.v3.model.CreateL7RuleRequest;
import com.g42cloud.sdk.elb.v3.model.CreateL7RuleResponse;
import com.g42cloud.sdk.elb.v3.model.CreateListenerRequest;
import com.g42cloud.sdk.elb.v3.model.CreateListenerResponse;
import com.g42cloud.sdk.elb.v3.model.CreateLoadBalancerRequest;
import com.g42cloud.sdk.elb.v3.model.CreateLoadBalancerResponse;
import com.g42cloud.sdk.elb.v3.model.CreateLogtankRequest;
import com.g42cloud.sdk.elb.v3.model.CreateLogtankResponse;
import com.g42cloud.sdk.elb.v3.model.CreateMemberRequest;
import com.g42cloud.sdk.elb.v3.model.CreateMemberResponse;
import com.g42cloud.sdk.elb.v3.model.CreatePoolRequest;
import com.g42cloud.sdk.elb.v3.model.CreatePoolResponse;
import com.g42cloud.sdk.elb.v3.model.CreateSecurityPolicyRequest;
import com.g42cloud.sdk.elb.v3.model.CreateSecurityPolicyResponse;
import com.g42cloud.sdk.elb.v3.model.DeleteCertificateRequest;
import com.g42cloud.sdk.elb.v3.model.DeleteCertificateResponse;
import com.g42cloud.sdk.elb.v3.model.DeleteHealthMonitorRequest;
import com.g42cloud.sdk.elb.v3.model.DeleteHealthMonitorResponse;
import com.g42cloud.sdk.elb.v3.model.DeleteIpGroupRequest;
import com.g42cloud.sdk.elb.v3.model.DeleteIpGroupResponse;
import com.g42cloud.sdk.elb.v3.model.DeleteL7PolicyRequest;
import com.g42cloud.sdk.elb.v3.model.DeleteL7PolicyResponse;
import com.g42cloud.sdk.elb.v3.model.DeleteL7RuleRequest;
import com.g42cloud.sdk.elb.v3.model.DeleteL7RuleResponse;
import com.g42cloud.sdk.elb.v3.model.DeleteListenerRequest;
import com.g42cloud.sdk.elb.v3.model.DeleteListenerResponse;
import com.g42cloud.sdk.elb.v3.model.DeleteLoadBalancerRequest;
import com.g42cloud.sdk.elb.v3.model.DeleteLoadBalancerResponse;
import com.g42cloud.sdk.elb.v3.model.DeleteLogtankRequest;
import com.g42cloud.sdk.elb.v3.model.DeleteLogtankResponse;
import com.g42cloud.sdk.elb.v3.model.DeleteMemberRequest;
import com.g42cloud.sdk.elb.v3.model.DeleteMemberResponse;
import com.g42cloud.sdk.elb.v3.model.DeletePoolRequest;
import com.g42cloud.sdk.elb.v3.model.DeletePoolResponse;
import com.g42cloud.sdk.elb.v3.model.DeleteSecurityPolicyRequest;
import com.g42cloud.sdk.elb.v3.model.DeleteSecurityPolicyResponse;
import com.g42cloud.sdk.elb.v3.model.ListAllMembersRequest;
import com.g42cloud.sdk.elb.v3.model.ListAllMembersResponse;
import com.g42cloud.sdk.elb.v3.model.ListApiVersionsRequest;
import com.g42cloud.sdk.elb.v3.model.ListApiVersionsResponse;
import com.g42cloud.sdk.elb.v3.model.ListAvailabilityZonesRequest;
import com.g42cloud.sdk.elb.v3.model.ListAvailabilityZonesResponse;
import com.g42cloud.sdk.elb.v3.model.ListCertificatesRequest;
import com.g42cloud.sdk.elb.v3.model.ListCertificatesResponse;
import com.g42cloud.sdk.elb.v3.model.ListFlavorsRequest;
import com.g42cloud.sdk.elb.v3.model.ListFlavorsResponse;
import com.g42cloud.sdk.elb.v3.model.ListHealthMonitorsRequest;
import com.g42cloud.sdk.elb.v3.model.ListHealthMonitorsResponse;
import com.g42cloud.sdk.elb.v3.model.ListIpGroupsRequest;
import com.g42cloud.sdk.elb.v3.model.ListIpGroupsResponse;
import com.g42cloud.sdk.elb.v3.model.ListL7PoliciesRequest;
import com.g42cloud.sdk.elb.v3.model.ListL7PoliciesResponse;
import com.g42cloud.sdk.elb.v3.model.ListL7RulesRequest;
import com.g42cloud.sdk.elb.v3.model.ListL7RulesResponse;
import com.g42cloud.sdk.elb.v3.model.ListListenersRequest;
import com.g42cloud.sdk.elb.v3.model.ListListenersResponse;
import com.g42cloud.sdk.elb.v3.model.ListLoadBalancersRequest;
import com.g42cloud.sdk.elb.v3.model.ListLoadBalancersResponse;
import com.g42cloud.sdk.elb.v3.model.ListLogtanksRequest;
import com.g42cloud.sdk.elb.v3.model.ListLogtanksResponse;
import com.g42cloud.sdk.elb.v3.model.ListMembersRequest;
import com.g42cloud.sdk.elb.v3.model.ListMembersResponse;
import com.g42cloud.sdk.elb.v3.model.ListPoolsRequest;
import com.g42cloud.sdk.elb.v3.model.ListPoolsResponse;
import com.g42cloud.sdk.elb.v3.model.ListQuotaDetailsRequest;
import com.g42cloud.sdk.elb.v3.model.ListQuotaDetailsResponse;
import com.g42cloud.sdk.elb.v3.model.ListSecurityPoliciesRequest;
import com.g42cloud.sdk.elb.v3.model.ListSecurityPoliciesResponse;
import com.g42cloud.sdk.elb.v3.model.ListSystemSecurityPoliciesRequest;
import com.g42cloud.sdk.elb.v3.model.ListSystemSecurityPoliciesResponse;
import com.g42cloud.sdk.elb.v3.model.ShowCertificateRequest;
import com.g42cloud.sdk.elb.v3.model.ShowCertificateResponse;
import com.g42cloud.sdk.elb.v3.model.ShowFlavorRequest;
import com.g42cloud.sdk.elb.v3.model.ShowFlavorResponse;
import com.g42cloud.sdk.elb.v3.model.ShowHealthMonitorRequest;
import com.g42cloud.sdk.elb.v3.model.ShowHealthMonitorResponse;
import com.g42cloud.sdk.elb.v3.model.ShowIpGroupRequest;
import com.g42cloud.sdk.elb.v3.model.ShowIpGroupResponse;
import com.g42cloud.sdk.elb.v3.model.ShowL7PolicyRequest;
import com.g42cloud.sdk.elb.v3.model.ShowL7PolicyResponse;
import com.g42cloud.sdk.elb.v3.model.ShowL7RuleRequest;
import com.g42cloud.sdk.elb.v3.model.ShowL7RuleResponse;
import com.g42cloud.sdk.elb.v3.model.ShowListenerRequest;
import com.g42cloud.sdk.elb.v3.model.ShowListenerResponse;
import com.g42cloud.sdk.elb.v3.model.ShowLoadBalancerRequest;
import com.g42cloud.sdk.elb.v3.model.ShowLoadBalancerResponse;
import com.g42cloud.sdk.elb.v3.model.ShowLoadBalancerStatusRequest;
import com.g42cloud.sdk.elb.v3.model.ShowLoadBalancerStatusResponse;
import com.g42cloud.sdk.elb.v3.model.ShowLogtankRequest;
import com.g42cloud.sdk.elb.v3.model.ShowLogtankResponse;
import com.g42cloud.sdk.elb.v3.model.ShowMemberRequest;
import com.g42cloud.sdk.elb.v3.model.ShowMemberResponse;
import com.g42cloud.sdk.elb.v3.model.ShowPoolRequest;
import com.g42cloud.sdk.elb.v3.model.ShowPoolResponse;
import com.g42cloud.sdk.elb.v3.model.ShowQuotaRequest;
import com.g42cloud.sdk.elb.v3.model.ShowQuotaResponse;
import com.g42cloud.sdk.elb.v3.model.ShowSecurityPolicyRequest;
import com.g42cloud.sdk.elb.v3.model.ShowSecurityPolicyResponse;
import com.g42cloud.sdk.elb.v3.model.UpdateCertificateRequest;
import com.g42cloud.sdk.elb.v3.model.UpdateCertificateResponse;
import com.g42cloud.sdk.elb.v3.model.UpdateHealthMonitorRequest;
import com.g42cloud.sdk.elb.v3.model.UpdateHealthMonitorResponse;
import com.g42cloud.sdk.elb.v3.model.UpdateIpGroupRequest;
import com.g42cloud.sdk.elb.v3.model.UpdateIpGroupResponse;
import com.g42cloud.sdk.elb.v3.model.UpdateIpListRequest;
import com.g42cloud.sdk.elb.v3.model.UpdateIpListResponse;
import com.g42cloud.sdk.elb.v3.model.UpdateL7PolicyRequest;
import com.g42cloud.sdk.elb.v3.model.UpdateL7PolicyResponse;
import com.g42cloud.sdk.elb.v3.model.UpdateL7RuleRequest;
import com.g42cloud.sdk.elb.v3.model.UpdateL7RuleResponse;
import com.g42cloud.sdk.elb.v3.model.UpdateListenerRequest;
import com.g42cloud.sdk.elb.v3.model.UpdateListenerResponse;
import com.g42cloud.sdk.elb.v3.model.UpdateLoadBalancerRequest;
import com.g42cloud.sdk.elb.v3.model.UpdateLoadBalancerResponse;
import com.g42cloud.sdk.elb.v3.model.UpdateLogtankRequest;
import com.g42cloud.sdk.elb.v3.model.UpdateLogtankResponse;
import com.g42cloud.sdk.elb.v3.model.UpdateMemberRequest;
import com.g42cloud.sdk.elb.v3.model.UpdateMemberResponse;
import com.g42cloud.sdk.elb.v3.model.UpdatePoolRequest;
import com.g42cloud.sdk.elb.v3.model.UpdatePoolResponse;
import com.g42cloud.sdk.elb.v3.model.UpdateSecurityPolicyRequest;
import com.g42cloud.sdk.elb.v3.model.UpdateSecurityPolicyResponse;

import java.util.concurrent.CompletableFuture;

public class ElbAsyncClient {

    protected HcClient hcClient;

    public ElbAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ElbAsyncClient> newBuilder() {
        ClientBuilder<ElbAsyncClient> clientBuilder = new ClientBuilder<>(ElbAsyncClient::new);
        return clientBuilder;
    }

    public CompletableFuture<BatchCreateMembersResponse> batchCreateMembersAsync(BatchCreateMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.batchCreateMembers);
    }

    public AsyncInvoker<BatchCreateMembersRequest, BatchCreateMembersResponse> batchCreateMembersAsyncInvoker(
        BatchCreateMembersRequest request) {
        return new AsyncInvoker<BatchCreateMembersRequest, BatchCreateMembersResponse>(request,
            ElbMeta.batchCreateMembers, hcClient);
    }

    public CompletableFuture<BatchDeleteMembersResponse> batchDeleteMembersAsync(BatchDeleteMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.batchDeleteMembers);
    }

    public AsyncInvoker<BatchDeleteMembersRequest, BatchDeleteMembersResponse> batchDeleteMembersAsyncInvoker(
        BatchDeleteMembersRequest request) {
        return new AsyncInvoker<BatchDeleteMembersRequest, BatchDeleteMembersResponse>(request,
            ElbMeta.batchDeleteMembers, hcClient);
    }

    public CompletableFuture<BatchUpdatePoliciesPriorityResponse> batchUpdatePoliciesPriorityAsync(
        BatchUpdatePoliciesPriorityRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.batchUpdatePoliciesPriority);
    }

    public AsyncInvoker<BatchUpdatePoliciesPriorityRequest, BatchUpdatePoliciesPriorityResponse> batchUpdatePoliciesPriorityAsyncInvoker(
        BatchUpdatePoliciesPriorityRequest request) {
        return new AsyncInvoker<BatchUpdatePoliciesPriorityRequest, BatchUpdatePoliciesPriorityResponse>(request,
            ElbMeta.batchUpdatePoliciesPriority, hcClient);
    }

    public CompletableFuture<ChangeLoadbalancerChargeModeResponse> changeLoadbalancerChargeModeAsync(
        ChangeLoadbalancerChargeModeRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.changeLoadbalancerChargeMode);
    }

    public AsyncInvoker<ChangeLoadbalancerChargeModeRequest, ChangeLoadbalancerChargeModeResponse> changeLoadbalancerChargeModeAsyncInvoker(
        ChangeLoadbalancerChargeModeRequest request) {
        return new AsyncInvoker<ChangeLoadbalancerChargeModeRequest, ChangeLoadbalancerChargeModeResponse>(request,
            ElbMeta.changeLoadbalancerChargeMode, hcClient);
    }

    public CompletableFuture<CreateCertificateResponse> createCertificateAsync(CreateCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createCertificate);
    }

    public AsyncInvoker<CreateCertificateRequest, CreateCertificateResponse> createCertificateAsyncInvoker(
        CreateCertificateRequest request) {
        return new AsyncInvoker<CreateCertificateRequest, CreateCertificateResponse>(request, ElbMeta.createCertificate,
            hcClient);
    }

    public CompletableFuture<CreateHealthMonitorResponse> createHealthMonitorAsync(CreateHealthMonitorRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createHealthMonitor);
    }

    public AsyncInvoker<CreateHealthMonitorRequest, CreateHealthMonitorResponse> createHealthMonitorAsyncInvoker(
        CreateHealthMonitorRequest request) {
        return new AsyncInvoker<CreateHealthMonitorRequest, CreateHealthMonitorResponse>(request,
            ElbMeta.createHealthMonitor, hcClient);
    }

    public CompletableFuture<CreateL7PolicyResponse> createL7PolicyAsync(CreateL7PolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createL7Policy);
    }

    public AsyncInvoker<CreateL7PolicyRequest, CreateL7PolicyResponse> createL7PolicyAsyncInvoker(
        CreateL7PolicyRequest request) {
        return new AsyncInvoker<CreateL7PolicyRequest, CreateL7PolicyResponse>(request, ElbMeta.createL7Policy,
            hcClient);
    }

    public CompletableFuture<CreateL7RuleResponse> createL7RuleAsync(CreateL7RuleRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createL7Rule);
    }

    public AsyncInvoker<CreateL7RuleRequest, CreateL7RuleResponse> createL7RuleAsyncInvoker(
        CreateL7RuleRequest request) {
        return new AsyncInvoker<CreateL7RuleRequest, CreateL7RuleResponse>(request, ElbMeta.createL7Rule, hcClient);
    }

    public CompletableFuture<CreateListenerResponse> createListenerAsync(CreateListenerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createListener);
    }

    public AsyncInvoker<CreateListenerRequest, CreateListenerResponse> createListenerAsyncInvoker(
        CreateListenerRequest request) {
        return new AsyncInvoker<CreateListenerRequest, CreateListenerResponse>(request, ElbMeta.createListener,
            hcClient);
    }

    public CompletableFuture<CreateLoadBalancerResponse> createLoadBalancerAsync(CreateLoadBalancerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createLoadBalancer);
    }

    public AsyncInvoker<CreateLoadBalancerRequest, CreateLoadBalancerResponse> createLoadBalancerAsyncInvoker(
        CreateLoadBalancerRequest request) {
        return new AsyncInvoker<CreateLoadBalancerRequest, CreateLoadBalancerResponse>(request,
            ElbMeta.createLoadBalancer, hcClient);
    }

    public CompletableFuture<CreateLogtankResponse> createLogtankAsync(CreateLogtankRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createLogtank);
    }

    public AsyncInvoker<CreateLogtankRequest, CreateLogtankResponse> createLogtankAsyncInvoker(
        CreateLogtankRequest request) {
        return new AsyncInvoker<CreateLogtankRequest, CreateLogtankResponse>(request, ElbMeta.createLogtank, hcClient);
    }

    public CompletableFuture<CreateMemberResponse> createMemberAsync(CreateMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createMember);
    }

    public AsyncInvoker<CreateMemberRequest, CreateMemberResponse> createMemberAsyncInvoker(
        CreateMemberRequest request) {
        return new AsyncInvoker<CreateMemberRequest, CreateMemberResponse>(request, ElbMeta.createMember, hcClient);
    }

    public CompletableFuture<CreatePoolResponse> createPoolAsync(CreatePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createPool);
    }

    public AsyncInvoker<CreatePoolRequest, CreatePoolResponse> createPoolAsyncInvoker(CreatePoolRequest request) {
        return new AsyncInvoker<CreatePoolRequest, CreatePoolResponse>(request, ElbMeta.createPool, hcClient);
    }

    public CompletableFuture<CreateSecurityPolicyResponse> createSecurityPolicyAsync(
        CreateSecurityPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createSecurityPolicy);
    }

    public AsyncInvoker<CreateSecurityPolicyRequest, CreateSecurityPolicyResponse> createSecurityPolicyAsyncInvoker(
        CreateSecurityPolicyRequest request) {
        return new AsyncInvoker<CreateSecurityPolicyRequest, CreateSecurityPolicyResponse>(request,
            ElbMeta.createSecurityPolicy, hcClient);
    }

    public CompletableFuture<DeleteCertificateResponse> deleteCertificateAsync(DeleteCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteCertificate);
    }

    public AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificateAsyncInvoker(
        DeleteCertificateRequest request) {
        return new AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>(request, ElbMeta.deleteCertificate,
            hcClient);
    }

    public CompletableFuture<DeleteHealthMonitorResponse> deleteHealthMonitorAsync(DeleteHealthMonitorRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteHealthMonitor);
    }

    public AsyncInvoker<DeleteHealthMonitorRequest, DeleteHealthMonitorResponse> deleteHealthMonitorAsyncInvoker(
        DeleteHealthMonitorRequest request) {
        return new AsyncInvoker<DeleteHealthMonitorRequest, DeleteHealthMonitorResponse>(request,
            ElbMeta.deleteHealthMonitor, hcClient);
    }

    public CompletableFuture<DeleteL7PolicyResponse> deleteL7PolicyAsync(DeleteL7PolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteL7Policy);
    }

    public AsyncInvoker<DeleteL7PolicyRequest, DeleteL7PolicyResponse> deleteL7PolicyAsyncInvoker(
        DeleteL7PolicyRequest request) {
        return new AsyncInvoker<DeleteL7PolicyRequest, DeleteL7PolicyResponse>(request, ElbMeta.deleteL7Policy,
            hcClient);
    }

    public CompletableFuture<DeleteL7RuleResponse> deleteL7RuleAsync(DeleteL7RuleRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteL7Rule);
    }

    public AsyncInvoker<DeleteL7RuleRequest, DeleteL7RuleResponse> deleteL7RuleAsyncInvoker(
        DeleteL7RuleRequest request) {
        return new AsyncInvoker<DeleteL7RuleRequest, DeleteL7RuleResponse>(request, ElbMeta.deleteL7Rule, hcClient);
    }

    public CompletableFuture<DeleteListenerResponse> deleteListenerAsync(DeleteListenerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteListener);
    }

    public AsyncInvoker<DeleteListenerRequest, DeleteListenerResponse> deleteListenerAsyncInvoker(
        DeleteListenerRequest request) {
        return new AsyncInvoker<DeleteListenerRequest, DeleteListenerResponse>(request, ElbMeta.deleteListener,
            hcClient);
    }

    public CompletableFuture<DeleteLoadBalancerResponse> deleteLoadBalancerAsync(DeleteLoadBalancerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteLoadBalancer);
    }

    public AsyncInvoker<DeleteLoadBalancerRequest, DeleteLoadBalancerResponse> deleteLoadBalancerAsyncInvoker(
        DeleteLoadBalancerRequest request) {
        return new AsyncInvoker<DeleteLoadBalancerRequest, DeleteLoadBalancerResponse>(request,
            ElbMeta.deleteLoadBalancer, hcClient);
    }

    public CompletableFuture<DeleteLogtankResponse> deleteLogtankAsync(DeleteLogtankRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteLogtank);
    }

    public AsyncInvoker<DeleteLogtankRequest, DeleteLogtankResponse> deleteLogtankAsyncInvoker(
        DeleteLogtankRequest request) {
        return new AsyncInvoker<DeleteLogtankRequest, DeleteLogtankResponse>(request, ElbMeta.deleteLogtank, hcClient);
    }

    public CompletableFuture<DeleteMemberResponse> deleteMemberAsync(DeleteMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteMember);
    }

    public AsyncInvoker<DeleteMemberRequest, DeleteMemberResponse> deleteMemberAsyncInvoker(
        DeleteMemberRequest request) {
        return new AsyncInvoker<DeleteMemberRequest, DeleteMemberResponse>(request, ElbMeta.deleteMember, hcClient);
    }

    public CompletableFuture<DeletePoolResponse> deletePoolAsync(DeletePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deletePool);
    }

    public AsyncInvoker<DeletePoolRequest, DeletePoolResponse> deletePoolAsyncInvoker(DeletePoolRequest request) {
        return new AsyncInvoker<DeletePoolRequest, DeletePoolResponse>(request, ElbMeta.deletePool, hcClient);
    }

    public CompletableFuture<DeleteSecurityPolicyResponse> deleteSecurityPolicyAsync(
        DeleteSecurityPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteSecurityPolicy);
    }

    public AsyncInvoker<DeleteSecurityPolicyRequest, DeleteSecurityPolicyResponse> deleteSecurityPolicyAsyncInvoker(
        DeleteSecurityPolicyRequest request) {
        return new AsyncInvoker<DeleteSecurityPolicyRequest, DeleteSecurityPolicyResponse>(request,
            ElbMeta.deleteSecurityPolicy, hcClient);
    }

    public CompletableFuture<ListAllMembersResponse> listAllMembersAsync(ListAllMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listAllMembers);
    }

    public AsyncInvoker<ListAllMembersRequest, ListAllMembersResponse> listAllMembersAsyncInvoker(
        ListAllMembersRequest request) {
        return new AsyncInvoker<ListAllMembersRequest, ListAllMembersResponse>(request, ElbMeta.listAllMembers,
            hcClient);
    }

    public CompletableFuture<ListAvailabilityZonesResponse> listAvailabilityZonesAsync(
        ListAvailabilityZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listAvailabilityZones);
    }

    public AsyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> listAvailabilityZonesAsyncInvoker(
        ListAvailabilityZonesRequest request) {
        return new AsyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse>(request,
            ElbMeta.listAvailabilityZones, hcClient);
    }

    public CompletableFuture<ListCertificatesResponse> listCertificatesAsync(ListCertificatesRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listCertificates);
    }

    public AsyncInvoker<ListCertificatesRequest, ListCertificatesResponse> listCertificatesAsyncInvoker(
        ListCertificatesRequest request) {
        return new AsyncInvoker<ListCertificatesRequest, ListCertificatesResponse>(request, ElbMeta.listCertificates,
            hcClient);
    }

    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listFlavors);
    }

    public AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsAsyncInvoker(ListFlavorsRequest request) {
        return new AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, ElbMeta.listFlavors, hcClient);
    }

    public CompletableFuture<ListHealthMonitorsResponse> listHealthMonitorsAsync(ListHealthMonitorsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listHealthMonitors);
    }

    public AsyncInvoker<ListHealthMonitorsRequest, ListHealthMonitorsResponse> listHealthMonitorsAsyncInvoker(
        ListHealthMonitorsRequest request) {
        return new AsyncInvoker<ListHealthMonitorsRequest, ListHealthMonitorsResponse>(request,
            ElbMeta.listHealthMonitors, hcClient);
    }

    public CompletableFuture<ListL7PoliciesResponse> listL7PoliciesAsync(ListL7PoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listL7Policies);
    }

    public AsyncInvoker<ListL7PoliciesRequest, ListL7PoliciesResponse> listL7PoliciesAsyncInvoker(
        ListL7PoliciesRequest request) {
        return new AsyncInvoker<ListL7PoliciesRequest, ListL7PoliciesResponse>(request, ElbMeta.listL7Policies,
            hcClient);
    }

    public CompletableFuture<ListL7RulesResponse> listL7RulesAsync(ListL7RulesRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listL7Rules);
    }

    public AsyncInvoker<ListL7RulesRequest, ListL7RulesResponse> listL7RulesAsyncInvoker(ListL7RulesRequest request) {
        return new AsyncInvoker<ListL7RulesRequest, ListL7RulesResponse>(request, ElbMeta.listL7Rules, hcClient);
    }

    public CompletableFuture<ListListenersResponse> listListenersAsync(ListListenersRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listListeners);
    }

    public AsyncInvoker<ListListenersRequest, ListListenersResponse> listListenersAsyncInvoker(
        ListListenersRequest request) {
        return new AsyncInvoker<ListListenersRequest, ListListenersResponse>(request, ElbMeta.listListeners, hcClient);
    }

    public CompletableFuture<ListLoadBalancersResponse> listLoadBalancersAsync(ListLoadBalancersRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listLoadBalancers);
    }

    public AsyncInvoker<ListLoadBalancersRequest, ListLoadBalancersResponse> listLoadBalancersAsyncInvoker(
        ListLoadBalancersRequest request) {
        return new AsyncInvoker<ListLoadBalancersRequest, ListLoadBalancersResponse>(request, ElbMeta.listLoadBalancers,
            hcClient);
    }

    public CompletableFuture<ListLogtanksResponse> listLogtanksAsync(ListLogtanksRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listLogtanks);
    }

    public AsyncInvoker<ListLogtanksRequest, ListLogtanksResponse> listLogtanksAsyncInvoker(
        ListLogtanksRequest request) {
        return new AsyncInvoker<ListLogtanksRequest, ListLogtanksResponse>(request, ElbMeta.listLogtanks, hcClient);
    }

    public CompletableFuture<ListMembersResponse> listMembersAsync(ListMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listMembers);
    }

    public AsyncInvoker<ListMembersRequest, ListMembersResponse> listMembersAsyncInvoker(ListMembersRequest request) {
        return new AsyncInvoker<ListMembersRequest, ListMembersResponse>(request, ElbMeta.listMembers, hcClient);
    }

    public CompletableFuture<ListPoolsResponse> listPoolsAsync(ListPoolsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listPools);
    }

    public AsyncInvoker<ListPoolsRequest, ListPoolsResponse> listPoolsAsyncInvoker(ListPoolsRequest request) {
        return new AsyncInvoker<ListPoolsRequest, ListPoolsResponse>(request, ElbMeta.listPools, hcClient);
    }

    public CompletableFuture<ListQuotaDetailsResponse> listQuotaDetailsAsync(ListQuotaDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listQuotaDetails);
    }

    public AsyncInvoker<ListQuotaDetailsRequest, ListQuotaDetailsResponse> listQuotaDetailsAsyncInvoker(
        ListQuotaDetailsRequest request) {
        return new AsyncInvoker<ListQuotaDetailsRequest, ListQuotaDetailsResponse>(request, ElbMeta.listQuotaDetails,
            hcClient);
    }

    public CompletableFuture<ListSecurityPoliciesResponse> listSecurityPoliciesAsync(
        ListSecurityPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listSecurityPolicies);
    }

    public AsyncInvoker<ListSecurityPoliciesRequest, ListSecurityPoliciesResponse> listSecurityPoliciesAsyncInvoker(
        ListSecurityPoliciesRequest request) {
        return new AsyncInvoker<ListSecurityPoliciesRequest, ListSecurityPoliciesResponse>(request,
            ElbMeta.listSecurityPolicies, hcClient);
    }

    public CompletableFuture<ListSystemSecurityPoliciesResponse> listSystemSecurityPoliciesAsync(
        ListSystemSecurityPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listSystemSecurityPolicies);
    }

    public AsyncInvoker<ListSystemSecurityPoliciesRequest, ListSystemSecurityPoliciesResponse> listSystemSecurityPoliciesAsyncInvoker(
        ListSystemSecurityPoliciesRequest request) {
        return new AsyncInvoker<ListSystemSecurityPoliciesRequest, ListSystemSecurityPoliciesResponse>(request,
            ElbMeta.listSystemSecurityPolicies, hcClient);
    }

    public CompletableFuture<ShowCertificateResponse> showCertificateAsync(ShowCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showCertificate);
    }

    public AsyncInvoker<ShowCertificateRequest, ShowCertificateResponse> showCertificateAsyncInvoker(
        ShowCertificateRequest request) {
        return new AsyncInvoker<ShowCertificateRequest, ShowCertificateResponse>(request, ElbMeta.showCertificate,
            hcClient);
    }

    public CompletableFuture<ShowFlavorResponse> showFlavorAsync(ShowFlavorRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showFlavor);
    }

    public AsyncInvoker<ShowFlavorRequest, ShowFlavorResponse> showFlavorAsyncInvoker(ShowFlavorRequest request) {
        return new AsyncInvoker<ShowFlavorRequest, ShowFlavorResponse>(request, ElbMeta.showFlavor, hcClient);
    }

    public CompletableFuture<ShowHealthMonitorResponse> showHealthMonitorAsync(ShowHealthMonitorRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showHealthMonitor);
    }

    public AsyncInvoker<ShowHealthMonitorRequest, ShowHealthMonitorResponse> showHealthMonitorAsyncInvoker(
        ShowHealthMonitorRequest request) {
        return new AsyncInvoker<ShowHealthMonitorRequest, ShowHealthMonitorResponse>(request, ElbMeta.showHealthMonitor,
            hcClient);
    }

    public CompletableFuture<ShowL7PolicyResponse> showL7PolicyAsync(ShowL7PolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showL7Policy);
    }

    public AsyncInvoker<ShowL7PolicyRequest, ShowL7PolicyResponse> showL7PolicyAsyncInvoker(
        ShowL7PolicyRequest request) {
        return new AsyncInvoker<ShowL7PolicyRequest, ShowL7PolicyResponse>(request, ElbMeta.showL7Policy, hcClient);
    }

    public CompletableFuture<ShowL7RuleResponse> showL7RuleAsync(ShowL7RuleRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showL7Rule);
    }

    public AsyncInvoker<ShowL7RuleRequest, ShowL7RuleResponse> showL7RuleAsyncInvoker(ShowL7RuleRequest request) {
        return new AsyncInvoker<ShowL7RuleRequest, ShowL7RuleResponse>(request, ElbMeta.showL7Rule, hcClient);
    }

    public CompletableFuture<ShowListenerResponse> showListenerAsync(ShowListenerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showListener);
    }

    public AsyncInvoker<ShowListenerRequest, ShowListenerResponse> showListenerAsyncInvoker(
        ShowListenerRequest request) {
        return new AsyncInvoker<ShowListenerRequest, ShowListenerResponse>(request, ElbMeta.showListener, hcClient);
    }

    public CompletableFuture<ShowLoadBalancerResponse> showLoadBalancerAsync(ShowLoadBalancerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showLoadBalancer);
    }

    public AsyncInvoker<ShowLoadBalancerRequest, ShowLoadBalancerResponse> showLoadBalancerAsyncInvoker(
        ShowLoadBalancerRequest request) {
        return new AsyncInvoker<ShowLoadBalancerRequest, ShowLoadBalancerResponse>(request, ElbMeta.showLoadBalancer,
            hcClient);
    }

    public CompletableFuture<ShowLoadBalancerStatusResponse> showLoadBalancerStatusAsync(
        ShowLoadBalancerStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showLoadBalancerStatus);
    }

    public AsyncInvoker<ShowLoadBalancerStatusRequest, ShowLoadBalancerStatusResponse> showLoadBalancerStatusAsyncInvoker(
        ShowLoadBalancerStatusRequest request) {
        return new AsyncInvoker<ShowLoadBalancerStatusRequest, ShowLoadBalancerStatusResponse>(request,
            ElbMeta.showLoadBalancerStatus, hcClient);
    }

    public CompletableFuture<ShowLogtankResponse> showLogtankAsync(ShowLogtankRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showLogtank);
    }

    public AsyncInvoker<ShowLogtankRequest, ShowLogtankResponse> showLogtankAsyncInvoker(ShowLogtankRequest request) {
        return new AsyncInvoker<ShowLogtankRequest, ShowLogtankResponse>(request, ElbMeta.showLogtank, hcClient);
    }

    public CompletableFuture<ShowMemberResponse> showMemberAsync(ShowMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showMember);
    }

    public AsyncInvoker<ShowMemberRequest, ShowMemberResponse> showMemberAsyncInvoker(ShowMemberRequest request) {
        return new AsyncInvoker<ShowMemberRequest, ShowMemberResponse>(request, ElbMeta.showMember, hcClient);
    }

    public CompletableFuture<ShowPoolResponse> showPoolAsync(ShowPoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showPool);
    }

    public AsyncInvoker<ShowPoolRequest, ShowPoolResponse> showPoolAsyncInvoker(ShowPoolRequest request) {
        return new AsyncInvoker<ShowPoolRequest, ShowPoolResponse>(request, ElbMeta.showPool, hcClient);
    }

    public CompletableFuture<ShowQuotaResponse> showQuotaAsync(ShowQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showQuota);
    }

    public AsyncInvoker<ShowQuotaRequest, ShowQuotaResponse> showQuotaAsyncInvoker(ShowQuotaRequest request) {
        return new AsyncInvoker<ShowQuotaRequest, ShowQuotaResponse>(request, ElbMeta.showQuota, hcClient);
    }

    public CompletableFuture<ShowSecurityPolicyResponse> showSecurityPolicyAsync(ShowSecurityPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showSecurityPolicy);
    }

    public AsyncInvoker<ShowSecurityPolicyRequest, ShowSecurityPolicyResponse> showSecurityPolicyAsyncInvoker(
        ShowSecurityPolicyRequest request) {
        return new AsyncInvoker<ShowSecurityPolicyRequest, ShowSecurityPolicyResponse>(request,
            ElbMeta.showSecurityPolicy, hcClient);
    }

    public CompletableFuture<UpdateCertificateResponse> updateCertificateAsync(UpdateCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateCertificate);
    }

    public AsyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse> updateCertificateAsyncInvoker(
        UpdateCertificateRequest request) {
        return new AsyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse>(request, ElbMeta.updateCertificate,
            hcClient);
    }

    public CompletableFuture<UpdateHealthMonitorResponse> updateHealthMonitorAsync(UpdateHealthMonitorRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateHealthMonitor);
    }

    public AsyncInvoker<UpdateHealthMonitorRequest, UpdateHealthMonitorResponse> updateHealthMonitorAsyncInvoker(
        UpdateHealthMonitorRequest request) {
        return new AsyncInvoker<UpdateHealthMonitorRequest, UpdateHealthMonitorResponse>(request,
            ElbMeta.updateHealthMonitor, hcClient);
    }

    public CompletableFuture<UpdateL7PolicyResponse> updateL7PolicyAsync(UpdateL7PolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateL7Policy);
    }

    public AsyncInvoker<UpdateL7PolicyRequest, UpdateL7PolicyResponse> updateL7PolicyAsyncInvoker(
        UpdateL7PolicyRequest request) {
        return new AsyncInvoker<UpdateL7PolicyRequest, UpdateL7PolicyResponse>(request, ElbMeta.updateL7Policy,
            hcClient);
    }

    public CompletableFuture<UpdateL7RuleResponse> updateL7RuleAsync(UpdateL7RuleRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateL7Rule);
    }

    public AsyncInvoker<UpdateL7RuleRequest, UpdateL7RuleResponse> updateL7RuleAsyncInvoker(
        UpdateL7RuleRequest request) {
        return new AsyncInvoker<UpdateL7RuleRequest, UpdateL7RuleResponse>(request, ElbMeta.updateL7Rule, hcClient);
    }

    public CompletableFuture<UpdateListenerResponse> updateListenerAsync(UpdateListenerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateListener);
    }

    public AsyncInvoker<UpdateListenerRequest, UpdateListenerResponse> updateListenerAsyncInvoker(
        UpdateListenerRequest request) {
        return new AsyncInvoker<UpdateListenerRequest, UpdateListenerResponse>(request, ElbMeta.updateListener,
            hcClient);
    }

    public CompletableFuture<UpdateLoadBalancerResponse> updateLoadBalancerAsync(UpdateLoadBalancerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateLoadBalancer);
    }

    public AsyncInvoker<UpdateLoadBalancerRequest, UpdateLoadBalancerResponse> updateLoadBalancerAsyncInvoker(
        UpdateLoadBalancerRequest request) {
        return new AsyncInvoker<UpdateLoadBalancerRequest, UpdateLoadBalancerResponse>(request,
            ElbMeta.updateLoadBalancer, hcClient);
    }

    public CompletableFuture<UpdateLogtankResponse> updateLogtankAsync(UpdateLogtankRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateLogtank);
    }

    public AsyncInvoker<UpdateLogtankRequest, UpdateLogtankResponse> updateLogtankAsyncInvoker(
        UpdateLogtankRequest request) {
        return new AsyncInvoker<UpdateLogtankRequest, UpdateLogtankResponse>(request, ElbMeta.updateLogtank, hcClient);
    }

    public CompletableFuture<UpdateMemberResponse> updateMemberAsync(UpdateMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateMember);
    }

    public AsyncInvoker<UpdateMemberRequest, UpdateMemberResponse> updateMemberAsyncInvoker(
        UpdateMemberRequest request) {
        return new AsyncInvoker<UpdateMemberRequest, UpdateMemberResponse>(request, ElbMeta.updateMember, hcClient);
    }

    public CompletableFuture<UpdatePoolResponse> updatePoolAsync(UpdatePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updatePool);
    }

    public AsyncInvoker<UpdatePoolRequest, UpdatePoolResponse> updatePoolAsyncInvoker(UpdatePoolRequest request) {
        return new AsyncInvoker<UpdatePoolRequest, UpdatePoolResponse>(request, ElbMeta.updatePool, hcClient);
    }

    public CompletableFuture<UpdateSecurityPolicyResponse> updateSecurityPolicyAsync(
        UpdateSecurityPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateSecurityPolicy);
    }

    public AsyncInvoker<UpdateSecurityPolicyRequest, UpdateSecurityPolicyResponse> updateSecurityPolicyAsyncInvoker(
        UpdateSecurityPolicyRequest request) {
        return new AsyncInvoker<UpdateSecurityPolicyRequest, UpdateSecurityPolicyResponse>(request,
            ElbMeta.updateSecurityPolicy, hcClient);
    }

    public CompletableFuture<ListApiVersionsResponse> listApiVersionsAsync(ListApiVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listApiVersions);
    }

    public AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsAsyncInvoker(
        ListApiVersionsRequest request) {
        return new AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>(request, ElbMeta.listApiVersions,
            hcClient);
    }

    public CompletableFuture<BatchDeleteIpListResponse> batchDeleteIpListAsync(BatchDeleteIpListRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.batchDeleteIpList);
    }

    public AsyncInvoker<BatchDeleteIpListRequest, BatchDeleteIpListResponse> batchDeleteIpListAsyncInvoker(
        BatchDeleteIpListRequest request) {
        return new AsyncInvoker<BatchDeleteIpListRequest, BatchDeleteIpListResponse>(request, ElbMeta.batchDeleteIpList,
            hcClient);
    }

    public CompletableFuture<CountPreoccupyIpNumResponse> countPreoccupyIpNumAsync(CountPreoccupyIpNumRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.countPreoccupyIpNum);
    }

    public AsyncInvoker<CountPreoccupyIpNumRequest, CountPreoccupyIpNumResponse> countPreoccupyIpNumAsyncInvoker(
        CountPreoccupyIpNumRequest request) {
        return new AsyncInvoker<CountPreoccupyIpNumRequest, CountPreoccupyIpNumResponse>(request,
            ElbMeta.countPreoccupyIpNum, hcClient);
    }

    public CompletableFuture<CreateIpGroupResponse> createIpGroupAsync(CreateIpGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createIpGroup);
    }

    public AsyncInvoker<CreateIpGroupRequest, CreateIpGroupResponse> createIpGroupAsyncInvoker(
        CreateIpGroupRequest request) {
        return new AsyncInvoker<CreateIpGroupRequest, CreateIpGroupResponse>(request, ElbMeta.createIpGroup, hcClient);
    }

    public CompletableFuture<DeleteIpGroupResponse> deleteIpGroupAsync(DeleteIpGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteIpGroup);
    }

    public AsyncInvoker<DeleteIpGroupRequest, DeleteIpGroupResponse> deleteIpGroupAsyncInvoker(
        DeleteIpGroupRequest request) {
        return new AsyncInvoker<DeleteIpGroupRequest, DeleteIpGroupResponse>(request, ElbMeta.deleteIpGroup, hcClient);
    }

    public CompletableFuture<ListIpGroupsResponse> listIpGroupsAsync(ListIpGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listIpGroups);
    }

    public AsyncInvoker<ListIpGroupsRequest, ListIpGroupsResponse> listIpGroupsAsyncInvoker(
        ListIpGroupsRequest request) {
        return new AsyncInvoker<ListIpGroupsRequest, ListIpGroupsResponse>(request, ElbMeta.listIpGroups, hcClient);
    }

    public CompletableFuture<ShowIpGroupResponse> showIpGroupAsync(ShowIpGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showIpGroup);
    }

    public AsyncInvoker<ShowIpGroupRequest, ShowIpGroupResponse> showIpGroupAsyncInvoker(ShowIpGroupRequest request) {
        return new AsyncInvoker<ShowIpGroupRequest, ShowIpGroupResponse>(request, ElbMeta.showIpGroup, hcClient);
    }

    public CompletableFuture<UpdateIpGroupResponse> updateIpGroupAsync(UpdateIpGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateIpGroup);
    }

    public AsyncInvoker<UpdateIpGroupRequest, UpdateIpGroupResponse> updateIpGroupAsyncInvoker(
        UpdateIpGroupRequest request) {
        return new AsyncInvoker<UpdateIpGroupRequest, UpdateIpGroupResponse>(request, ElbMeta.updateIpGroup, hcClient);
    }

    public CompletableFuture<UpdateIpListResponse> updateIpListAsync(UpdateIpListRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateIpList);
    }

    public AsyncInvoker<UpdateIpListRequest, UpdateIpListResponse> updateIpListAsyncInvoker(
        UpdateIpListRequest request) {
        return new AsyncInvoker<UpdateIpListRequest, UpdateIpListResponse>(request, ElbMeta.updateIpList, hcClient);
    }

}
