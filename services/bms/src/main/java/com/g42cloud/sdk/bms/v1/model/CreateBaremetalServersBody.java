package com.g42cloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建裸金属服务器接口请求结构体
 */
public class CreateBaremetalServersBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server")

    private CreateServers server;

    public CreateBaremetalServersBody withServer(CreateServers server) {
        this.server = server;
        return this;
    }

    public CreateBaremetalServersBody withServer(Consumer<CreateServers> serverSetter) {
        if (this.server == null) {
            this.server = new CreateServers();
            serverSetter.accept(this.server);
        }

        return this;
    }

    public CreateServers getServer() {
        return server;
    }

    public void setServer(CreateServers server) {
        this.server = server;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateBaremetalServersBody that = (CreateBaremetalServersBody) obj;
        return Objects.equals(this.server, that.server);
    }

    @Override
    public int hashCode() {
        return Objects.hash(server);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBaremetalServersBody {\n");
        sb.append("    server: ").append(toIndentedString(server)).append("\n");
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
