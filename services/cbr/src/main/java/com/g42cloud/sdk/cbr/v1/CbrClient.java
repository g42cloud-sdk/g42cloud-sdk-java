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
import com.g42cloud.sdk.core.invoker.SyncInvoker;

public class CbrClient {

    protected HcClient hcClient;

    public CbrClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CbrClient> newBuilder() {
        ClientBuilder<CbrClient> clientBuilder = new ClientBuilder<>(CbrClient::new);
        return clientBuilder;
    }

    public AddMemberResponse addMember(AddMemberRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.addMember);
    }

    public SyncInvoker<AddMemberRequest, AddMemberResponse> addMemberInvoker(AddMemberRequest request) {
        return new SyncInvoker<AddMemberRequest, AddMemberResponse>(request, CbrMeta.addMember, hcClient);
    }

    public AddVaultResourceResponse addVaultResource(AddVaultResourceRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.addVaultResource);
    }

    public SyncInvoker<AddVaultResourceRequest, AddVaultResourceResponse> addVaultResourceInvoker(
        AddVaultResourceRequest request) {
        return new SyncInvoker<AddVaultResourceRequest, AddVaultResourceResponse>(request, CbrMeta.addVaultResource,
            hcClient);
    }

    public AssociateVaultPolicyResponse associateVaultPolicy(AssociateVaultPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.associateVaultPolicy);
    }

    public SyncInvoker<AssociateVaultPolicyRequest, AssociateVaultPolicyResponse> associateVaultPolicyInvoker(
        AssociateVaultPolicyRequest request) {
        return new SyncInvoker<AssociateVaultPolicyRequest, AssociateVaultPolicyResponse>(request,
            CbrMeta.associateVaultPolicy, hcClient);
    }

    public BatchCreateAndDeleteVaultTagsResponse batchCreateAndDeleteVaultTags(
        BatchCreateAndDeleteVaultTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.batchCreateAndDeleteVaultTags);
    }

    public SyncInvoker<BatchCreateAndDeleteVaultTagsRequest, BatchCreateAndDeleteVaultTagsResponse> batchCreateAndDeleteVaultTagsInvoker(
        BatchCreateAndDeleteVaultTagsRequest request) {
        return new SyncInvoker<BatchCreateAndDeleteVaultTagsRequest, BatchCreateAndDeleteVaultTagsResponse>(request,
            CbrMeta.batchCreateAndDeleteVaultTags, hcClient);
    }

    public CreateCheckpointResponse createCheckpoint(CreateCheckpointRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.createCheckpoint);
    }

    public SyncInvoker<CreateCheckpointRequest, CreateCheckpointResponse> createCheckpointInvoker(
        CreateCheckpointRequest request) {
        return new SyncInvoker<CreateCheckpointRequest, CreateCheckpointResponse>(request, CbrMeta.createCheckpoint,
            hcClient);
    }

    public CreatePolicyResponse createPolicy(CreatePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.createPolicy);
    }

    public SyncInvoker<CreatePolicyRequest, CreatePolicyResponse> createPolicyInvoker(CreatePolicyRequest request) {
        return new SyncInvoker<CreatePolicyRequest, CreatePolicyResponse>(request, CbrMeta.createPolicy, hcClient);
    }

    public CreateVaultResponse createVault(CreateVaultRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.createVault);
    }

    public SyncInvoker<CreateVaultRequest, CreateVaultResponse> createVaultInvoker(CreateVaultRequest request) {
        return new SyncInvoker<CreateVaultRequest, CreateVaultResponse>(request, CbrMeta.createVault, hcClient);
    }

    public CreateVaultTagsResponse createVaultTags(CreateVaultTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.createVaultTags);
    }

    public SyncInvoker<CreateVaultTagsRequest, CreateVaultTagsResponse> createVaultTagsInvoker(
        CreateVaultTagsRequest request) {
        return new SyncInvoker<CreateVaultTagsRequest, CreateVaultTagsResponse>(request, CbrMeta.createVaultTags,
            hcClient);
    }

    public DeleteBackupResponse deleteBackup(DeleteBackupRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.deleteBackup);
    }

    public SyncInvoker<DeleteBackupRequest, DeleteBackupResponse> deleteBackupInvoker(DeleteBackupRequest request) {
        return new SyncInvoker<DeleteBackupRequest, DeleteBackupResponse>(request, CbrMeta.deleteBackup, hcClient);
    }

    public DeleteMemberResponse deleteMember(DeleteMemberRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.deleteMember);
    }

    public SyncInvoker<DeleteMemberRequest, DeleteMemberResponse> deleteMemberInvoker(DeleteMemberRequest request) {
        return new SyncInvoker<DeleteMemberRequest, DeleteMemberResponse>(request, CbrMeta.deleteMember, hcClient);
    }

    public DeletePolicyResponse deletePolicy(DeletePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.deletePolicy);
    }

    public SyncInvoker<DeletePolicyRequest, DeletePolicyResponse> deletePolicyInvoker(DeletePolicyRequest request) {
        return new SyncInvoker<DeletePolicyRequest, DeletePolicyResponse>(request, CbrMeta.deletePolicy, hcClient);
    }

    public DeleteVaultResponse deleteVault(DeleteVaultRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.deleteVault);
    }

    public SyncInvoker<DeleteVaultRequest, DeleteVaultResponse> deleteVaultInvoker(DeleteVaultRequest request) {
        return new SyncInvoker<DeleteVaultRequest, DeleteVaultResponse>(request, CbrMeta.deleteVault, hcClient);
    }

    public DeleteVaultTagResponse deleteVaultTag(DeleteVaultTagRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.deleteVaultTag);
    }

    public SyncInvoker<DeleteVaultTagRequest, DeleteVaultTagResponse> deleteVaultTagInvoker(
        DeleteVaultTagRequest request) {
        return new SyncInvoker<DeleteVaultTagRequest, DeleteVaultTagResponse>(request, CbrMeta.deleteVaultTag,
            hcClient);
    }

    public DisassociateVaultPolicyResponse disassociateVaultPolicy(DisassociateVaultPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.disassociateVaultPolicy);
    }

    public SyncInvoker<DisassociateVaultPolicyRequest, DisassociateVaultPolicyResponse> disassociateVaultPolicyInvoker(
        DisassociateVaultPolicyRequest request) {
        return new SyncInvoker<DisassociateVaultPolicyRequest, DisassociateVaultPolicyResponse>(request,
            CbrMeta.disassociateVaultPolicy, hcClient);
    }

    public ListBackupsResponse listBackups(ListBackupsRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.listBackups);
    }

    public SyncInvoker<ListBackupsRequest, ListBackupsResponse> listBackupsInvoker(ListBackupsRequest request) {
        return new SyncInvoker<ListBackupsRequest, ListBackupsResponse>(request, CbrMeta.listBackups, hcClient);
    }

    public ListOpLogsResponse listOpLogs(ListOpLogsRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.listOpLogs);
    }

    public SyncInvoker<ListOpLogsRequest, ListOpLogsResponse> listOpLogsInvoker(ListOpLogsRequest request) {
        return new SyncInvoker<ListOpLogsRequest, ListOpLogsResponse>(request, CbrMeta.listOpLogs, hcClient);
    }

    public ListPoliciesResponse listPolicies(ListPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.listPolicies);
    }

    public SyncInvoker<ListPoliciesRequest, ListPoliciesResponse> listPoliciesInvoker(ListPoliciesRequest request) {
        return new SyncInvoker<ListPoliciesRequest, ListPoliciesResponse>(request, CbrMeta.listPolicies, hcClient);
    }

    public ListProtectableResponse listProtectable(ListProtectableRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.listProtectable);
    }

    public SyncInvoker<ListProtectableRequest, ListProtectableResponse> listProtectableInvoker(
        ListProtectableRequest request) {
        return new SyncInvoker<ListProtectableRequest, ListProtectableResponse>(request, CbrMeta.listProtectable,
            hcClient);
    }

    public ListVaultResponse listVault(ListVaultRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.listVault);
    }

    public SyncInvoker<ListVaultRequest, ListVaultResponse> listVaultInvoker(ListVaultRequest request) {
        return new SyncInvoker<ListVaultRequest, ListVaultResponse>(request, CbrMeta.listVault, hcClient);
    }

    public RemoveVaultResourceResponse removeVaultResource(RemoveVaultResourceRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.removeVaultResource);
    }

    public SyncInvoker<RemoveVaultResourceRequest, RemoveVaultResourceResponse> removeVaultResourceInvoker(
        RemoveVaultResourceRequest request) {
        return new SyncInvoker<RemoveVaultResourceRequest, RemoveVaultResourceResponse>(request,
            CbrMeta.removeVaultResource, hcClient);
    }

    public RestoreBackupResponse restoreBackup(RestoreBackupRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.restoreBackup);
    }

    public SyncInvoker<RestoreBackupRequest, RestoreBackupResponse> restoreBackupInvoker(RestoreBackupRequest request) {
        return new SyncInvoker<RestoreBackupRequest, RestoreBackupResponse>(request, CbrMeta.restoreBackup, hcClient);
    }

    public ShowBackupResponse showBackup(ShowBackupRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.showBackup);
    }

    public SyncInvoker<ShowBackupRequest, ShowBackupResponse> showBackupInvoker(ShowBackupRequest request) {
        return new SyncInvoker<ShowBackupRequest, ShowBackupResponse>(request, CbrMeta.showBackup, hcClient);
    }

    public ShowCheckpointResponse showCheckpoint(ShowCheckpointRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.showCheckpoint);
    }

    public SyncInvoker<ShowCheckpointRequest, ShowCheckpointResponse> showCheckpointInvoker(
        ShowCheckpointRequest request) {
        return new SyncInvoker<ShowCheckpointRequest, ShowCheckpointResponse>(request, CbrMeta.showCheckpoint,
            hcClient);
    }

    public ShowMemberDetailResponse showMemberDetail(ShowMemberDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.showMemberDetail);
    }

    public SyncInvoker<ShowMemberDetailRequest, ShowMemberDetailResponse> showMemberDetailInvoker(
        ShowMemberDetailRequest request) {
        return new SyncInvoker<ShowMemberDetailRequest, ShowMemberDetailResponse>(request, CbrMeta.showMemberDetail,
            hcClient);
    }

    public ShowMembersDetailResponse showMembersDetail(ShowMembersDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.showMembersDetail);
    }

    public SyncInvoker<ShowMembersDetailRequest, ShowMembersDetailResponse> showMembersDetailInvoker(
        ShowMembersDetailRequest request) {
        return new SyncInvoker<ShowMembersDetailRequest, ShowMembersDetailResponse>(request, CbrMeta.showMembersDetail,
            hcClient);
    }

    public ShowOpLogResponse showOpLog(ShowOpLogRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.showOpLog);
    }

    public SyncInvoker<ShowOpLogRequest, ShowOpLogResponse> showOpLogInvoker(ShowOpLogRequest request) {
        return new SyncInvoker<ShowOpLogRequest, ShowOpLogResponse>(request, CbrMeta.showOpLog, hcClient);
    }

    public ShowPolicyResponse showPolicy(ShowPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.showPolicy);
    }

    public SyncInvoker<ShowPolicyRequest, ShowPolicyResponse> showPolicyInvoker(ShowPolicyRequest request) {
        return new SyncInvoker<ShowPolicyRequest, ShowPolicyResponse>(request, CbrMeta.showPolicy, hcClient);
    }

    public ShowProtectableResponse showProtectable(ShowProtectableRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.showProtectable);
    }

    public SyncInvoker<ShowProtectableRequest, ShowProtectableResponse> showProtectableInvoker(
        ShowProtectableRequest request) {
        return new SyncInvoker<ShowProtectableRequest, ShowProtectableResponse>(request, CbrMeta.showProtectable,
            hcClient);
    }

    public ShowVaultResponse showVault(ShowVaultRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.showVault);
    }

    public SyncInvoker<ShowVaultRequest, ShowVaultResponse> showVaultInvoker(ShowVaultRequest request) {
        return new SyncInvoker<ShowVaultRequest, ShowVaultResponse>(request, CbrMeta.showVault, hcClient);
    }

    public ShowVaultProjectTagResponse showVaultProjectTag(ShowVaultProjectTagRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.showVaultProjectTag);
    }

    public SyncInvoker<ShowVaultProjectTagRequest, ShowVaultProjectTagResponse> showVaultProjectTagInvoker(
        ShowVaultProjectTagRequest request) {
        return new SyncInvoker<ShowVaultProjectTagRequest, ShowVaultProjectTagResponse>(request,
            CbrMeta.showVaultProjectTag, hcClient);
    }

    public ShowVaultResourceInstancesResponse showVaultResourceInstances(ShowVaultResourceInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.showVaultResourceInstances);
    }

    public SyncInvoker<ShowVaultResourceInstancesRequest, ShowVaultResourceInstancesResponse> showVaultResourceInstancesInvoker(
        ShowVaultResourceInstancesRequest request) {
        return new SyncInvoker<ShowVaultResourceInstancesRequest, ShowVaultResourceInstancesResponse>(request,
            CbrMeta.showVaultResourceInstances, hcClient);
    }

    public ShowVaultTagResponse showVaultTag(ShowVaultTagRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.showVaultTag);
    }

    public SyncInvoker<ShowVaultTagRequest, ShowVaultTagResponse> showVaultTagInvoker(ShowVaultTagRequest request) {
        return new SyncInvoker<ShowVaultTagRequest, ShowVaultTagResponse>(request, CbrMeta.showVaultTag, hcClient);
    }

    public UpdateMemberStatusResponse updateMemberStatus(UpdateMemberStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.updateMemberStatus);
    }

    public SyncInvoker<UpdateMemberStatusRequest, UpdateMemberStatusResponse> updateMemberStatusInvoker(
        UpdateMemberStatusRequest request) {
        return new SyncInvoker<UpdateMemberStatusRequest, UpdateMemberStatusResponse>(request,
            CbrMeta.updateMemberStatus, hcClient);
    }

    public UpdatePolicyResponse updatePolicy(UpdatePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.updatePolicy);
    }

    public SyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse> updatePolicyInvoker(UpdatePolicyRequest request) {
        return new SyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse>(request, CbrMeta.updatePolicy, hcClient);
    }

    public UpdateVaultResponse updateVault(UpdateVaultRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.updateVault);
    }

    public SyncInvoker<UpdateVaultRequest, UpdateVaultResponse> updateVaultInvoker(UpdateVaultRequest request) {
        return new SyncInvoker<UpdateVaultRequest, UpdateVaultResponse>(request, CbrMeta.updateVault, hcClient);
    }

}
