package com.g42cloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DisassociateServerVirtualIpRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nic_id")

    private String nicId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DisassociateServerVirtualIpRequestBody body;

    public DisassociateServerVirtualIpRequest withNicId(String nicId) {
        this.nicId = nicId;
        return this;
    }

    public String getNicId() {
        return nicId;
    }

    public void setNicId(String nicId) {
        this.nicId = nicId;
    }

    public DisassociateServerVirtualIpRequest withBody(DisassociateServerVirtualIpRequestBody body) {
        this.body = body;
        return this;
    }

    public DisassociateServerVirtualIpRequest withBody(Consumer<DisassociateServerVirtualIpRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new DisassociateServerVirtualIpRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public DisassociateServerVirtualIpRequestBody getBody() {
        return body;
    }

    public void setBody(DisassociateServerVirtualIpRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DisassociateServerVirtualIpRequest that = (DisassociateServerVirtualIpRequest) obj;
        return Objects.equals(this.nicId, that.nicId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nicId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisassociateServerVirtualIpRequest {\n");
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
