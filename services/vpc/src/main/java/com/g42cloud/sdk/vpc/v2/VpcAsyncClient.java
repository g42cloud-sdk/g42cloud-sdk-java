package com.g42cloud.sdk.vpc.v2;

import com.g42cloud.sdk.core.ClientBuilder;
import com.g42cloud.sdk.core.HcClient;
import com.g42cloud.sdk.core.invoker.AsyncInvoker;
import com.g42cloud.sdk.vpc.v2.model.AcceptVpcPeeringRequest;
import com.g42cloud.sdk.vpc.v2.model.AcceptVpcPeeringResponse;
import com.g42cloud.sdk.vpc.v2.model.AssociateRouteTableRequest;
import com.g42cloud.sdk.vpc.v2.model.AssociateRouteTableResponse;
import com.g42cloud.sdk.vpc.v2.model.BatchCreateSubnetTagsRequest;
import com.g42cloud.sdk.vpc.v2.model.BatchCreateSubnetTagsResponse;
import com.g42cloud.sdk.vpc.v2.model.BatchCreateVpcTagsRequest;
import com.g42cloud.sdk.vpc.v2.model.BatchCreateVpcTagsResponse;
import com.g42cloud.sdk.vpc.v2.model.BatchDeleteSubnetTagsRequest;
import com.g42cloud.sdk.vpc.v2.model.BatchDeleteSubnetTagsResponse;
import com.g42cloud.sdk.vpc.v2.model.BatchDeleteVpcTagsRequest;
import com.g42cloud.sdk.vpc.v2.model.BatchDeleteVpcTagsResponse;
import com.g42cloud.sdk.vpc.v2.model.CreatePortRequest;
import com.g42cloud.sdk.vpc.v2.model.CreatePortResponse;
import com.g42cloud.sdk.vpc.v2.model.CreatePrivateipRequest;
import com.g42cloud.sdk.vpc.v2.model.CreatePrivateipResponse;
import com.g42cloud.sdk.vpc.v2.model.CreateRouteTableRequest;
import com.g42cloud.sdk.vpc.v2.model.CreateRouteTableResponse;
import com.g42cloud.sdk.vpc.v2.model.CreateSecurityGroupRequest;
import com.g42cloud.sdk.vpc.v2.model.CreateSecurityGroupResponse;
import com.g42cloud.sdk.vpc.v2.model.CreateSecurityGroupRuleRequest;
import com.g42cloud.sdk.vpc.v2.model.CreateSecurityGroupRuleResponse;
import com.g42cloud.sdk.vpc.v2.model.CreateSubnetRequest;
import com.g42cloud.sdk.vpc.v2.model.CreateSubnetResponse;
import com.g42cloud.sdk.vpc.v2.model.CreateSubnetTagRequest;
import com.g42cloud.sdk.vpc.v2.model.CreateSubnetTagResponse;
import com.g42cloud.sdk.vpc.v2.model.CreateVpcPeeringRequest;
import com.g42cloud.sdk.vpc.v2.model.CreateVpcPeeringResponse;
import com.g42cloud.sdk.vpc.v2.model.CreateVpcRequest;
import com.g42cloud.sdk.vpc.v2.model.CreateVpcResourceTagRequest;
import com.g42cloud.sdk.vpc.v2.model.CreateVpcResourceTagResponse;
import com.g42cloud.sdk.vpc.v2.model.CreateVpcResponse;
import com.g42cloud.sdk.vpc.v2.model.CreateVpcRouteRequest;
import com.g42cloud.sdk.vpc.v2.model.CreateVpcRouteResponse;
import com.g42cloud.sdk.vpc.v2.model.DeletePortRequest;
import com.g42cloud.sdk.vpc.v2.model.DeletePortResponse;
import com.g42cloud.sdk.vpc.v2.model.DeletePrivateipRequest;
import com.g42cloud.sdk.vpc.v2.model.DeletePrivateipResponse;
import com.g42cloud.sdk.vpc.v2.model.DeleteRouteTableRequest;
import com.g42cloud.sdk.vpc.v2.model.DeleteRouteTableResponse;
import com.g42cloud.sdk.vpc.v2.model.DeleteSecurityGroupRequest;
import com.g42cloud.sdk.vpc.v2.model.DeleteSecurityGroupResponse;
import com.g42cloud.sdk.vpc.v2.model.DeleteSecurityGroupRuleRequest;
import com.g42cloud.sdk.vpc.v2.model.DeleteSecurityGroupRuleResponse;
import com.g42cloud.sdk.vpc.v2.model.DeleteSubnetRequest;
import com.g42cloud.sdk.vpc.v2.model.DeleteSubnetResponse;
import com.g42cloud.sdk.vpc.v2.model.DeleteSubnetTagRequest;
import com.g42cloud.sdk.vpc.v2.model.DeleteSubnetTagResponse;
import com.g42cloud.sdk.vpc.v2.model.DeleteVpcPeeringRequest;
import com.g42cloud.sdk.vpc.v2.model.DeleteVpcPeeringResponse;
import com.g42cloud.sdk.vpc.v2.model.DeleteVpcRequest;
import com.g42cloud.sdk.vpc.v2.model.DeleteVpcResponse;
import com.g42cloud.sdk.vpc.v2.model.DeleteVpcRouteRequest;
import com.g42cloud.sdk.vpc.v2.model.DeleteVpcRouteResponse;
import com.g42cloud.sdk.vpc.v2.model.DeleteVpcTagRequest;
import com.g42cloud.sdk.vpc.v2.model.DeleteVpcTagResponse;
import com.g42cloud.sdk.vpc.v2.model.DisassociateRouteTableRequest;
import com.g42cloud.sdk.vpc.v2.model.DisassociateRouteTableResponse;
import com.g42cloud.sdk.vpc.v2.model.ListPortsRequest;
import com.g42cloud.sdk.vpc.v2.model.ListPortsResponse;
import com.g42cloud.sdk.vpc.v2.model.ListPrivateipsRequest;
import com.g42cloud.sdk.vpc.v2.model.ListPrivateipsResponse;
import com.g42cloud.sdk.vpc.v2.model.ListRouteTablesRequest;
import com.g42cloud.sdk.vpc.v2.model.ListRouteTablesResponse;
import com.g42cloud.sdk.vpc.v2.model.ListSecurityGroupRulesRequest;
import com.g42cloud.sdk.vpc.v2.model.ListSecurityGroupRulesResponse;
import com.g42cloud.sdk.vpc.v2.model.ListSecurityGroupsRequest;
import com.g42cloud.sdk.vpc.v2.model.ListSecurityGroupsResponse;
import com.g42cloud.sdk.vpc.v2.model.ListSubnetTagsRequest;
import com.g42cloud.sdk.vpc.v2.model.ListSubnetTagsResponse;
import com.g42cloud.sdk.vpc.v2.model.ListSubnetsByTagsRequest;
import com.g42cloud.sdk.vpc.v2.model.ListSubnetsByTagsResponse;
import com.g42cloud.sdk.vpc.v2.model.ListSubnetsRequest;
import com.g42cloud.sdk.vpc.v2.model.ListSubnetsResponse;
import com.g42cloud.sdk.vpc.v2.model.ListVpcPeeringsRequest;
import com.g42cloud.sdk.vpc.v2.model.ListVpcPeeringsResponse;
import com.g42cloud.sdk.vpc.v2.model.ListVpcRoutesRequest;
import com.g42cloud.sdk.vpc.v2.model.ListVpcRoutesResponse;
import com.g42cloud.sdk.vpc.v2.model.ListVpcTagsRequest;
import com.g42cloud.sdk.vpc.v2.model.ListVpcTagsResponse;
import com.g42cloud.sdk.vpc.v2.model.ListVpcsByTagsRequest;
import com.g42cloud.sdk.vpc.v2.model.ListVpcsByTagsResponse;
import com.g42cloud.sdk.vpc.v2.model.ListVpcsRequest;
import com.g42cloud.sdk.vpc.v2.model.ListVpcsResponse;
import com.g42cloud.sdk.vpc.v2.model.NeutronAddFirewallRuleRequest;
import com.g42cloud.sdk.vpc.v2.model.NeutronAddFirewallRuleResponse;
import com.g42cloud.sdk.vpc.v2.model.NeutronCreateFirewallGroupRequest;
import com.g42cloud.sdk.vpc.v2.model.NeutronCreateFirewallGroupResponse;
import com.g42cloud.sdk.vpc.v2.model.NeutronCreateFirewallPolicyRequest;
import com.g42cloud.sdk.vpc.v2.model.NeutronCreateFirewallPolicyResponse;
import com.g42cloud.sdk.vpc.v2.model.NeutronCreateFirewallRuleRequest;
import com.g42cloud.sdk.vpc.v2.model.NeutronCreateFirewallRuleResponse;
import com.g42cloud.sdk.vpc.v2.model.NeutronCreateSecurityGroupRequest;
import com.g42cloud.sdk.vpc.v2.model.NeutronCreateSecurityGroupResponse;
import com.g42cloud.sdk.vpc.v2.model.NeutronCreateSecurityGroupRuleRequest;
import com.g42cloud.sdk.vpc.v2.model.NeutronCreateSecurityGroupRuleResponse;
import com.g42cloud.sdk.vpc.v2.model.NeutronDeleteFirewallGroupRequest;
import com.g42cloud.sdk.vpc.v2.model.NeutronDeleteFirewallGroupResponse;
import com.g42cloud.sdk.vpc.v2.model.NeutronDeleteFirewallPolicyRequest;
import com.g42cloud.sdk.vpc.v2.model.NeutronDeleteFirewallPolicyResponse;
import com.g42cloud.sdk.vpc.v2.model.NeutronDeleteFirewallRuleRequest;
import com.g42cloud.sdk.vpc.v2.model.NeutronDeleteFirewallRuleResponse;
import com.g42cloud.sdk.vpc.v2.model.NeutronDeleteSecurityGroupRequest;
import com.g42cloud.sdk.vpc.v2.model.NeutronDeleteSecurityGroupResponse;
import com.g42cloud.sdk.vpc.v2.model.NeutronDeleteSecurityGroupRuleRequest;
import com.g42cloud.sdk.vpc.v2.model.NeutronDeleteSecurityGroupRuleResponse;
import com.g42cloud.sdk.vpc.v2.model.NeutronListFirewallGroupsRequest;
import com.g42cloud.sdk.vpc.v2.model.NeutronListFirewallGroupsResponse;
import com.g42cloud.sdk.vpc.v2.model.NeutronListFirewallPoliciesRequest;
import com.g42cloud.sdk.vpc.v2.model.NeutronListFirewallPoliciesResponse;
import com.g42cloud.sdk.vpc.v2.model.NeutronListFirewallRulesRequest;
import com.g42cloud.sdk.vpc.v2.model.NeutronListFirewallRulesResponse;
import com.g42cloud.sdk.vpc.v2.model.NeutronListSecurityGroupRulesRequest;
import com.g42cloud.sdk.vpc.v2.model.NeutronListSecurityGroupRulesResponse;
import com.g42cloud.sdk.vpc.v2.model.NeutronListSecurityGroupsRequest;
import com.g42cloud.sdk.vpc.v2.model.NeutronListSecurityGroupsResponse;
import com.g42cloud.sdk.vpc.v2.model.NeutronRemoveFirewallRuleRequest;
import com.g42cloud.sdk.vpc.v2.model.NeutronRemoveFirewallRuleResponse;
import com.g42cloud.sdk.vpc.v2.model.NeutronShowFirewallGroupRequest;
import com.g42cloud.sdk.vpc.v2.model.NeutronShowFirewallGroupResponse;
import com.g42cloud.sdk.vpc.v2.model.NeutronShowFirewallPolicyRequest;
import com.g42cloud.sdk.vpc.v2.model.NeutronShowFirewallPolicyResponse;
import com.g42cloud.sdk.vpc.v2.model.NeutronShowFirewallRuleRequest;
import com.g42cloud.sdk.vpc.v2.model.NeutronShowFirewallRuleResponse;
import com.g42cloud.sdk.vpc.v2.model.NeutronShowSecurityGroupRequest;
import com.g42cloud.sdk.vpc.v2.model.NeutronShowSecurityGroupResponse;
import com.g42cloud.sdk.vpc.v2.model.NeutronShowSecurityGroupRuleRequest;
import com.g42cloud.sdk.vpc.v2.model.NeutronShowSecurityGroupRuleResponse;
import com.g42cloud.sdk.vpc.v2.model.NeutronUpdateFirewallGroupRequest;
import com.g42cloud.sdk.vpc.v2.model.NeutronUpdateFirewallGroupResponse;
import com.g42cloud.sdk.vpc.v2.model.NeutronUpdateFirewallPolicyRequest;
import com.g42cloud.sdk.vpc.v2.model.NeutronUpdateFirewallPolicyResponse;
import com.g42cloud.sdk.vpc.v2.model.NeutronUpdateFirewallRuleRequest;
import com.g42cloud.sdk.vpc.v2.model.NeutronUpdateFirewallRuleResponse;
import com.g42cloud.sdk.vpc.v2.model.NeutronUpdateSecurityGroupRequest;
import com.g42cloud.sdk.vpc.v2.model.NeutronUpdateSecurityGroupResponse;
import com.g42cloud.sdk.vpc.v2.model.RejectVpcPeeringRequest;
import com.g42cloud.sdk.vpc.v2.model.RejectVpcPeeringResponse;
import com.g42cloud.sdk.vpc.v2.model.ShowNetworkIpAvailabilitiesRequest;
import com.g42cloud.sdk.vpc.v2.model.ShowNetworkIpAvailabilitiesResponse;
import com.g42cloud.sdk.vpc.v2.model.ShowPortRequest;
import com.g42cloud.sdk.vpc.v2.model.ShowPortResponse;
import com.g42cloud.sdk.vpc.v2.model.ShowPrivateipRequest;
import com.g42cloud.sdk.vpc.v2.model.ShowPrivateipResponse;
import com.g42cloud.sdk.vpc.v2.model.ShowQuotaRequest;
import com.g42cloud.sdk.vpc.v2.model.ShowQuotaResponse;
import com.g42cloud.sdk.vpc.v2.model.ShowRouteTableRequest;
import com.g42cloud.sdk.vpc.v2.model.ShowRouteTableResponse;
import com.g42cloud.sdk.vpc.v2.model.ShowSecurityGroupRequest;
import com.g42cloud.sdk.vpc.v2.model.ShowSecurityGroupResponse;
import com.g42cloud.sdk.vpc.v2.model.ShowSecurityGroupRuleRequest;
import com.g42cloud.sdk.vpc.v2.model.ShowSecurityGroupRuleResponse;
import com.g42cloud.sdk.vpc.v2.model.ShowSubnetRequest;
import com.g42cloud.sdk.vpc.v2.model.ShowSubnetResponse;
import com.g42cloud.sdk.vpc.v2.model.ShowSubnetTagsRequest;
import com.g42cloud.sdk.vpc.v2.model.ShowSubnetTagsResponse;
import com.g42cloud.sdk.vpc.v2.model.ShowVpcPeeringRequest;
import com.g42cloud.sdk.vpc.v2.model.ShowVpcPeeringResponse;
import com.g42cloud.sdk.vpc.v2.model.ShowVpcRequest;
import com.g42cloud.sdk.vpc.v2.model.ShowVpcResponse;
import com.g42cloud.sdk.vpc.v2.model.ShowVpcRouteRequest;
import com.g42cloud.sdk.vpc.v2.model.ShowVpcRouteResponse;
import com.g42cloud.sdk.vpc.v2.model.ShowVpcTagsRequest;
import com.g42cloud.sdk.vpc.v2.model.ShowVpcTagsResponse;
import com.g42cloud.sdk.vpc.v2.model.UpdatePortRequest;
import com.g42cloud.sdk.vpc.v2.model.UpdatePortResponse;
import com.g42cloud.sdk.vpc.v2.model.UpdateRouteTableRequest;
import com.g42cloud.sdk.vpc.v2.model.UpdateRouteTableResponse;
import com.g42cloud.sdk.vpc.v2.model.UpdateSubnetRequest;
import com.g42cloud.sdk.vpc.v2.model.UpdateSubnetResponse;
import com.g42cloud.sdk.vpc.v2.model.UpdateVpcPeeringRequest;
import com.g42cloud.sdk.vpc.v2.model.UpdateVpcPeeringResponse;
import com.g42cloud.sdk.vpc.v2.model.UpdateVpcRequest;
import com.g42cloud.sdk.vpc.v2.model.UpdateVpcResponse;

import java.util.concurrent.CompletableFuture;

public class VpcAsyncClient {

    protected HcClient hcClient;

    public VpcAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VpcAsyncClient> newBuilder() {
        ClientBuilder<VpcAsyncClient> clientBuilder = new ClientBuilder<>(VpcAsyncClient::new);
        return clientBuilder;
    }

    public CompletableFuture<AcceptVpcPeeringResponse> acceptVpcPeeringAsync(AcceptVpcPeeringRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.acceptVpcPeering);
    }

    public AsyncInvoker<AcceptVpcPeeringRequest, AcceptVpcPeeringResponse> acceptVpcPeeringAsyncInvoker(
        AcceptVpcPeeringRequest request) {
        return new AsyncInvoker<AcceptVpcPeeringRequest, AcceptVpcPeeringResponse>(request, VpcMeta.acceptVpcPeering,
            hcClient);
    }

    public CompletableFuture<AssociateRouteTableResponse> associateRouteTableAsync(AssociateRouteTableRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.associateRouteTable);
    }

    public AsyncInvoker<AssociateRouteTableRequest, AssociateRouteTableResponse> associateRouteTableAsyncInvoker(
        AssociateRouteTableRequest request) {
        return new AsyncInvoker<AssociateRouteTableRequest, AssociateRouteTableResponse>(request,
            VpcMeta.associateRouteTable, hcClient);
    }

    public CompletableFuture<BatchCreateSubnetTagsResponse> batchCreateSubnetTagsAsync(
        BatchCreateSubnetTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.batchCreateSubnetTags);
    }

    public AsyncInvoker<BatchCreateSubnetTagsRequest, BatchCreateSubnetTagsResponse> batchCreateSubnetTagsAsyncInvoker(
        BatchCreateSubnetTagsRequest request) {
        return new AsyncInvoker<BatchCreateSubnetTagsRequest, BatchCreateSubnetTagsResponse>(request,
            VpcMeta.batchCreateSubnetTags, hcClient);
    }

    public CompletableFuture<BatchDeleteSubnetTagsResponse> batchDeleteSubnetTagsAsync(
        BatchDeleteSubnetTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.batchDeleteSubnetTags);
    }

    public AsyncInvoker<BatchDeleteSubnetTagsRequest, BatchDeleteSubnetTagsResponse> batchDeleteSubnetTagsAsyncInvoker(
        BatchDeleteSubnetTagsRequest request) {
        return new AsyncInvoker<BatchDeleteSubnetTagsRequest, BatchDeleteSubnetTagsResponse>(request,
            VpcMeta.batchDeleteSubnetTags, hcClient);
    }

    public CompletableFuture<CreatePortResponse> createPortAsync(CreatePortRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createPort);
    }

    public AsyncInvoker<CreatePortRequest, CreatePortResponse> createPortAsyncInvoker(CreatePortRequest request) {
        return new AsyncInvoker<CreatePortRequest, CreatePortResponse>(request, VpcMeta.createPort, hcClient);
    }

    public CompletableFuture<CreateRouteTableResponse> createRouteTableAsync(CreateRouteTableRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createRouteTable);
    }

    public AsyncInvoker<CreateRouteTableRequest, CreateRouteTableResponse> createRouteTableAsyncInvoker(
        CreateRouteTableRequest request) {
        return new AsyncInvoker<CreateRouteTableRequest, CreateRouteTableResponse>(request, VpcMeta.createRouteTable,
            hcClient);
    }

    public CompletableFuture<CreateSecurityGroupResponse> createSecurityGroupAsync(CreateSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createSecurityGroup);
    }

    public AsyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse> createSecurityGroupAsyncInvoker(
        CreateSecurityGroupRequest request) {
        return new AsyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse>(request,
            VpcMeta.createSecurityGroup, hcClient);
    }

    public CompletableFuture<CreateSecurityGroupRuleResponse> createSecurityGroupRuleAsync(
        CreateSecurityGroupRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createSecurityGroupRule);
    }

    public AsyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse> createSecurityGroupRuleAsyncInvoker(
        CreateSecurityGroupRuleRequest request) {
        return new AsyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse>(request,
            VpcMeta.createSecurityGroupRule, hcClient);
    }

    public CompletableFuture<CreateSubnetResponse> createSubnetAsync(CreateSubnetRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createSubnet);
    }

    public AsyncInvoker<CreateSubnetRequest, CreateSubnetResponse> createSubnetAsyncInvoker(
        CreateSubnetRequest request) {
        return new AsyncInvoker<CreateSubnetRequest, CreateSubnetResponse>(request, VpcMeta.createSubnet, hcClient);
    }

    public CompletableFuture<CreateSubnetTagResponse> createSubnetTagAsync(CreateSubnetTagRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createSubnetTag);
    }

    public AsyncInvoker<CreateSubnetTagRequest, CreateSubnetTagResponse> createSubnetTagAsyncInvoker(
        CreateSubnetTagRequest request) {
        return new AsyncInvoker<CreateSubnetTagRequest, CreateSubnetTagResponse>(request, VpcMeta.createSubnetTag,
            hcClient);
    }

    public CompletableFuture<CreateVpcPeeringResponse> createVpcPeeringAsync(CreateVpcPeeringRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createVpcPeering);
    }

    public AsyncInvoker<CreateVpcPeeringRequest, CreateVpcPeeringResponse> createVpcPeeringAsyncInvoker(
        CreateVpcPeeringRequest request) {
        return new AsyncInvoker<CreateVpcPeeringRequest, CreateVpcPeeringResponse>(request, VpcMeta.createVpcPeering,
            hcClient);
    }

    public CompletableFuture<DeletePortResponse> deletePortAsync(DeletePortRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deletePort);
    }

    public AsyncInvoker<DeletePortRequest, DeletePortResponse> deletePortAsyncInvoker(DeletePortRequest request) {
        return new AsyncInvoker<DeletePortRequest, DeletePortResponse>(request, VpcMeta.deletePort, hcClient);
    }

    public CompletableFuture<DeleteRouteTableResponse> deleteRouteTableAsync(DeleteRouteTableRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteRouteTable);
    }

    public AsyncInvoker<DeleteRouteTableRequest, DeleteRouteTableResponse> deleteRouteTableAsyncInvoker(
        DeleteRouteTableRequest request) {
        return new AsyncInvoker<DeleteRouteTableRequest, DeleteRouteTableResponse>(request, VpcMeta.deleteRouteTable,
            hcClient);
    }

    public CompletableFuture<DeleteSecurityGroupResponse> deleteSecurityGroupAsync(DeleteSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteSecurityGroup);
    }

    public AsyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse> deleteSecurityGroupAsyncInvoker(
        DeleteSecurityGroupRequest request) {
        return new AsyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse>(request,
            VpcMeta.deleteSecurityGroup, hcClient);
    }

    public CompletableFuture<DeleteSecurityGroupRuleResponse> deleteSecurityGroupRuleAsync(
        DeleteSecurityGroupRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteSecurityGroupRule);
    }

    public AsyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse> deleteSecurityGroupRuleAsyncInvoker(
        DeleteSecurityGroupRuleRequest request) {
        return new AsyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse>(request,
            VpcMeta.deleteSecurityGroupRule, hcClient);
    }

    public CompletableFuture<DeleteSubnetResponse> deleteSubnetAsync(DeleteSubnetRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteSubnet);
    }

    public AsyncInvoker<DeleteSubnetRequest, DeleteSubnetResponse> deleteSubnetAsyncInvoker(
        DeleteSubnetRequest request) {
        return new AsyncInvoker<DeleteSubnetRequest, DeleteSubnetResponse>(request, VpcMeta.deleteSubnet, hcClient);
    }

    public CompletableFuture<DeleteSubnetTagResponse> deleteSubnetTagAsync(DeleteSubnetTagRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteSubnetTag);
    }

    public AsyncInvoker<DeleteSubnetTagRequest, DeleteSubnetTagResponse> deleteSubnetTagAsyncInvoker(
        DeleteSubnetTagRequest request) {
        return new AsyncInvoker<DeleteSubnetTagRequest, DeleteSubnetTagResponse>(request, VpcMeta.deleteSubnetTag,
            hcClient);
    }

    public CompletableFuture<DeleteVpcPeeringResponse> deleteVpcPeeringAsync(DeleteVpcPeeringRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteVpcPeering);
    }

    public AsyncInvoker<DeleteVpcPeeringRequest, DeleteVpcPeeringResponse> deleteVpcPeeringAsyncInvoker(
        DeleteVpcPeeringRequest request) {
        return new AsyncInvoker<DeleteVpcPeeringRequest, DeleteVpcPeeringResponse>(request, VpcMeta.deleteVpcPeering,
            hcClient);
    }

    public CompletableFuture<DisassociateRouteTableResponse> disassociateRouteTableAsync(
        DisassociateRouteTableRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.disassociateRouteTable);
    }

    public AsyncInvoker<DisassociateRouteTableRequest, DisassociateRouteTableResponse> disassociateRouteTableAsyncInvoker(
        DisassociateRouteTableRequest request) {
        return new AsyncInvoker<DisassociateRouteTableRequest, DisassociateRouteTableResponse>(request,
            VpcMeta.disassociateRouteTable, hcClient);
    }

    public CompletableFuture<ListPortsResponse> listPortsAsync(ListPortsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listPorts);
    }

    public AsyncInvoker<ListPortsRequest, ListPortsResponse> listPortsAsyncInvoker(ListPortsRequest request) {
        return new AsyncInvoker<ListPortsRequest, ListPortsResponse>(request, VpcMeta.listPorts, hcClient);
    }

    public CompletableFuture<ListRouteTablesResponse> listRouteTablesAsync(ListRouteTablesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listRouteTables);
    }

    public AsyncInvoker<ListRouteTablesRequest, ListRouteTablesResponse> listRouteTablesAsyncInvoker(
        ListRouteTablesRequest request) {
        return new AsyncInvoker<ListRouteTablesRequest, ListRouteTablesResponse>(request, VpcMeta.listRouteTables,
            hcClient);
    }

    public CompletableFuture<ListSecurityGroupRulesResponse> listSecurityGroupRulesAsync(
        ListSecurityGroupRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listSecurityGroupRules);
    }

    public AsyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse> listSecurityGroupRulesAsyncInvoker(
        ListSecurityGroupRulesRequest request) {
        return new AsyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse>(request,
            VpcMeta.listSecurityGroupRules, hcClient);
    }

    public CompletableFuture<ListSecurityGroupsResponse> listSecurityGroupsAsync(ListSecurityGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listSecurityGroups);
    }

    public AsyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse> listSecurityGroupsAsyncInvoker(
        ListSecurityGroupsRequest request) {
        return new AsyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse>(request,
            VpcMeta.listSecurityGroups, hcClient);
    }

    public CompletableFuture<ListSubnetTagsResponse> listSubnetTagsAsync(ListSubnetTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listSubnetTags);
    }

    public AsyncInvoker<ListSubnetTagsRequest, ListSubnetTagsResponse> listSubnetTagsAsyncInvoker(
        ListSubnetTagsRequest request) {
        return new AsyncInvoker<ListSubnetTagsRequest, ListSubnetTagsResponse>(request, VpcMeta.listSubnetTags,
            hcClient);
    }

    public CompletableFuture<ListSubnetsResponse> listSubnetsAsync(ListSubnetsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listSubnets);
    }

    public AsyncInvoker<ListSubnetsRequest, ListSubnetsResponse> listSubnetsAsyncInvoker(ListSubnetsRequest request) {
        return new AsyncInvoker<ListSubnetsRequest, ListSubnetsResponse>(request, VpcMeta.listSubnets, hcClient);
    }

    public CompletableFuture<ListSubnetsByTagsResponse> listSubnetsByTagsAsync(ListSubnetsByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listSubnetsByTags);
    }

    public AsyncInvoker<ListSubnetsByTagsRequest, ListSubnetsByTagsResponse> listSubnetsByTagsAsyncInvoker(
        ListSubnetsByTagsRequest request) {
        return new AsyncInvoker<ListSubnetsByTagsRequest, ListSubnetsByTagsResponse>(request, VpcMeta.listSubnetsByTags,
            hcClient);
    }

    public CompletableFuture<ListVpcPeeringsResponse> listVpcPeeringsAsync(ListVpcPeeringsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listVpcPeerings);
    }

    public AsyncInvoker<ListVpcPeeringsRequest, ListVpcPeeringsResponse> listVpcPeeringsAsyncInvoker(
        ListVpcPeeringsRequest request) {
        return new AsyncInvoker<ListVpcPeeringsRequest, ListVpcPeeringsResponse>(request, VpcMeta.listVpcPeerings,
            hcClient);
    }

    public CompletableFuture<RejectVpcPeeringResponse> rejectVpcPeeringAsync(RejectVpcPeeringRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.rejectVpcPeering);
    }

    public AsyncInvoker<RejectVpcPeeringRequest, RejectVpcPeeringResponse> rejectVpcPeeringAsyncInvoker(
        RejectVpcPeeringRequest request) {
        return new AsyncInvoker<RejectVpcPeeringRequest, RejectVpcPeeringResponse>(request, VpcMeta.rejectVpcPeering,
            hcClient);
    }

    public CompletableFuture<ShowPortResponse> showPortAsync(ShowPortRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showPort);
    }

    public AsyncInvoker<ShowPortRequest, ShowPortResponse> showPortAsyncInvoker(ShowPortRequest request) {
        return new AsyncInvoker<ShowPortRequest, ShowPortResponse>(request, VpcMeta.showPort, hcClient);
    }

    public CompletableFuture<ShowQuotaResponse> showQuotaAsync(ShowQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showQuota);
    }

    public AsyncInvoker<ShowQuotaRequest, ShowQuotaResponse> showQuotaAsyncInvoker(ShowQuotaRequest request) {
        return new AsyncInvoker<ShowQuotaRequest, ShowQuotaResponse>(request, VpcMeta.showQuota, hcClient);
    }

    public CompletableFuture<ShowRouteTableResponse> showRouteTableAsync(ShowRouteTableRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showRouteTable);
    }

    public AsyncInvoker<ShowRouteTableRequest, ShowRouteTableResponse> showRouteTableAsyncInvoker(
        ShowRouteTableRequest request) {
        return new AsyncInvoker<ShowRouteTableRequest, ShowRouteTableResponse>(request, VpcMeta.showRouteTable,
            hcClient);
    }

    public CompletableFuture<ShowSecurityGroupResponse> showSecurityGroupAsync(ShowSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showSecurityGroup);
    }

    public AsyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse> showSecurityGroupAsyncInvoker(
        ShowSecurityGroupRequest request) {
        return new AsyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse>(request, VpcMeta.showSecurityGroup,
            hcClient);
    }

    public CompletableFuture<ShowSecurityGroupRuleResponse> showSecurityGroupRuleAsync(
        ShowSecurityGroupRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showSecurityGroupRule);
    }

    public AsyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse> showSecurityGroupRuleAsyncInvoker(
        ShowSecurityGroupRuleRequest request) {
        return new AsyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse>(request,
            VpcMeta.showSecurityGroupRule, hcClient);
    }

    public CompletableFuture<ShowSubnetResponse> showSubnetAsync(ShowSubnetRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showSubnet);
    }

    public AsyncInvoker<ShowSubnetRequest, ShowSubnetResponse> showSubnetAsyncInvoker(ShowSubnetRequest request) {
        return new AsyncInvoker<ShowSubnetRequest, ShowSubnetResponse>(request, VpcMeta.showSubnet, hcClient);
    }

    public CompletableFuture<ShowSubnetTagsResponse> showSubnetTagsAsync(ShowSubnetTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showSubnetTags);
    }

    public AsyncInvoker<ShowSubnetTagsRequest, ShowSubnetTagsResponse> showSubnetTagsAsyncInvoker(
        ShowSubnetTagsRequest request) {
        return new AsyncInvoker<ShowSubnetTagsRequest, ShowSubnetTagsResponse>(request, VpcMeta.showSubnetTags,
            hcClient);
    }

    public CompletableFuture<ShowVpcPeeringResponse> showVpcPeeringAsync(ShowVpcPeeringRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showVpcPeering);
    }

    public AsyncInvoker<ShowVpcPeeringRequest, ShowVpcPeeringResponse> showVpcPeeringAsyncInvoker(
        ShowVpcPeeringRequest request) {
        return new AsyncInvoker<ShowVpcPeeringRequest, ShowVpcPeeringResponse>(request, VpcMeta.showVpcPeering,
            hcClient);
    }

    public CompletableFuture<UpdatePortResponse> updatePortAsync(UpdatePortRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updatePort);
    }

    public AsyncInvoker<UpdatePortRequest, UpdatePortResponse> updatePortAsyncInvoker(UpdatePortRequest request) {
        return new AsyncInvoker<UpdatePortRequest, UpdatePortResponse>(request, VpcMeta.updatePort, hcClient);
    }

    public CompletableFuture<UpdateRouteTableResponse> updateRouteTableAsync(UpdateRouteTableRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateRouteTable);
    }

    public AsyncInvoker<UpdateRouteTableRequest, UpdateRouteTableResponse> updateRouteTableAsyncInvoker(
        UpdateRouteTableRequest request) {
        return new AsyncInvoker<UpdateRouteTableRequest, UpdateRouteTableResponse>(request, VpcMeta.updateRouteTable,
            hcClient);
    }

    public CompletableFuture<UpdateSubnetResponse> updateSubnetAsync(UpdateSubnetRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateSubnet);
    }

    public AsyncInvoker<UpdateSubnetRequest, UpdateSubnetResponse> updateSubnetAsyncInvoker(
        UpdateSubnetRequest request) {
        return new AsyncInvoker<UpdateSubnetRequest, UpdateSubnetResponse>(request, VpcMeta.updateSubnet, hcClient);
    }

    public CompletableFuture<UpdateVpcPeeringResponse> updateVpcPeeringAsync(UpdateVpcPeeringRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateVpcPeering);
    }

    public AsyncInvoker<UpdateVpcPeeringRequest, UpdateVpcPeeringResponse> updateVpcPeeringAsyncInvoker(
        UpdateVpcPeeringRequest request) {
        return new AsyncInvoker<UpdateVpcPeeringRequest, UpdateVpcPeeringResponse>(request, VpcMeta.updateVpcPeering,
            hcClient);
    }

    public CompletableFuture<CreatePrivateipResponse> createPrivateipAsync(CreatePrivateipRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createPrivateip);
    }

    public AsyncInvoker<CreatePrivateipRequest, CreatePrivateipResponse> createPrivateipAsyncInvoker(
        CreatePrivateipRequest request) {
        return new AsyncInvoker<CreatePrivateipRequest, CreatePrivateipResponse>(request, VpcMeta.createPrivateip,
            hcClient);
    }

    public CompletableFuture<DeletePrivateipResponse> deletePrivateipAsync(DeletePrivateipRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deletePrivateip);
    }

    public AsyncInvoker<DeletePrivateipRequest, DeletePrivateipResponse> deletePrivateipAsyncInvoker(
        DeletePrivateipRequest request) {
        return new AsyncInvoker<DeletePrivateipRequest, DeletePrivateipResponse>(request, VpcMeta.deletePrivateip,
            hcClient);
    }

    public CompletableFuture<ListPrivateipsResponse> listPrivateipsAsync(ListPrivateipsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listPrivateips);
    }

    public AsyncInvoker<ListPrivateipsRequest, ListPrivateipsResponse> listPrivateipsAsyncInvoker(
        ListPrivateipsRequest request) {
        return new AsyncInvoker<ListPrivateipsRequest, ListPrivateipsResponse>(request, VpcMeta.listPrivateips,
            hcClient);
    }

    public CompletableFuture<ShowNetworkIpAvailabilitiesResponse> showNetworkIpAvailabilitiesAsync(
        ShowNetworkIpAvailabilitiesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showNetworkIpAvailabilities);
    }

    public AsyncInvoker<ShowNetworkIpAvailabilitiesRequest, ShowNetworkIpAvailabilitiesResponse> showNetworkIpAvailabilitiesAsyncInvoker(
        ShowNetworkIpAvailabilitiesRequest request) {
        return new AsyncInvoker<ShowNetworkIpAvailabilitiesRequest, ShowNetworkIpAvailabilitiesResponse>(request,
            VpcMeta.showNetworkIpAvailabilities, hcClient);
    }

    public CompletableFuture<ShowPrivateipResponse> showPrivateipAsync(ShowPrivateipRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showPrivateip);
    }

    public AsyncInvoker<ShowPrivateipRequest, ShowPrivateipResponse> showPrivateipAsyncInvoker(
        ShowPrivateipRequest request) {
        return new AsyncInvoker<ShowPrivateipRequest, ShowPrivateipResponse>(request, VpcMeta.showPrivateip, hcClient);
    }

    public CompletableFuture<NeutronCreateSecurityGroupResponse> neutronCreateSecurityGroupAsync(
        NeutronCreateSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronCreateSecurityGroup);
    }

    public AsyncInvoker<NeutronCreateSecurityGroupRequest, NeutronCreateSecurityGroupResponse> neutronCreateSecurityGroupAsyncInvoker(
        NeutronCreateSecurityGroupRequest request) {
        return new AsyncInvoker<NeutronCreateSecurityGroupRequest, NeutronCreateSecurityGroupResponse>(request,
            VpcMeta.neutronCreateSecurityGroup, hcClient);
    }

    public CompletableFuture<NeutronCreateSecurityGroupRuleResponse> neutronCreateSecurityGroupRuleAsync(
        NeutronCreateSecurityGroupRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronCreateSecurityGroupRule);
    }

    public AsyncInvoker<NeutronCreateSecurityGroupRuleRequest, NeutronCreateSecurityGroupRuleResponse> neutronCreateSecurityGroupRuleAsyncInvoker(
        NeutronCreateSecurityGroupRuleRequest request) {
        return new AsyncInvoker<NeutronCreateSecurityGroupRuleRequest, NeutronCreateSecurityGroupRuleResponse>(request,
            VpcMeta.neutronCreateSecurityGroupRule, hcClient);
    }

    public CompletableFuture<NeutronDeleteSecurityGroupResponse> neutronDeleteSecurityGroupAsync(
        NeutronDeleteSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronDeleteSecurityGroup);
    }

    public AsyncInvoker<NeutronDeleteSecurityGroupRequest, NeutronDeleteSecurityGroupResponse> neutronDeleteSecurityGroupAsyncInvoker(
        NeutronDeleteSecurityGroupRequest request) {
        return new AsyncInvoker<NeutronDeleteSecurityGroupRequest, NeutronDeleteSecurityGroupResponse>(request,
            VpcMeta.neutronDeleteSecurityGroup, hcClient);
    }

    public CompletableFuture<NeutronDeleteSecurityGroupRuleResponse> neutronDeleteSecurityGroupRuleAsync(
        NeutronDeleteSecurityGroupRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronDeleteSecurityGroupRule);
    }

    public AsyncInvoker<NeutronDeleteSecurityGroupRuleRequest, NeutronDeleteSecurityGroupRuleResponse> neutronDeleteSecurityGroupRuleAsyncInvoker(
        NeutronDeleteSecurityGroupRuleRequest request) {
        return new AsyncInvoker<NeutronDeleteSecurityGroupRuleRequest, NeutronDeleteSecurityGroupRuleResponse>(request,
            VpcMeta.neutronDeleteSecurityGroupRule, hcClient);
    }

    public CompletableFuture<NeutronListSecurityGroupRulesResponse> neutronListSecurityGroupRulesAsync(
        NeutronListSecurityGroupRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronListSecurityGroupRules);
    }

    public AsyncInvoker<NeutronListSecurityGroupRulesRequest, NeutronListSecurityGroupRulesResponse> neutronListSecurityGroupRulesAsyncInvoker(
        NeutronListSecurityGroupRulesRequest request) {
        return new AsyncInvoker<NeutronListSecurityGroupRulesRequest, NeutronListSecurityGroupRulesResponse>(request,
            VpcMeta.neutronListSecurityGroupRules, hcClient);
    }

    public CompletableFuture<NeutronListSecurityGroupsResponse> neutronListSecurityGroupsAsync(
        NeutronListSecurityGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronListSecurityGroups);
    }

    public AsyncInvoker<NeutronListSecurityGroupsRequest, NeutronListSecurityGroupsResponse> neutronListSecurityGroupsAsyncInvoker(
        NeutronListSecurityGroupsRequest request) {
        return new AsyncInvoker<NeutronListSecurityGroupsRequest, NeutronListSecurityGroupsResponse>(request,
            VpcMeta.neutronListSecurityGroups, hcClient);
    }

    public CompletableFuture<NeutronShowSecurityGroupResponse> neutronShowSecurityGroupAsync(
        NeutronShowSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronShowSecurityGroup);
    }

    public AsyncInvoker<NeutronShowSecurityGroupRequest, NeutronShowSecurityGroupResponse> neutronShowSecurityGroupAsyncInvoker(
        NeutronShowSecurityGroupRequest request) {
        return new AsyncInvoker<NeutronShowSecurityGroupRequest, NeutronShowSecurityGroupResponse>(request,
            VpcMeta.neutronShowSecurityGroup, hcClient);
    }

    public CompletableFuture<NeutronShowSecurityGroupRuleResponse> neutronShowSecurityGroupRuleAsync(
        NeutronShowSecurityGroupRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronShowSecurityGroupRule);
    }

    public AsyncInvoker<NeutronShowSecurityGroupRuleRequest, NeutronShowSecurityGroupRuleResponse> neutronShowSecurityGroupRuleAsyncInvoker(
        NeutronShowSecurityGroupRuleRequest request) {
        return new AsyncInvoker<NeutronShowSecurityGroupRuleRequest, NeutronShowSecurityGroupRuleResponse>(request,
            VpcMeta.neutronShowSecurityGroupRule, hcClient);
    }

    public CompletableFuture<NeutronUpdateSecurityGroupResponse> neutronUpdateSecurityGroupAsync(
        NeutronUpdateSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronUpdateSecurityGroup);
    }

    public AsyncInvoker<NeutronUpdateSecurityGroupRequest, NeutronUpdateSecurityGroupResponse> neutronUpdateSecurityGroupAsyncInvoker(
        NeutronUpdateSecurityGroupRequest request) {
        return new AsyncInvoker<NeutronUpdateSecurityGroupRequest, NeutronUpdateSecurityGroupResponse>(request,
            VpcMeta.neutronUpdateSecurityGroup, hcClient);
    }

    public CompletableFuture<NeutronAddFirewallRuleResponse> neutronAddFirewallRuleAsync(
        NeutronAddFirewallRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronAddFirewallRule);
    }

    public AsyncInvoker<NeutronAddFirewallRuleRequest, NeutronAddFirewallRuleResponse> neutronAddFirewallRuleAsyncInvoker(
        NeutronAddFirewallRuleRequest request) {
        return new AsyncInvoker<NeutronAddFirewallRuleRequest, NeutronAddFirewallRuleResponse>(request,
            VpcMeta.neutronAddFirewallRule, hcClient);
    }

    public CompletableFuture<NeutronCreateFirewallGroupResponse> neutronCreateFirewallGroupAsync(
        NeutronCreateFirewallGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronCreateFirewallGroup);
    }

    public AsyncInvoker<NeutronCreateFirewallGroupRequest, NeutronCreateFirewallGroupResponse> neutronCreateFirewallGroupAsyncInvoker(
        NeutronCreateFirewallGroupRequest request) {
        return new AsyncInvoker<NeutronCreateFirewallGroupRequest, NeutronCreateFirewallGroupResponse>(request,
            VpcMeta.neutronCreateFirewallGroup, hcClient);
    }

    public CompletableFuture<NeutronCreateFirewallPolicyResponse> neutronCreateFirewallPolicyAsync(
        NeutronCreateFirewallPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronCreateFirewallPolicy);
    }

    public AsyncInvoker<NeutronCreateFirewallPolicyRequest, NeutronCreateFirewallPolicyResponse> neutronCreateFirewallPolicyAsyncInvoker(
        NeutronCreateFirewallPolicyRequest request) {
        return new AsyncInvoker<NeutronCreateFirewallPolicyRequest, NeutronCreateFirewallPolicyResponse>(request,
            VpcMeta.neutronCreateFirewallPolicy, hcClient);
    }

    public CompletableFuture<NeutronCreateFirewallRuleResponse> neutronCreateFirewallRuleAsync(
        NeutronCreateFirewallRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronCreateFirewallRule);
    }

    public AsyncInvoker<NeutronCreateFirewallRuleRequest, NeutronCreateFirewallRuleResponse> neutronCreateFirewallRuleAsyncInvoker(
        NeutronCreateFirewallRuleRequest request) {
        return new AsyncInvoker<NeutronCreateFirewallRuleRequest, NeutronCreateFirewallRuleResponse>(request,
            VpcMeta.neutronCreateFirewallRule, hcClient);
    }

    public CompletableFuture<NeutronDeleteFirewallGroupResponse> neutronDeleteFirewallGroupAsync(
        NeutronDeleteFirewallGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronDeleteFirewallGroup);
    }

    public AsyncInvoker<NeutronDeleteFirewallGroupRequest, NeutronDeleteFirewallGroupResponse> neutronDeleteFirewallGroupAsyncInvoker(
        NeutronDeleteFirewallGroupRequest request) {
        return new AsyncInvoker<NeutronDeleteFirewallGroupRequest, NeutronDeleteFirewallGroupResponse>(request,
            VpcMeta.neutronDeleteFirewallGroup, hcClient);
    }

    public CompletableFuture<NeutronDeleteFirewallPolicyResponse> neutronDeleteFirewallPolicyAsync(
        NeutronDeleteFirewallPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronDeleteFirewallPolicy);
    }

    public AsyncInvoker<NeutronDeleteFirewallPolicyRequest, NeutronDeleteFirewallPolicyResponse> neutronDeleteFirewallPolicyAsyncInvoker(
        NeutronDeleteFirewallPolicyRequest request) {
        return new AsyncInvoker<NeutronDeleteFirewallPolicyRequest, NeutronDeleteFirewallPolicyResponse>(request,
            VpcMeta.neutronDeleteFirewallPolicy, hcClient);
    }

    public CompletableFuture<NeutronDeleteFirewallRuleResponse> neutronDeleteFirewallRuleAsync(
        NeutronDeleteFirewallRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronDeleteFirewallRule);
    }

    public AsyncInvoker<NeutronDeleteFirewallRuleRequest, NeutronDeleteFirewallRuleResponse> neutronDeleteFirewallRuleAsyncInvoker(
        NeutronDeleteFirewallRuleRequest request) {
        return new AsyncInvoker<NeutronDeleteFirewallRuleRequest, NeutronDeleteFirewallRuleResponse>(request,
            VpcMeta.neutronDeleteFirewallRule, hcClient);
    }

    public CompletableFuture<NeutronListFirewallGroupsResponse> neutronListFirewallGroupsAsync(
        NeutronListFirewallGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronListFirewallGroups);
    }

    public AsyncInvoker<NeutronListFirewallGroupsRequest, NeutronListFirewallGroupsResponse> neutronListFirewallGroupsAsyncInvoker(
        NeutronListFirewallGroupsRequest request) {
        return new AsyncInvoker<NeutronListFirewallGroupsRequest, NeutronListFirewallGroupsResponse>(request,
            VpcMeta.neutronListFirewallGroups, hcClient);
    }

    public CompletableFuture<NeutronListFirewallPoliciesResponse> neutronListFirewallPoliciesAsync(
        NeutronListFirewallPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronListFirewallPolicies);
    }

    public AsyncInvoker<NeutronListFirewallPoliciesRequest, NeutronListFirewallPoliciesResponse> neutronListFirewallPoliciesAsyncInvoker(
        NeutronListFirewallPoliciesRequest request) {
        return new AsyncInvoker<NeutronListFirewallPoliciesRequest, NeutronListFirewallPoliciesResponse>(request,
            VpcMeta.neutronListFirewallPolicies, hcClient);
    }

    public CompletableFuture<NeutronListFirewallRulesResponse> neutronListFirewallRulesAsync(
        NeutronListFirewallRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronListFirewallRules);
    }

    public AsyncInvoker<NeutronListFirewallRulesRequest, NeutronListFirewallRulesResponse> neutronListFirewallRulesAsyncInvoker(
        NeutronListFirewallRulesRequest request) {
        return new AsyncInvoker<NeutronListFirewallRulesRequest, NeutronListFirewallRulesResponse>(request,
            VpcMeta.neutronListFirewallRules, hcClient);
    }

    public CompletableFuture<NeutronRemoveFirewallRuleResponse> neutronRemoveFirewallRuleAsync(
        NeutronRemoveFirewallRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronRemoveFirewallRule);
    }

    public AsyncInvoker<NeutronRemoveFirewallRuleRequest, NeutronRemoveFirewallRuleResponse> neutronRemoveFirewallRuleAsyncInvoker(
        NeutronRemoveFirewallRuleRequest request) {
        return new AsyncInvoker<NeutronRemoveFirewallRuleRequest, NeutronRemoveFirewallRuleResponse>(request,
            VpcMeta.neutronRemoveFirewallRule, hcClient);
    }

    public CompletableFuture<NeutronShowFirewallGroupResponse> neutronShowFirewallGroupAsync(
        NeutronShowFirewallGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronShowFirewallGroup);
    }

    public AsyncInvoker<NeutronShowFirewallGroupRequest, NeutronShowFirewallGroupResponse> neutronShowFirewallGroupAsyncInvoker(
        NeutronShowFirewallGroupRequest request) {
        return new AsyncInvoker<NeutronShowFirewallGroupRequest, NeutronShowFirewallGroupResponse>(request,
            VpcMeta.neutronShowFirewallGroup, hcClient);
    }

    public CompletableFuture<NeutronShowFirewallPolicyResponse> neutronShowFirewallPolicyAsync(
        NeutronShowFirewallPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronShowFirewallPolicy);
    }

    public AsyncInvoker<NeutronShowFirewallPolicyRequest, NeutronShowFirewallPolicyResponse> neutronShowFirewallPolicyAsyncInvoker(
        NeutronShowFirewallPolicyRequest request) {
        return new AsyncInvoker<NeutronShowFirewallPolicyRequest, NeutronShowFirewallPolicyResponse>(request,
            VpcMeta.neutronShowFirewallPolicy, hcClient);
    }

    public CompletableFuture<NeutronShowFirewallRuleResponse> neutronShowFirewallRuleAsync(
        NeutronShowFirewallRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronShowFirewallRule);
    }

    public AsyncInvoker<NeutronShowFirewallRuleRequest, NeutronShowFirewallRuleResponse> neutronShowFirewallRuleAsyncInvoker(
        NeutronShowFirewallRuleRequest request) {
        return new AsyncInvoker<NeutronShowFirewallRuleRequest, NeutronShowFirewallRuleResponse>(request,
            VpcMeta.neutronShowFirewallRule, hcClient);
    }

    public CompletableFuture<NeutronUpdateFirewallGroupResponse> neutronUpdateFirewallGroupAsync(
        NeutronUpdateFirewallGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronUpdateFirewallGroup);
    }

    public AsyncInvoker<NeutronUpdateFirewallGroupRequest, NeutronUpdateFirewallGroupResponse> neutronUpdateFirewallGroupAsyncInvoker(
        NeutronUpdateFirewallGroupRequest request) {
        return new AsyncInvoker<NeutronUpdateFirewallGroupRequest, NeutronUpdateFirewallGroupResponse>(request,
            VpcMeta.neutronUpdateFirewallGroup, hcClient);
    }

    public CompletableFuture<NeutronUpdateFirewallPolicyResponse> neutronUpdateFirewallPolicyAsync(
        NeutronUpdateFirewallPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronUpdateFirewallPolicy);
    }

    public AsyncInvoker<NeutronUpdateFirewallPolicyRequest, NeutronUpdateFirewallPolicyResponse> neutronUpdateFirewallPolicyAsyncInvoker(
        NeutronUpdateFirewallPolicyRequest request) {
        return new AsyncInvoker<NeutronUpdateFirewallPolicyRequest, NeutronUpdateFirewallPolicyResponse>(request,
            VpcMeta.neutronUpdateFirewallPolicy, hcClient);
    }

    public CompletableFuture<NeutronUpdateFirewallRuleResponse> neutronUpdateFirewallRuleAsync(
        NeutronUpdateFirewallRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronUpdateFirewallRule);
    }

    public AsyncInvoker<NeutronUpdateFirewallRuleRequest, NeutronUpdateFirewallRuleResponse> neutronUpdateFirewallRuleAsyncInvoker(
        NeutronUpdateFirewallRuleRequest request) {
        return new AsyncInvoker<NeutronUpdateFirewallRuleRequest, NeutronUpdateFirewallRuleResponse>(request,
            VpcMeta.neutronUpdateFirewallRule, hcClient);
    }

    public CompletableFuture<BatchCreateVpcTagsResponse> batchCreateVpcTagsAsync(BatchCreateVpcTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.batchCreateVpcTags);
    }

    public AsyncInvoker<BatchCreateVpcTagsRequest, BatchCreateVpcTagsResponse> batchCreateVpcTagsAsyncInvoker(
        BatchCreateVpcTagsRequest request) {
        return new AsyncInvoker<BatchCreateVpcTagsRequest, BatchCreateVpcTagsResponse>(request,
            VpcMeta.batchCreateVpcTags, hcClient);
    }

    public CompletableFuture<BatchDeleteVpcTagsResponse> batchDeleteVpcTagsAsync(BatchDeleteVpcTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.batchDeleteVpcTags);
    }

    public AsyncInvoker<BatchDeleteVpcTagsRequest, BatchDeleteVpcTagsResponse> batchDeleteVpcTagsAsyncInvoker(
        BatchDeleteVpcTagsRequest request) {
        return new AsyncInvoker<BatchDeleteVpcTagsRequest, BatchDeleteVpcTagsResponse>(request,
            VpcMeta.batchDeleteVpcTags, hcClient);
    }

    public CompletableFuture<CreateVpcResponse> createVpcAsync(CreateVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createVpc);
    }

    public AsyncInvoker<CreateVpcRequest, CreateVpcResponse> createVpcAsyncInvoker(CreateVpcRequest request) {
        return new AsyncInvoker<CreateVpcRequest, CreateVpcResponse>(request, VpcMeta.createVpc, hcClient);
    }

    public CompletableFuture<CreateVpcResourceTagResponse> createVpcResourceTagAsync(
        CreateVpcResourceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createVpcResourceTag);
    }

    public AsyncInvoker<CreateVpcResourceTagRequest, CreateVpcResourceTagResponse> createVpcResourceTagAsyncInvoker(
        CreateVpcResourceTagRequest request) {
        return new AsyncInvoker<CreateVpcResourceTagRequest, CreateVpcResourceTagResponse>(request,
            VpcMeta.createVpcResourceTag, hcClient);
    }

    public CompletableFuture<CreateVpcRouteResponse> createVpcRouteAsync(CreateVpcRouteRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createVpcRoute);
    }

    public AsyncInvoker<CreateVpcRouteRequest, CreateVpcRouteResponse> createVpcRouteAsyncInvoker(
        CreateVpcRouteRequest request) {
        return new AsyncInvoker<CreateVpcRouteRequest, CreateVpcRouteResponse>(request, VpcMeta.createVpcRoute,
            hcClient);
    }

    public CompletableFuture<DeleteVpcResponse> deleteVpcAsync(DeleteVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteVpc);
    }

    public AsyncInvoker<DeleteVpcRequest, DeleteVpcResponse> deleteVpcAsyncInvoker(DeleteVpcRequest request) {
        return new AsyncInvoker<DeleteVpcRequest, DeleteVpcResponse>(request, VpcMeta.deleteVpc, hcClient);
    }

    public CompletableFuture<DeleteVpcRouteResponse> deleteVpcRouteAsync(DeleteVpcRouteRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteVpcRoute);
    }

    public AsyncInvoker<DeleteVpcRouteRequest, DeleteVpcRouteResponse> deleteVpcRouteAsyncInvoker(
        DeleteVpcRouteRequest request) {
        return new AsyncInvoker<DeleteVpcRouteRequest, DeleteVpcRouteResponse>(request, VpcMeta.deleteVpcRoute,
            hcClient);
    }

    public CompletableFuture<DeleteVpcTagResponse> deleteVpcTagAsync(DeleteVpcTagRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteVpcTag);
    }

    public AsyncInvoker<DeleteVpcTagRequest, DeleteVpcTagResponse> deleteVpcTagAsyncInvoker(
        DeleteVpcTagRequest request) {
        return new AsyncInvoker<DeleteVpcTagRequest, DeleteVpcTagResponse>(request, VpcMeta.deleteVpcTag, hcClient);
    }

    public CompletableFuture<ListVpcRoutesResponse> listVpcRoutesAsync(ListVpcRoutesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listVpcRoutes);
    }

    public AsyncInvoker<ListVpcRoutesRequest, ListVpcRoutesResponse> listVpcRoutesAsyncInvoker(
        ListVpcRoutesRequest request) {
        return new AsyncInvoker<ListVpcRoutesRequest, ListVpcRoutesResponse>(request, VpcMeta.listVpcRoutes, hcClient);
    }

    public CompletableFuture<ListVpcTagsResponse> listVpcTagsAsync(ListVpcTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listVpcTags);
    }

    public AsyncInvoker<ListVpcTagsRequest, ListVpcTagsResponse> listVpcTagsAsyncInvoker(ListVpcTagsRequest request) {
        return new AsyncInvoker<ListVpcTagsRequest, ListVpcTagsResponse>(request, VpcMeta.listVpcTags, hcClient);
    }

    public CompletableFuture<ListVpcsResponse> listVpcsAsync(ListVpcsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listVpcs);
    }

    public AsyncInvoker<ListVpcsRequest, ListVpcsResponse> listVpcsAsyncInvoker(ListVpcsRequest request) {
        return new AsyncInvoker<ListVpcsRequest, ListVpcsResponse>(request, VpcMeta.listVpcs, hcClient);
    }

    public CompletableFuture<ListVpcsByTagsResponse> listVpcsByTagsAsync(ListVpcsByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listVpcsByTags);
    }

    public AsyncInvoker<ListVpcsByTagsRequest, ListVpcsByTagsResponse> listVpcsByTagsAsyncInvoker(
        ListVpcsByTagsRequest request) {
        return new AsyncInvoker<ListVpcsByTagsRequest, ListVpcsByTagsResponse>(request, VpcMeta.listVpcsByTags,
            hcClient);
    }

    public CompletableFuture<ShowVpcResponse> showVpcAsync(ShowVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showVpc);
    }

    public AsyncInvoker<ShowVpcRequest, ShowVpcResponse> showVpcAsyncInvoker(ShowVpcRequest request) {
        return new AsyncInvoker<ShowVpcRequest, ShowVpcResponse>(request, VpcMeta.showVpc, hcClient);
    }

    public CompletableFuture<ShowVpcRouteResponse> showVpcRouteAsync(ShowVpcRouteRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showVpcRoute);
    }

    public AsyncInvoker<ShowVpcRouteRequest, ShowVpcRouteResponse> showVpcRouteAsyncInvoker(
        ShowVpcRouteRequest request) {
        return new AsyncInvoker<ShowVpcRouteRequest, ShowVpcRouteResponse>(request, VpcMeta.showVpcRoute, hcClient);
    }

    public CompletableFuture<ShowVpcTagsResponse> showVpcTagsAsync(ShowVpcTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showVpcTags);
    }

    public AsyncInvoker<ShowVpcTagsRequest, ShowVpcTagsResponse> showVpcTagsAsyncInvoker(ShowVpcTagsRequest request) {
        return new AsyncInvoker<ShowVpcTagsRequest, ShowVpcTagsResponse>(request, VpcMeta.showVpcTags, hcClient);
    }

    public CompletableFuture<UpdateVpcResponse> updateVpcAsync(UpdateVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateVpc);
    }

    public AsyncInvoker<UpdateVpcRequest, UpdateVpcResponse> updateVpcAsyncInvoker(UpdateVpcRequest request) {
        return new AsyncInvoker<UpdateVpcRequest, UpdateVpcResponse>(request, VpcMeta.updateVpc, hcClient);
    }

}
