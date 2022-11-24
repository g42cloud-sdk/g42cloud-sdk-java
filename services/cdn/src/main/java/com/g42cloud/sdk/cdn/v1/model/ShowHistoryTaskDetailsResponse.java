package com.g42cloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowHistoryTaskDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urls")

    private List<UrlObject> urls = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "processing")

    private Integer processing;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "succeed")

    private Integer succeed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed")

    private Integer failed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_type")

    private String fileType;

    public ShowHistoryTaskDetailsResponse withId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowHistoryTaskDetailsResponse withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public ShowHistoryTaskDetailsResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowHistoryTaskDetailsResponse withUrls(List<UrlObject> urls) {
        this.urls = urls;
        return this;
    }

    public ShowHistoryTaskDetailsResponse addUrlsItem(UrlObject urlsItem) {
        if (this.urls == null) {
            this.urls = new ArrayList<>();
        }
        this.urls.add(urlsItem);
        return this;
    }

    public ShowHistoryTaskDetailsResponse withUrls(Consumer<List<UrlObject>> urlsSetter) {
        if (this.urls == null) {
            this.urls = new ArrayList<>();
        }
        urlsSetter.accept(this.urls);
        return this;
    }

    public List<UrlObject> getUrls() {
        return urls;
    }

    public void setUrls(List<UrlObject> urls) {
        this.urls = urls;
    }

    public ShowHistoryTaskDetailsResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowHistoryTaskDetailsResponse withProcessing(Integer processing) {
        this.processing = processing;
        return this;
    }

    public Integer getProcessing() {
        return processing;
    }

    public void setProcessing(Integer processing) {
        this.processing = processing;
    }

    public ShowHistoryTaskDetailsResponse withSucceed(Integer succeed) {
        this.succeed = succeed;
        return this;
    }

    public Integer getSucceed() {
        return succeed;
    }

    public void setSucceed(Integer succeed) {
        this.succeed = succeed;
    }

    public ShowHistoryTaskDetailsResponse withFailed(Integer failed) {
        this.failed = failed;
        return this;
    }

    public Integer getFailed() {
        return failed;
    }

    public void setFailed(Integer failed) {
        this.failed = failed;
    }

    public ShowHistoryTaskDetailsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShowHistoryTaskDetailsResponse withFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowHistoryTaskDetailsResponse showHistoryTaskDetailsResponse = (ShowHistoryTaskDetailsResponse) o;
        return Objects.equals(this.id, showHistoryTaskDetailsResponse.id)
            && Objects.equals(this.taskType, showHistoryTaskDetailsResponse.taskType)
            && Objects.equals(this.status, showHistoryTaskDetailsResponse.status)
            && Objects.equals(this.urls, showHistoryTaskDetailsResponse.urls)
            && Objects.equals(this.createTime, showHistoryTaskDetailsResponse.createTime)
            && Objects.equals(this.processing, showHistoryTaskDetailsResponse.processing)
            && Objects.equals(this.succeed, showHistoryTaskDetailsResponse.succeed)
            && Objects.equals(this.failed, showHistoryTaskDetailsResponse.failed)
            && Objects.equals(this.total, showHistoryTaskDetailsResponse.total)
            && Objects.equals(this.fileType, showHistoryTaskDetailsResponse.fileType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, taskType, status, urls, createTime, processing, succeed, failed, total, fileType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHistoryTaskDetailsResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    processing: ").append(toIndentedString(processing)).append("\n");
        sb.append("    succeed: ").append(toIndentedString(succeed)).append("\n");
        sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
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
