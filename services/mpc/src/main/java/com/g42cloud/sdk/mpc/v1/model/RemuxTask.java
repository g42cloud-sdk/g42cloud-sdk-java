package com.g42cloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * RemuxTask
 */
public class RemuxTask {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_data")

    private String userData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private ObsObjInfo input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private ObsObjInfo output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_param")

    private RemuxOutputParam outputParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "complete_ratio")

    private Integer completeRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_metadata")

    private MetaData outputMetadata;

    public RemuxTask withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public RemuxTask withStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RemuxTask withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public RemuxTask withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public RemuxTask withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public RemuxTask withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public RemuxTask withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RemuxTask withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public RemuxTask withInput(ObsObjInfo input) {
        this.input = input;
        return this;
    }

    public RemuxTask withInput(Consumer<ObsObjInfo> inputSetter) {
        if (this.input == null) {
            this.input = new ObsObjInfo();
            inputSetter.accept(this.input);
        }

        return this;
    }

    public ObsObjInfo getInput() {
        return input;
    }

    public void setInput(ObsObjInfo input) {
        this.input = input;
    }

    public RemuxTask withOutput(ObsObjInfo output) {
        this.output = output;
        return this;
    }

    public RemuxTask withOutput(Consumer<ObsObjInfo> outputSetter) {
        if (this.output == null) {
            this.output = new ObsObjInfo();
            outputSetter.accept(this.output);
        }

        return this;
    }

    public ObsObjInfo getOutput() {
        return output;
    }

    public void setOutput(ObsObjInfo output) {
        this.output = output;
    }

    public RemuxTask withOutputParam(RemuxOutputParam outputParam) {
        this.outputParam = outputParam;
        return this;
    }

    public RemuxTask withOutputParam(Consumer<RemuxOutputParam> outputParamSetter) {
        if (this.outputParam == null) {
            this.outputParam = new RemuxOutputParam();
            outputParamSetter.accept(this.outputParam);
        }

        return this;
    }

    public RemuxOutputParam getOutputParam() {
        return outputParam;
    }

    public void setOutputParam(RemuxOutputParam outputParam) {
        this.outputParam = outputParam;
    }

    public RemuxTask withCompleteRatio(Integer completeRatio) {
        this.completeRatio = completeRatio;
        return this;
    }

    public Integer getCompleteRatio() {
        return completeRatio;
    }

    public void setCompleteRatio(Integer completeRatio) {
        this.completeRatio = completeRatio;
    }

    public RemuxTask withOutputMetadata(MetaData outputMetadata) {
        this.outputMetadata = outputMetadata;
        return this;
    }

    public RemuxTask withOutputMetadata(Consumer<MetaData> outputMetadataSetter) {
        if (this.outputMetadata == null) {
            this.outputMetadata = new MetaData();
            outputMetadataSetter.accept(this.outputMetadata);
        }

        return this;
    }

    public MetaData getOutputMetadata() {
        return outputMetadata;
    }

    public void setOutputMetadata(MetaData outputMetadata) {
        this.outputMetadata = outputMetadata;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RemuxTask remuxTask = (RemuxTask) o;
        return Objects.equals(this.taskId, remuxTask.taskId) && Objects.equals(this.status, remuxTask.status)
            && Objects.equals(this.createTime, remuxTask.createTime)
            && Objects.equals(this.startTime, remuxTask.startTime) && Objects.equals(this.endTime, remuxTask.endTime)
            && Objects.equals(this.errorCode, remuxTask.errorCode)
            && Objects.equals(this.description, remuxTask.description)
            && Objects.equals(this.userData, remuxTask.userData) && Objects.equals(this.input, remuxTask.input)
            && Objects.equals(this.output, remuxTask.output) && Objects.equals(this.outputParam, remuxTask.outputParam)
            && Objects.equals(this.completeRatio, remuxTask.completeRatio)
            && Objects.equals(this.outputMetadata, remuxTask.outputMetadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            status,
            createTime,
            startTime,
            endTime,
            errorCode,
            description,
            userData,
            input,
            output,
            outputParam,
            completeRatio,
            outputMetadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemuxTask {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    outputParam: ").append(toIndentedString(outputParam)).append("\n");
        sb.append("    completeRatio: ").append(toIndentedString(completeRatio)).append("\n");
        sb.append("    outputMetadata: ").append(toIndentedString(outputMetadata)).append("\n");
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
