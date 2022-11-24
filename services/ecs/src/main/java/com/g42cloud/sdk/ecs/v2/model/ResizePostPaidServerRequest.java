package com.g42cloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ResizePostPaidServerRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ResizePostPaidServerRequestBody body;

    public ResizePostPaidServerRequest withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public ResizePostPaidServerRequest withBody(ResizePostPaidServerRequestBody body) {
        this.body = body;
        return this;
    }

    public ResizePostPaidServerRequest withBody(Consumer<ResizePostPaidServerRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ResizePostPaidServerRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public ResizePostPaidServerRequestBody getBody() {
        return body;
    }

    public void setBody(ResizePostPaidServerRequestBody body) {
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
        ResizePostPaidServerRequest resizePostPaidServerRequest = (ResizePostPaidServerRequest) o;
        return Objects.equals(this.serverId, resizePostPaidServerRequest.serverId)
            && Objects.equals(this.body, resizePostPaidServerRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizePostPaidServerRequest {\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
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
