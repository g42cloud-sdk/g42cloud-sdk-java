package com.g42cloud.sdk.ims.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class GlanceUpdateImageMemberRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_id")

    private String memberId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private GlanceUpdateImageMemberRequestBody body;

    public GlanceUpdateImageMemberRequest withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public GlanceUpdateImageMemberRequest withMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public GlanceUpdateImageMemberRequest withBody(GlanceUpdateImageMemberRequestBody body) {
        this.body = body;
        return this;
    }

    public GlanceUpdateImageMemberRequest withBody(Consumer<GlanceUpdateImageMemberRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new GlanceUpdateImageMemberRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public GlanceUpdateImageMemberRequestBody getBody() {
        return body;
    }

    public void setBody(GlanceUpdateImageMemberRequestBody body) {
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
        GlanceUpdateImageMemberRequest glanceUpdateImageMemberRequest = (GlanceUpdateImageMemberRequest) o;
        return Objects.equals(this.imageId, glanceUpdateImageMemberRequest.imageId)
            && Objects.equals(this.memberId, glanceUpdateImageMemberRequest.memberId)
            && Objects.equals(this.body, glanceUpdateImageMemberRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageId, memberId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlanceUpdateImageMemberRequest {\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
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
