package com.g42cloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * MbTasksReportReq
 */
public class MbTasksReportReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry")

    private Boolean retry;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameter")

    private MbTaskParameter parameter;

    public MbTasksReportReq withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public MbTasksReportReq withStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public MbTasksReportReq withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public MbTasksReportReq withRetry(Boolean retry) {
        this.retry = retry;
        return this;
    }

    public Boolean getRetry() {
        return retry;
    }

    public void setRetry(Boolean retry) {
        this.retry = retry;
    }

    public MbTasksReportReq withParameter(MbTaskParameter parameter) {
        this.parameter = parameter;
        return this;
    }

    public MbTasksReportReq withParameter(Consumer<MbTaskParameter> parameterSetter) {
        if (this.parameter == null) {
            this.parameter = new MbTaskParameter();
            parameterSetter.accept(this.parameter);
        }

        return this;
    }

    public MbTaskParameter getParameter() {
        return parameter;
    }

    public void setParameter(MbTaskParameter parameter) {
        this.parameter = parameter;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MbTasksReportReq that = (MbTasksReportReq) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.taskName, that.taskName) && Objects.equals(this.retry, that.retry)
            && Objects.equals(this.parameter, that.parameter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, status, taskName, retry, parameter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MbTasksReportReq {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    retry: ").append(toIndentedString(retry)).append("\n");
        sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
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
