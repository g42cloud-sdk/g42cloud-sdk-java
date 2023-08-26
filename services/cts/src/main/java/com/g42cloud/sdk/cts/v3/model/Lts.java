package com.g42cloud.sdk.cts.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 云日志服务配置
 */
public class Lts {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_lts_enabled")

    private Boolean isLtsEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_name")

    private String logGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_topic_name")

    private String logTopicName;

    public Lts withIsLtsEnabled(Boolean isLtsEnabled) {
        this.isLtsEnabled = isLtsEnabled;
        return this;
    }

    public Boolean getIsLtsEnabled() {
        return isLtsEnabled;
    }

    public void setIsLtsEnabled(Boolean isLtsEnabled) {
        this.isLtsEnabled = isLtsEnabled;
    }

    public Lts withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    public String getLogGroupName() {
        return logGroupName;
    }

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    public Lts withLogTopicName(String logTopicName) {
        this.logTopicName = logTopicName;
        return this;
    }

    public String getLogTopicName() {
        return logTopicName;
    }

    public void setLogTopicName(String logTopicName) {
        this.logTopicName = logTopicName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Lts that = (Lts) obj;
        return Objects.equals(this.isLtsEnabled, that.isLtsEnabled)
            && Objects.equals(this.logGroupName, that.logGroupName)
            && Objects.equals(this.logTopicName, that.logTopicName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isLtsEnabled, logGroupName, logTopicName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Lts {\n");
        sb.append("    isLtsEnabled: ").append(toIndentedString(isLtsEnabled)).append("\n");
        sb.append("    logGroupName: ").append(toIndentedString(logGroupName)).append("\n");
        sb.append("    logTopicName: ").append(toIndentedString(logTopicName)).append("\n");
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
