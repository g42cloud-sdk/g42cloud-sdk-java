package com.g42cloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 节点池自动伸缩相关配置
 */
public class NodePoolNodeAutoscaling {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minNodeCount")

    private Integer minNodeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxNodeCount")

    private Integer maxNodeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaleDownCooldownTime")

    private Integer scaleDownCooldownTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    public NodePoolNodeAutoscaling withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public NodePoolNodeAutoscaling withMinNodeCount(Integer minNodeCount) {
        this.minNodeCount = minNodeCount;
        return this;
    }

    public Integer getMinNodeCount() {
        return minNodeCount;
    }

    public void setMinNodeCount(Integer minNodeCount) {
        this.minNodeCount = minNodeCount;
    }

    public NodePoolNodeAutoscaling withMaxNodeCount(Integer maxNodeCount) {
        this.maxNodeCount = maxNodeCount;
        return this;
    }

    public Integer getMaxNodeCount() {
        return maxNodeCount;
    }

    public void setMaxNodeCount(Integer maxNodeCount) {
        this.maxNodeCount = maxNodeCount;
    }

    public NodePoolNodeAutoscaling withScaleDownCooldownTime(Integer scaleDownCooldownTime) {
        this.scaleDownCooldownTime = scaleDownCooldownTime;
        return this;
    }

    public Integer getScaleDownCooldownTime() {
        return scaleDownCooldownTime;
    }

    public void setScaleDownCooldownTime(Integer scaleDownCooldownTime) {
        this.scaleDownCooldownTime = scaleDownCooldownTime;
    }

    public NodePoolNodeAutoscaling withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodePoolNodeAutoscaling that = (NodePoolNodeAutoscaling) obj;
        return Objects.equals(this.enable, that.enable) && Objects.equals(this.minNodeCount, that.minNodeCount)
            && Objects.equals(this.maxNodeCount, that.maxNodeCount)
            && Objects.equals(this.scaleDownCooldownTime, that.scaleDownCooldownTime)
            && Objects.equals(this.priority, that.priority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable, minNodeCount, maxNodeCount, scaleDownCooldownTime, priority);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodePoolNodeAutoscaling {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    minNodeCount: ").append(toIndentedString(minNodeCount)).append("\n");
        sb.append("    maxNodeCount: ").append(toIndentedString(maxNodeCount)).append("\n");
        sb.append("    scaleDownCooldownTime: ").append(toIndentedString(scaleDownCooldownTime)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
