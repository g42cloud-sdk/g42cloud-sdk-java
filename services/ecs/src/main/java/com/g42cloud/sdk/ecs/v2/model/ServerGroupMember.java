package com.g42cloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 云服务器组添加、删除成员列表
 */
public class ServerGroupMember {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_uuid")

    private String instanceUuid;

    public ServerGroupMember withInstanceUuid(String instanceUuid) {
        this.instanceUuid = instanceUuid;
        return this;
    }

    public String getInstanceUuid() {
        return instanceUuid;
    }

    public void setInstanceUuid(String instanceUuid) {
        this.instanceUuid = instanceUuid;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServerGroupMember serverGroupMember = (ServerGroupMember) o;
        return Objects.equals(this.instanceUuid, serverGroupMember.instanceUuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceUuid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerGroupMember {\n");
        sb.append("    instanceUuid: ").append(toIndentedString(instanceUuid)).append("\n");
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
