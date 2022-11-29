package com.g42cloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateAlarmRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateAlarmRequestBody body;

    public CreateAlarmRequest withBody(CreateAlarmRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateAlarmRequest withBody(Consumer<CreateAlarmRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateAlarmRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public CreateAlarmRequestBody getBody() {
        return body;
    }

    public void setBody(CreateAlarmRequestBody body) {
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
        CreateAlarmRequest createAlarmRequest = (CreateAlarmRequest) o;
        return Objects.equals(this.body, createAlarmRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAlarmRequest {\n");
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
