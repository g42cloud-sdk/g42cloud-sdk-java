package com.g42cloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateMessageTemplateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateMessageTemplateRequestBody body;

    public CreateMessageTemplateRequest withBody(CreateMessageTemplateRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateMessageTemplateRequest withBody(Consumer<CreateMessageTemplateRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateMessageTemplateRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public CreateMessageTemplateRequestBody getBody() {
        return body;
    }

    public void setBody(CreateMessageTemplateRequestBody body) {
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
        CreateMessageTemplateRequest createMessageTemplateRequest = (CreateMessageTemplateRequest) o;
        return Objects.equals(this.body, createMessageTemplateRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMessageTemplateRequest {\n");
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
