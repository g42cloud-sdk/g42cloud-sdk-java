package com.g42cloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 任务信息。
 */
public class GetTaskDetailListRspJobs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public static final class StatusEnum {

        /**
         * Enum RUNNING for value: "Running"
         */
        public static final StatusEnum RUNNING = new StatusEnum("Running");

        /**
         * Enum COMPLETED for value: "Completed"
         */
        public static final StatusEnum COMPLETED = new StatusEnum("Completed");

        /**
         * Enum FAILED for value: "Failed"
         */
        public static final StatusEnum FAILED = new StatusEnum("Failed");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("Running", RUNNING);
            map.put("Completed", COMPLETED);
            map.put("Failed", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ended")

    private String ended;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process")

    private String process;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_detail")

    private String taskDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance")

    private GetTaskDetailListRspJobsInstance instance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entities")

    private Object entities;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_reason")

    private String failReason;

    public GetTaskDetailListRspJobs withId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GetTaskDetailListRspJobs withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GetTaskDetailListRspJobs withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public GetTaskDetailListRspJobs withCreated(String created) {
        this.created = created;
        return this;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public GetTaskDetailListRspJobs withEnded(String ended) {
        this.ended = ended;
        return this;
    }

    public String getEnded() {
        return ended;
    }

    public void setEnded(String ended) {
        this.ended = ended;
    }

    public GetTaskDetailListRspJobs withProcess(String process) {
        this.process = process;
        return this;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public GetTaskDetailListRspJobs withTaskDetail(String taskDetail) {
        this.taskDetail = taskDetail;
        return this;
    }

    public String getTaskDetail() {
        return taskDetail;
    }

    public void setTaskDetail(String taskDetail) {
        this.taskDetail = taskDetail;
    }

    public GetTaskDetailListRspJobs withInstance(GetTaskDetailListRspJobsInstance instance) {
        this.instance = instance;
        return this;
    }

    public GetTaskDetailListRspJobs withInstance(Consumer<GetTaskDetailListRspJobsInstance> instanceSetter) {
        if (this.instance == null) {
            this.instance = new GetTaskDetailListRspJobsInstance();
            instanceSetter.accept(this.instance);
        }

        return this;
    }

    public GetTaskDetailListRspJobsInstance getInstance() {
        return instance;
    }

    public void setInstance(GetTaskDetailListRspJobsInstance instance) {
        this.instance = instance;
    }

    public GetTaskDetailListRspJobs withEntities(Object entities) {
        this.entities = entities;
        return this;
    }

    public Object getEntities() {
        return entities;
    }

    public void setEntities(Object entities) {
        this.entities = entities;
    }

    public GetTaskDetailListRspJobs withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetTaskDetailListRspJobs getTaskDetailListRspJobs = (GetTaskDetailListRspJobs) o;
        return Objects.equals(this.id, getTaskDetailListRspJobs.id)
            && Objects.equals(this.name, getTaskDetailListRspJobs.name)
            && Objects.equals(this.status, getTaskDetailListRspJobs.status)
            && Objects.equals(this.created, getTaskDetailListRspJobs.created)
            && Objects.equals(this.ended, getTaskDetailListRspJobs.ended)
            && Objects.equals(this.process, getTaskDetailListRspJobs.process)
            && Objects.equals(this.taskDetail, getTaskDetailListRspJobs.taskDetail)
            && Objects.equals(this.instance, getTaskDetailListRspJobs.instance)
            && Objects.equals(this.entities, getTaskDetailListRspJobs.entities)
            && Objects.equals(this.failReason, getTaskDetailListRspJobs.failReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, status, created, ended, process, taskDetail, instance, entities, failReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetTaskDetailListRspJobs {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    ended: ").append(toIndentedString(ended)).append("\n");
        sb.append("    process: ").append(toIndentedString(process)).append("\n");
        sb.append("    taskDetail: ").append(toIndentedString(taskDetail)).append("\n");
        sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
        sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
