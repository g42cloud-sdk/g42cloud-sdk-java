package com.g42cloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建云日志信息请求体
 */
public class CreateLogtankRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_id")

    private String logGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_id")

    private String logStreamId;

    public CreateLogtankRequestBody withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    public CreateLogtankRequestBody withLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
        return this;
    }

    public String getLogStreamId() {
        return logStreamId;
    }

    public void setLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateLogtankRequestBody createLogtankRequestBody = (CreateLogtankRequestBody) o;
        return Objects.equals(this.logGroupId, createLogtankRequestBody.logGroupId)
            && Objects.equals(this.logStreamId, createLogtankRequestBody.logStreamId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logGroupId, logStreamId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLogtankRequestBody {\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    logStreamId: ").append(toIndentedString(logStreamId)).append("\n");
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
