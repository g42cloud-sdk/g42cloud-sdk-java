package com.g42cloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateVpcPeeringRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateVpcPeeringRequestBody body;

    public CreateVpcPeeringRequest withBody(CreateVpcPeeringRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateVpcPeeringRequest withBody(Consumer<CreateVpcPeeringRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateVpcPeeringRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public CreateVpcPeeringRequestBody getBody() {
        return body;
    }

    public void setBody(CreateVpcPeeringRequestBody body) {
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
        CreateVpcPeeringRequest that = (CreateVpcPeeringRequest) obj;
        return Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVpcPeeringRequest {\n");
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
