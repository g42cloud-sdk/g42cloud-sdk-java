package com.g42cloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateApplicationEndpointRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_urn")

    private String endpointUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateApplicationEndpointRequestBody body;

    public UpdateApplicationEndpointRequest withEndpointUrn(String endpointUrn) {
        this.endpointUrn = endpointUrn;
        return this;
    }

    public String getEndpointUrn() {
        return endpointUrn;
    }

    public void setEndpointUrn(String endpointUrn) {
        this.endpointUrn = endpointUrn;
    }

    public UpdateApplicationEndpointRequest withBody(UpdateApplicationEndpointRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateApplicationEndpointRequest withBody(Consumer<UpdateApplicationEndpointRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateApplicationEndpointRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public UpdateApplicationEndpointRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateApplicationEndpointRequestBody body) {
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
        UpdateApplicationEndpointRequest updateApplicationEndpointRequest = (UpdateApplicationEndpointRequest) o;
        return Objects.equals(this.endpointUrn, updateApplicationEndpointRequest.endpointUrn)
            && Objects.equals(this.body, updateApplicationEndpointRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpointUrn, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateApplicationEndpointRequest {\n");
        sb.append("    endpointUrn: ").append(toIndentedString(endpointUrn)).append("\n");
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
