package com.g42cloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateVpcAttachmentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "er_id")

    private String erId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_attachment_id")

    private String vpcAttachmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateVpcAttachmentRequestBody body;

    public UpdateVpcAttachmentRequest withErId(String erId) {
        this.erId = erId;
        return this;
    }

    public String getErId() {
        return erId;
    }

    public void setErId(String erId) {
        this.erId = erId;
    }

    public UpdateVpcAttachmentRequest withVpcAttachmentId(String vpcAttachmentId) {
        this.vpcAttachmentId = vpcAttachmentId;
        return this;
    }

    public String getVpcAttachmentId() {
        return vpcAttachmentId;
    }

    public void setVpcAttachmentId(String vpcAttachmentId) {
        this.vpcAttachmentId = vpcAttachmentId;
    }

    public UpdateVpcAttachmentRequest withBody(UpdateVpcAttachmentRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateVpcAttachmentRequest withBody(Consumer<UpdateVpcAttachmentRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateVpcAttachmentRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public UpdateVpcAttachmentRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateVpcAttachmentRequestBody body) {
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
        UpdateVpcAttachmentRequest updateVpcAttachmentRequest = (UpdateVpcAttachmentRequest) o;
        return Objects.equals(this.erId, updateVpcAttachmentRequest.erId)
            && Objects.equals(this.vpcAttachmentId, updateVpcAttachmentRequest.vpcAttachmentId)
            && Objects.equals(this.body, updateVpcAttachmentRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(erId, vpcAttachmentId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVpcAttachmentRequest {\n");
        sb.append("    erId: ").append(toIndentedString(erId)).append("\n");
        sb.append("    vpcAttachmentId: ").append(toIndentedString(vpcAttachmentId)).append("\n");
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
