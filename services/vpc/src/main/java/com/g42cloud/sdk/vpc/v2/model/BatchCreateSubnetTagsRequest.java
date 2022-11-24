package com.g42cloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchCreateSubnetTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchCreateSubnetTagsRequestBody body;

    public BatchCreateSubnetTagsRequest withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public BatchCreateSubnetTagsRequest withBody(BatchCreateSubnetTagsRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchCreateSubnetTagsRequest withBody(Consumer<BatchCreateSubnetTagsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchCreateSubnetTagsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public BatchCreateSubnetTagsRequestBody getBody() {
        return body;
    }

    public void setBody(BatchCreateSubnetTagsRequestBody body) {
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
        BatchCreateSubnetTagsRequest batchCreateSubnetTagsRequest = (BatchCreateSubnetTagsRequest) o;
        return Objects.equals(this.subnetId, batchCreateSubnetTagsRequest.subnetId)
            && Objects.equals(this.body, batchCreateSubnetTagsRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subnetId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateSubnetTagsRequest {\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
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
