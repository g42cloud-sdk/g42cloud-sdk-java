package com.g42cloud.sdk.ims.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ExportImageRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ExportImageRequestBody body;

    public ExportImageRequest withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public ExportImageRequest withBody(ExportImageRequestBody body) {
        this.body = body;
        return this;
    }

    public ExportImageRequest withBody(Consumer<ExportImageRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ExportImageRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public ExportImageRequestBody getBody() {
        return body;
    }

    public void setBody(ExportImageRequestBody body) {
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
        ExportImageRequest exportImageRequest = (ExportImageRequest) o;
        return Objects.equals(this.imageId, exportImageRequest.imageId)
            && Objects.equals(this.body, exportImageRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportImageRequest {\n");
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
