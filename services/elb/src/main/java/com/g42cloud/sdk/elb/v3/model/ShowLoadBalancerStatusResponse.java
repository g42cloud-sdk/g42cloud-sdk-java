package com.g42cloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowLoadBalancerStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statuses")

    private LoadBalancerStatusResult statuses;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ShowLoadBalancerStatusResponse withStatuses(LoadBalancerStatusResult statuses) {
        this.statuses = statuses;
        return this;
    }

    public ShowLoadBalancerStatusResponse withStatuses(Consumer<LoadBalancerStatusResult> statusesSetter) {
        if (this.statuses == null) {
            this.statuses = new LoadBalancerStatusResult();
            statusesSetter.accept(this.statuses);
        }

        return this;
    }

    public LoadBalancerStatusResult getStatuses() {
        return statuses;
    }

    public void setStatuses(LoadBalancerStatusResult statuses) {
        this.statuses = statuses;
    }

    public ShowLoadBalancerStatusResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowLoadBalancerStatusResponse showLoadBalancerStatusResponse = (ShowLoadBalancerStatusResponse) o;
        return Objects.equals(this.statuses, showLoadBalancerStatusResponse.statuses)
            && Objects.equals(this.requestId, showLoadBalancerStatusResponse.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statuses, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLoadBalancerStatusResponse {\n");
        sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
