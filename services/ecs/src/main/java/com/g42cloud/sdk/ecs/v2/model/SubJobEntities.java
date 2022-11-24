package com.g42cloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class SubJobEntities {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nic_id")

    private String nicId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "errorcode_message")

    private String errorcodeMessage;

    public SubJobEntities withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public SubJobEntities withNicId(String nicId) {
        this.nicId = nicId;
        return this;
    }

    public String getNicId() {
        return nicId;
    }

    public void setNicId(String nicId) {
        this.nicId = nicId;
    }

    public SubJobEntities withErrorcodeMessage(String errorcodeMessage) {
        this.errorcodeMessage = errorcodeMessage;
        return this;
    }

    public String getErrorcodeMessage() {
        return errorcodeMessage;
    }

    public void setErrorcodeMessage(String errorcodeMessage) {
        this.errorcodeMessage = errorcodeMessage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubJobEntities subJobEntities = (SubJobEntities) o;
        return Objects.equals(this.serverId, subJobEntities.serverId)
            && Objects.equals(this.nicId, subJobEntities.nicId)
            && Objects.equals(this.errorcodeMessage, subJobEntities.errorcodeMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverId, nicId, errorcodeMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubJobEntities {\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    nicId: ").append(toIndentedString(nicId)).append("\n");
        sb.append("    errorcodeMessage: ").append(toIndentedString(errorcodeMessage)).append("\n");
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
