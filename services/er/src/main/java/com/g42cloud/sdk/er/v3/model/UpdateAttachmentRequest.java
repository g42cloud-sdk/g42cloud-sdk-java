package com.g42cloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateAttachmentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "er_id")

    private String erId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment_id")

    private String attachmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateAttachmentRequestBody body;

    public UpdateAttachmentRequest withErId(String erId) {
        this.erId = erId;
        return this;
    }

    public String getErId() {
        return erId;
    }

    public void setErId(String erId) {
        this.erId = erId;
    }

    public UpdateAttachmentRequest withAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
        return this;
    }

    public String getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    public UpdateAttachmentRequest withBody(UpdateAttachmentRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateAttachmentRequest withBody(Consumer<UpdateAttachmentRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateAttachmentRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public UpdateAttachmentRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateAttachmentRequestBody body) {
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
        UpdateAttachmentRequest updateAttachmentRequest = (UpdateAttachmentRequest) o;
        return Objects.equals(this.erId, updateAttachmentRequest.erId)
            && Objects.equals(this.attachmentId, updateAttachmentRequest.attachmentId)
            && Objects.equals(this.body, updateAttachmentRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(erId, attachmentId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAttachmentRequest {\n");
        sb.append("    erId: ").append(toIndentedString(erId)).append("\n");
        sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
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
