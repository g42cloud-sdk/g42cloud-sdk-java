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
public class ListTranscodeDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_array")

    private List<TaskDetailInfo> taskArray = null;

    public ListTranscodeDetailResponse withTaskArray(List<TaskDetailInfo> taskArray) {
        this.taskArray = taskArray;
        return this;
    }

    public ListTranscodeDetailResponse addTaskArrayItem(TaskDetailInfo taskArrayItem) {
        if (this.taskArray == null) {
            this.taskArray = new ArrayList<>();
        }
        this.taskArray.add(taskArrayItem);
        return this;
    }

    public ListTranscodeDetailResponse withTaskArray(Consumer<List<TaskDetailInfo>> taskArraySetter) {
        if (this.taskArray == null) {
            this.taskArray = new ArrayList<>();
        }
        taskArraySetter.accept(this.taskArray);
        return this;
    }

    public List<TaskDetailInfo> getTaskArray() {
        return taskArray;
    }

    public void setTaskArray(List<TaskDetailInfo> taskArray) {
        this.taskArray = taskArray;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTranscodeDetailResponse that = (ListTranscodeDetailResponse) obj;
        return Objects.equals(this.taskArray, that.taskArray);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskArray);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTranscodeDetailResponse {\n");
        sb.append("    taskArray: ").append(toIndentedString(taskArray)).append("\n");
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
