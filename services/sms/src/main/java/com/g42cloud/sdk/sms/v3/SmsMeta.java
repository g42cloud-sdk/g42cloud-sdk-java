package com.g42cloud.sdk.sms.v3;

import com.g42cloud.sdk.core.TypeCasts;
import com.g42cloud.sdk.core.http.FieldExistence;
import com.g42cloud.sdk.core.http.HttpMethod;
import com.g42cloud.sdk.core.http.HttpRequestDef;
import com.g42cloud.sdk.core.http.LocationType;
import com.g42cloud.sdk.sms.v3.model.CheckNetAclRequest;
import com.g42cloud.sdk.sms.v3.model.CheckNetAclResponse;
import com.g42cloud.sdk.sms.v3.model.CollectLogRequest;
import com.g42cloud.sdk.sms.v3.model.CollectLogResponse;
import com.g42cloud.sdk.sms.v3.model.CommandBody;
import com.g42cloud.sdk.sms.v3.model.ConfigurationRequestBody;
import com.g42cloud.sdk.sms.v3.model.CreateMigprojectRequest;
import com.g42cloud.sdk.sms.v3.model.CreateMigprojectResponse;
import com.g42cloud.sdk.sms.v3.model.CreateTaskRequest;
import com.g42cloud.sdk.sms.v3.model.CreateTaskResponse;
import com.g42cloud.sdk.sms.v3.model.CreateTemplateReq;
import com.g42cloud.sdk.sms.v3.model.CreateTemplateRequest;
import com.g42cloud.sdk.sms.v3.model.CreateTemplateResponse;
import com.g42cloud.sdk.sms.v3.model.DeleteIds;
import com.g42cloud.sdk.sms.v3.model.DeleteMigprojectRequest;
import com.g42cloud.sdk.sms.v3.model.DeleteMigprojectResponse;
import com.g42cloud.sdk.sms.v3.model.DeleteServerRequest;
import com.g42cloud.sdk.sms.v3.model.DeleteServerResponse;
import com.g42cloud.sdk.sms.v3.model.DeleteServersRequest;
import com.g42cloud.sdk.sms.v3.model.DeleteServersResponse;
import com.g42cloud.sdk.sms.v3.model.DeleteTaskRequest;
import com.g42cloud.sdk.sms.v3.model.DeleteTaskResponse;
import com.g42cloud.sdk.sms.v3.model.DeleteTasksReq;
import com.g42cloud.sdk.sms.v3.model.DeleteTasksRequest;
import com.g42cloud.sdk.sms.v3.model.DeleteTasksResponse;
import com.g42cloud.sdk.sms.v3.model.DeleteTemplateRequest;
import com.g42cloud.sdk.sms.v3.model.DeleteTemplateResponse;
import com.g42cloud.sdk.sms.v3.model.DeleteTemplatesRequest;
import com.g42cloud.sdk.sms.v3.model.DeleteTemplatesResponse;
import com.g42cloud.sdk.sms.v3.model.DeletetemplatesReq;
import com.g42cloud.sdk.sms.v3.model.ListErrorServersRequest;
import com.g42cloud.sdk.sms.v3.model.ListErrorServersResponse;
import com.g42cloud.sdk.sms.v3.model.ListMigprojectsRequest;
import com.g42cloud.sdk.sms.v3.model.ListMigprojectsResponse;
import com.g42cloud.sdk.sms.v3.model.ListServersRequest;
import com.g42cloud.sdk.sms.v3.model.ListServersResponse;
import com.g42cloud.sdk.sms.v3.model.ListTasksRequest;
import com.g42cloud.sdk.sms.v3.model.ListTasksResponse;
import com.g42cloud.sdk.sms.v3.model.ListTemplatesRequest;
import com.g42cloud.sdk.sms.v3.model.ListTemplatesResponse;
import com.g42cloud.sdk.sms.v3.model.MigProject;
import com.g42cloud.sdk.sms.v3.model.NetworkCheckInfoRequestBody;
import com.g42cloud.sdk.sms.v3.model.PostMigProjectBody;
import com.g42cloud.sdk.sms.v3.model.PostSourceServerBody;
import com.g42cloud.sdk.sms.v3.model.PostTask;
import com.g42cloud.sdk.sms.v3.model.PutCopyStateReq;
import com.g42cloud.sdk.sms.v3.model.PutDiskInfoReq;
import com.g42cloud.sdk.sms.v3.model.PutSourceServerBody;
import com.g42cloud.sdk.sms.v3.model.PutTaskReq;
import com.g42cloud.sdk.sms.v3.model.RegisterServerRequest;
import com.g42cloud.sdk.sms.v3.model.RegisterServerResponse;
import com.g42cloud.sdk.sms.v3.model.ShowCertKeyRequest;
import com.g42cloud.sdk.sms.v3.model.ShowCertKeyResponse;
import com.g42cloud.sdk.sms.v3.model.ShowCommandRequest;
import com.g42cloud.sdk.sms.v3.model.ShowCommandResponse;
import com.g42cloud.sdk.sms.v3.model.ShowConfigRequest;
import com.g42cloud.sdk.sms.v3.model.ShowConfigResponse;
import com.g42cloud.sdk.sms.v3.model.ShowConfigSettingRequest;
import com.g42cloud.sdk.sms.v3.model.ShowConfigSettingResponse;
import com.g42cloud.sdk.sms.v3.model.ShowMigprojectRequest;
import com.g42cloud.sdk.sms.v3.model.ShowMigprojectResponse;
import com.g42cloud.sdk.sms.v3.model.ShowOverviewRequest;
import com.g42cloud.sdk.sms.v3.model.ShowOverviewResponse;
import com.g42cloud.sdk.sms.v3.model.ShowPassphraseRequest;
import com.g42cloud.sdk.sms.v3.model.ShowPassphraseResponse;
import com.g42cloud.sdk.sms.v3.model.ShowServerRequest;
import com.g42cloud.sdk.sms.v3.model.ShowServerResponse;
import com.g42cloud.sdk.sms.v3.model.ShowSha256Request;
import com.g42cloud.sdk.sms.v3.model.ShowSha256Response;
import com.g42cloud.sdk.sms.v3.model.ShowTargetPasswordRequest;
import com.g42cloud.sdk.sms.v3.model.ShowTargetPasswordResponse;
import com.g42cloud.sdk.sms.v3.model.ShowTaskRequest;
import com.g42cloud.sdk.sms.v3.model.ShowTaskResponse;
import com.g42cloud.sdk.sms.v3.model.ShowTemplateRequest;
import com.g42cloud.sdk.sms.v3.model.ShowTemplateResponse;
import com.g42cloud.sdk.sms.v3.model.ShowsSpeedLimitsRequest;
import com.g42cloud.sdk.sms.v3.model.ShowsSpeedLimitsResponse;
import com.g42cloud.sdk.sms.v3.model.SpeedLimit;
import com.g42cloud.sdk.sms.v3.model.UnlockTargetEcsRequest;
import com.g42cloud.sdk.sms.v3.model.UnlockTargetEcsResponse;
import com.g42cloud.sdk.sms.v3.model.UpdateCommandResultRequest;
import com.g42cloud.sdk.sms.v3.model.UpdateCommandResultResponse;
import com.g42cloud.sdk.sms.v3.model.UpdateCopyStateRequest;
import com.g42cloud.sdk.sms.v3.model.UpdateCopyStateResponse;
import com.g42cloud.sdk.sms.v3.model.UpdateDefaultMigprojectRequest;
import com.g42cloud.sdk.sms.v3.model.UpdateDefaultMigprojectResponse;
import com.g42cloud.sdk.sms.v3.model.UpdateDiskInfoRequest;
import com.g42cloud.sdk.sms.v3.model.UpdateDiskInfoResponse;
import com.g42cloud.sdk.sms.v3.model.UpdateMigprojectRequest;
import com.g42cloud.sdk.sms.v3.model.UpdateMigprojectResponse;
import com.g42cloud.sdk.sms.v3.model.UpdateNetworkCheckInfoRequest;
import com.g42cloud.sdk.sms.v3.model.UpdateNetworkCheckInfoResponse;
import com.g42cloud.sdk.sms.v3.model.UpdateServerNameRequest;
import com.g42cloud.sdk.sms.v3.model.UpdateServerNameResponse;
import com.g42cloud.sdk.sms.v3.model.UpdateSpeedRequest;
import com.g42cloud.sdk.sms.v3.model.UpdateSpeedResponse;
import com.g42cloud.sdk.sms.v3.model.UpdateTaskRequest;
import com.g42cloud.sdk.sms.v3.model.UpdateTaskResponse;
import com.g42cloud.sdk.sms.v3.model.UpdateTaskSpeedReq;
import com.g42cloud.sdk.sms.v3.model.UpdateTaskSpeedRequest;
import com.g42cloud.sdk.sms.v3.model.UpdateTaskSpeedResponse;
import com.g42cloud.sdk.sms.v3.model.UpdateTaskStatusReq;
import com.g42cloud.sdk.sms.v3.model.UpdateTaskStatusRequest;
import com.g42cloud.sdk.sms.v3.model.UpdateTaskStatusResponse;
import com.g42cloud.sdk.sms.v3.model.UpdateTemplateReq;
import com.g42cloud.sdk.sms.v3.model.UpdateTemplateRequest;
import com.g42cloud.sdk.sms.v3.model.UpdateTemplateResponse;
import com.g42cloud.sdk.sms.v3.model.UploadLogRequestBody;
import com.g42cloud.sdk.sms.v3.model.UploadSpecialConfigurationSettingRequest;
import com.g42cloud.sdk.sms.v3.model.UploadSpecialConfigurationSettingResponse;

@SuppressWarnings("unchecked")
public class SmsMeta {

    public static final HttpRequestDef<CheckNetAclRequest, CheckNetAclResponse> checkNetAcl = genForcheckNetAcl();

    private static HttpRequestDef<CheckNetAclRequest, CheckNetAclResponse> genForcheckNetAcl() {
        // basic
        HttpRequestDef.Builder<CheckNetAclRequest, CheckNetAclResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckNetAclRequest.class, CheckNetAclResponse.class)
                .withName("CheckNetAcl")
                .withUri("/v3/tasks/{t_project_id}/networkacl/{t_network_id}/check")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("t_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckNetAclRequest::getTProjectId, (req, v) -> {
                req.setTProjectId(v);
            }));
        builder.<String>withRequestField("t_network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckNetAclRequest::getTNetworkId, (req, v) -> {
                req.setTNetworkId(v);
            }));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckNetAclRequest::getRegionId, (req, v) -> {
                req.setRegionId(v);
            }));
        builder.<String>withRequestField("os_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckNetAclRequest::getOsType, (req, v) -> {
                req.setOsType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CollectLogRequest, CollectLogResponse> collectLog = genForcollectLog();

    private static HttpRequestDef<CollectLogRequest, CollectLogResponse> genForcollectLog() {
        // basic
        HttpRequestDef.Builder<CollectLogRequest, CollectLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CollectLogRequest.class, CollectLogResponse.class)
                .withName("CollectLog")
                .withUri("/v3/tasks/{task_id}/log")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectLogRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<UploadLogRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadLogRequestBody.class),
            f -> f.withMarshaller(CollectLogRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMigprojectRequest, CreateMigprojectResponse> createMigproject =
        genForcreateMigproject();

    private static HttpRequestDef<CreateMigprojectRequest, CreateMigprojectResponse> genForcreateMigproject() {
        // basic
        HttpRequestDef.Builder<CreateMigprojectRequest, CreateMigprojectResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMigprojectRequest.class, CreateMigprojectResponse.class)
                .withName("CreateMigproject")
                .withUri("/v3/migprojects")
                .withContentType("application/json");

        // requests
        builder.<PostMigProjectBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostMigProjectBody.class),
            f -> f.withMarshaller(CreateMigprojectRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTaskRequest, CreateTaskResponse> createTask = genForcreateTask();

    private static HttpRequestDef<CreateTaskRequest, CreateTaskResponse> genForcreateTask() {
        // basic
        HttpRequestDef.Builder<CreateTaskRequest, CreateTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTaskRequest.class, CreateTaskResponse.class)
                .withName("CreateTask")
                .withUri("/v3/tasks")
                .withContentType("application/json");

        // requests
        builder.<PostTask>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostTask.class),
            f -> f.withMarshaller(CreateTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTemplateRequest, CreateTemplateResponse> createTemplate =
        genForcreateTemplate();

    private static HttpRequestDef<CreateTemplateRequest, CreateTemplateResponse> genForcreateTemplate() {
        // basic
        HttpRequestDef.Builder<CreateTemplateRequest, CreateTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTemplateRequest.class, CreateTemplateResponse.class)
                .withName("CreateTemplate")
                .withUri("/v3/vm/templates")
                .withContentType("application/json");

        // requests
        builder.<CreateTemplateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTemplateReq.class),
            f -> f.withMarshaller(CreateTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMigprojectRequest, DeleteMigprojectResponse> deleteMigproject =
        genFordeleteMigproject();

    private static HttpRequestDef<DeleteMigprojectRequest, DeleteMigprojectResponse> genFordeleteMigproject() {
        // basic
        HttpRequestDef.Builder<DeleteMigprojectRequest, DeleteMigprojectResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteMigprojectRequest.class, DeleteMigprojectResponse.class)
                .withName("DeleteMigproject")
                .withUri("/v3/migprojects/{mig_project_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("mig_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMigprojectRequest::getMigProjectId, (req, v) -> {
                req.setMigProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServerRequest, DeleteServerResponse> deleteServer = genFordeleteServer();

    private static HttpRequestDef<DeleteServerRequest, DeleteServerResponse> genFordeleteServer() {
        // basic
        HttpRequestDef.Builder<DeleteServerRequest, DeleteServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteServerRequest.class, DeleteServerResponse.class)
                .withName("DeleteServer")
                .withUri("/v3/sources/{source_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("source_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteServerRequest::getSourceId, (req, v) -> {
                req.setSourceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServersRequest, DeleteServersResponse> deleteServers =
        genFordeleteServers();

    private static HttpRequestDef<DeleteServersRequest, DeleteServersResponse> genFordeleteServers() {
        // basic
        HttpRequestDef.Builder<DeleteServersRequest, DeleteServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteServersRequest.class, DeleteServersResponse.class)
                .withName("DeleteServers")
                .withUri("/v3/sources/delete")
                .withContentType("application/json");

        // requests
        builder.<DeleteIds>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteIds.class),
            f -> f.withMarshaller(DeleteServersRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTaskRequest, DeleteTaskResponse> deleteTask = genFordeleteTask();

    private static HttpRequestDef<DeleteTaskRequest, DeleteTaskResponse> genFordeleteTask() {
        // basic
        HttpRequestDef.Builder<DeleteTaskRequest, DeleteTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTaskRequest.class, DeleteTaskResponse.class)
                .withName("DeleteTask")
                .withUri("/v3/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTasksRequest, DeleteTasksResponse> deleteTasks = genFordeleteTasks();

    private static HttpRequestDef<DeleteTasksRequest, DeleteTasksResponse> genFordeleteTasks() {
        // basic
        HttpRequestDef.Builder<DeleteTasksRequest, DeleteTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteTasksRequest.class, DeleteTasksResponse.class)
                .withName("DeleteTasks")
                .withUri("/v3/tasks/delete")
                .withContentType("application/json");

        // requests
        builder.<DeleteTasksReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteTasksReq.class),
            f -> f.withMarshaller(DeleteTasksRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplate =
        genFordeleteTemplate();

    private static HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> genFordeleteTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteTemplateRequest, DeleteTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTemplateRequest.class, DeleteTemplateResponse.class)
                .withName("DeleteTemplate")
                .withUri("/v3/vm/templates/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplatesRequest, DeleteTemplatesResponse> deleteTemplates =
        genFordeleteTemplates();

    private static HttpRequestDef<DeleteTemplatesRequest, DeleteTemplatesResponse> genFordeleteTemplates() {
        // basic
        HttpRequestDef.Builder<DeleteTemplatesRequest, DeleteTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteTemplatesRequest.class, DeleteTemplatesResponse.class)
                .withName("DeleteTemplates")
                .withUri("/v3/vm/templates/delete")
                .withContentType("application/json");

        // requests
        builder.<DeletetemplatesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeletetemplatesReq.class),
            f -> f.withMarshaller(DeleteTemplatesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListErrorServersRequest, ListErrorServersResponse> listErrorServers =
        genForlistErrorServers();

    private static HttpRequestDef<ListErrorServersRequest, ListErrorServersResponse> genForlistErrorServers() {
        // basic
        HttpRequestDef.Builder<ListErrorServersRequest, ListErrorServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListErrorServersRequest.class, ListErrorServersResponse.class)
                .withName("ListErrorServers")
                .withUri("/v3/errors")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListErrorServersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListErrorServersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("migproject",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListErrorServersRequest::getMigproject, (req, v) -> {
                req.setMigproject(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListErrorServersRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMigprojectsRequest, ListMigprojectsResponse> listMigprojects =
        genForlistMigprojects();

    private static HttpRequestDef<ListMigprojectsRequest, ListMigprojectsResponse> genForlistMigprojects() {
        // basic
        HttpRequestDef.Builder<ListMigprojectsRequest, ListMigprojectsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMigprojectsRequest.class, ListMigprojectsResponse.class)
                .withName("ListMigprojects")
                .withUri("/v3/migprojects")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMigprojectsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMigprojectsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServersRequest, ListServersResponse> listServers = genForlistServers();

    private static HttpRequestDef<ListServersRequest, ListServersResponse> genForlistServers() {
        // basic
        HttpRequestDef.Builder<ListServersRequest, ListServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListServersRequest.class, ListServersResponse.class)
                .withName("ListServers")
                .withUri("/v3/sources")
                .withContentType("application/json");

        // requests
        builder.<ListServersRequest.StateEnum>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListServersRequest.StateEnum.class),
            f -> f.withMarshaller(ListServersRequest::getState, (req, v) -> {
                req.setState(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersRequest::getIp, (req, v) -> {
                req.setIp(v);
            }));
        builder.<String>withRequestField("migproject",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersRequest::getMigproject, (req, v) -> {
                req.setMigproject(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<ListServersRequest.MigrationCycleEnum>withRequestField("migration_cycle",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListServersRequest.MigrationCycleEnum.class),
            f -> f.withMarshaller(ListServersRequest::getMigrationCycle, (req, v) -> {
                req.setMigrationCycle(v);
            }));
        builder.<Boolean>withRequestField("connected",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListServersRequest::getConnected, (req, v) -> {
                req.setConnected(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTasksRequest, ListTasksResponse> listTasks = genForlistTasks();

    private static HttpRequestDef<ListTasksRequest, ListTasksResponse> genForlistTasks() {
        // basic
        HttpRequestDef.Builder<ListTasksRequest, ListTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTasksRequest.class, ListTasksResponse.class)
                .withName("ListTasks")
                .withUri("/v3/tasks")
                .withContentType("application/json");

        // requests
        builder.<ListTasksRequest.StateEnum>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTasksRequest.StateEnum.class),
            f -> f.withMarshaller(ListTasksRequest::getState, (req, v) -> {
                req.setState(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("source_server_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getSourceServerId, (req, v) -> {
                req.setSourceServerId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTasksRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTasksRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> listTemplates =
        genForlistTemplates();

    private static HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> genForlistTemplates() {
        // basic
        HttpRequestDef.Builder<ListTemplatesRequest, ListTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTemplatesRequest.class, ListTemplatesResponse.class)
                .withName("ListTemplates")
                .withUri("/v3/vm/templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplatesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplatesRequest::getAvailabilityZone, (req, v) -> {
                req.setAvailabilityZone(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplatesRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTemplatesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTemplatesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterServerRequest, RegisterServerResponse> registerServer =
        genForregisterServer();

    private static HttpRequestDef<RegisterServerRequest, RegisterServerResponse> genForregisterServer() {
        // basic
        HttpRequestDef.Builder<RegisterServerRequest, RegisterServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RegisterServerRequest.class, RegisterServerResponse.class)
                .withName("RegisterServer")
                .withUri("/v3/sources")
                .withContentType("application/json");

        // requests
        builder.<PostSourceServerBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostSourceServerBody.class),
            f -> f.withMarshaller(RegisterServerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCertKeyRequest, ShowCertKeyResponse> showCertKey = genForshowCertKey();

    private static HttpRequestDef<ShowCertKeyRequest, ShowCertKeyResponse> genForshowCertKey() {
        // basic
        HttpRequestDef.Builder<ShowCertKeyRequest, ShowCertKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCertKeyRequest.class, ShowCertKeyResponse.class)
                .withName("ShowCertKey")
                .withUri("/v3/tasks/{task_id}/certkey")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCertKeyRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCommandRequest, ShowCommandResponse> showCommand = genForshowCommand();

    private static HttpRequestDef<ShowCommandRequest, ShowCommandResponse> genForshowCommand() {
        // basic
        HttpRequestDef.Builder<ShowCommandRequest, ShowCommandResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCommandRequest.class, ShowCommandResponse.class)
                .withName("ShowCommand")
                .withUri("/v3/sources/{server_id}/command")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCommandRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConfigSettingRequest, ShowConfigSettingResponse> showConfigSetting =
        genForshowConfigSetting();

    private static HttpRequestDef<ShowConfigSettingRequest, ShowConfigSettingResponse> genForshowConfigSetting() {
        // basic
        HttpRequestDef.Builder<ShowConfigSettingRequest, ShowConfigSettingResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowConfigSettingRequest.class, ShowConfigSettingResponse.class)
                .withName("ShowConfigSetting")
                .withUri("/v3/tasks/{task_id}/configuration-setting")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConfigSettingRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<String>withRequestField("config_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConfigSettingRequest::getConfigKey, (req, v) -> {
                req.setConfigKey(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMigprojectRequest, ShowMigprojectResponse> showMigproject =
        genForshowMigproject();

    private static HttpRequestDef<ShowMigprojectRequest, ShowMigprojectResponse> genForshowMigproject() {
        // basic
        HttpRequestDef.Builder<ShowMigprojectRequest, ShowMigprojectResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMigprojectRequest.class, ShowMigprojectResponse.class)
                .withName("ShowMigproject")
                .withUri("/v3/migprojects/{mig_project_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("mig_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMigprojectRequest::getMigProjectId, (req, v) -> {
                req.setMigProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOverviewRequest, ShowOverviewResponse> showOverview = genForshowOverview();

    private static HttpRequestDef<ShowOverviewRequest, ShowOverviewResponse> genForshowOverview() {
        // basic
        HttpRequestDef.Builder<ShowOverviewRequest, ShowOverviewResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowOverviewRequest.class, ShowOverviewResponse.class)
                .withName("ShowOverview")
                .withUri("/v3/sources/overview")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPassphraseRequest, ShowPassphraseResponse> showPassphrase =
        genForshowPassphrase();

    private static HttpRequestDef<ShowPassphraseRequest, ShowPassphraseResponse> genForshowPassphrase() {
        // basic
        HttpRequestDef.Builder<ShowPassphraseRequest, ShowPassphraseResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPassphraseRequest.class, ShowPassphraseResponse.class)
                .withName("ShowPassphrase")
                .withUri("/v3/tasks/{task_id}/passphrase")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPassphraseRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowServerRequest, ShowServerResponse> showServer = genForshowServer();

    private static HttpRequestDef<ShowServerRequest, ShowServerResponse> genForshowServer() {
        // basic
        HttpRequestDef.Builder<ShowServerRequest, ShowServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowServerRequest.class, ShowServerResponse.class)
                .withName("ShowServer")
                .withUri("/v3/sources/{source_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("source_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowServerRequest::getSourceId, (req, v) -> {
                req.setSourceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSha256Request, ShowSha256Response> showSha256 = genForshowSha256();

    private static HttpRequestDef<ShowSha256Request, ShowSha256Response> genForshowSha256() {
        // basic
        HttpRequestDef.Builder<ShowSha256Request, ShowSha256Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSha256Request.class, ShowSha256Response.class)
                .withName("ShowSha256")
                .withUri("/v3/sha256/{key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSha256Request::getKey, (req, v) -> {
                req.setKey(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTargetPasswordRequest, ShowTargetPasswordResponse> showTargetPassword =
        genForshowTargetPassword();

    private static HttpRequestDef<ShowTargetPasswordRequest, ShowTargetPasswordResponse> genForshowTargetPassword() {
        // basic
        HttpRequestDef.Builder<ShowTargetPasswordRequest, ShowTargetPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTargetPasswordRequest.class, ShowTargetPasswordResponse.class)
                .withName("ShowTargetPassword")
                .withUri("/v3/vm/templates/{id}/target-password")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTargetPasswordRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskRequest, ShowTaskResponse> showTask = genForshowTask();

    private static HttpRequestDef<ShowTaskRequest, ShowTaskResponse> genForshowTask() {
        // basic
        HttpRequestDef.Builder<ShowTaskRequest, ShowTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskRequest.class, ShowTaskResponse.class)
                .withName("ShowTask")
                .withUri("/v3/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplateRequest, ShowTemplateResponse> showTemplate = genForshowTemplate();

    private static HttpRequestDef<ShowTemplateRequest, ShowTemplateResponse> genForshowTemplate() {
        // basic
        HttpRequestDef.Builder<ShowTemplateRequest, ShowTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTemplateRequest.class, ShowTemplateResponse.class)
                .withName("ShowTemplate")
                .withUri("/v3/vm/templates/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowsSpeedLimitsRequest, ShowsSpeedLimitsResponse> showsSpeedLimits =
        genForshowsSpeedLimits();

    private static HttpRequestDef<ShowsSpeedLimitsRequest, ShowsSpeedLimitsResponse> genForshowsSpeedLimits() {
        // basic
        HttpRequestDef.Builder<ShowsSpeedLimitsRequest, ShowsSpeedLimitsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowsSpeedLimitsRequest.class, ShowsSpeedLimitsResponse.class)
                .withName("ShowsSpeedLimits")
                .withUri("/v3/tasks/{task_id}/speed-limit")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowsSpeedLimitsRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnlockTargetEcsRequest, UnlockTargetEcsResponse> unlockTargetEcs =
        genForunlockTargetEcs();

    private static HttpRequestDef<UnlockTargetEcsRequest, UnlockTargetEcsResponse> genForunlockTargetEcs() {
        // basic
        HttpRequestDef.Builder<UnlockTargetEcsRequest, UnlockTargetEcsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UnlockTargetEcsRequest.class, UnlockTargetEcsResponse.class)
                .withName("UnlockTargetEcs")
                .withUri("/v3/tasks/{task_id}/unlock")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnlockTargetEcsRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCommandResultRequest, UpdateCommandResultResponse> updateCommandResult =
        genForupdateCommandResult();

    private static HttpRequestDef<UpdateCommandResultRequest, UpdateCommandResultResponse> genForupdateCommandResult() {
        // basic
        HttpRequestDef.Builder<UpdateCommandResultRequest, UpdateCommandResultResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateCommandResultRequest.class, UpdateCommandResultResponse.class)
                .withName("UpdateCommandResult")
                .withUri("/v3/sources/{server_id}/command_result")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCommandResultRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<CommandBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CommandBody.class),
            f -> f.withMarshaller(UpdateCommandResultRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCopyStateRequest, UpdateCopyStateResponse> updateCopyState =
        genForupdateCopyState();

    private static HttpRequestDef<UpdateCopyStateRequest, UpdateCopyStateResponse> genForupdateCopyState() {
        // basic
        HttpRequestDef.Builder<UpdateCopyStateRequest, UpdateCopyStateResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCopyStateRequest.class, UpdateCopyStateResponse.class)
                .withName("UpdateCopyState")
                .withUri("/v3/sources/{source_id}/changestate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("source_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCopyStateRequest::getSourceId, (req, v) -> {
                req.setSourceId(v);
            }));
        builder.<PutCopyStateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PutCopyStateReq.class),
            f -> f.withMarshaller(UpdateCopyStateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDefaultMigprojectRequest, UpdateDefaultMigprojectResponse> updateDefaultMigproject =
        genForupdateDefaultMigproject();

    private static HttpRequestDef<UpdateDefaultMigprojectRequest, UpdateDefaultMigprojectResponse> genForupdateDefaultMigproject() {
        // basic
        HttpRequestDef.Builder<UpdateDefaultMigprojectRequest, UpdateDefaultMigprojectResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateDefaultMigprojectRequest.class, UpdateDefaultMigprojectResponse.class)
            .withName("UpdateDefaultMigproject")
            .withUri("/v3/migprojects/{mig_project_id}/default")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("mig_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDefaultMigprojectRequest::getMigProjectId, (req, v) -> {
                req.setMigProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDiskInfoRequest, UpdateDiskInfoResponse> updateDiskInfo =
        genForupdateDiskInfo();

    private static HttpRequestDef<UpdateDiskInfoRequest, UpdateDiskInfoResponse> genForupdateDiskInfo() {
        // basic
        HttpRequestDef.Builder<UpdateDiskInfoRequest, UpdateDiskInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDiskInfoRequest.class, UpdateDiskInfoResponse.class)
                .withName("UpdateDiskInfo")
                .withUri("/v3/sources/{source_id}/diskinfo")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("source_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDiskInfoRequest::getSourceId, (req, v) -> {
                req.setSourceId(v);
            }));
        builder.<PutDiskInfoReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PutDiskInfoReq.class),
            f -> f.withMarshaller(UpdateDiskInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMigprojectRequest, UpdateMigprojectResponse> updateMigproject =
        genForupdateMigproject();

    private static HttpRequestDef<UpdateMigprojectRequest, UpdateMigprojectResponse> genForupdateMigproject() {
        // basic
        HttpRequestDef.Builder<UpdateMigprojectRequest, UpdateMigprojectResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateMigprojectRequest.class, UpdateMigprojectResponse.class)
                .withName("UpdateMigproject")
                .withUri("/v3/migprojects/{mig_project_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("mig_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMigprojectRequest::getMigProjectId, (req, v) -> {
                req.setMigProjectId(v);
            }));
        builder.<MigProject>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(MigProject.class),
            f -> f.withMarshaller(UpdateMigprojectRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateMigprojectResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNetworkCheckInfoRequest, UpdateNetworkCheckInfoResponse> updateNetworkCheckInfo =
        genForupdateNetworkCheckInfo();

    private static HttpRequestDef<UpdateNetworkCheckInfoRequest, UpdateNetworkCheckInfoResponse> genForupdateNetworkCheckInfo() {
        // basic
        HttpRequestDef.Builder<UpdateNetworkCheckInfoRequest, UpdateNetworkCheckInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateNetworkCheckInfoRequest.class, UpdateNetworkCheckInfoResponse.class)
            .withName("UpdateNetworkCheckInfo")
            .withUri("/v3/{task_id}/update-network-check-info")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNetworkCheckInfoRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<NetworkCheckInfoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NetworkCheckInfoRequestBody.class),
            f -> f.withMarshaller(UpdateNetworkCheckInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateNetworkCheckInfoResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateServerNameRequest, UpdateServerNameResponse> updateServerName =
        genForupdateServerName();

    private static HttpRequestDef<UpdateServerNameRequest, UpdateServerNameResponse> genForupdateServerName() {
        // basic
        HttpRequestDef.Builder<UpdateServerNameRequest, UpdateServerNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateServerNameRequest.class, UpdateServerNameResponse.class)
                .withName("UpdateServerName")
                .withUri("/v3/sources/{source_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("source_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateServerNameRequest::getSourceId, (req, v) -> {
                req.setSourceId(v);
            }));
        builder.<PutSourceServerBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PutSourceServerBody.class),
            f -> f.withMarshaller(UpdateServerNameRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSpeedRequest, UpdateSpeedResponse> updateSpeed = genForupdateSpeed();

    private static HttpRequestDef<UpdateSpeedRequest, UpdateSpeedResponse> genForupdateSpeed() {
        // basic
        HttpRequestDef.Builder<UpdateSpeedRequest, UpdateSpeedResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateSpeedRequest.class, UpdateSpeedResponse.class)
                .withName("UpdateSpeed")
                .withUri("/v3/tasks/{task_id}/speed-limit")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSpeedRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<SpeedLimit>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SpeedLimit.class),
            f -> f.withMarshaller(UpdateSpeedRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTaskRequest, UpdateTaskResponse> updateTask = genForupdateTask();

    private static HttpRequestDef<UpdateTaskRequest, UpdateTaskResponse> genForupdateTask() {
        // basic
        HttpRequestDef.Builder<UpdateTaskRequest, UpdateTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTaskRequest.class, UpdateTaskResponse.class)
                .withName("UpdateTask")
                .withUri("/v3/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<PutTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PutTaskReq.class),
            f -> f.withMarshaller(UpdateTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateTaskResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTaskSpeedRequest, UpdateTaskSpeedResponse> updateTaskSpeed =
        genForupdateTaskSpeed();

    private static HttpRequestDef<UpdateTaskSpeedRequest, UpdateTaskSpeedResponse> genForupdateTaskSpeed() {
        // basic
        HttpRequestDef.Builder<UpdateTaskSpeedRequest, UpdateTaskSpeedResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTaskSpeedRequest.class, UpdateTaskSpeedResponse.class)
                .withName("UpdateTaskSpeed")
                .withUri("/v3/tasks/{task_id}/progress")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTaskSpeedRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<UpdateTaskSpeedReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateTaskSpeedReq.class),
            f -> f.withMarshaller(UpdateTaskSpeedRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTaskStatusRequest, UpdateTaskStatusResponse> updateTaskStatus =
        genForupdateTaskStatus();

    private static HttpRequestDef<UpdateTaskStatusRequest, UpdateTaskStatusResponse> genForupdateTaskStatus() {
        // basic
        HttpRequestDef.Builder<UpdateTaskStatusRequest, UpdateTaskStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateTaskStatusRequest.class, UpdateTaskStatusResponse.class)
                .withName("UpdateTaskStatus")
                .withUri("/v3/tasks/{task_id}/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTaskStatusRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<UpdateTaskStatusReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTaskStatusReq.class),
            f -> f.withMarshaller(UpdateTaskStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTemplateRequest, UpdateTemplateResponse> updateTemplate =
        genForupdateTemplate();

    private static HttpRequestDef<UpdateTemplateRequest, UpdateTemplateResponse> genForupdateTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateTemplateRequest, UpdateTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTemplateRequest.class, UpdateTemplateResponse.class)
                .withName("UpdateTemplate")
                .withUri("/v3/vm/templates/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTemplateRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<UpdateTemplateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateTemplateReq.class),
            f -> f.withMarshaller(UpdateTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadSpecialConfigurationSettingRequest, UploadSpecialConfigurationSettingResponse> uploadSpecialConfigurationSetting =
        genForuploadSpecialConfigurationSetting();

    private static HttpRequestDef<UploadSpecialConfigurationSettingRequest, UploadSpecialConfigurationSettingResponse> genForuploadSpecialConfigurationSetting() {
        // basic
        HttpRequestDef.Builder<UploadSpecialConfigurationSettingRequest, UploadSpecialConfigurationSettingResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UploadSpecialConfigurationSettingRequest.class,
                    UploadSpecialConfigurationSettingResponse.class)
                .withName("UploadSpecialConfigurationSetting")
                .withUri("/v3/tasks/{task_id}/configuration-setting")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadSpecialConfigurationSettingRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<ConfigurationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConfigurationRequestBody.class),
            f -> f.withMarshaller(UploadSpecialConfigurationSettingRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConfigRequest, ShowConfigResponse> showConfig = genForshowConfig();

    private static HttpRequestDef<ShowConfigRequest, ShowConfigResponse> genForshowConfig() {
        // basic
        HttpRequestDef.Builder<ShowConfigRequest, ShowConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowConfigRequest.class, ShowConfigResponse.class)
                .withName("ShowConfig")
                .withUri("/v3/config")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

}
