package com.g42cloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateEditingJobRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateEditingJobReq body;

    public CreateEditingJobRequest withBody(CreateEditingJobReq body) {
        this.body = body;
        return this;
    }

    public CreateEditingJobRequest withBody(Consumer<CreateEditingJobReq> bodySetter) {
        if (this.body == null) {
            this.body = new CreateEditingJobReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public CreateEditingJobReq getBody() {
        return body;
    }

    public void setBody(CreateEditingJobReq body) {
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
        CreateEditingJobRequest createEditingJobRequest = (CreateEditingJobRequest) o;
        return Objects.equals(this.body, createEditingJobRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEditingJobRequest {\n");
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
