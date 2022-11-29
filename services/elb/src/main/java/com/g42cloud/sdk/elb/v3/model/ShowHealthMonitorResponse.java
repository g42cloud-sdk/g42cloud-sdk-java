package com.g42cloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowHealthMonitorResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "healthmonitor")

    private HealthMonitor healthmonitor;

    public ShowHealthMonitorResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ShowHealthMonitorResponse withHealthmonitor(HealthMonitor healthmonitor) {
        this.healthmonitor = healthmonitor;
        return this;
    }

    public ShowHealthMonitorResponse withHealthmonitor(Consumer<HealthMonitor> healthmonitorSetter) {
        if (this.healthmonitor == null) {
            this.healthmonitor = new HealthMonitor();
            healthmonitorSetter.accept(this.healthmonitor);
        }

        return this;
    }

    public HealthMonitor getHealthmonitor() {
        return healthmonitor;
    }

    public void setHealthmonitor(HealthMonitor healthmonitor) {
        this.healthmonitor = healthmonitor;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowHealthMonitorResponse showHealthMonitorResponse = (ShowHealthMonitorResponse) o;
        return Objects.equals(this.requestId, showHealthMonitorResponse.requestId)
            && Objects.equals(this.healthmonitor, showHealthMonitorResponse.healthmonitor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, healthmonitor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHealthMonitorResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    healthmonitor: ").append(toIndentedString(healthmonitor)).append("\n");
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
