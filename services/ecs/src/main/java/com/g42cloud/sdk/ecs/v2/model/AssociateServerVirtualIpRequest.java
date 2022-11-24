package com.g42cloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AssociateServerVirtualIpRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nic_id")

    private String nicId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AssociateServerVirtualIpRequestBody body;

    public AssociateServerVirtualIpRequest withNicId(String nicId) {
        this.nicId = nicId;
        return this;
    }

    public String getNicId() {
        return nicId;
    }

    public void setNicId(String nicId) {
        this.nicId = nicId;
    }

    public AssociateServerVirtualIpRequest withBody(AssociateServerVirtualIpRequestBody body) {
        this.body = body;
        return this;
    }

    public AssociateServerVirtualIpRequest withBody(Consumer<AssociateServerVirtualIpRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new AssociateServerVirtualIpRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public AssociateServerVirtualIpRequestBody getBody() {
        return body;
    }

    public void setBody(AssociateServerVirtualIpRequestBody body) {
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
        AssociateServerVirtualIpRequest associateServerVirtualIpRequest = (AssociateServerVirtualIpRequest) o;
        return Objects.equals(this.nicId, associateServerVirtualIpRequest.nicId)
            && Objects.equals(this.body, associateServerVirtualIpRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nicId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateServerVirtualIpRequest {\n");
        sb.append("    nicId: ").append(toIndentedString(nicId)).append("\n");
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
