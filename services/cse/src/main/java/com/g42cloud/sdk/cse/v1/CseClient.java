package com.g42cloud.sdk.cse.v1;

import com.g42cloud.sdk.core.ClientBuilder;
import com.g42cloud.sdk.core.HcClient;
import com.g42cloud.sdk.core.invoker.SyncInvoker;
import com.g42cloud.sdk.cse.v1.model.CreateEngineRequest;
import com.g42cloud.sdk.cse.v1.model.CreateEngineResponse;
import com.g42cloud.sdk.cse.v1.model.DeleteEngineRequest;
import com.g42cloud.sdk.cse.v1.model.DeleteEngineResponse;
import com.g42cloud.sdk.cse.v1.model.DownloadKieRequest;
import com.g42cloud.sdk.cse.v1.model.DownloadKieResponse;
import com.g42cloud.sdk.cse.v1.model.ListEnginesRequest;
import com.g42cloud.sdk.cse.v1.model.ListEnginesResponse;
import com.g42cloud.sdk.cse.v1.model.ListFlavorsRequest;
import com.g42cloud.sdk.cse.v1.model.ListFlavorsResponse;
import com.g42cloud.sdk.cse.v1.model.ShowEngineJobRequest;
import com.g42cloud.sdk.cse.v1.model.ShowEngineJobResponse;
import com.g42cloud.sdk.cse.v1.model.ShowEngineRequest;
import com.g42cloud.sdk.cse.v1.model.ShowEngineResponse;
import com.g42cloud.sdk.cse.v1.model.UploadKieRequest;
import com.g42cloud.sdk.cse.v1.model.UploadKieResponse;

public class CseClient {

    protected HcClient hcClient;

    public CseClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CseClient> newBuilder() {
        ClientBuilder<CseClient> clientBuilder = new ClientBuilder<>(CseClient::new);
        return clientBuilder;
    }

    public CreateEngineResponse createEngine(CreateEngineRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.createEngine);
    }

    public SyncInvoker<CreateEngineRequest, CreateEngineResponse> createEngineInvoker(CreateEngineRequest request) {
        return new SyncInvoker<CreateEngineRequest, CreateEngineResponse>(request, CseMeta.createEngine, hcClient);
    }

    public DeleteEngineResponse deleteEngine(DeleteEngineRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.deleteEngine);
    }

    public SyncInvoker<DeleteEngineRequest, DeleteEngineResponse> deleteEngineInvoker(DeleteEngineRequest request) {
        return new SyncInvoker<DeleteEngineRequest, DeleteEngineResponse>(request, CseMeta.deleteEngine, hcClient);
    }

    public DownloadKieResponse downloadKie(DownloadKieRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.downloadKie);
    }

    public SyncInvoker<DownloadKieRequest, DownloadKieResponse> downloadKieInvoker(DownloadKieRequest request) {
        return new SyncInvoker<DownloadKieRequest, DownloadKieResponse>(request, CseMeta.downloadKie, hcClient);
    }

    public ListEnginesResponse listEngines(ListEnginesRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.listEngines);
    }

    public SyncInvoker<ListEnginesRequest, ListEnginesResponse> listEnginesInvoker(ListEnginesRequest request) {
        return new SyncInvoker<ListEnginesRequest, ListEnginesResponse>(request, CseMeta.listEngines, hcClient);
    }

    public ListFlavorsResponse listFlavors(ListFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.listFlavors);
    }

    public SyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsInvoker(ListFlavorsRequest request) {
        return new SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, CseMeta.listFlavors, hcClient);
    }

    public ShowEngineResponse showEngine(ShowEngineRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.showEngine);
    }

    public SyncInvoker<ShowEngineRequest, ShowEngineResponse> showEngineInvoker(ShowEngineRequest request) {
        return new SyncInvoker<ShowEngineRequest, ShowEngineResponse>(request, CseMeta.showEngine, hcClient);
    }

    public ShowEngineJobResponse showEngineJob(ShowEngineJobRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.showEngineJob);
    }

    public SyncInvoker<ShowEngineJobRequest, ShowEngineJobResponse> showEngineJobInvoker(ShowEngineJobRequest request) {
        return new SyncInvoker<ShowEngineJobRequest, ShowEngineJobResponse>(request, CseMeta.showEngineJob, hcClient);
    }

    public UploadKieResponse uploadKie(UploadKieRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.uploadKie);
    }

    public SyncInvoker<UploadKieRequest, UploadKieResponse> uploadKieInvoker(UploadKieRequest request) {
        return new SyncInvoker<UploadKieRequest, UploadKieResponse>(request, CseMeta.uploadKie, hcClient);
    }

}
