package com.g42cloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdatePortRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_id")

    private String portId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdatePortRequestBody body;

    public UpdatePortRequest withPortId(String portId) {
        this.portId = portId;
        return this;
    }

    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public UpdatePortRequest withBody(UpdatePortRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdatePortRequest withBody(Consumer<UpdatePortRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdatePortRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public UpdatePortRequestBody getBody() {
        return body;
    }

    public void setBody(UpdatePortRequestBody body) {
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
        UpdatePortRequest updatePortRequest = (UpdatePortRequest) o;
        return Objects.equals(this.portId, updatePortRequest.portId)
            && Objects.equals(this.body, updatePortRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(portId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePortRequest {\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
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
