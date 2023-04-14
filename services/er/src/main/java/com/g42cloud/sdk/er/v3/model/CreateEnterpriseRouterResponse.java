package com.g42cloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateEnterpriseRouterResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance")

    private EnterpriseRouter instance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Client-Token")

    private String xClientToken;

    public CreateEnterpriseRouterResponse withInstance(EnterpriseRouter instance) {
        this.instance = instance;
        return this;
    }

    public CreateEnterpriseRouterResponse withInstance(Consumer<EnterpriseRouter> instanceSetter) {
        if (this.instance == null) {
            this.instance = new EnterpriseRouter();
            instanceSetter.accept(this.instance);
        }

        return this;
    }

    public EnterpriseRouter getInstance() {
        return instance;
    }

    public void setInstance(EnterpriseRouter instance) {
        this.instance = instance;
    }

    public CreateEnterpriseRouterResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public CreateEnterpriseRouterResponse withXClientToken(String xClientToken) {
        this.xClientToken = xClientToken;
        return this;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Client-Token")
    public String getXClientToken() {
        return xClientToken;
    }

    public void setXClientToken(String xClientToken) {
        this.xClientToken = xClientToken;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateEnterpriseRouterResponse createEnterpriseRouterResponse = (CreateEnterpriseRouterResponse) o;
        return Objects.equals(this.instance, createEnterpriseRouterResponse.instance)
            && Objects.equals(this.requestId, createEnterpriseRouterResponse.requestId)
            && Objects.equals(this.xClientToken, createEnterpriseRouterResponse.xClientToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instance, requestId, xClientToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEnterpriseRouterResponse {\n");
        sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    xClientToken: ").append(toIndentedString(xClientToken)).append("\n");
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
