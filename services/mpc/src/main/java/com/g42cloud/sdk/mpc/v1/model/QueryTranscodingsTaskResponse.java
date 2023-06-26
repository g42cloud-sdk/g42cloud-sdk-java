package com.g42cloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * QueryTranscodingsTaskResponse
 */
public class QueryTranscodingsTaskResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    public static final class StatusEnum {

        /**
         * Enum NO_TASK for value: "NO_TASK"
         */
        public static final StatusEnum NO_TASK = new StatusEnum("NO_TASK");

        /**
         * Enum WAITING for value: "WAITING"
         */
        public static final StatusEnum WAITING = new StatusEnum("WAITING");

        /**
         * Enum TRANSCODING for value: "TRANSCODING"
         */
        public static final StatusEnum TRANSCODING = new StatusEnum("TRANSCODING");

        /**
         * Enum SUCCEEDED for value: "SUCCEEDED"
         */
        public static final StatusEnum SUCCEEDED = new StatusEnum("SUCCEEDED");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StatusEnum FAILED = new StatusEnum("FAILED");

        /**
         * Enum CANCELED for value: "CANCELED"
         */
        public static final StatusEnum CANCELED = new StatusEnum("CANCELED");

        /**
         * Enum NEED_TO_BE_AUDIT for value: "NEED_TO_BE_AUDIT"
         */
        public static final StatusEnum NEED_TO_BE_AUDIT = new StatusEnum("NEED_TO_BE_AUDIT");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("NO_TASK", NO_TASK);
            map.put("WAITING", WAITING);
            map.put("TRANSCODING", TRANSCODING);
            map.put("SUCCEEDED", SUCCEEDED);
            map.put("FAILED", FAILED);
            map.put("CANCELED", CANCELED);
            map.put("NEED_TO_BE_AUDIT", NEED_TO_BE_AUDIT);
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
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trans_template_id")

    private List<Integer> transTemplateId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private ObsObjInfo input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private ObsObjInfo output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_file_name")

    private List<String> outputFileName = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_data")

    private String userData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tips")

    private String tips;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transcode_detail")

    private TranscodeDetail transcodeDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thumbnail_output")

    private ObsObjInfo thumbnailOutput;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thumbnail_outputname")

    private String thumbnailOutputname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pic_info")

    private List<PicInfo> picInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "av_parameters")

    private List<AvParameters> avParameters = null;

    public QueryTranscodingsTaskResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public QueryTranscodingsTaskResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public QueryTranscodingsTaskResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public QueryTranscodingsTaskResponse withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public QueryTranscodingsTaskResponse withTransTemplateId(List<Integer> transTemplateId) {
        this.transTemplateId = transTemplateId;
        return this;
    }

    public QueryTranscodingsTaskResponse addTransTemplateIdItem(Integer transTemplateIdItem) {
        if (this.transTemplateId == null) {
            this.transTemplateId = new ArrayList<>();
        }
        this.transTemplateId.add(transTemplateIdItem);
        return this;
    }

    public QueryTranscodingsTaskResponse withTransTemplateId(Consumer<List<Integer>> transTemplateIdSetter) {
        if (this.transTemplateId == null) {
            this.transTemplateId = new ArrayList<>();
        }
        transTemplateIdSetter.accept(this.transTemplateId);
        return this;
    }

    public List<Integer> getTransTemplateId() {
        return transTemplateId;
    }

    public void setTransTemplateId(List<Integer> transTemplateId) {
        this.transTemplateId = transTemplateId;
    }

    public QueryTranscodingsTaskResponse withInput(ObsObjInfo input) {
        this.input = input;
        return this;
    }

    public QueryTranscodingsTaskResponse withInput(Consumer<ObsObjInfo> inputSetter) {
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

    public QueryTranscodingsTaskResponse withOutput(ObsObjInfo output) {
        this.output = output;
        return this;
    }

    public QueryTranscodingsTaskResponse withOutput(Consumer<ObsObjInfo> outputSetter) {
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

    public QueryTranscodingsTaskResponse withOutputFileName(List<String> outputFileName) {
        this.outputFileName = outputFileName;
        return this;
    }

    public QueryTranscodingsTaskResponse addOutputFileNameItem(String outputFileNameItem) {
        if (this.outputFileName == null) {
            this.outputFileName = new ArrayList<>();
        }
        this.outputFileName.add(outputFileNameItem);
        return this;
    }

    public QueryTranscodingsTaskResponse withOutputFileName(Consumer<List<String>> outputFileNameSetter) {
        if (this.outputFileName == null) {
            this.outputFileName = new ArrayList<>();
        }
        outputFileNameSetter.accept(this.outputFileName);
        return this;
    }

    public List<String> getOutputFileName() {
        return outputFileName;
    }

    public void setOutputFileName(List<String> outputFileName) {
        this.outputFileName = outputFileName;
    }

    public QueryTranscodingsTaskResponse withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public QueryTranscodingsTaskResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public QueryTranscodingsTaskResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public QueryTranscodingsTaskResponse withTips(String tips) {
        this.tips = tips;
        return this;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    public QueryTranscodingsTaskResponse withTranscodeDetail(TranscodeDetail transcodeDetail) {
        this.transcodeDetail = transcodeDetail;
        return this;
    }

    public QueryTranscodingsTaskResponse withTranscodeDetail(Consumer<TranscodeDetail> transcodeDetailSetter) {
        if (this.transcodeDetail == null) {
            this.transcodeDetail = new TranscodeDetail();
            transcodeDetailSetter.accept(this.transcodeDetail);
        }

        return this;
    }

    public TranscodeDetail getTranscodeDetail() {
        return transcodeDetail;
    }

    public void setTranscodeDetail(TranscodeDetail transcodeDetail) {
        this.transcodeDetail = transcodeDetail;
    }

    public QueryTranscodingsTaskResponse withThumbnailOutput(ObsObjInfo thumbnailOutput) {
        this.thumbnailOutput = thumbnailOutput;
        return this;
    }

    public QueryTranscodingsTaskResponse withThumbnailOutput(Consumer<ObsObjInfo> thumbnailOutputSetter) {
        if (this.thumbnailOutput == null) {
            this.thumbnailOutput = new ObsObjInfo();
            thumbnailOutputSetter.accept(this.thumbnailOutput);
        }

        return this;
    }

    public ObsObjInfo getThumbnailOutput() {
        return thumbnailOutput;
    }

    public void setThumbnailOutput(ObsObjInfo thumbnailOutput) {
        this.thumbnailOutput = thumbnailOutput;
    }

    public QueryTranscodingsTaskResponse withThumbnailOutputname(String thumbnailOutputname) {
        this.thumbnailOutputname = thumbnailOutputname;
        return this;
    }

    public String getThumbnailOutputname() {
        return thumbnailOutputname;
    }

    public void setThumbnailOutputname(String thumbnailOutputname) {
        this.thumbnailOutputname = thumbnailOutputname;
    }

    public QueryTranscodingsTaskResponse withPicInfo(List<PicInfo> picInfo) {
        this.picInfo = picInfo;
        return this;
    }

    public QueryTranscodingsTaskResponse addPicInfoItem(PicInfo picInfoItem) {
        if (this.picInfo == null) {
            this.picInfo = new ArrayList<>();
        }
        this.picInfo.add(picInfoItem);
        return this;
    }

    public QueryTranscodingsTaskResponse withPicInfo(Consumer<List<PicInfo>> picInfoSetter) {
        if (this.picInfo == null) {
            this.picInfo = new ArrayList<>();
        }
        picInfoSetter.accept(this.picInfo);
        return this;
    }

    public List<PicInfo> getPicInfo() {
        return picInfo;
    }

    public void setPicInfo(List<PicInfo> picInfo) {
        this.picInfo = picInfo;
    }

    public QueryTranscodingsTaskResponse withAvParameters(List<AvParameters> avParameters) {
        this.avParameters = avParameters;
        return this;
    }

    public QueryTranscodingsTaskResponse addAvParametersItem(AvParameters avParametersItem) {
        if (this.avParameters == null) {
            this.avParameters = new ArrayList<>();
        }
        this.avParameters.add(avParametersItem);
        return this;
    }

    public QueryTranscodingsTaskResponse withAvParameters(Consumer<List<AvParameters>> avParametersSetter) {
        if (this.avParameters == null) {
            this.avParameters = new ArrayList<>();
        }
        avParametersSetter.accept(this.avParameters);
        return this;
    }

    public List<AvParameters> getAvParameters() {
        return avParameters;
    }

    public void setAvParameters(List<AvParameters> avParameters) {
        this.avParameters = avParameters;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryTranscodingsTaskResponse queryTranscodingsTaskResponse = (QueryTranscodingsTaskResponse) o;
        return Objects.equals(this.taskId, queryTranscodingsTaskResponse.taskId)
            && Objects.equals(this.status, queryTranscodingsTaskResponse.status)
            && Objects.equals(this.createTime, queryTranscodingsTaskResponse.createTime)
            && Objects.equals(this.endTime, queryTranscodingsTaskResponse.endTime)
            && Objects.equals(this.transTemplateId, queryTranscodingsTaskResponse.transTemplateId)
            && Objects.equals(this.input, queryTranscodingsTaskResponse.input)
            && Objects.equals(this.output, queryTranscodingsTaskResponse.output)
            && Objects.equals(this.outputFileName, queryTranscodingsTaskResponse.outputFileName)
            && Objects.equals(this.userData, queryTranscodingsTaskResponse.userData)
            && Objects.equals(this.errorCode, queryTranscodingsTaskResponse.errorCode)
            && Objects.equals(this.description, queryTranscodingsTaskResponse.description)
            && Objects.equals(this.tips, queryTranscodingsTaskResponse.tips)
            && Objects.equals(this.transcodeDetail, queryTranscodingsTaskResponse.transcodeDetail)
            && Objects.equals(this.thumbnailOutput, queryTranscodingsTaskResponse.thumbnailOutput)
            && Objects.equals(this.thumbnailOutputname, queryTranscodingsTaskResponse.thumbnailOutputname)
            && Objects.equals(this.picInfo, queryTranscodingsTaskResponse.picInfo)
            && Objects.equals(this.avParameters, queryTranscodingsTaskResponse.avParameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            status,
            createTime,
            endTime,
            transTemplateId,
            input,
            output,
            outputFileName,
            userData,
            errorCode,
            description,
            tips,
            transcodeDetail,
            thumbnailOutput,
            thumbnailOutputname,
            picInfo,
            avParameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryTranscodingsTaskResponse {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    transTemplateId: ").append(toIndentedString(transTemplateId)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    outputFileName: ").append(toIndentedString(outputFileName)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    tips: ").append(toIndentedString(tips)).append("\n");
        sb.append("    transcodeDetail: ").append(toIndentedString(transcodeDetail)).append("\n");
        sb.append("    thumbnailOutput: ").append(toIndentedString(thumbnailOutput)).append("\n");
        sb.append("    thumbnailOutputname: ").append(toIndentedString(thumbnailOutputname)).append("\n");
        sb.append("    picInfo: ").append(toIndentedString(picInfo)).append("\n");
        sb.append("    avParameters: ").append(toIndentedString(avParameters)).append("\n");
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
