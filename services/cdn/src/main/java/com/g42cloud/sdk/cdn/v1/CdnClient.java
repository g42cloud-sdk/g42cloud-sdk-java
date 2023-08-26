package com.g42cloud.sdk.cdn.v1;

import com.g42cloud.sdk.cdn.v1.model.CreateDomainRequest;
import com.g42cloud.sdk.cdn.v1.model.CreateDomainResponse;
import com.g42cloud.sdk.cdn.v1.model.CreatePreheatingTasksRequest;
import com.g42cloud.sdk.cdn.v1.model.CreatePreheatingTasksResponse;
import com.g42cloud.sdk.cdn.v1.model.CreateRefreshTasksRequest;
import com.g42cloud.sdk.cdn.v1.model.CreateRefreshTasksResponse;
import com.g42cloud.sdk.cdn.v1.model.DeleteDomainRequest;
import com.g42cloud.sdk.cdn.v1.model.DeleteDomainResponse;
import com.g42cloud.sdk.cdn.v1.model.DisableDomainRequest;
import com.g42cloud.sdk.cdn.v1.model.DisableDomainResponse;
import com.g42cloud.sdk.cdn.v1.model.EnableDomainRequest;
import com.g42cloud.sdk.cdn.v1.model.EnableDomainResponse;
import com.g42cloud.sdk.cdn.v1.model.ListDomainsRequest;
import com.g42cloud.sdk.cdn.v1.model.ListDomainsResponse;
import com.g42cloud.sdk.cdn.v1.model.ShowBlackWhiteListRequest;
import com.g42cloud.sdk.cdn.v1.model.ShowBlackWhiteListResponse;
import com.g42cloud.sdk.cdn.v1.model.ShowCacheRulesRequest;
import com.g42cloud.sdk.cdn.v1.model.ShowCacheRulesResponse;
import com.g42cloud.sdk.cdn.v1.model.ShowCertificatesHttpsInfoRequest;
import com.g42cloud.sdk.cdn.v1.model.ShowCertificatesHttpsInfoResponse;
import com.g42cloud.sdk.cdn.v1.model.ShowDomainDetailRequest;
import com.g42cloud.sdk.cdn.v1.model.ShowDomainDetailResponse;
import com.g42cloud.sdk.cdn.v1.model.ShowDomainFullConfigRequest;
import com.g42cloud.sdk.cdn.v1.model.ShowDomainFullConfigResponse;
import com.g42cloud.sdk.cdn.v1.model.ShowDomainItemDetailsRequest;
import com.g42cloud.sdk.cdn.v1.model.ShowDomainItemDetailsResponse;
import com.g42cloud.sdk.cdn.v1.model.ShowDomainItemLocationDetailsRequest;
import com.g42cloud.sdk.cdn.v1.model.ShowDomainItemLocationDetailsResponse;
import com.g42cloud.sdk.cdn.v1.model.ShowDomainLocationStatsRequest;
import com.g42cloud.sdk.cdn.v1.model.ShowDomainLocationStatsResponse;
import com.g42cloud.sdk.cdn.v1.model.ShowDomainStatsRequest;
import com.g42cloud.sdk.cdn.v1.model.ShowDomainStatsResponse;
import com.g42cloud.sdk.cdn.v1.model.ShowHistoryTaskDetailsRequest;
import com.g42cloud.sdk.cdn.v1.model.ShowHistoryTaskDetailsResponse;
import com.g42cloud.sdk.cdn.v1.model.ShowHistoryTasksRequest;
import com.g42cloud.sdk.cdn.v1.model.ShowHistoryTasksResponse;
import com.g42cloud.sdk.cdn.v1.model.ShowHttpInfoRequest;
import com.g42cloud.sdk.cdn.v1.model.ShowHttpInfoResponse;
import com.g42cloud.sdk.cdn.v1.model.ShowIpInfoRequest;
import com.g42cloud.sdk.cdn.v1.model.ShowIpInfoResponse;
import com.g42cloud.sdk.cdn.v1.model.ShowLogsRequest;
import com.g42cloud.sdk.cdn.v1.model.ShowLogsResponse;
import com.g42cloud.sdk.cdn.v1.model.ShowOriginHostRequest;
import com.g42cloud.sdk.cdn.v1.model.ShowOriginHostResponse;
import com.g42cloud.sdk.cdn.v1.model.ShowQuotaRequest;
import com.g42cloud.sdk.cdn.v1.model.ShowQuotaResponse;
import com.g42cloud.sdk.cdn.v1.model.ShowReferRequest;
import com.g42cloud.sdk.cdn.v1.model.ShowReferResponse;
import com.g42cloud.sdk.cdn.v1.model.ShowResponseHeaderRequest;
import com.g42cloud.sdk.cdn.v1.model.ShowResponseHeaderResponse;
import com.g42cloud.sdk.cdn.v1.model.ShowTopUrlRequest;
import com.g42cloud.sdk.cdn.v1.model.ShowTopUrlResponse;
import com.g42cloud.sdk.cdn.v1.model.UpdateBlackWhiteListRequest;
import com.g42cloud.sdk.cdn.v1.model.UpdateBlackWhiteListResponse;
import com.g42cloud.sdk.cdn.v1.model.UpdateCacheRulesRequest;
import com.g42cloud.sdk.cdn.v1.model.UpdateCacheRulesResponse;
import com.g42cloud.sdk.cdn.v1.model.UpdateDomainFullConfigRequest;
import com.g42cloud.sdk.cdn.v1.model.UpdateDomainFullConfigResponse;
import com.g42cloud.sdk.cdn.v1.model.UpdateDomainMultiCertificatesRequest;
import com.g42cloud.sdk.cdn.v1.model.UpdateDomainMultiCertificatesResponse;
import com.g42cloud.sdk.cdn.v1.model.UpdateDomainOriginRequest;
import com.g42cloud.sdk.cdn.v1.model.UpdateDomainOriginResponse;
import com.g42cloud.sdk.cdn.v1.model.UpdateFollow302SwitchRequest;
import com.g42cloud.sdk.cdn.v1.model.UpdateFollow302SwitchResponse;
import com.g42cloud.sdk.cdn.v1.model.UpdateHttpsInfoRequest;
import com.g42cloud.sdk.cdn.v1.model.UpdateHttpsInfoResponse;
import com.g42cloud.sdk.cdn.v1.model.UpdateOriginHostRequest;
import com.g42cloud.sdk.cdn.v1.model.UpdateOriginHostResponse;
import com.g42cloud.sdk.cdn.v1.model.UpdatePrivateBucketAccessRequest;
import com.g42cloud.sdk.cdn.v1.model.UpdatePrivateBucketAccessResponse;
import com.g42cloud.sdk.cdn.v1.model.UpdateRangeSwitchRequest;
import com.g42cloud.sdk.cdn.v1.model.UpdateRangeSwitchResponse;
import com.g42cloud.sdk.cdn.v1.model.UpdateReferRequest;
import com.g42cloud.sdk.cdn.v1.model.UpdateReferResponse;
import com.g42cloud.sdk.cdn.v1.model.UpdateResponseHeaderRequest;
import com.g42cloud.sdk.cdn.v1.model.UpdateResponseHeaderResponse;
import com.g42cloud.sdk.core.ClientBuilder;
import com.g42cloud.sdk.core.HcClient;
import com.g42cloud.sdk.core.invoker.SyncInvoker;

public class CdnClient {

    protected HcClient hcClient;

    public CdnClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CdnClient> newBuilder() {
        ClientBuilder<CdnClient> clientBuilder = new ClientBuilder<>(CdnClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    public CreateDomainResponse createDomain(CreateDomainRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.createDomain);
    }

    public SyncInvoker<CreateDomainRequest, CreateDomainResponse> createDomainInvoker(CreateDomainRequest request) {
        return new SyncInvoker<CreateDomainRequest, CreateDomainResponse>(request, CdnMeta.createDomain, hcClient);
    }

    public CreatePreheatingTasksResponse createPreheatingTasks(CreatePreheatingTasksRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.createPreheatingTasks);
    }

    public SyncInvoker<CreatePreheatingTasksRequest, CreatePreheatingTasksResponse> createPreheatingTasksInvoker(
        CreatePreheatingTasksRequest request) {
        return new SyncInvoker<CreatePreheatingTasksRequest, CreatePreheatingTasksResponse>(request,
            CdnMeta.createPreheatingTasks, hcClient);
    }

    public CreateRefreshTasksResponse createRefreshTasks(CreateRefreshTasksRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.createRefreshTasks);
    }

    public SyncInvoker<CreateRefreshTasksRequest, CreateRefreshTasksResponse> createRefreshTasksInvoker(
        CreateRefreshTasksRequest request) {
        return new SyncInvoker<CreateRefreshTasksRequest, CreateRefreshTasksResponse>(request,
            CdnMeta.createRefreshTasks, hcClient);
    }

    public DeleteDomainResponse deleteDomain(DeleteDomainRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.deleteDomain);
    }

    public SyncInvoker<DeleteDomainRequest, DeleteDomainResponse> deleteDomainInvoker(DeleteDomainRequest request) {
        return new SyncInvoker<DeleteDomainRequest, DeleteDomainResponse>(request, CdnMeta.deleteDomain, hcClient);
    }

    public DisableDomainResponse disableDomain(DisableDomainRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.disableDomain);
    }

    public SyncInvoker<DisableDomainRequest, DisableDomainResponse> disableDomainInvoker(DisableDomainRequest request) {
        return new SyncInvoker<DisableDomainRequest, DisableDomainResponse>(request, CdnMeta.disableDomain, hcClient);
    }

    public EnableDomainResponse enableDomain(EnableDomainRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.enableDomain);
    }

    public SyncInvoker<EnableDomainRequest, EnableDomainResponse> enableDomainInvoker(EnableDomainRequest request) {
        return new SyncInvoker<EnableDomainRequest, EnableDomainResponse>(request, CdnMeta.enableDomain, hcClient);
    }

    public ListDomainsResponse listDomains(ListDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.listDomains);
    }

    public SyncInvoker<ListDomainsRequest, ListDomainsResponse> listDomainsInvoker(ListDomainsRequest request) {
        return new SyncInvoker<ListDomainsRequest, ListDomainsResponse>(request, CdnMeta.listDomains, hcClient);
    }

    public ShowBlackWhiteListResponse showBlackWhiteList(ShowBlackWhiteListRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showBlackWhiteList);
    }

    public SyncInvoker<ShowBlackWhiteListRequest, ShowBlackWhiteListResponse> showBlackWhiteListInvoker(
        ShowBlackWhiteListRequest request) {
        return new SyncInvoker<ShowBlackWhiteListRequest, ShowBlackWhiteListResponse>(request,
            CdnMeta.showBlackWhiteList, hcClient);
    }

    public ShowCacheRulesResponse showCacheRules(ShowCacheRulesRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showCacheRules);
    }

    public SyncInvoker<ShowCacheRulesRequest, ShowCacheRulesResponse> showCacheRulesInvoker(
        ShowCacheRulesRequest request) {
        return new SyncInvoker<ShowCacheRulesRequest, ShowCacheRulesResponse>(request, CdnMeta.showCacheRules,
            hcClient);
    }

    public ShowCertificatesHttpsInfoResponse showCertificatesHttpsInfo(ShowCertificatesHttpsInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showCertificatesHttpsInfo);
    }

    public SyncInvoker<ShowCertificatesHttpsInfoRequest, ShowCertificatesHttpsInfoResponse> showCertificatesHttpsInfoInvoker(
        ShowCertificatesHttpsInfoRequest request) {
        return new SyncInvoker<ShowCertificatesHttpsInfoRequest, ShowCertificatesHttpsInfoResponse>(request,
            CdnMeta.showCertificatesHttpsInfo, hcClient);
    }

    public ShowDomainDetailResponse showDomainDetail(ShowDomainDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showDomainDetail);
    }

    public SyncInvoker<ShowDomainDetailRequest, ShowDomainDetailResponse> showDomainDetailInvoker(
        ShowDomainDetailRequest request) {
        return new SyncInvoker<ShowDomainDetailRequest, ShowDomainDetailResponse>(request, CdnMeta.showDomainDetail,
            hcClient);
    }

    public ShowDomainFullConfigResponse showDomainFullConfig(ShowDomainFullConfigRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showDomainFullConfig);
    }

    public SyncInvoker<ShowDomainFullConfigRequest, ShowDomainFullConfigResponse> showDomainFullConfigInvoker(
        ShowDomainFullConfigRequest request) {
        return new SyncInvoker<ShowDomainFullConfigRequest, ShowDomainFullConfigResponse>(request,
            CdnMeta.showDomainFullConfig, hcClient);
    }

    public ShowDomainItemDetailsResponse showDomainItemDetails(ShowDomainItemDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showDomainItemDetails);
    }

    public SyncInvoker<ShowDomainItemDetailsRequest, ShowDomainItemDetailsResponse> showDomainItemDetailsInvoker(
        ShowDomainItemDetailsRequest request) {
        return new SyncInvoker<ShowDomainItemDetailsRequest, ShowDomainItemDetailsResponse>(request,
            CdnMeta.showDomainItemDetails, hcClient);
    }

    public ShowDomainItemLocationDetailsResponse showDomainItemLocationDetails(
        ShowDomainItemLocationDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showDomainItemLocationDetails);
    }

    public SyncInvoker<ShowDomainItemLocationDetailsRequest, ShowDomainItemLocationDetailsResponse> showDomainItemLocationDetailsInvoker(
        ShowDomainItemLocationDetailsRequest request) {
        return new SyncInvoker<ShowDomainItemLocationDetailsRequest, ShowDomainItemLocationDetailsResponse>(request,
            CdnMeta.showDomainItemLocationDetails, hcClient);
    }

    public ShowDomainLocationStatsResponse showDomainLocationStats(ShowDomainLocationStatsRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showDomainLocationStats);
    }

    public SyncInvoker<ShowDomainLocationStatsRequest, ShowDomainLocationStatsResponse> showDomainLocationStatsInvoker(
        ShowDomainLocationStatsRequest request) {
        return new SyncInvoker<ShowDomainLocationStatsRequest, ShowDomainLocationStatsResponse>(request,
            CdnMeta.showDomainLocationStats, hcClient);
    }

    public ShowDomainStatsResponse showDomainStats(ShowDomainStatsRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showDomainStats);
    }

    public SyncInvoker<ShowDomainStatsRequest, ShowDomainStatsResponse> showDomainStatsInvoker(
        ShowDomainStatsRequest request) {
        return new SyncInvoker<ShowDomainStatsRequest, ShowDomainStatsResponse>(request, CdnMeta.showDomainStats,
            hcClient);
    }

    public ShowHistoryTaskDetailsResponse showHistoryTaskDetails(ShowHistoryTaskDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showHistoryTaskDetails);
    }

    public SyncInvoker<ShowHistoryTaskDetailsRequest, ShowHistoryTaskDetailsResponse> showHistoryTaskDetailsInvoker(
        ShowHistoryTaskDetailsRequest request) {
        return new SyncInvoker<ShowHistoryTaskDetailsRequest, ShowHistoryTaskDetailsResponse>(request,
            CdnMeta.showHistoryTaskDetails, hcClient);
    }

    public ShowHistoryTasksResponse showHistoryTasks(ShowHistoryTasksRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showHistoryTasks);
    }

    public SyncInvoker<ShowHistoryTasksRequest, ShowHistoryTasksResponse> showHistoryTasksInvoker(
        ShowHistoryTasksRequest request) {
        return new SyncInvoker<ShowHistoryTasksRequest, ShowHistoryTasksResponse>(request, CdnMeta.showHistoryTasks,
            hcClient);
    }

    public ShowHttpInfoResponse showHttpInfo(ShowHttpInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showHttpInfo);
    }

    public SyncInvoker<ShowHttpInfoRequest, ShowHttpInfoResponse> showHttpInfoInvoker(ShowHttpInfoRequest request) {
        return new SyncInvoker<ShowHttpInfoRequest, ShowHttpInfoResponse>(request, CdnMeta.showHttpInfo, hcClient);
    }

    public ShowIpInfoResponse showIpInfo(ShowIpInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showIpInfo);
    }

    public SyncInvoker<ShowIpInfoRequest, ShowIpInfoResponse> showIpInfoInvoker(ShowIpInfoRequest request) {
        return new SyncInvoker<ShowIpInfoRequest, ShowIpInfoResponse>(request, CdnMeta.showIpInfo, hcClient);
    }

    public ShowLogsResponse showLogs(ShowLogsRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showLogs);
    }

    public SyncInvoker<ShowLogsRequest, ShowLogsResponse> showLogsInvoker(ShowLogsRequest request) {
        return new SyncInvoker<ShowLogsRequest, ShowLogsResponse>(request, CdnMeta.showLogs, hcClient);
    }

    public ShowOriginHostResponse showOriginHost(ShowOriginHostRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showOriginHost);
    }

    public SyncInvoker<ShowOriginHostRequest, ShowOriginHostResponse> showOriginHostInvoker(
        ShowOriginHostRequest request) {
        return new SyncInvoker<ShowOriginHostRequest, ShowOriginHostResponse>(request, CdnMeta.showOriginHost,
            hcClient);
    }

    public ShowQuotaResponse showQuota(ShowQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showQuota);
    }

    public SyncInvoker<ShowQuotaRequest, ShowQuotaResponse> showQuotaInvoker(ShowQuotaRequest request) {
        return new SyncInvoker<ShowQuotaRequest, ShowQuotaResponse>(request, CdnMeta.showQuota, hcClient);
    }

    public ShowReferResponse showRefer(ShowReferRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showRefer);
    }

    public SyncInvoker<ShowReferRequest, ShowReferResponse> showReferInvoker(ShowReferRequest request) {
        return new SyncInvoker<ShowReferRequest, ShowReferResponse>(request, CdnMeta.showRefer, hcClient);
    }

    public ShowResponseHeaderResponse showResponseHeader(ShowResponseHeaderRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showResponseHeader);
    }

    public SyncInvoker<ShowResponseHeaderRequest, ShowResponseHeaderResponse> showResponseHeaderInvoker(
        ShowResponseHeaderRequest request) {
        return new SyncInvoker<ShowResponseHeaderRequest, ShowResponseHeaderResponse>(request,
            CdnMeta.showResponseHeader, hcClient);
    }

    public ShowTopUrlResponse showTopUrl(ShowTopUrlRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showTopUrl);
    }

    public SyncInvoker<ShowTopUrlRequest, ShowTopUrlResponse> showTopUrlInvoker(ShowTopUrlRequest request) {
        return new SyncInvoker<ShowTopUrlRequest, ShowTopUrlResponse>(request, CdnMeta.showTopUrl, hcClient);
    }

    public UpdateBlackWhiteListResponse updateBlackWhiteList(UpdateBlackWhiteListRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.updateBlackWhiteList);
    }

    public SyncInvoker<UpdateBlackWhiteListRequest, UpdateBlackWhiteListResponse> updateBlackWhiteListInvoker(
        UpdateBlackWhiteListRequest request) {
        return new SyncInvoker<UpdateBlackWhiteListRequest, UpdateBlackWhiteListResponse>(request,
            CdnMeta.updateBlackWhiteList, hcClient);
    }

    public UpdateCacheRulesResponse updateCacheRules(UpdateCacheRulesRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.updateCacheRules);
    }

    public SyncInvoker<UpdateCacheRulesRequest, UpdateCacheRulesResponse> updateCacheRulesInvoker(
        UpdateCacheRulesRequest request) {
        return new SyncInvoker<UpdateCacheRulesRequest, UpdateCacheRulesResponse>(request, CdnMeta.updateCacheRules,
            hcClient);
    }

    public UpdateDomainFullConfigResponse updateDomainFullConfig(UpdateDomainFullConfigRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.updateDomainFullConfig);
    }

    public SyncInvoker<UpdateDomainFullConfigRequest, UpdateDomainFullConfigResponse> updateDomainFullConfigInvoker(
        UpdateDomainFullConfigRequest request) {
        return new SyncInvoker<UpdateDomainFullConfigRequest, UpdateDomainFullConfigResponse>(request,
            CdnMeta.updateDomainFullConfig, hcClient);
    }

    public UpdateDomainMultiCertificatesResponse updateDomainMultiCertificates(
        UpdateDomainMultiCertificatesRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.updateDomainMultiCertificates);
    }

    public SyncInvoker<UpdateDomainMultiCertificatesRequest, UpdateDomainMultiCertificatesResponse> updateDomainMultiCertificatesInvoker(
        UpdateDomainMultiCertificatesRequest request) {
        return new SyncInvoker<UpdateDomainMultiCertificatesRequest, UpdateDomainMultiCertificatesResponse>(request,
            CdnMeta.updateDomainMultiCertificates, hcClient);
    }

    public UpdateDomainOriginResponse updateDomainOrigin(UpdateDomainOriginRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.updateDomainOrigin);
    }

    public SyncInvoker<UpdateDomainOriginRequest, UpdateDomainOriginResponse> updateDomainOriginInvoker(
        UpdateDomainOriginRequest request) {
        return new SyncInvoker<UpdateDomainOriginRequest, UpdateDomainOriginResponse>(request,
            CdnMeta.updateDomainOrigin, hcClient);
    }

    public UpdateFollow302SwitchResponse updateFollow302Switch(UpdateFollow302SwitchRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.updateFollow302Switch);
    }

    public SyncInvoker<UpdateFollow302SwitchRequest, UpdateFollow302SwitchResponse> updateFollow302SwitchInvoker(
        UpdateFollow302SwitchRequest request) {
        return new SyncInvoker<UpdateFollow302SwitchRequest, UpdateFollow302SwitchResponse>(request,
            CdnMeta.updateFollow302Switch, hcClient);
    }

    public UpdateHttpsInfoResponse updateHttpsInfo(UpdateHttpsInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.updateHttpsInfo);
    }

    public SyncInvoker<UpdateHttpsInfoRequest, UpdateHttpsInfoResponse> updateHttpsInfoInvoker(
        UpdateHttpsInfoRequest request) {
        return new SyncInvoker<UpdateHttpsInfoRequest, UpdateHttpsInfoResponse>(request, CdnMeta.updateHttpsInfo,
            hcClient);
    }

    public UpdateOriginHostResponse updateOriginHost(UpdateOriginHostRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.updateOriginHost);
    }

    public SyncInvoker<UpdateOriginHostRequest, UpdateOriginHostResponse> updateOriginHostInvoker(
        UpdateOriginHostRequest request) {
        return new SyncInvoker<UpdateOriginHostRequest, UpdateOriginHostResponse>(request, CdnMeta.updateOriginHost,
            hcClient);
    }

    public UpdatePrivateBucketAccessResponse updatePrivateBucketAccess(UpdatePrivateBucketAccessRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.updatePrivateBucketAccess);
    }

    public SyncInvoker<UpdatePrivateBucketAccessRequest, UpdatePrivateBucketAccessResponse> updatePrivateBucketAccessInvoker(
        UpdatePrivateBucketAccessRequest request) {
        return new SyncInvoker<UpdatePrivateBucketAccessRequest, UpdatePrivateBucketAccessResponse>(request,
            CdnMeta.updatePrivateBucketAccess, hcClient);
    }

    public UpdateRangeSwitchResponse updateRangeSwitch(UpdateRangeSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.updateRangeSwitch);
    }

    public SyncInvoker<UpdateRangeSwitchRequest, UpdateRangeSwitchResponse> updateRangeSwitchInvoker(
        UpdateRangeSwitchRequest request) {
        return new SyncInvoker<UpdateRangeSwitchRequest, UpdateRangeSwitchResponse>(request, CdnMeta.updateRangeSwitch,
            hcClient);
    }

    public UpdateReferResponse updateRefer(UpdateReferRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.updateRefer);
    }

    public SyncInvoker<UpdateReferRequest, UpdateReferResponse> updateReferInvoker(UpdateReferRequest request) {
        return new SyncInvoker<UpdateReferRequest, UpdateReferResponse>(request, CdnMeta.updateRefer, hcClient);
    }

    public UpdateResponseHeaderResponse updateResponseHeader(UpdateResponseHeaderRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.updateResponseHeader);
    }

    public SyncInvoker<UpdateResponseHeaderRequest, UpdateResponseHeaderResponse> updateResponseHeaderInvoker(
        UpdateResponseHeaderRequest request) {
        return new SyncInvoker<UpdateResponseHeaderRequest, UpdateResponseHeaderResponse>(request,
            CdnMeta.updateResponseHeader, hcClient);
    }

}
