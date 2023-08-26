package com.g42cloud.sdk.cbr.v1;

import com.g42cloud.sdk.cbr.v1.model.AddMemberRequest;
import com.g42cloud.sdk.cbr.v1.model.AddMemberResponse;
import com.g42cloud.sdk.cbr.v1.model.AddVaultResourceRequest;
import com.g42cloud.sdk.cbr.v1.model.AddVaultResourceResponse;
import com.g42cloud.sdk.cbr.v1.model.AssociateVaultPolicyRequest;
import com.g42cloud.sdk.cbr.v1.model.AssociateVaultPolicyResponse;
import com.g42cloud.sdk.cbr.v1.model.BatchCreateAndDeleteVaultTagsRequest;
import com.g42cloud.sdk.cbr.v1.model.BatchCreateAndDeleteVaultTagsResponse;
import com.g42cloud.sdk.cbr.v1.model.CreateCheckpointRequest;
import com.g42cloud.sdk.cbr.v1.model.CreateCheckpointResponse;
import com.g42cloud.sdk.cbr.v1.model.CreatePolicyRequest;
import com.g42cloud.sdk.cbr.v1.model.CreatePolicyResponse;
import com.g42cloud.sdk.cbr.v1.model.CreateVaultRequest;
import com.g42cloud.sdk.cbr.v1.model.CreateVaultResponse;
import com.g42cloud.sdk.cbr.v1.model.CreateVaultTagsRequest;
import com.g42cloud.sdk.cbr.v1.model.CreateVaultTagsResponse;
import com.g42cloud.sdk.cbr.v1.model.DeleteBackupRequest;
import com.g42cloud.sdk.cbr.v1.model.DeleteBackupResponse;
import com.g42cloud.sdk.cbr.v1.model.DeleteMemberRequest;
import com.g42cloud.sdk.cbr.v1.model.DeleteMemberResponse;
import com.g42cloud.sdk.cbr.v1.model.DeletePolicyRequest;
import com.g42cloud.sdk.cbr.v1.model.DeletePolicyResponse;
import com.g42cloud.sdk.cbr.v1.model.DeleteVaultRequest;
import com.g42cloud.sdk.cbr.v1.model.DeleteVaultResponse;
import com.g42cloud.sdk.cbr.v1.model.DeleteVaultTagRequest;
import com.g42cloud.sdk.cbr.v1.model.DeleteVaultTagResponse;
import com.g42cloud.sdk.cbr.v1.model.DisassociateVaultPolicyRequest;
import com.g42cloud.sdk.cbr.v1.model.DisassociateVaultPolicyResponse;
import com.g42cloud.sdk.cbr.v1.model.ListBackupsRequest;
import com.g42cloud.sdk.cbr.v1.model.ListBackupsResponse;
import com.g42cloud.sdk.cbr.v1.model.ListOpLogsRequest;
import com.g42cloud.sdk.cbr.v1.model.ListOpLogsResponse;
import com.g42cloud.sdk.cbr.v1.model.ListPoliciesRequest;
import com.g42cloud.sdk.cbr.v1.model.ListPoliciesResponse;
import com.g42cloud.sdk.cbr.v1.model.ListProtectableRequest;
import com.g42cloud.sdk.cbr.v1.model.ListProtectableResponse;
import com.g42cloud.sdk.cbr.v1.model.ListVaultRequest;
import com.g42cloud.sdk.cbr.v1.model.ListVaultResponse;
import com.g42cloud.sdk.cbr.v1.model.RemoveVaultResourceRequest;
import com.g42cloud.sdk.cbr.v1.model.RemoveVaultResourceResponse;
import com.g42cloud.sdk.cbr.v1.model.RestoreBackupRequest;
import com.g42cloud.sdk.cbr.v1.model.RestoreBackupResponse;
import com.g42cloud.sdk.cbr.v1.model.ShowBackupRequest;
import com.g42cloud.sdk.cbr.v1.model.ShowBackupResponse;
import com.g42cloud.sdk.cbr.v1.model.ShowCheckpointRequest;
import com.g42cloud.sdk.cbr.v1.model.ShowCheckpointResponse;
import com.g42cloud.sdk.cbr.v1.model.ShowMemberDetailRequest;
import com.g42cloud.sdk.cbr.v1.model.ShowMemberDetailResponse;
import com.g42cloud.sdk.cbr.v1.model.ShowMembersDetailRequest;
import com.g42cloud.sdk.cbr.v1.model.ShowMembersDetailResponse;
import com.g42cloud.sdk.cbr.v1.model.ShowOpLogRequest;
import com.g42cloud.sdk.cbr.v1.model.ShowOpLogResponse;
import com.g42cloud.sdk.cbr.v1.model.ShowPolicyRequest;
import com.g42cloud.sdk.cbr.v1.model.ShowPolicyResponse;
import com.g42cloud.sdk.cbr.v1.model.ShowProtectableRequest;
import com.g42cloud.sdk.cbr.v1.model.ShowProtectableResponse;
import com.g42cloud.sdk.cbr.v1.model.ShowVaultProjectTagRequest;
import com.g42cloud.sdk.cbr.v1.model.ShowVaultProjectTagResponse;
import com.g42cloud.sdk.cbr.v1.model.ShowVaultRequest;
import com.g42cloud.sdk.cbr.v1.model.ShowVaultResourceInstancesRequest;
import com.g42cloud.sdk.cbr.v1.model.ShowVaultResourceInstancesResponse;
import com.g42cloud.sdk.cbr.v1.model.ShowVaultResponse;
import com.g42cloud.sdk.cbr.v1.model.ShowVaultTagRequest;
import com.g42cloud.sdk.cbr.v1.model.ShowVaultTagResponse;
import com.g42cloud.sdk.cbr.v1.model.UpdateMemberStatusRequest;
import com.g42cloud.sdk.cbr.v1.model.UpdateMemberStatusResponse;
import com.g42cloud.sdk.cbr.v1.model.UpdatePolicyRequest;
import com.g42cloud.sdk.cbr.v1.model.UpdatePolicyResponse;
import com.g42cloud.sdk.cbr.v1.model.UpdateVaultRequest;
import com.g42cloud.sdk.cbr.v1.model.UpdateVaultResponse;
import com.g42cloud.sdk.core.ClientBuilder;
import com.g42cloud.sdk.core.HcClient;
import com.g42cloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CbrAsyncClient {

    protected HcClient hcClient;

    public CbrAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CbrAsyncClient> newBuilder() {
        ClientBuilder<CbrAsyncClient> clientBuilder = new ClientBuilder<>(CbrAsyncClient::new);
        return clientBuilder;
    }

    public CompletableFuture<AddMemberResponse> addMemberAsync(AddMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.addMember);
    }

    public AsyncInvoker<AddMemberRequest, AddMemberResponse> addMemberAsyncInvoker(AddMemberRequest request) {
        return new AsyncInvoker<AddMemberRequest, AddMemberResponse>(request, CbrMeta.addMember, hcClient);
    }

    public CompletableFuture<AddVaultResourceResponse> addVaultResourceAsync(AddVaultResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.addVaultResource);
    }

    public AsyncInvoker<AddVaultResourceRequest, AddVaultResourceResponse> addVaultResourceAsyncInvoker(
        AddVaultResourceRequest request) {
        return new AsyncInvoker<AddVaultResourceRequest, AddVaultResourceResponse>(request, CbrMeta.addVaultResource,
            hcClient);
    }

    public CompletableFuture<AssociateVaultPolicyResponse> associateVaultPolicyAsync(
        AssociateVaultPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.associateVaultPolicy);
    }

    public AsyncInvoker<AssociateVaultPolicyRequest, AssociateVaultPolicyResponse> associateVaultPolicyAsyncInvoker(
        AssociateVaultPolicyRequest request) {
        return new AsyncInvoker<AssociateVaultPolicyRequest, AssociateVaultPolicyResponse>(request,
            CbrMeta.associateVaultPolicy, hcClient);
    }

    public CompletableFuture<BatchCreateAndDeleteVaultTagsResponse> batchCreateAndDeleteVaultTagsAsync(
        BatchCreateAndDeleteVaultTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.batchCreateAndDeleteVaultTags);
    }

    public AsyncInvoker<BatchCreateAndDeleteVaultTagsRequest, BatchCreateAndDeleteVaultTagsResponse> batchCreateAndDeleteVaultTagsAsyncInvoker(
        BatchCreateAndDeleteVaultTagsRequest request) {
        return new AsyncInvoker<BatchCreateAndDeleteVaultTagsRequest, BatchCreateAndDeleteVaultTagsResponse>(request,
            CbrMeta.batchCreateAndDeleteVaultTags, hcClient);
    }

    public CompletableFuture<CreateCheckpointResponse> createCheckpointAsync(CreateCheckpointRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.createCheckpoint);
    }

    public AsyncInvoker<CreateCheckpointRequest, CreateCheckpointResponse> createCheckpointAsyncInvoker(
        CreateCheckpointRequest request) {
        return new AsyncInvoker<CreateCheckpointRequest, CreateCheckpointResponse>(request, CbrMeta.createCheckpoint,
            hcClient);
    }

    public CompletableFuture<CreatePolicyResponse> createPolicyAsync(CreatePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.createPolicy);
    }

    public AsyncInvoker<CreatePolicyRequest, CreatePolicyResponse> createPolicyAsyncInvoker(
        CreatePolicyRequest request) {
        return new AsyncInvoker<CreatePolicyRequest, CreatePolicyResponse>(request, CbrMeta.createPolicy, hcClient);
    }

    public CompletableFuture<CreateVaultResponse> createVaultAsync(CreateVaultRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.createVault);
    }

    public AsyncInvoker<CreateVaultRequest, CreateVaultResponse> createVaultAsyncInvoker(CreateVaultRequest request) {
        return new AsyncInvoker<CreateVaultRequest, CreateVaultResponse>(request, CbrMeta.createVault, hcClient);
    }

    public CompletableFuture<CreateVaultTagsResponse> createVaultTagsAsync(CreateVaultTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.createVaultTags);
    }

    public AsyncInvoker<CreateVaultTagsRequest, CreateVaultTagsResponse> createVaultTagsAsyncInvoker(
        CreateVaultTagsRequest request) {
        return new AsyncInvoker<CreateVaultTagsRequest, CreateVaultTagsResponse>(request, CbrMeta.createVaultTags,
            hcClient);
    }

    public CompletableFuture<DeleteBackupResponse> deleteBackupAsync(DeleteBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.deleteBackup);
    }

    public AsyncInvoker<DeleteBackupRequest, DeleteBackupResponse> deleteBackupAsyncInvoker(
        DeleteBackupRequest request) {
        return new AsyncInvoker<DeleteBackupRequest, DeleteBackupResponse>(request, CbrMeta.deleteBackup, hcClient);
    }

    public CompletableFuture<DeleteMemberResponse> deleteMemberAsync(DeleteMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.deleteMember);
    }

    public AsyncInvoker<DeleteMemberRequest, DeleteMemberResponse> deleteMemberAsyncInvoker(
        DeleteMemberRequest request) {
        return new AsyncInvoker<DeleteMemberRequest, DeleteMemberResponse>(request, CbrMeta.deleteMember, hcClient);
    }

    public CompletableFuture<DeletePolicyResponse> deletePolicyAsync(DeletePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.deletePolicy);
    }

    public AsyncInvoker<DeletePolicyRequest, DeletePolicyResponse> deletePolicyAsyncInvoker(
        DeletePolicyRequest request) {
        return new AsyncInvoker<DeletePolicyRequest, DeletePolicyResponse>(request, CbrMeta.deletePolicy, hcClient);
    }

    public CompletableFuture<DeleteVaultResponse> deleteVaultAsync(DeleteVaultRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.deleteVault);
    }

    public AsyncInvoker<DeleteVaultRequest, DeleteVaultResponse> deleteVaultAsyncInvoker(DeleteVaultRequest request) {
        return new AsyncInvoker<DeleteVaultRequest, DeleteVaultResponse>(request, CbrMeta.deleteVault, hcClient);
    }

    public CompletableFuture<DeleteVaultTagResponse> deleteVaultTagAsync(DeleteVaultTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.deleteVaultTag);
    }

    public AsyncInvoker<DeleteVaultTagRequest, DeleteVaultTagResponse> deleteVaultTagAsyncInvoker(
        DeleteVaultTagRequest request) {
        return new AsyncInvoker<DeleteVaultTagRequest, DeleteVaultTagResponse>(request, CbrMeta.deleteVaultTag,
            hcClient);
    }

    public CompletableFuture<DisassociateVaultPolicyResponse> disassociateVaultPolicyAsync(
        DisassociateVaultPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.disassociateVaultPolicy);
    }

    public AsyncInvoker<DisassociateVaultPolicyRequest, DisassociateVaultPolicyResponse> disassociateVaultPolicyAsyncInvoker(
        DisassociateVaultPolicyRequest request) {
        return new AsyncInvoker<DisassociateVaultPolicyRequest, DisassociateVaultPolicyResponse>(request,
            CbrMeta.disassociateVaultPolicy, hcClient);
    }

    public CompletableFuture<ListBackupsResponse> listBackupsAsync(ListBackupsRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.listBackups);
    }

    public AsyncInvoker<ListBackupsRequest, ListBackupsResponse> listBackupsAsyncInvoker(ListBackupsRequest request) {
        return new AsyncInvoker<ListBackupsRequest, ListBackupsResponse>(request, CbrMeta.listBackups, hcClient);
    }

    public CompletableFuture<ListOpLogsResponse> listOpLogsAsync(ListOpLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.listOpLogs);
    }

    public AsyncInvoker<ListOpLogsRequest, ListOpLogsResponse> listOpLogsAsyncInvoker(ListOpLogsRequest request) {
        return new AsyncInvoker<ListOpLogsRequest, ListOpLogsResponse>(request, CbrMeta.listOpLogs, hcClient);
    }

    public CompletableFuture<ListPoliciesResponse> listPoliciesAsync(ListPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.listPolicies);
    }

    public AsyncInvoker<ListPoliciesRequest, ListPoliciesResponse> listPoliciesAsyncInvoker(
        ListPoliciesRequest request) {
        return new AsyncInvoker<ListPoliciesRequest, ListPoliciesResponse>(request, CbrMeta.listPolicies, hcClient);
    }

    public CompletableFuture<ListProtectableResponse> listProtectableAsync(ListProtectableRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.listProtectable);
    }

    public AsyncInvoker<ListProtectableRequest, ListProtectableResponse> listProtectableAsyncInvoker(
        ListProtectableRequest request) {
        return new AsyncInvoker<ListProtectableRequest, ListProtectableResponse>(request, CbrMeta.listProtectable,
            hcClient);
    }

    public CompletableFuture<ListVaultResponse> listVaultAsync(ListVaultRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.listVault);
    }

    public AsyncInvoker<ListVaultRequest, ListVaultResponse> listVaultAsyncInvoker(ListVaultRequest request) {
        return new AsyncInvoker<ListVaultRequest, ListVaultResponse>(request, CbrMeta.listVault, hcClient);
    }

    public CompletableFuture<RemoveVaultResourceResponse> removeVaultResourceAsync(RemoveVaultResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.removeVaultResource);
    }

    public AsyncInvoker<RemoveVaultResourceRequest, RemoveVaultResourceResponse> removeVaultResourceAsyncInvoker(
        RemoveVaultResourceRequest request) {
        return new AsyncInvoker<RemoveVaultResourceRequest, RemoveVaultResourceResponse>(request,
            CbrMeta.removeVaultResource, hcClient);
    }

    public CompletableFuture<RestoreBackupResponse> restoreBackupAsync(RestoreBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.restoreBackup);
    }

    public AsyncInvoker<RestoreBackupRequest, RestoreBackupResponse> restoreBackupAsyncInvoker(
        RestoreBackupRequest request) {
        return new AsyncInvoker<RestoreBackupRequest, RestoreBackupResponse>(request, CbrMeta.restoreBackup, hcClient);
    }

    public CompletableFuture<ShowBackupResponse> showBackupAsync(ShowBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showBackup);
    }

    public AsyncInvoker<ShowBackupRequest, ShowBackupResponse> showBackupAsyncInvoker(ShowBackupRequest request) {
        return new AsyncInvoker<ShowBackupRequest, ShowBackupResponse>(request, CbrMeta.showBackup, hcClient);
    }

    public CompletableFuture<ShowCheckpointResponse> showCheckpointAsync(ShowCheckpointRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showCheckpoint);
    }

    public AsyncInvoker<ShowCheckpointRequest, ShowCheckpointResponse> showCheckpointAsyncInvoker(
        ShowCheckpointRequest request) {
        return new AsyncInvoker<ShowCheckpointRequest, ShowCheckpointResponse>(request, CbrMeta.showCheckpoint,
            hcClient);
    }

    public CompletableFuture<ShowMemberDetailResponse> showMemberDetailAsync(ShowMemberDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showMemberDetail);
    }

    public AsyncInvoker<ShowMemberDetailRequest, ShowMemberDetailResponse> showMemberDetailAsyncInvoker(
        ShowMemberDetailRequest request) {
        return new AsyncInvoker<ShowMemberDetailRequest, ShowMemberDetailResponse>(request, CbrMeta.showMemberDetail,
            hcClient);
    }

    public CompletableFuture<ShowMembersDetailResponse> showMembersDetailAsync(ShowMembersDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showMembersDetail);
    }

    public AsyncInvoker<ShowMembersDetailRequest, ShowMembersDetailResponse> showMembersDetailAsyncInvoker(
        ShowMembersDetailRequest request) {
        return new AsyncInvoker<ShowMembersDetailRequest, ShowMembersDetailResponse>(request, CbrMeta.showMembersDetail,
            hcClient);
    }

    public CompletableFuture<ShowOpLogResponse> showOpLogAsync(ShowOpLogRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showOpLog);
    }

    public AsyncInvoker<ShowOpLogRequest, ShowOpLogResponse> showOpLogAsyncInvoker(ShowOpLogRequest request) {
        return new AsyncInvoker<ShowOpLogRequest, ShowOpLogResponse>(request, CbrMeta.showOpLog, hcClient);
    }

    public CompletableFuture<ShowPolicyResponse> showPolicyAsync(ShowPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showPolicy);
    }

    public AsyncInvoker<ShowPolicyRequest, ShowPolicyResponse> showPolicyAsyncInvoker(ShowPolicyRequest request) {
        return new AsyncInvoker<ShowPolicyRequest, ShowPolicyResponse>(request, CbrMeta.showPolicy, hcClient);
    }

    public CompletableFuture<ShowProtectableResponse> showProtectableAsync(ShowProtectableRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showProtectable);
    }

    public AsyncInvoker<ShowProtectableRequest, ShowProtectableResponse> showProtectableAsyncInvoker(
        ShowProtectableRequest request) {
        return new AsyncInvoker<ShowProtectableRequest, ShowProtectableResponse>(request, CbrMeta.showProtectable,
            hcClient);
    }

    public CompletableFuture<ShowVaultResponse> showVaultAsync(ShowVaultRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showVault);
    }

    public AsyncInvoker<ShowVaultRequest, ShowVaultResponse> showVaultAsyncInvoker(ShowVaultRequest request) {
        return new AsyncInvoker<ShowVaultRequest, ShowVaultResponse>(request, CbrMeta.showVault, hcClient);
    }

    public CompletableFuture<ShowVaultProjectTagResponse> showVaultProjectTagAsync(ShowVaultProjectTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showVaultProjectTag);
    }

    public AsyncInvoker<ShowVaultProjectTagRequest, ShowVaultProjectTagResponse> showVaultProjectTagAsyncInvoker(
        ShowVaultProjectTagRequest request) {
        return new AsyncInvoker<ShowVaultProjectTagRequest, ShowVaultProjectTagResponse>(request,
            CbrMeta.showVaultProjectTag, hcClient);
    }

    public CompletableFuture<ShowVaultResourceInstancesResponse> showVaultResourceInstancesAsync(
        ShowVaultResourceInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showVaultResourceInstances);
    }

    public AsyncInvoker<ShowVaultResourceInstancesRequest, ShowVaultResourceInstancesResponse> showVaultResourceInstancesAsyncInvoker(
        ShowVaultResourceInstancesRequest request) {
        return new AsyncInvoker<ShowVaultResourceInstancesRequest, ShowVaultResourceInstancesResponse>(request,
            CbrMeta.showVaultResourceInstances, hcClient);
    }

    public CompletableFuture<ShowVaultTagResponse> showVaultTagAsync(ShowVaultTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showVaultTag);
    }

    public AsyncInvoker<ShowVaultTagRequest, ShowVaultTagResponse> showVaultTagAsyncInvoker(
        ShowVaultTagRequest request) {
        return new AsyncInvoker<ShowVaultTagRequest, ShowVaultTagResponse>(request, CbrMeta.showVaultTag, hcClient);
    }

    public CompletableFuture<UpdateMemberStatusResponse> updateMemberStatusAsync(UpdateMemberStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.updateMemberStatus);
    }

    public AsyncInvoker<UpdateMemberStatusRequest, UpdateMemberStatusResponse> updateMemberStatusAsyncInvoker(
        UpdateMemberStatusRequest request) {
        return new AsyncInvoker<UpdateMemberStatusRequest, UpdateMemberStatusResponse>(request,
            CbrMeta.updateMemberStatus, hcClient);
    }

    public CompletableFuture<UpdatePolicyResponse> updatePolicyAsync(UpdatePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.updatePolicy);
    }

    public AsyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse> updatePolicyAsyncInvoker(
        UpdatePolicyRequest request) {
        return new AsyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse>(request, CbrMeta.updatePolicy, hcClient);
    }

    public CompletableFuture<UpdateVaultResponse> updateVaultAsync(UpdateVaultRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.updateVault);
    }

    public AsyncInvoker<UpdateVaultRequest, UpdateVaultResponse> updateVaultAsyncInvoker(UpdateVaultRequest request) {
        return new AsyncInvoker<UpdateVaultRequest, UpdateVaultResponse>(request, CbrMeta.updateVault, hcClient);
    }

}
