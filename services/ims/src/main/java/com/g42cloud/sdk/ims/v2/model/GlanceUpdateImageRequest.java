package com.g42cloud.sdk.ims.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class GlanceUpdateImageRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private List<GlanceUpdateImageRequestBody> body = null;

    public GlanceUpdateImageRequest withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public GlanceUpdateImageRequest withBody(List<GlanceUpdateImageRequestBody> body) {
        this.body = body;
        return this;
    }

    public GlanceUpdateImageRequest addBodyItem(GlanceUpdateImageRequestBody bodyItem) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        this.body.add(bodyItem);
        return this;
    }

    public GlanceUpdateImageRequest withBody(Consumer<List<GlanceUpdateImageRequestBody>> bodySetter) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        bodySetter.accept(this.body);
        return this;
    }

    public List<GlanceUpdateImageRequestBody> getBody() {
        return body;
    }

    public void setBody(List<GlanceUpdateImageRequestBody> body) {
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
        GlanceUpdateImageRequest glanceUpdateImageRequest = (GlanceUpdateImageRequest) o;
        return Objects.equals(this.imageId, glanceUpdateImageRequest.imageId)
            && Objects.equals(this.body, glanceUpdateImageRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlanceUpdateImageRequest {\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
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
