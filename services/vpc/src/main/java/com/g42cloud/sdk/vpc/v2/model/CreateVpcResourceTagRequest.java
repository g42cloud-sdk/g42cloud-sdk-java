package com.g42cloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateVpcResourceTagRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateVpcResourceTagRequestBody body;

    public CreateVpcResourceTagRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateVpcResourceTagRequest withBody(CreateVpcResourceTagRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateVpcResourceTagRequest withBody(Consumer<CreateVpcResourceTagRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateVpcResourceTagRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public CreateVpcResourceTagRequestBody getBody() {
        return body;
    }

    public void setBody(CreateVpcResourceTagRequestBody body) {
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
        CreateVpcResourceTagRequest createVpcResourceTagRequest = (CreateVpcResourceTagRequest) o;
        return Objects.equals(this.vpcId, createVpcResourceTagRequest.vpcId)
            && Objects.equals(this.body, createVpcResourceTagRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVpcResourceTagRequest {\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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
