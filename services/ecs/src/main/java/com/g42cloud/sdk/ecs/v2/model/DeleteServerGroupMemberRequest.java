package com.g42cloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DeleteServerGroupMemberRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group_id")

    private String serverGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DeleteServerGroupMemberRequestBody body;

    public DeleteServerGroupMemberRequest withServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }

    public String getServerGroupId() {
        return serverGroupId;
    }

    public void setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
    }

    public DeleteServerGroupMemberRequest withBody(DeleteServerGroupMemberRequestBody body) {
        this.body = body;
        return this;
    }

    public DeleteServerGroupMemberRequest withBody(Consumer<DeleteServerGroupMemberRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new DeleteServerGroupMemberRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public DeleteServerGroupMemberRequestBody getBody() {
        return body;
    }

    public void setBody(DeleteServerGroupMemberRequestBody body) {
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
        DeleteServerGroupMemberRequest that = (DeleteServerGroupMemberRequest) obj;
        return Objects.equals(this.serverGroupId, that.serverGroupId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverGroupId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteServerGroupMemberRequest {\n");
        sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
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
