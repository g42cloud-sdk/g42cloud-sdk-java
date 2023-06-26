package com.g42cloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListThumbnailsTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_array")

    private List<ThumbTask> taskArray = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_truncated")

    private Integer isTruncated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListThumbnailsTaskResponse withTaskArray(List<ThumbTask> taskArray) {
        this.taskArray = taskArray;
        return this;
    }

    public ListThumbnailsTaskResponse addTaskArrayItem(ThumbTask taskArrayItem) {
        if (this.taskArray == null) {
            this.taskArray = new ArrayList<>();
        }
        this.taskArray.add(taskArrayItem);
        return this;
    }

    public ListThumbnailsTaskResponse withTaskArray(Consumer<List<ThumbTask>> taskArraySetter) {
        if (this.taskArray == null) {
            this.taskArray = new ArrayList<>();
        }
        taskArraySetter.accept(this.taskArray);
        return this;
    }

    public List<ThumbTask> getTaskArray() {
        return taskArray;
    }

    public void setTaskArray(List<ThumbTask> taskArray) {
        this.taskArray = taskArray;
    }

    public ListThumbnailsTaskResponse withIsTruncated(Integer isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public Integer getIsTruncated() {
        return isTruncated;
    }

    public void setIsTruncated(Integer isTruncated) {
        this.isTruncated = isTruncated;
    }

    public ListThumbnailsTaskResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListThumbnailsTaskResponse listThumbnailsTaskResponse = (ListThumbnailsTaskResponse) o;
        return Objects.equals(this.taskArray, listThumbnailsTaskResponse.taskArray)
            && Objects.equals(this.isTruncated, listThumbnailsTaskResponse.isTruncated)
            && Objects.equals(this.total, listThumbnailsTaskResponse.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskArray, isTruncated, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListThumbnailsTaskResponse {\n");
        sb.append("    taskArray: ").append(toIndentedString(taskArray)).append("\n");
        sb.append("    isTruncated: ").append(toIndentedString(isTruncated)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
