package com.g42cloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListBareMetalServerDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server")

    private ServerDetails server;

    public ListBareMetalServerDetailsResponse withServer(ServerDetails server) {
        this.server = server;
        return this;
    }

    public ListBareMetalServerDetailsResponse withServer(Consumer<ServerDetails> serverSetter) {
        if (this.server == null) {
            this.server = new ServerDetails();
            serverSetter.accept(this.server);
        }

        return this;
    }

    public ServerDetails getServer() {
        return server;
    }

    public void setServer(ServerDetails server) {
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
        ListBareMetalServerDetailsResponse that = (ListBareMetalServerDetailsResponse) obj;
        return Objects.equals(this.server, that.server);
    }

    @Override
    public int hashCode() {
        return Objects.hash(server);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBareMetalServerDetailsResponse {\n");
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
