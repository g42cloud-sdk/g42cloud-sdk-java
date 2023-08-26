package com.g42cloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateServerGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group")

    private CreateServerGroupResult serverGroup;

    public CreateServerGroupResponse withServerGroup(CreateServerGroupResult serverGroup) {
        this.serverGroup = serverGroup;
        return this;
    }

    public CreateServerGroupResponse withServerGroup(Consumer<CreateServerGroupResult> serverGroupSetter) {
        if (this.serverGroup == null) {
            this.serverGroup = new CreateServerGroupResult();
            serverGroupSetter.accept(this.serverGroup);
        }

        return this;
    }

    public CreateServerGroupResult getServerGroup() {
        return serverGroup;
    }

    public void setServerGroup(CreateServerGroupResult serverGroup) {
        this.serverGroup = serverGroup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateServerGroupResponse that = (CreateServerGroupResponse) obj;
        return Objects.equals(this.serverGroup, that.serverGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateServerGroupResponse {\n");
        sb.append("    serverGroup: ").append(toIndentedString(serverGroup)).append("\n");
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
