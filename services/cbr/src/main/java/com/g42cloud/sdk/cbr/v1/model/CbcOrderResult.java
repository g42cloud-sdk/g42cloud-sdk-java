package com.g42cloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CbcOrderResult
 */
public class CbcOrderResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloudServiceId")

    private String cloudServiceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orderId")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscribeResult")

    private Integer subscribeResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceId")

    private String resourceId;

    public CbcOrderResult withCloudServiceId(String cloudServiceId) {
        this.cloudServiceId = cloudServiceId;
        return this;
    }

    public String getCloudServiceId() {
        return cloudServiceId;
    }

    public void setCloudServiceId(String cloudServiceId) {
        this.cloudServiceId = cloudServiceId;
    }

    public CbcOrderResult withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public CbcOrderResult withSubscribeResult(Integer subscribeResult) {
        this.subscribeResult = subscribeResult;
        return this;
    }

    public Integer getSubscribeResult() {
        return subscribeResult;
    }

    public void setSubscribeResult(Integer subscribeResult) {
        this.subscribeResult = subscribeResult;
    }

    public CbcOrderResult withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CbcOrderResult cbcOrderResult = (CbcOrderResult) o;
        return Objects.equals(this.cloudServiceId, cbcOrderResult.cloudServiceId)
            && Objects.equals(this.orderId, cbcOrderResult.orderId)
            && Objects.equals(this.subscribeResult, cbcOrderResult.subscribeResult)
            && Objects.equals(this.resourceId, cbcOrderResult.resourceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cloudServiceId, orderId, subscribeResult, resourceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CbcOrderResult {\n");
        sb.append("    cloudServiceId: ").append(toIndentedString(cloudServiceId)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    subscribeResult: ").append(toIndentedString(subscribeResult)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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
