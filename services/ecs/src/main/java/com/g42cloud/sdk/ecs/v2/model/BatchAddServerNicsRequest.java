package com.g42cloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchAddServerNicsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchAddServerNicsRequestBody body;

    public BatchAddServerNicsRequest withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public BatchAddServerNicsRequest withBody(BatchAddServerNicsRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchAddServerNicsRequest withBody(Consumer<BatchAddServerNicsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchAddServerNicsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public BatchAddServerNicsRequestBody getBody() {
        return body;
    }

    public void setBody(BatchAddServerNicsRequestBody body) {
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
        BatchAddServerNicsRequest batchAddServerNicsRequest = (BatchAddServerNicsRequest) o;
        return Objects.equals(this.serverId, batchAddServerNicsRequest.serverId)
            && Objects.equals(this.body, batchAddServerNicsRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAddServerNicsRequest {\n");
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
