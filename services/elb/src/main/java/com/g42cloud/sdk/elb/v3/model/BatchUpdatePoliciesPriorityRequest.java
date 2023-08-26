package com.g42cloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchUpdatePoliciesPriorityRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchUpdatePoliciesPriorityRequestBody body;

    public BatchUpdatePoliciesPriorityRequest withBody(BatchUpdatePoliciesPriorityRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchUpdatePoliciesPriorityRequest withBody(Consumer<BatchUpdatePoliciesPriorityRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchUpdatePoliciesPriorityRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public BatchUpdatePoliciesPriorityRequestBody getBody() {
        return body;
    }

    public void setBody(BatchUpdatePoliciesPriorityRequestBody body) {
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
        BatchUpdatePoliciesPriorityRequest that = (BatchUpdatePoliciesPriorityRequest) obj;
        return Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdatePoliciesPriorityRequest {\n");
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
