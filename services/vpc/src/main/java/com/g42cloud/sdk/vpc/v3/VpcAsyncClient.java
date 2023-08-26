package com.g42cloud.sdk.vpc.v3;

import com.g42cloud.sdk.core.ClientBuilder;
import com.g42cloud.sdk.core.HcClient;
import com.g42cloud.sdk.core.invoker.AsyncInvoker;
import com.g42cloud.sdk.vpc.v3.model.AddVpcExtendCidrRequest;
import com.g42cloud.sdk.vpc.v3.model.AddVpcExtendCidrResponse;
import com.g42cloud.sdk.vpc.v3.model.BatchCreateSubNetworkInterfaceRequest;
import com.g42cloud.sdk.vpc.v3.model.BatchCreateSubNetworkInterfaceResponse;
import com.g42cloud.sdk.vpc.v3.model.CreateAddressGroupRequest;
import com.g42cloud.sdk.vpc.v3.model.CreateAddressGroupResponse;
import com.g42cloud.sdk.vpc.v3.model.CreateSecurityGroupRequest;
import com.g42cloud.sdk.vpc.v3.model.CreateSecurityGroupResponse;
import com.g42cloud.sdk.vpc.v3.model.CreateSecurityGroupRuleRequest;
import com.g42cloud.sdk.vpc.v3.model.CreateSecurityGroupRuleResponse;
import com.g42cloud.sdk.vpc.v3.model.CreateSubNetworkInterfaceRequest;
import com.g42cloud.sdk.vpc.v3.model.CreateSubNetworkInterfaceResponse;
import com.g42cloud.sdk.vpc.v3.model.CreateVpcRequest;
import com.g42cloud.sdk.vpc.v3.model.CreateVpcResponse;
import com.g42cloud.sdk.vpc.v3.model.DeleteAddressGroupRequest;
import com.g42cloud.sdk.vpc.v3.model.DeleteAddressGroupResponse;
import com.g42cloud.sdk.vpc.v3.model.DeleteIpAddressGroupForceRequest;
import com.g42cloud.sdk.vpc.v3.model.DeleteIpAddressGroupForceResponse;
import com.g42cloud.sdk.vpc.v3.model.DeleteSecurityGroupRequest;
import com.g42cloud.sdk.vpc.v3.model.DeleteSecurityGroupResponse;
import com.g42cloud.sdk.vpc.v3.model.DeleteSecurityGroupRuleRequest;
import com.g42cloud.sdk.vpc.v3.model.DeleteSecurityGroupRuleResponse;
import com.g42cloud.sdk.vpc.v3.model.DeleteSubNetworkInterfaceRequest;
import com.g42cloud.sdk.vpc.v3.model.DeleteSubNetworkInterfaceResponse;
import com.g42cloud.sdk.vpc.v3.model.DeleteVpcRequest;
import com.g42cloud.sdk.vpc.v3.model.DeleteVpcResponse;
import com.g42cloud.sdk.vpc.v3.model.ListAddressGroupRequest;
import com.g42cloud.sdk.vpc.v3.model.ListAddressGroupResponse;
import com.g42cloud.sdk.vpc.v3.model.ListSecurityGroupRulesRequest;
import com.g42cloud.sdk.vpc.v3.model.ListSecurityGroupRulesResponse;
import com.g42cloud.sdk.vpc.v3.model.ListSecurityGroupsRequest;
import com.g42cloud.sdk.vpc.v3.model.ListSecurityGroupsResponse;
import com.g42cloud.sdk.vpc.v3.model.ListSubNetworkInterfacesRequest;
import com.g42cloud.sdk.vpc.v3.model.ListSubNetworkInterfacesResponse;
import com.g42cloud.sdk.vpc.v3.model.ListVpcsRequest;
import com.g42cloud.sdk.vpc.v3.model.ListVpcsResponse;
import com.g42cloud.sdk.vpc.v3.model.MigrateSubNetworkInterfaceRequest;
import com.g42cloud.sdk.vpc.v3.model.MigrateSubNetworkInterfaceResponse;
import com.g42cloud.sdk.vpc.v3.model.RemoveVpcExtendCidrRequest;
import com.g42cloud.sdk.vpc.v3.model.RemoveVpcExtendCidrResponse;
import com.g42cloud.sdk.vpc.v3.model.ShowAddressGroupRequest;
import com.g42cloud.sdk.vpc.v3.model.ShowAddressGroupResponse;
import com.g42cloud.sdk.vpc.v3.model.ShowSecurityGroupRequest;
import com.g42cloud.sdk.vpc.v3.model.ShowSecurityGroupResponse;
import com.g42cloud.sdk.vpc.v3.model.ShowSecurityGroupRuleRequest;
import com.g42cloud.sdk.vpc.v3.model.ShowSecurityGroupRuleResponse;
import com.g42cloud.sdk.vpc.v3.model.ShowSubNetworkInterfaceRequest;
import com.g42cloud.sdk.vpc.v3.model.ShowSubNetworkInterfaceResponse;
import com.g42cloud.sdk.vpc.v3.model.ShowSubNetworkInterfacesQuantityRequest;
import com.g42cloud.sdk.vpc.v3.model.ShowSubNetworkInterfacesQuantityResponse;
import com.g42cloud.sdk.vpc.v3.model.ShowVpcRequest;
import com.g42cloud.sdk.vpc.v3.model.ShowVpcResponse;
import com.g42cloud.sdk.vpc.v3.model.UpdateAddressGroupRequest;
import com.g42cloud.sdk.vpc.v3.model.UpdateAddressGroupResponse;
import com.g42cloud.sdk.vpc.v3.model.UpdateSecurityGroupRequest;
import com.g42cloud.sdk.vpc.v3.model.UpdateSecurityGroupResponse;
import com.g42cloud.sdk.vpc.v3.model.UpdateSubNetworkInterfaceRequest;
import com.g42cloud.sdk.vpc.v3.model.UpdateSubNetworkInterfaceResponse;
import com.g42cloud.sdk.vpc.v3.model.UpdateVpcRequest;
import com.g42cloud.sdk.vpc.v3.model.UpdateVpcResponse;

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

    public CompletableFuture<BatchCreateSubNetworkInterfaceResponse> batchCreateSubNetworkInterfaceAsync(
        BatchCreateSubNetworkInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.batchCreateSubNetworkInterface);
    }

    public AsyncInvoker<BatchCreateSubNetworkInterfaceRequest, BatchCreateSubNetworkInterfaceResponse> batchCreateSubNetworkInterfaceAsyncInvoker(
        BatchCreateSubNetworkInterfaceRequest request) {
        return new AsyncInvoker<BatchCreateSubNetworkInterfaceRequest, BatchCreateSubNetworkInterfaceResponse>(request,
            VpcMeta.batchCreateSubNetworkInterface, hcClient);
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

    public CompletableFuture<CreateSubNetworkInterfaceResponse> createSubNetworkInterfaceAsync(
        CreateSubNetworkInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createSubNetworkInterface);
    }

    public AsyncInvoker<CreateSubNetworkInterfaceRequest, CreateSubNetworkInterfaceResponse> createSubNetworkInterfaceAsyncInvoker(
        CreateSubNetworkInterfaceRequest request) {
        return new AsyncInvoker<CreateSubNetworkInterfaceRequest, CreateSubNetworkInterfaceResponse>(request,
            VpcMeta.createSubNetworkInterface, hcClient);
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

    public CompletableFuture<DeleteSubNetworkInterfaceResponse> deleteSubNetworkInterfaceAsync(
        DeleteSubNetworkInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteSubNetworkInterface);
    }

    public AsyncInvoker<DeleteSubNetworkInterfaceRequest, DeleteSubNetworkInterfaceResponse> deleteSubNetworkInterfaceAsyncInvoker(
        DeleteSubNetworkInterfaceRequest request) {
        return new AsyncInvoker<DeleteSubNetworkInterfaceRequest, DeleteSubNetworkInterfaceResponse>(request,
            VpcMeta.deleteSubNetworkInterface, hcClient);
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

    public CompletableFuture<ListSubNetworkInterfacesResponse> listSubNetworkInterfacesAsync(
        ListSubNetworkInterfacesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listSubNetworkInterfaces);
    }

    public AsyncInvoker<ListSubNetworkInterfacesRequest, ListSubNetworkInterfacesResponse> listSubNetworkInterfacesAsyncInvoker(
        ListSubNetworkInterfacesRequest request) {
        return new AsyncInvoker<ListSubNetworkInterfacesRequest, ListSubNetworkInterfacesResponse>(request,
            VpcMeta.listSubNetworkInterfaces, hcClient);
    }

    public CompletableFuture<MigrateSubNetworkInterfaceResponse> migrateSubNetworkInterfaceAsync(
        MigrateSubNetworkInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.migrateSubNetworkInterface);
    }

    public AsyncInvoker<MigrateSubNetworkInterfaceRequest, MigrateSubNetworkInterfaceResponse> migrateSubNetworkInterfaceAsyncInvoker(
        MigrateSubNetworkInterfaceRequest request) {
        return new AsyncInvoker<MigrateSubNetworkInterfaceRequest, MigrateSubNetworkInterfaceResponse>(request,
            VpcMeta.migrateSubNetworkInterface, hcClient);
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

    public CompletableFuture<ShowSubNetworkInterfaceResponse> showSubNetworkInterfaceAsync(
        ShowSubNetworkInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showSubNetworkInterface);
    }

    public AsyncInvoker<ShowSubNetworkInterfaceRequest, ShowSubNetworkInterfaceResponse> showSubNetworkInterfaceAsyncInvoker(
        ShowSubNetworkInterfaceRequest request) {
        return new AsyncInvoker<ShowSubNetworkInterfaceRequest, ShowSubNetworkInterfaceResponse>(request,
            VpcMeta.showSubNetworkInterface, hcClient);
    }

    public CompletableFuture<ShowSubNetworkInterfacesQuantityResponse> showSubNetworkInterfacesQuantityAsync(
        ShowSubNetworkInterfacesQuantityRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showSubNetworkInterfacesQuantity);
    }

    public AsyncInvoker<ShowSubNetworkInterfacesQuantityRequest, ShowSubNetworkInterfacesQuantityResponse> showSubNetworkInterfacesQuantityAsyncInvoker(
        ShowSubNetworkInterfacesQuantityRequest request) {
        return new AsyncInvoker<ShowSubNetworkInterfacesQuantityRequest, ShowSubNetworkInterfacesQuantityResponse>(
            request, VpcMeta.showSubNetworkInterfacesQuantity, hcClient);
    }

    public CompletableFuture<UpdateSecurityGroupResponse> updateSecurityGroupAsync(UpdateSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateSecurityGroup);
    }

    public AsyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> updateSecurityGroupAsyncInvoker(
        UpdateSecurityGroupRequest request) {
        return new AsyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse>(request,
            VpcMeta.updateSecurityGroup, hcClient);
    }

    public CompletableFuture<UpdateSubNetworkInterfaceResponse> updateSubNetworkInterfaceAsync(
        UpdateSubNetworkInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateSubNetworkInterface);
    }

    public AsyncInvoker<UpdateSubNetworkInterfaceRequest, UpdateSubNetworkInterfaceResponse> updateSubNetworkInterfaceAsyncInvoker(
        UpdateSubNetworkInterfaceRequest request) {
        return new AsyncInvoker<UpdateSubNetworkInterfaceRequest, UpdateSubNetworkInterfaceResponse>(request,
            VpcMeta.updateSubNetworkInterface, hcClient);
    }

    public CompletableFuture<CreateAddressGroupResponse> createAddressGroupAsync(CreateAddressGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createAddressGroup);
    }

    public AsyncInvoker<CreateAddressGroupRequest, CreateAddressGroupResponse> createAddressGroupAsyncInvoker(
        CreateAddressGroupRequest request) {
        return new AsyncInvoker<CreateAddressGroupRequest, CreateAddressGroupResponse>(request,
            VpcMeta.createAddressGroup, hcClient);
    }

    public CompletableFuture<DeleteAddressGroupResponse> deleteAddressGroupAsync(DeleteAddressGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteAddressGroup);
    }

    public AsyncInvoker<DeleteAddressGroupRequest, DeleteAddressGroupResponse> deleteAddressGroupAsyncInvoker(
        DeleteAddressGroupRequest request) {
        return new AsyncInvoker<DeleteAddressGroupRequest, DeleteAddressGroupResponse>(request,
            VpcMeta.deleteAddressGroup, hcClient);
    }

    public CompletableFuture<DeleteIpAddressGroupForceResponse> deleteIpAddressGroupForceAsync(
        DeleteIpAddressGroupForceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteIpAddressGroupForce);
    }

    public AsyncInvoker<DeleteIpAddressGroupForceRequest, DeleteIpAddressGroupForceResponse> deleteIpAddressGroupForceAsyncInvoker(
        DeleteIpAddressGroupForceRequest request) {
        return new AsyncInvoker<DeleteIpAddressGroupForceRequest, DeleteIpAddressGroupForceResponse>(request,
            VpcMeta.deleteIpAddressGroupForce, hcClient);
    }

    public CompletableFuture<ListAddressGroupResponse> listAddressGroupAsync(ListAddressGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listAddressGroup);
    }

    public AsyncInvoker<ListAddressGroupRequest, ListAddressGroupResponse> listAddressGroupAsyncInvoker(
        ListAddressGroupRequest request) {
        return new AsyncInvoker<ListAddressGroupRequest, ListAddressGroupResponse>(request, VpcMeta.listAddressGroup,
            hcClient);
    }

    public CompletableFuture<ShowAddressGroupResponse> showAddressGroupAsync(ShowAddressGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showAddressGroup);
    }

    public AsyncInvoker<ShowAddressGroupRequest, ShowAddressGroupResponse> showAddressGroupAsyncInvoker(
        ShowAddressGroupRequest request) {
        return new AsyncInvoker<ShowAddressGroupRequest, ShowAddressGroupResponse>(request, VpcMeta.showAddressGroup,
            hcClient);
    }

    public CompletableFuture<UpdateAddressGroupResponse> updateAddressGroupAsync(UpdateAddressGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateAddressGroup);
    }

    public AsyncInvoker<UpdateAddressGroupRequest, UpdateAddressGroupResponse> updateAddressGroupAsyncInvoker(
        UpdateAddressGroupRequest request) {
        return new AsyncInvoker<UpdateAddressGroupRequest, UpdateAddressGroupResponse>(request,
            VpcMeta.updateAddressGroup, hcClient);
    }

    public CompletableFuture<AddVpcExtendCidrResponse> addVpcExtendCidrAsync(AddVpcExtendCidrRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.addVpcExtendCidr);
    }

    public AsyncInvoker<AddVpcExtendCidrRequest, AddVpcExtendCidrResponse> addVpcExtendCidrAsyncInvoker(
        AddVpcExtendCidrRequest request) {
        return new AsyncInvoker<AddVpcExtendCidrRequest, AddVpcExtendCidrResponse>(request, VpcMeta.addVpcExtendCidr,
            hcClient);
    }

    public CompletableFuture<CreateVpcResponse> createVpcAsync(CreateVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createVpc);
    }

    public AsyncInvoker<CreateVpcRequest, CreateVpcResponse> createVpcAsyncInvoker(CreateVpcRequest request) {
        return new AsyncInvoker<CreateVpcRequest, CreateVpcResponse>(request, VpcMeta.createVpc, hcClient);
    }

    public CompletableFuture<DeleteVpcResponse> deleteVpcAsync(DeleteVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteVpc);
    }

    public AsyncInvoker<DeleteVpcRequest, DeleteVpcResponse> deleteVpcAsyncInvoker(DeleteVpcRequest request) {
        return new AsyncInvoker<DeleteVpcRequest, DeleteVpcResponse>(request, VpcMeta.deleteVpc, hcClient);
    }

    public CompletableFuture<ListVpcsResponse> listVpcsAsync(ListVpcsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listVpcs);
    }

    public AsyncInvoker<ListVpcsRequest, ListVpcsResponse> listVpcsAsyncInvoker(ListVpcsRequest request) {
        return new AsyncInvoker<ListVpcsRequest, ListVpcsResponse>(request, VpcMeta.listVpcs, hcClient);
    }

    public CompletableFuture<RemoveVpcExtendCidrResponse> removeVpcExtendCidrAsync(RemoveVpcExtendCidrRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.removeVpcExtendCidr);
    }

    public AsyncInvoker<RemoveVpcExtendCidrRequest, RemoveVpcExtendCidrResponse> removeVpcExtendCidrAsyncInvoker(
        RemoveVpcExtendCidrRequest request) {
        return new AsyncInvoker<RemoveVpcExtendCidrRequest, RemoveVpcExtendCidrResponse>(request,
            VpcMeta.removeVpcExtendCidr, hcClient);
    }

    public CompletableFuture<ShowVpcResponse> showVpcAsync(ShowVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showVpc);
    }

    public AsyncInvoker<ShowVpcRequest, ShowVpcResponse> showVpcAsyncInvoker(ShowVpcRequest request) {
        return new AsyncInvoker<ShowVpcRequest, ShowVpcResponse>(request, VpcMeta.showVpc, hcClient);
    }

    public CompletableFuture<UpdateVpcResponse> updateVpcAsync(UpdateVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateVpc);
    }

    public AsyncInvoker<UpdateVpcRequest, UpdateVpcResponse> updateVpcAsyncInvoker(UpdateVpcRequest request) {
        return new AsyncInvoker<UpdateVpcRequest, UpdateVpcResponse>(request, VpcMeta.updateVpc, hcClient);
    }

}
