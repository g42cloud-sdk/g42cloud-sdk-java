package com.g42cloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreatePostPaidServersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreatePostPaidServersRequestBody body;

    public CreatePostPaidServersRequest withBody(CreatePostPaidServersRequestBody body) {
        this.body = body;
        return this;
    }

    public CreatePostPaidServersRequest withBody(Consumer<CreatePostPaidServersRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreatePostPaidServersRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public CreatePostPaidServersRequestBody getBody() {
        return body;
    }

    public void setBody(CreatePostPaidServersRequestBody body) {
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
        CreatePostPaidServersRequest createPostPaidServersRequest = (CreatePostPaidServersRequest) o;
        return Objects.equals(this.body, createPostPaidServersRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePostPaidServersRequest {\n");
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
