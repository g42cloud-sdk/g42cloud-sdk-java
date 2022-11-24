package com.g42cloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateAddressGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateAddressGroupRequestBody body;

    public CreateAddressGroupRequest withBody(CreateAddressGroupRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateAddressGroupRequest withBody(Consumer<CreateAddressGroupRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateAddressGroupRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public CreateAddressGroupRequestBody getBody() {
        return body;
    }

    public void setBody(CreateAddressGroupRequestBody body) {
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
        CreateAddressGroupRequest createAddressGroupRequest = (CreateAddressGroupRequest) o;
        return Objects.equals(this.body, createAddressGroupRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAddressGroupRequest {\n");
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
