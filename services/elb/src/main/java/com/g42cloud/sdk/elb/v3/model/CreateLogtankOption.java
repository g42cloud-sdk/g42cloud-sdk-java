package com.g42cloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建云日志请求参数。
 */
public class CreateLogtankOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer_id")

    private String loadbalancerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_id")

    private String logGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_topic_id")

    private String logTopicId;

    public CreateLogtankOption withLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
        return this;
    }

    public String getLoadbalancerId() {
        return loadbalancerId;
    }

    public void setLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
    }

    public CreateLogtankOption withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    public CreateLogtankOption withLogTopicId(String logTopicId) {
        this.logTopicId = logTopicId;
        return this;
    }

    public String getLogTopicId() {
        return logTopicId;
    }

    public void setLogTopicId(String logTopicId) {
        this.logTopicId = logTopicId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateLogtankOption that = (CreateLogtankOption) obj;
        return Objects.equals(this.loadbalancerId, that.loadbalancerId)
            && Objects.equals(this.logGroupId, that.logGroupId) && Objects.equals(this.logTopicId, that.logTopicId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loadbalancerId, logGroupId, logTopicId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLogtankOption {\n");
        sb.append("    loadbalancerId: ").append(toIndentedString(loadbalancerId)).append("\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    logTopicId: ").append(toIndentedString(logTopicId)).append("\n");
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
