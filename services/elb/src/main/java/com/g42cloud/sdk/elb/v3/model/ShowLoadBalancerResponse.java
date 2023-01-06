package com.g42cloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowLoadBalancerResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer")

    private LoadBalancer loadbalancer;

    public ShowLoadBalancerResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ShowLoadBalancerResponse withLoadbalancer(LoadBalancer loadbalancer) {
        this.loadbalancer = loadbalancer;
        return this;
    }

    public ShowLoadBalancerResponse withLoadbalancer(Consumer<LoadBalancer> loadbalancerSetter) {
        if (this.loadbalancer == null) {
            this.loadbalancer = new LoadBalancer();
            loadbalancerSetter.accept(this.loadbalancer);
        }

        return this;
    }

    public LoadBalancer getLoadbalancer() {
        return loadbalancer;
    }

    public void setLoadbalancer(LoadBalancer loadbalancer) {
        this.loadbalancer = loadbalancer;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowLoadBalancerResponse showLoadBalancerResponse = (ShowLoadBalancerResponse) o;
        return Objects.equals(this.requestId, showLoadBalancerResponse.requestId)
            && Objects.equals(this.loadbalancer, showLoadBalancerResponse.loadbalancer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, loadbalancer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLoadBalancerResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    loadbalancer: ").append(toIndentedString(loadbalancer)).append("\n");
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
