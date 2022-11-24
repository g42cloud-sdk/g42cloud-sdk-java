package com.g42cloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateSubNetworkInterfaceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateSubNetworkInterfaceRequestBody body;

    public CreateSubNetworkInterfaceRequest withBody(CreateSubNetworkInterfaceRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateSubNetworkInterfaceRequest withBody(Consumer<CreateSubNetworkInterfaceRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateSubNetworkInterfaceRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public CreateSubNetworkInterfaceRequestBody getBody() {
        return body;
    }

    public void setBody(CreateSubNetworkInterfaceRequestBody body) {
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
        CreateSubNetworkInterfaceRequest createSubNetworkInterfaceRequest = (CreateSubNetworkInterfaceRequest) o;
        return Objects.equals(this.body, createSubNetworkInterfaceRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSubNetworkInterfaceRequest {\n");
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
