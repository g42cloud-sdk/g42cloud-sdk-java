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
import com.g42cloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CdnAsyncClient {

    protected HcClient hcClient;

    public CdnAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CdnAsyncClient> newBuilder() {
        ClientBuilder<CdnAsyncClient> clientBuilder = new ClientBuilder<>(CdnAsyncClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    public CompletableFuture<CreateDomainResponse> createDomainAsync(CreateDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.createDomain);
    }

    public AsyncInvoker<CreateDomainRequest, CreateDomainResponse> createDomainAsyncInvoker(
        CreateDomainRequest request) {
        return new AsyncInvoker<CreateDomainRequest, CreateDomainResponse>(request, CdnMeta.createDomain, hcClient);
    }

    public CompletableFuture<CreatePreheatingTasksResponse> createPreheatingTasksAsync(
        CreatePreheatingTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.createPreheatingTasks);
    }

    public AsyncInvoker<CreatePreheatingTasksRequest, CreatePreheatingTasksResponse> createPreheatingTasksAsyncInvoker(
        CreatePreheatingTasksRequest request) {
        return new AsyncInvoker<CreatePreheatingTasksRequest, CreatePreheatingTasksResponse>(request,
            CdnMeta.createPreheatingTasks, hcClient);
    }

    public CompletableFuture<CreateRefreshTasksResponse> createRefreshTasksAsync(CreateRefreshTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.createRefreshTasks);
    }

    public AsyncInvoker<CreateRefreshTasksRequest, CreateRefreshTasksResponse> createRefreshTasksAsyncInvoker(
        CreateRefreshTasksRequest request) {
        return new AsyncInvoker<CreateRefreshTasksRequest, CreateRefreshTasksResponse>(request,
            CdnMeta.createRefreshTasks, hcClient);
    }

    public CompletableFuture<DeleteDomainResponse> deleteDomainAsync(DeleteDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.deleteDomain);
    }

    public AsyncInvoker<DeleteDomainRequest, DeleteDomainResponse> deleteDomainAsyncInvoker(
        DeleteDomainRequest request) {
        return new AsyncInvoker<DeleteDomainRequest, DeleteDomainResponse>(request, CdnMeta.deleteDomain, hcClient);
    }

    public CompletableFuture<DisableDomainResponse> disableDomainAsync(DisableDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.disableDomain);
    }

    public AsyncInvoker<DisableDomainRequest, DisableDomainResponse> disableDomainAsyncInvoker(
        DisableDomainRequest request) {
        return new AsyncInvoker<DisableDomainRequest, DisableDomainResponse>(request, CdnMeta.disableDomain, hcClient);
    }

    public CompletableFuture<EnableDomainResponse> enableDomainAsync(EnableDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.enableDomain);
    }

    public AsyncInvoker<EnableDomainRequest, EnableDomainResponse> enableDomainAsyncInvoker(
        EnableDomainRequest request) {
        return new AsyncInvoker<EnableDomainRequest, EnableDomainResponse>(request, CdnMeta.enableDomain, hcClient);
    }

    public CompletableFuture<ListDomainsResponse> listDomainsAsync(ListDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.listDomains);
    }

    public AsyncInvoker<ListDomainsRequest, ListDomainsResponse> listDomainsAsyncInvoker(ListDomainsRequest request) {
        return new AsyncInvoker<ListDomainsRequest, ListDomainsResponse>(request, CdnMeta.listDomains, hcClient);
    }

    public CompletableFuture<ShowBlackWhiteListResponse> showBlackWhiteListAsync(ShowBlackWhiteListRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showBlackWhiteList);
    }

    public AsyncInvoker<ShowBlackWhiteListRequest, ShowBlackWhiteListResponse> showBlackWhiteListAsyncInvoker(
        ShowBlackWhiteListRequest request) {
        return new AsyncInvoker<ShowBlackWhiteListRequest, ShowBlackWhiteListResponse>(request,
            CdnMeta.showBlackWhiteList, hcClient);
    }

    public CompletableFuture<ShowCacheRulesResponse> showCacheRulesAsync(ShowCacheRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showCacheRules);
    }

    public AsyncInvoker<ShowCacheRulesRequest, ShowCacheRulesResponse> showCacheRulesAsyncInvoker(
        ShowCacheRulesRequest request) {
        return new AsyncInvoker<ShowCacheRulesRequest, ShowCacheRulesResponse>(request, CdnMeta.showCacheRules,
            hcClient);
    }

    public CompletableFuture<ShowCertificatesHttpsInfoResponse> showCertificatesHttpsInfoAsync(
        ShowCertificatesHttpsInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showCertificatesHttpsInfo);
    }

    public AsyncInvoker<ShowCertificatesHttpsInfoRequest, ShowCertificatesHttpsInfoResponse> showCertificatesHttpsInfoAsyncInvoker(
        ShowCertificatesHttpsInfoRequest request) {
        return new AsyncInvoker<ShowCertificatesHttpsInfoRequest, ShowCertificatesHttpsInfoResponse>(request,
            CdnMeta.showCertificatesHttpsInfo, hcClient);
    }

    public CompletableFuture<ShowDomainDetailResponse> showDomainDetailAsync(ShowDomainDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showDomainDetail);
    }

    public AsyncInvoker<ShowDomainDetailRequest, ShowDomainDetailResponse> showDomainDetailAsyncInvoker(
        ShowDomainDetailRequest request) {
        return new AsyncInvoker<ShowDomainDetailRequest, ShowDomainDetailResponse>(request, CdnMeta.showDomainDetail,
            hcClient);
    }

    public CompletableFuture<ShowDomainFullConfigResponse> showDomainFullConfigAsync(
        ShowDomainFullConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showDomainFullConfig);
    }

    public AsyncInvoker<ShowDomainFullConfigRequest, ShowDomainFullConfigResponse> showDomainFullConfigAsyncInvoker(
        ShowDomainFullConfigRequest request) {
        return new AsyncInvoker<ShowDomainFullConfigRequest, ShowDomainFullConfigResponse>(request,
            CdnMeta.showDomainFullConfig, hcClient);
    }

    public CompletableFuture<ShowDomainItemDetailsResponse> showDomainItemDetailsAsync(
        ShowDomainItemDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showDomainItemDetails);
    }

    public AsyncInvoker<ShowDomainItemDetailsRequest, ShowDomainItemDetailsResponse> showDomainItemDetailsAsyncInvoker(
        ShowDomainItemDetailsRequest request) {
        return new AsyncInvoker<ShowDomainItemDetailsRequest, ShowDomainItemDetailsResponse>(request,
            CdnMeta.showDomainItemDetails, hcClient);
    }

    public CompletableFuture<ShowDomainItemLocationDetailsResponse> showDomainItemLocationDetailsAsync(
        ShowDomainItemLocationDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showDomainItemLocationDetails);
    }

    public AsyncInvoker<ShowDomainItemLocationDetailsRequest, ShowDomainItemLocationDetailsResponse> showDomainItemLocationDetailsAsyncInvoker(
        ShowDomainItemLocationDetailsRequest request) {
        return new AsyncInvoker<ShowDomainItemLocationDetailsRequest, ShowDomainItemLocationDetailsResponse>(request,
            CdnMeta.showDomainItemLocationDetails, hcClient);
    }

    public CompletableFuture<ShowDomainLocationStatsResponse> showDomainLocationStatsAsync(
        ShowDomainLocationStatsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showDomainLocationStats);
    }

    public AsyncInvoker<ShowDomainLocationStatsRequest, ShowDomainLocationStatsResponse> showDomainLocationStatsAsyncInvoker(
        ShowDomainLocationStatsRequest request) {
        return new AsyncInvoker<ShowDomainLocationStatsRequest, ShowDomainLocationStatsResponse>(request,
            CdnMeta.showDomainLocationStats, hcClient);
    }

    public CompletableFuture<ShowDomainStatsResponse> showDomainStatsAsync(ShowDomainStatsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showDomainStats);
    }

    public AsyncInvoker<ShowDomainStatsRequest, ShowDomainStatsResponse> showDomainStatsAsyncInvoker(
        ShowDomainStatsRequest request) {
        return new AsyncInvoker<ShowDomainStatsRequest, ShowDomainStatsResponse>(request, CdnMeta.showDomainStats,
            hcClient);
    }

    public CompletableFuture<ShowHistoryTaskDetailsResponse> showHistoryTaskDetailsAsync(
        ShowHistoryTaskDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showHistoryTaskDetails);
    }

    public AsyncInvoker<ShowHistoryTaskDetailsRequest, ShowHistoryTaskDetailsResponse> showHistoryTaskDetailsAsyncInvoker(
        ShowHistoryTaskDetailsRequest request) {
        return new AsyncInvoker<ShowHistoryTaskDetailsRequest, ShowHistoryTaskDetailsResponse>(request,
            CdnMeta.showHistoryTaskDetails, hcClient);
    }

    public CompletableFuture<ShowHistoryTasksResponse> showHistoryTasksAsync(ShowHistoryTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showHistoryTasks);
    }

    public AsyncInvoker<ShowHistoryTasksRequest, ShowHistoryTasksResponse> showHistoryTasksAsyncInvoker(
        ShowHistoryTasksRequest request) {
        return new AsyncInvoker<ShowHistoryTasksRequest, ShowHistoryTasksResponse>(request, CdnMeta.showHistoryTasks,
            hcClient);
    }

    public CompletableFuture<ShowHttpInfoResponse> showHttpInfoAsync(ShowHttpInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showHttpInfo);
    }

    public AsyncInvoker<ShowHttpInfoRequest, ShowHttpInfoResponse> showHttpInfoAsyncInvoker(
        ShowHttpInfoRequest request) {
        return new AsyncInvoker<ShowHttpInfoRequest, ShowHttpInfoResponse>(request, CdnMeta.showHttpInfo, hcClient);
    }

    public CompletableFuture<ShowIpInfoResponse> showIpInfoAsync(ShowIpInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showIpInfo);
    }

    public AsyncInvoker<ShowIpInfoRequest, ShowIpInfoResponse> showIpInfoAsyncInvoker(ShowIpInfoRequest request) {
        return new AsyncInvoker<ShowIpInfoRequest, ShowIpInfoResponse>(request, CdnMeta.showIpInfo, hcClient);
    }

    public CompletableFuture<ShowLogsResponse> showLogsAsync(ShowLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showLogs);
    }

    public AsyncInvoker<ShowLogsRequest, ShowLogsResponse> showLogsAsyncInvoker(ShowLogsRequest request) {
        return new AsyncInvoker<ShowLogsRequest, ShowLogsResponse>(request, CdnMeta.showLogs, hcClient);
    }

    public CompletableFuture<ShowOriginHostResponse> showOriginHostAsync(ShowOriginHostRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showOriginHost);
    }

    public AsyncInvoker<ShowOriginHostRequest, ShowOriginHostResponse> showOriginHostAsyncInvoker(
        ShowOriginHostRequest request) {
        return new AsyncInvoker<ShowOriginHostRequest, ShowOriginHostResponse>(request, CdnMeta.showOriginHost,
            hcClient);
    }

    public CompletableFuture<ShowQuotaResponse> showQuotaAsync(ShowQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showQuota);
    }

    public AsyncInvoker<ShowQuotaRequest, ShowQuotaResponse> showQuotaAsyncInvoker(ShowQuotaRequest request) {
        return new AsyncInvoker<ShowQuotaRequest, ShowQuotaResponse>(request, CdnMeta.showQuota, hcClient);
    }

    public CompletableFuture<ShowReferResponse> showReferAsync(ShowReferRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showRefer);
    }

    public AsyncInvoker<ShowReferRequest, ShowReferResponse> showReferAsyncInvoker(ShowReferRequest request) {
        return new AsyncInvoker<ShowReferRequest, ShowReferResponse>(request, CdnMeta.showRefer, hcClient);
    }

    public CompletableFuture<ShowResponseHeaderResponse> showResponseHeaderAsync(ShowResponseHeaderRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showResponseHeader);
    }

    public AsyncInvoker<ShowResponseHeaderRequest, ShowResponseHeaderResponse> showResponseHeaderAsyncInvoker(
        ShowResponseHeaderRequest request) {
        return new AsyncInvoker<ShowResponseHeaderRequest, ShowResponseHeaderResponse>(request,
            CdnMeta.showResponseHeader, hcClient);
    }

    public CompletableFuture<ShowTopUrlResponse> showTopUrlAsync(ShowTopUrlRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showTopUrl);
    }

    public AsyncInvoker<ShowTopUrlRequest, ShowTopUrlResponse> showTopUrlAsyncInvoker(ShowTopUrlRequest request) {
        return new AsyncInvoker<ShowTopUrlRequest, ShowTopUrlResponse>(request, CdnMeta.showTopUrl, hcClient);
    }

    public CompletableFuture<UpdateBlackWhiteListResponse> updateBlackWhiteListAsync(
        UpdateBlackWhiteListRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.updateBlackWhiteList);
    }

    public AsyncInvoker<UpdateBlackWhiteListRequest, UpdateBlackWhiteListResponse> updateBlackWhiteListAsyncInvoker(
        UpdateBlackWhiteListRequest request) {
        return new AsyncInvoker<UpdateBlackWhiteListRequest, UpdateBlackWhiteListResponse>(request,
            CdnMeta.updateBlackWhiteList, hcClient);
    }

    public CompletableFuture<UpdateCacheRulesResponse> updateCacheRulesAsync(UpdateCacheRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.updateCacheRules);
    }

    public AsyncInvoker<UpdateCacheRulesRequest, UpdateCacheRulesResponse> updateCacheRulesAsyncInvoker(
        UpdateCacheRulesRequest request) {
        return new AsyncInvoker<UpdateCacheRulesRequest, UpdateCacheRulesResponse>(request, CdnMeta.updateCacheRules,
            hcClient);
    }

    public CompletableFuture<UpdateDomainFullConfigResponse> updateDomainFullConfigAsync(
        UpdateDomainFullConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.updateDomainFullConfig);
    }

    public AsyncInvoker<UpdateDomainFullConfigRequest, UpdateDomainFullConfigResponse> updateDomainFullConfigAsyncInvoker(
        UpdateDomainFullConfigRequest request) {
        return new AsyncInvoker<UpdateDomainFullConfigRequest, UpdateDomainFullConfigResponse>(request,
            CdnMeta.updateDomainFullConfig, hcClient);
    }

    public CompletableFuture<UpdateDomainMultiCertificatesResponse> updateDomainMultiCertificatesAsync(
        UpdateDomainMultiCertificatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.updateDomainMultiCertificates);
    }

    public AsyncInvoker<UpdateDomainMultiCertificatesRequest, UpdateDomainMultiCertificatesResponse> updateDomainMultiCertificatesAsyncInvoker(
        UpdateDomainMultiCertificatesRequest request) {
        return new AsyncInvoker<UpdateDomainMultiCertificatesRequest, UpdateDomainMultiCertificatesResponse>(request,
            CdnMeta.updateDomainMultiCertificates, hcClient);
    }

    public CompletableFuture<UpdateDomainOriginResponse> updateDomainOriginAsync(UpdateDomainOriginRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.updateDomainOrigin);
    }

    public AsyncInvoker<UpdateDomainOriginRequest, UpdateDomainOriginResponse> updateDomainOriginAsyncInvoker(
        UpdateDomainOriginRequest request) {
        return new AsyncInvoker<UpdateDomainOriginRequest, UpdateDomainOriginResponse>(request,
            CdnMeta.updateDomainOrigin, hcClient);
    }

    public CompletableFuture<UpdateFollow302SwitchResponse> updateFollow302SwitchAsync(
        UpdateFollow302SwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.updateFollow302Switch);
    }

    public AsyncInvoker<UpdateFollow302SwitchRequest, UpdateFollow302SwitchResponse> updateFollow302SwitchAsyncInvoker(
        UpdateFollow302SwitchRequest request) {
        return new AsyncInvoker<UpdateFollow302SwitchRequest, UpdateFollow302SwitchResponse>(request,
            CdnMeta.updateFollow302Switch, hcClient);
    }

    public CompletableFuture<UpdateHttpsInfoResponse> updateHttpsInfoAsync(UpdateHttpsInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.updateHttpsInfo);
    }

    public AsyncInvoker<UpdateHttpsInfoRequest, UpdateHttpsInfoResponse> updateHttpsInfoAsyncInvoker(
        UpdateHttpsInfoRequest request) {
        return new AsyncInvoker<UpdateHttpsInfoRequest, UpdateHttpsInfoResponse>(request, CdnMeta.updateHttpsInfo,
            hcClient);
    }

    public CompletableFuture<UpdateOriginHostResponse> updateOriginHostAsync(UpdateOriginHostRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.updateOriginHost);
    }

    public AsyncInvoker<UpdateOriginHostRequest, UpdateOriginHostResponse> updateOriginHostAsyncInvoker(
        UpdateOriginHostRequest request) {
        return new AsyncInvoker<UpdateOriginHostRequest, UpdateOriginHostResponse>(request, CdnMeta.updateOriginHost,
            hcClient);
    }

    public CompletableFuture<UpdatePrivateBucketAccessResponse> updatePrivateBucketAccessAsync(
        UpdatePrivateBucketAccessRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.updatePrivateBucketAccess);
    }

    public AsyncInvoker<UpdatePrivateBucketAccessRequest, UpdatePrivateBucketAccessResponse> updatePrivateBucketAccessAsyncInvoker(
        UpdatePrivateBucketAccessRequest request) {
        return new AsyncInvoker<UpdatePrivateBucketAccessRequest, UpdatePrivateBucketAccessResponse>(request,
            CdnMeta.updatePrivateBucketAccess, hcClient);
    }

    public CompletableFuture<UpdateRangeSwitchResponse> updateRangeSwitchAsync(UpdateRangeSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.updateRangeSwitch);
    }

    public AsyncInvoker<UpdateRangeSwitchRequest, UpdateRangeSwitchResponse> updateRangeSwitchAsyncInvoker(
        UpdateRangeSwitchRequest request) {
        return new AsyncInvoker<UpdateRangeSwitchRequest, UpdateRangeSwitchResponse>(request, CdnMeta.updateRangeSwitch,
            hcClient);
    }

    public CompletableFuture<UpdateReferResponse> updateReferAsync(UpdateReferRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.updateRefer);
    }

    public AsyncInvoker<UpdateReferRequest, UpdateReferResponse> updateReferAsyncInvoker(UpdateReferRequest request) {
        return new AsyncInvoker<UpdateReferRequest, UpdateReferResponse>(request, CdnMeta.updateRefer, hcClient);
    }

    public CompletableFuture<UpdateResponseHeaderResponse> updateResponseHeaderAsync(
        UpdateResponseHeaderRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.updateResponseHeader);
    }

    public AsyncInvoker<UpdateResponseHeaderRequest, UpdateResponseHeaderResponse> updateResponseHeaderAsyncInvoker(
        UpdateResponseHeaderRequest request) {
        return new AsyncInvoker<UpdateResponseHeaderRequest, UpdateResponseHeaderResponse>(request,
            CdnMeta.updateResponseHeader, hcClient);
    }

}
