package com.g42cloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateApplicationEndpointResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_urn")

    private String endpointUrn;

    public CreateApplicationEndpointResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public CreateApplicationEndpointResponse withEndpointUrn(String endpointUrn) {
        this.endpointUrn = endpointUrn;
        return this;
    }

    public String getEndpointUrn() {
        return endpointUrn;
    }

    public void setEndpointUrn(String endpointUrn) {
        this.endpointUrn = endpointUrn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateApplicationEndpointResponse that = (CreateApplicationEndpointResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.endpointUrn, that.endpointUrn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, endpointUrn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateApplicationEndpointResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    endpointUrn: ").append(toIndentedString(endpointUrn)).append("\n");
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
