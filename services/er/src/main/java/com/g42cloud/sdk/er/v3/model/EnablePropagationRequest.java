package com.g42cloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class EnablePropagationRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Client-Token")

    private String xClientToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "er_id")

    private String erId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_table_id")

    private String routeTableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private PropagationRequestBody body;

    public EnablePropagationRequest withXClientToken(String xClientToken) {
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

    public EnablePropagationRequest withErId(String erId) {
        this.erId = erId;
        return this;
    }

    public String getErId() {
        return erId;
    }

    public void setErId(String erId) {
        this.erId = erId;
    }

    public EnablePropagationRequest withRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }

    public String getRouteTableId() {
        return routeTableId;
    }

    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    public EnablePropagationRequest withBody(PropagationRequestBody body) {
        this.body = body;
        return this;
    }

    public EnablePropagationRequest withBody(Consumer<PropagationRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new PropagationRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public PropagationRequestBody getBody() {
        return body;
    }

    public void setBody(PropagationRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnablePropagationRequest enablePropagationRequest = (EnablePropagationRequest) o;
        return Objects.equals(this.xClientToken, enablePropagationRequest.xClientToken)
            && Objects.equals(this.erId, enablePropagationRequest.erId)
            && Objects.equals(this.routeTableId, enablePropagationRequest.routeTableId)
            && Objects.equals(this.body, enablePropagationRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xClientToken, erId, routeTableId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnablePropagationRequest {\n");
        sb.append("    xClientToken: ").append(toIndentedString(xClientToken)).append("\n");
        sb.append("    erId: ").append(toIndentedString(erId)).append("\n");
        sb.append("    routeTableId: ").append(toIndentedString(routeTableId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
