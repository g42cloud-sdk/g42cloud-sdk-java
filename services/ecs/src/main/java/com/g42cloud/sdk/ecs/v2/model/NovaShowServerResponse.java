package com.g42cloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class NovaShowServerResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server")

    private NovaServer server;

    public NovaShowServerResponse withServer(NovaServer server) {
        this.server = server;
        return this;
    }

    public NovaShowServerResponse withServer(Consumer<NovaServer> serverSetter) {
        if (this.server == null) {
            this.server = new NovaServer();
            serverSetter.accept(this.server);
        }

        return this;
    }

    public NovaServer getServer() {
        return server;
    }

    public void setServer(NovaServer server) {
        this.server = server;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NovaShowServerResponse novaShowServerResponse = (NovaShowServerResponse) o;
        return Objects.equals(this.server, novaShowServerResponse.server);
    }

    @Override
    public int hashCode() {
        return Objects.hash(server);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaShowServerResponse {\n");
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
