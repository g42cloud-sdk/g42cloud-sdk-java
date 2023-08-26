package com.g42cloud.sdk.elb.v3;

import com.g42cloud.sdk.core.ClientBuilder;
import com.g42cloud.sdk.core.HcClient;
import com.g42cloud.sdk.core.invoker.SyncInvoker;
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

public class ElbClient {

    protected HcClient hcClient;

    public ElbClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ElbClient> newBuilder() {
        ClientBuilder<ElbClient> clientBuilder = new ClientBuilder<>(ElbClient::new);
        return clientBuilder;
    }

    public BatchCreateMembersResponse batchCreateMembers(BatchCreateMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.batchCreateMembers);
    }

    public SyncInvoker<BatchCreateMembersRequest, BatchCreateMembersResponse> batchCreateMembersInvoker(
        BatchCreateMembersRequest request) {
        return new SyncInvoker<BatchCreateMembersRequest, BatchCreateMembersResponse>(request,
            ElbMeta.batchCreateMembers, hcClient);
    }

    public BatchDeleteMembersResponse batchDeleteMembers(BatchDeleteMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.batchDeleteMembers);
    }

    public SyncInvoker<BatchDeleteMembersRequest, BatchDeleteMembersResponse> batchDeleteMembersInvoker(
        BatchDeleteMembersRequest request) {
        return new SyncInvoker<BatchDeleteMembersRequest, BatchDeleteMembersResponse>(request,
            ElbMeta.batchDeleteMembers, hcClient);
    }

    public BatchUpdatePoliciesPriorityResponse batchUpdatePoliciesPriority(BatchUpdatePoliciesPriorityRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.batchUpdatePoliciesPriority);
    }

    public SyncInvoker<BatchUpdatePoliciesPriorityRequest, BatchUpdatePoliciesPriorityResponse> batchUpdatePoliciesPriorityInvoker(
        BatchUpdatePoliciesPriorityRequest request) {
        return new SyncInvoker<BatchUpdatePoliciesPriorityRequest, BatchUpdatePoliciesPriorityResponse>(request,
            ElbMeta.batchUpdatePoliciesPriority, hcClient);
    }

    public ChangeLoadbalancerChargeModeResponse changeLoadbalancerChargeMode(
        ChangeLoadbalancerChargeModeRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.changeLoadbalancerChargeMode);
    }

    public SyncInvoker<ChangeLoadbalancerChargeModeRequest, ChangeLoadbalancerChargeModeResponse> changeLoadbalancerChargeModeInvoker(
        ChangeLoadbalancerChargeModeRequest request) {
        return new SyncInvoker<ChangeLoadbalancerChargeModeRequest, ChangeLoadbalancerChargeModeResponse>(request,
            ElbMeta.changeLoadbalancerChargeMode, hcClient);
    }

    public CreateCertificateResponse createCertificate(CreateCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createCertificate);
    }

    public SyncInvoker<CreateCertificateRequest, CreateCertificateResponse> createCertificateInvoker(
        CreateCertificateRequest request) {
        return new SyncInvoker<CreateCertificateRequest, CreateCertificateResponse>(request, ElbMeta.createCertificate,
            hcClient);
    }

    public CreateHealthMonitorResponse createHealthMonitor(CreateHealthMonitorRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createHealthMonitor);
    }

    public SyncInvoker<CreateHealthMonitorRequest, CreateHealthMonitorResponse> createHealthMonitorInvoker(
        CreateHealthMonitorRequest request) {
        return new SyncInvoker<CreateHealthMonitorRequest, CreateHealthMonitorResponse>(request,
            ElbMeta.createHealthMonitor, hcClient);
    }

    public CreateL7PolicyResponse createL7Policy(CreateL7PolicyRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createL7Policy);
    }

    public SyncInvoker<CreateL7PolicyRequest, CreateL7PolicyResponse> createL7PolicyInvoker(
        CreateL7PolicyRequest request) {
        return new SyncInvoker<CreateL7PolicyRequest, CreateL7PolicyResponse>(request, ElbMeta.createL7Policy,
            hcClient);
    }

    public CreateL7RuleResponse createL7Rule(CreateL7RuleRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createL7Rule);
    }

    public SyncInvoker<CreateL7RuleRequest, CreateL7RuleResponse> createL7RuleInvoker(CreateL7RuleRequest request) {
        return new SyncInvoker<CreateL7RuleRequest, CreateL7RuleResponse>(request, ElbMeta.createL7Rule, hcClient);
    }

    public CreateListenerResponse createListener(CreateListenerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createListener);
    }

    public SyncInvoker<CreateListenerRequest, CreateListenerResponse> createListenerInvoker(
        CreateListenerRequest request) {
        return new SyncInvoker<CreateListenerRequest, CreateListenerResponse>(request, ElbMeta.createListener,
            hcClient);
    }

    public CreateLoadBalancerResponse createLoadBalancer(CreateLoadBalancerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createLoadBalancer);
    }

    public SyncInvoker<CreateLoadBalancerRequest, CreateLoadBalancerResponse> createLoadBalancerInvoker(
        CreateLoadBalancerRequest request) {
        return new SyncInvoker<CreateLoadBalancerRequest, CreateLoadBalancerResponse>(request,
            ElbMeta.createLoadBalancer, hcClient);
    }

    public CreateLogtankResponse createLogtank(CreateLogtankRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createLogtank);
    }

    public SyncInvoker<CreateLogtankRequest, CreateLogtankResponse> createLogtankInvoker(CreateLogtankRequest request) {
        return new SyncInvoker<CreateLogtankRequest, CreateLogtankResponse>(request, ElbMeta.createLogtank, hcClient);
    }

    public CreateMemberResponse createMember(CreateMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createMember);
    }

    public SyncInvoker<CreateMemberRequest, CreateMemberResponse> createMemberInvoker(CreateMemberRequest request) {
        return new SyncInvoker<CreateMemberRequest, CreateMemberResponse>(request, ElbMeta.createMember, hcClient);
    }

    public CreatePoolResponse createPool(CreatePoolRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createPool);
    }

    public SyncInvoker<CreatePoolRequest, CreatePoolResponse> createPoolInvoker(CreatePoolRequest request) {
        return new SyncInvoker<CreatePoolRequest, CreatePoolResponse>(request, ElbMeta.createPool, hcClient);
    }

    public CreateSecurityPolicyResponse createSecurityPolicy(CreateSecurityPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createSecurityPolicy);
    }

    public SyncInvoker<CreateSecurityPolicyRequest, CreateSecurityPolicyResponse> createSecurityPolicyInvoker(
        CreateSecurityPolicyRequest request) {
        return new SyncInvoker<CreateSecurityPolicyRequest, CreateSecurityPolicyResponse>(request,
            ElbMeta.createSecurityPolicy, hcClient);
    }

    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteCertificate);
    }

    public SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificateInvoker(
        DeleteCertificateRequest request) {
        return new SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>(request, ElbMeta.deleteCertificate,
            hcClient);
    }

    public DeleteHealthMonitorResponse deleteHealthMonitor(DeleteHealthMonitorRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteHealthMonitor);
    }

    public SyncInvoker<DeleteHealthMonitorRequest, DeleteHealthMonitorResponse> deleteHealthMonitorInvoker(
        DeleteHealthMonitorRequest request) {
        return new SyncInvoker<DeleteHealthMonitorRequest, DeleteHealthMonitorResponse>(request,
            ElbMeta.deleteHealthMonitor, hcClient);
    }

    public DeleteL7PolicyResponse deleteL7Policy(DeleteL7PolicyRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteL7Policy);
    }

    public SyncInvoker<DeleteL7PolicyRequest, DeleteL7PolicyResponse> deleteL7PolicyInvoker(
        DeleteL7PolicyRequest request) {
        return new SyncInvoker<DeleteL7PolicyRequest, DeleteL7PolicyResponse>(request, ElbMeta.deleteL7Policy,
            hcClient);
    }

    public DeleteL7RuleResponse deleteL7Rule(DeleteL7RuleRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteL7Rule);
    }

    public SyncInvoker<DeleteL7RuleRequest, DeleteL7RuleResponse> deleteL7RuleInvoker(DeleteL7RuleRequest request) {
        return new SyncInvoker<DeleteL7RuleRequest, DeleteL7RuleResponse>(request, ElbMeta.deleteL7Rule, hcClient);
    }

    public DeleteListenerResponse deleteListener(DeleteListenerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteListener);
    }

    public SyncInvoker<DeleteListenerRequest, DeleteListenerResponse> deleteListenerInvoker(
        DeleteListenerRequest request) {
        return new SyncInvoker<DeleteListenerRequest, DeleteListenerResponse>(request, ElbMeta.deleteListener,
            hcClient);
    }

    public DeleteLoadBalancerResponse deleteLoadBalancer(DeleteLoadBalancerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteLoadBalancer);
    }

    public SyncInvoker<DeleteLoadBalancerRequest, DeleteLoadBalancerResponse> deleteLoadBalancerInvoker(
        DeleteLoadBalancerRequest request) {
        return new SyncInvoker<DeleteLoadBalancerRequest, DeleteLoadBalancerResponse>(request,
            ElbMeta.deleteLoadBalancer, hcClient);
    }

    public DeleteLogtankResponse deleteLogtank(DeleteLogtankRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteLogtank);
    }

    public SyncInvoker<DeleteLogtankRequest, DeleteLogtankResponse> deleteLogtankInvoker(DeleteLogtankRequest request) {
        return new SyncInvoker<DeleteLogtankRequest, DeleteLogtankResponse>(request, ElbMeta.deleteLogtank, hcClient);
    }

    public DeleteMemberResponse deleteMember(DeleteMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteMember);
    }

    public SyncInvoker<DeleteMemberRequest, DeleteMemberResponse> deleteMemberInvoker(DeleteMemberRequest request) {
        return new SyncInvoker<DeleteMemberRequest, DeleteMemberResponse>(request, ElbMeta.deleteMember, hcClient);
    }

    public DeletePoolResponse deletePool(DeletePoolRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deletePool);
    }

    public SyncInvoker<DeletePoolRequest, DeletePoolResponse> deletePoolInvoker(DeletePoolRequest request) {
        return new SyncInvoker<DeletePoolRequest, DeletePoolResponse>(request, ElbMeta.deletePool, hcClient);
    }

    public DeleteSecurityPolicyResponse deleteSecurityPolicy(DeleteSecurityPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteSecurityPolicy);
    }

    public SyncInvoker<DeleteSecurityPolicyRequest, DeleteSecurityPolicyResponse> deleteSecurityPolicyInvoker(
        DeleteSecurityPolicyRequest request) {
        return new SyncInvoker<DeleteSecurityPolicyRequest, DeleteSecurityPolicyResponse>(request,
            ElbMeta.deleteSecurityPolicy, hcClient);
    }

    public ListAllMembersResponse listAllMembers(ListAllMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listAllMembers);
    }

    public SyncInvoker<ListAllMembersRequest, ListAllMembersResponse> listAllMembersInvoker(
        ListAllMembersRequest request) {
        return new SyncInvoker<ListAllMembersRequest, ListAllMembersResponse>(request, ElbMeta.listAllMembers,
            hcClient);
    }

    public ListAvailabilityZonesResponse listAvailabilityZones(ListAvailabilityZonesRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listAvailabilityZones);
    }

    public SyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> listAvailabilityZonesInvoker(
        ListAvailabilityZonesRequest request) {
        return new SyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse>(request,
            ElbMeta.listAvailabilityZones, hcClient);
    }

    public ListCertificatesResponse listCertificates(ListCertificatesRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listCertificates);
    }

    public SyncInvoker<ListCertificatesRequest, ListCertificatesResponse> listCertificatesInvoker(
        ListCertificatesRequest request) {
        return new SyncInvoker<ListCertificatesRequest, ListCertificatesResponse>(request, ElbMeta.listCertificates,
            hcClient);
    }

    public ListFlavorsResponse listFlavors(ListFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listFlavors);
    }

    public SyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsInvoker(ListFlavorsRequest request) {
        return new SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, ElbMeta.listFlavors, hcClient);
    }

    public ListHealthMonitorsResponse listHealthMonitors(ListHealthMonitorsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listHealthMonitors);
    }

    public SyncInvoker<ListHealthMonitorsRequest, ListHealthMonitorsResponse> listHealthMonitorsInvoker(
        ListHealthMonitorsRequest request) {
        return new SyncInvoker<ListHealthMonitorsRequest, ListHealthMonitorsResponse>(request,
            ElbMeta.listHealthMonitors, hcClient);
    }

    public ListL7PoliciesResponse listL7Policies(ListL7PoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listL7Policies);
    }

    public SyncInvoker<ListL7PoliciesRequest, ListL7PoliciesResponse> listL7PoliciesInvoker(
        ListL7PoliciesRequest request) {
        return new SyncInvoker<ListL7PoliciesRequest, ListL7PoliciesResponse>(request, ElbMeta.listL7Policies,
            hcClient);
    }

    public ListL7RulesResponse listL7Rules(ListL7RulesRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listL7Rules);
    }

    public SyncInvoker<ListL7RulesRequest, ListL7RulesResponse> listL7RulesInvoker(ListL7RulesRequest request) {
        return new SyncInvoker<ListL7RulesRequest, ListL7RulesResponse>(request, ElbMeta.listL7Rules, hcClient);
    }

    public ListListenersResponse listListeners(ListListenersRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listListeners);
    }

    public SyncInvoker<ListListenersRequest, ListListenersResponse> listListenersInvoker(ListListenersRequest request) {
        return new SyncInvoker<ListListenersRequest, ListListenersResponse>(request, ElbMeta.listListeners, hcClient);
    }

    public ListLoadBalancersResponse listLoadBalancers(ListLoadBalancersRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listLoadBalancers);
    }

    public SyncInvoker<ListLoadBalancersRequest, ListLoadBalancersResponse> listLoadBalancersInvoker(
        ListLoadBalancersRequest request) {
        return new SyncInvoker<ListLoadBalancersRequest, ListLoadBalancersResponse>(request, ElbMeta.listLoadBalancers,
            hcClient);
    }

    public ListLogtanksResponse listLogtanks(ListLogtanksRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listLogtanks);
    }

    public SyncInvoker<ListLogtanksRequest, ListLogtanksResponse> listLogtanksInvoker(ListLogtanksRequest request) {
        return new SyncInvoker<ListLogtanksRequest, ListLogtanksResponse>(request, ElbMeta.listLogtanks, hcClient);
    }

    public ListMembersResponse listMembers(ListMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listMembers);
    }

    public SyncInvoker<ListMembersRequest, ListMembersResponse> listMembersInvoker(ListMembersRequest request) {
        return new SyncInvoker<ListMembersRequest, ListMembersResponse>(request, ElbMeta.listMembers, hcClient);
    }

    public ListPoolsResponse listPools(ListPoolsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listPools);
    }

    public SyncInvoker<ListPoolsRequest, ListPoolsResponse> listPoolsInvoker(ListPoolsRequest request) {
        return new SyncInvoker<ListPoolsRequest, ListPoolsResponse>(request, ElbMeta.listPools, hcClient);
    }

    public ListQuotaDetailsResponse listQuotaDetails(ListQuotaDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listQuotaDetails);
    }

    public SyncInvoker<ListQuotaDetailsRequest, ListQuotaDetailsResponse> listQuotaDetailsInvoker(
        ListQuotaDetailsRequest request) {
        return new SyncInvoker<ListQuotaDetailsRequest, ListQuotaDetailsResponse>(request, ElbMeta.listQuotaDetails,
            hcClient);
    }

    public ListSecurityPoliciesResponse listSecurityPolicies(ListSecurityPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listSecurityPolicies);
    }

    public SyncInvoker<ListSecurityPoliciesRequest, ListSecurityPoliciesResponse> listSecurityPoliciesInvoker(
        ListSecurityPoliciesRequest request) {
        return new SyncInvoker<ListSecurityPoliciesRequest, ListSecurityPoliciesResponse>(request,
            ElbMeta.listSecurityPolicies, hcClient);
    }

    public ListSystemSecurityPoliciesResponse listSystemSecurityPolicies(ListSystemSecurityPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listSystemSecurityPolicies);
    }

    public SyncInvoker<ListSystemSecurityPoliciesRequest, ListSystemSecurityPoliciesResponse> listSystemSecurityPoliciesInvoker(
        ListSystemSecurityPoliciesRequest request) {
        return new SyncInvoker<ListSystemSecurityPoliciesRequest, ListSystemSecurityPoliciesResponse>(request,
            ElbMeta.listSystemSecurityPolicies, hcClient);
    }

    public ShowCertificateResponse showCertificate(ShowCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showCertificate);
    }

    public SyncInvoker<ShowCertificateRequest, ShowCertificateResponse> showCertificateInvoker(
        ShowCertificateRequest request) {
        return new SyncInvoker<ShowCertificateRequest, ShowCertificateResponse>(request, ElbMeta.showCertificate,
            hcClient);
    }

    public ShowFlavorResponse showFlavor(ShowFlavorRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showFlavor);
    }

    public SyncInvoker<ShowFlavorRequest, ShowFlavorResponse> showFlavorInvoker(ShowFlavorRequest request) {
        return new SyncInvoker<ShowFlavorRequest, ShowFlavorResponse>(request, ElbMeta.showFlavor, hcClient);
    }

    public ShowHealthMonitorResponse showHealthMonitor(ShowHealthMonitorRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showHealthMonitor);
    }

    public SyncInvoker<ShowHealthMonitorRequest, ShowHealthMonitorResponse> showHealthMonitorInvoker(
        ShowHealthMonitorRequest request) {
        return new SyncInvoker<ShowHealthMonitorRequest, ShowHealthMonitorResponse>(request, ElbMeta.showHealthMonitor,
            hcClient);
    }

    public ShowL7PolicyResponse showL7Policy(ShowL7PolicyRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showL7Policy);
    }

    public SyncInvoker<ShowL7PolicyRequest, ShowL7PolicyResponse> showL7PolicyInvoker(ShowL7PolicyRequest request) {
        return new SyncInvoker<ShowL7PolicyRequest, ShowL7PolicyResponse>(request, ElbMeta.showL7Policy, hcClient);
    }

    public ShowL7RuleResponse showL7Rule(ShowL7RuleRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showL7Rule);
    }

    public SyncInvoker<ShowL7RuleRequest, ShowL7RuleResponse> showL7RuleInvoker(ShowL7RuleRequest request) {
        return new SyncInvoker<ShowL7RuleRequest, ShowL7RuleResponse>(request, ElbMeta.showL7Rule, hcClient);
    }

    public ShowListenerResponse showListener(ShowListenerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showListener);
    }

    public SyncInvoker<ShowListenerRequest, ShowListenerResponse> showListenerInvoker(ShowListenerRequest request) {
        return new SyncInvoker<ShowListenerRequest, ShowListenerResponse>(request, ElbMeta.showListener, hcClient);
    }

    public ShowLoadBalancerResponse showLoadBalancer(ShowLoadBalancerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showLoadBalancer);
    }

    public SyncInvoker<ShowLoadBalancerRequest, ShowLoadBalancerResponse> showLoadBalancerInvoker(
        ShowLoadBalancerRequest request) {
        return new SyncInvoker<ShowLoadBalancerRequest, ShowLoadBalancerResponse>(request, ElbMeta.showLoadBalancer,
            hcClient);
    }

    public ShowLoadBalancerStatusResponse showLoadBalancerStatus(ShowLoadBalancerStatusRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showLoadBalancerStatus);
    }

    public SyncInvoker<ShowLoadBalancerStatusRequest, ShowLoadBalancerStatusResponse> showLoadBalancerStatusInvoker(
        ShowLoadBalancerStatusRequest request) {
        return new SyncInvoker<ShowLoadBalancerStatusRequest, ShowLoadBalancerStatusResponse>(request,
            ElbMeta.showLoadBalancerStatus, hcClient);
    }

    public ShowLogtankResponse showLogtank(ShowLogtankRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showLogtank);
    }

    public SyncInvoker<ShowLogtankRequest, ShowLogtankResponse> showLogtankInvoker(ShowLogtankRequest request) {
        return new SyncInvoker<ShowLogtankRequest, ShowLogtankResponse>(request, ElbMeta.showLogtank, hcClient);
    }

    public ShowMemberResponse showMember(ShowMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showMember);
    }

    public SyncInvoker<ShowMemberRequest, ShowMemberResponse> showMemberInvoker(ShowMemberRequest request) {
        return new SyncInvoker<ShowMemberRequest, ShowMemberResponse>(request, ElbMeta.showMember, hcClient);
    }

    public ShowPoolResponse showPool(ShowPoolRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showPool);
    }

    public SyncInvoker<ShowPoolRequest, ShowPoolResponse> showPoolInvoker(ShowPoolRequest request) {
        return new SyncInvoker<ShowPoolRequest, ShowPoolResponse>(request, ElbMeta.showPool, hcClient);
    }

    public ShowQuotaResponse showQuota(ShowQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showQuota);
    }

    public SyncInvoker<ShowQuotaRequest, ShowQuotaResponse> showQuotaInvoker(ShowQuotaRequest request) {
        return new SyncInvoker<ShowQuotaRequest, ShowQuotaResponse>(request, ElbMeta.showQuota, hcClient);
    }

    public ShowSecurityPolicyResponse showSecurityPolicy(ShowSecurityPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showSecurityPolicy);
    }

    public SyncInvoker<ShowSecurityPolicyRequest, ShowSecurityPolicyResponse> showSecurityPolicyInvoker(
        ShowSecurityPolicyRequest request) {
        return new SyncInvoker<ShowSecurityPolicyRequest, ShowSecurityPolicyResponse>(request,
            ElbMeta.showSecurityPolicy, hcClient);
    }

    public UpdateCertificateResponse updateCertificate(UpdateCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateCertificate);
    }

    public SyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse> updateCertificateInvoker(
        UpdateCertificateRequest request) {
        return new SyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse>(request, ElbMeta.updateCertificate,
            hcClient);
    }

    public UpdateHealthMonitorResponse updateHealthMonitor(UpdateHealthMonitorRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateHealthMonitor);
    }

    public SyncInvoker<UpdateHealthMonitorRequest, UpdateHealthMonitorResponse> updateHealthMonitorInvoker(
        UpdateHealthMonitorRequest request) {
        return new SyncInvoker<UpdateHealthMonitorRequest, UpdateHealthMonitorResponse>(request,
            ElbMeta.updateHealthMonitor, hcClient);
    }

    public UpdateL7PolicyResponse updateL7Policy(UpdateL7PolicyRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateL7Policy);
    }

    public SyncInvoker<UpdateL7PolicyRequest, UpdateL7PolicyResponse> updateL7PolicyInvoker(
        UpdateL7PolicyRequest request) {
        return new SyncInvoker<UpdateL7PolicyRequest, UpdateL7PolicyResponse>(request, ElbMeta.updateL7Policy,
            hcClient);
    }

    public UpdateL7RuleResponse updateL7Rule(UpdateL7RuleRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateL7Rule);
    }

    public SyncInvoker<UpdateL7RuleRequest, UpdateL7RuleResponse> updateL7RuleInvoker(UpdateL7RuleRequest request) {
        return new SyncInvoker<UpdateL7RuleRequest, UpdateL7RuleResponse>(request, ElbMeta.updateL7Rule, hcClient);
    }

    public UpdateListenerResponse updateListener(UpdateListenerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateListener);
    }

    public SyncInvoker<UpdateListenerRequest, UpdateListenerResponse> updateListenerInvoker(
        UpdateListenerRequest request) {
        return new SyncInvoker<UpdateListenerRequest, UpdateListenerResponse>(request, ElbMeta.updateListener,
            hcClient);
    }

    public UpdateLoadBalancerResponse updateLoadBalancer(UpdateLoadBalancerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateLoadBalancer);
    }

    public SyncInvoker<UpdateLoadBalancerRequest, UpdateLoadBalancerResponse> updateLoadBalancerInvoker(
        UpdateLoadBalancerRequest request) {
        return new SyncInvoker<UpdateLoadBalancerRequest, UpdateLoadBalancerResponse>(request,
            ElbMeta.updateLoadBalancer, hcClient);
    }

    public UpdateLogtankResponse updateLogtank(UpdateLogtankRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateLogtank);
    }

    public SyncInvoker<UpdateLogtankRequest, UpdateLogtankResponse> updateLogtankInvoker(UpdateLogtankRequest request) {
        return new SyncInvoker<UpdateLogtankRequest, UpdateLogtankResponse>(request, ElbMeta.updateLogtank, hcClient);
    }

    public UpdateMemberResponse updateMember(UpdateMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateMember);
    }

    public SyncInvoker<UpdateMemberRequest, UpdateMemberResponse> updateMemberInvoker(UpdateMemberRequest request) {
        return new SyncInvoker<UpdateMemberRequest, UpdateMemberResponse>(request, ElbMeta.updateMember, hcClient);
    }

    public UpdatePoolResponse updatePool(UpdatePoolRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updatePool);
    }

    public SyncInvoker<UpdatePoolRequest, UpdatePoolResponse> updatePoolInvoker(UpdatePoolRequest request) {
        return new SyncInvoker<UpdatePoolRequest, UpdatePoolResponse>(request, ElbMeta.updatePool, hcClient);
    }

    public UpdateSecurityPolicyResponse updateSecurityPolicy(UpdateSecurityPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateSecurityPolicy);
    }

    public SyncInvoker<UpdateSecurityPolicyRequest, UpdateSecurityPolicyResponse> updateSecurityPolicyInvoker(
        UpdateSecurityPolicyRequest request) {
        return new SyncInvoker<UpdateSecurityPolicyRequest, UpdateSecurityPolicyResponse>(request,
            ElbMeta.updateSecurityPolicy, hcClient);
    }

    public ListApiVersionsResponse listApiVersions(ListApiVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listApiVersions);
    }

    public SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsInvoker(
        ListApiVersionsRequest request) {
        return new SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>(request, ElbMeta.listApiVersions,
            hcClient);
    }

    public BatchDeleteIpListResponse batchDeleteIpList(BatchDeleteIpListRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.batchDeleteIpList);
    }

    public SyncInvoker<BatchDeleteIpListRequest, BatchDeleteIpListResponse> batchDeleteIpListInvoker(
        BatchDeleteIpListRequest request) {
        return new SyncInvoker<BatchDeleteIpListRequest, BatchDeleteIpListResponse>(request, ElbMeta.batchDeleteIpList,
            hcClient);
    }

    public CountPreoccupyIpNumResponse countPreoccupyIpNum(CountPreoccupyIpNumRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.countPreoccupyIpNum);
    }

    public SyncInvoker<CountPreoccupyIpNumRequest, CountPreoccupyIpNumResponse> countPreoccupyIpNumInvoker(
        CountPreoccupyIpNumRequest request) {
        return new SyncInvoker<CountPreoccupyIpNumRequest, CountPreoccupyIpNumResponse>(request,
            ElbMeta.countPreoccupyIpNum, hcClient);
    }

    public CreateIpGroupResponse createIpGroup(CreateIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createIpGroup);
    }

    public SyncInvoker<CreateIpGroupRequest, CreateIpGroupResponse> createIpGroupInvoker(CreateIpGroupRequest request) {
        return new SyncInvoker<CreateIpGroupRequest, CreateIpGroupResponse>(request, ElbMeta.createIpGroup, hcClient);
    }

    public DeleteIpGroupResponse deleteIpGroup(DeleteIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteIpGroup);
    }

    public SyncInvoker<DeleteIpGroupRequest, DeleteIpGroupResponse> deleteIpGroupInvoker(DeleteIpGroupRequest request) {
        return new SyncInvoker<DeleteIpGroupRequest, DeleteIpGroupResponse>(request, ElbMeta.deleteIpGroup, hcClient);
    }

    public ListIpGroupsResponse listIpGroups(ListIpGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listIpGroups);
    }

    public SyncInvoker<ListIpGroupsRequest, ListIpGroupsResponse> listIpGroupsInvoker(ListIpGroupsRequest request) {
        return new SyncInvoker<ListIpGroupsRequest, ListIpGroupsResponse>(request, ElbMeta.listIpGroups, hcClient);
    }

    public ShowIpGroupResponse showIpGroup(ShowIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showIpGroup);
    }

    public SyncInvoker<ShowIpGroupRequest, ShowIpGroupResponse> showIpGroupInvoker(ShowIpGroupRequest request) {
        return new SyncInvoker<ShowIpGroupRequest, ShowIpGroupResponse>(request, ElbMeta.showIpGroup, hcClient);
    }

    public UpdateIpGroupResponse updateIpGroup(UpdateIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateIpGroup);
    }

    public SyncInvoker<UpdateIpGroupRequest, UpdateIpGroupResponse> updateIpGroupInvoker(UpdateIpGroupRequest request) {
        return new SyncInvoker<UpdateIpGroupRequest, UpdateIpGroupResponse>(request, ElbMeta.updateIpGroup, hcClient);
    }

    public UpdateIpListResponse updateIpList(UpdateIpListRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateIpList);
    }

    public SyncInvoker<UpdateIpListRequest, UpdateIpListResponse> updateIpListInvoker(UpdateIpListRequest request) {
        return new SyncInvoker<UpdateIpListRequest, UpdateIpListResponse>(request, ElbMeta.updateIpList, hcClient);
    }

}
