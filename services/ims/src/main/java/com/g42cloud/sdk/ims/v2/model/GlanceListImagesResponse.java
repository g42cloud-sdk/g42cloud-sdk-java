package com.g42cloud.sdk.ims.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class GlanceListImagesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first")

    private String first;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "images")

    private List<GlanceShowImageResponseBody> images = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private String schema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next")

    private String next;

    public GlanceListImagesResponse withFirst(String first) {
        this.first = first;
        return this;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public GlanceListImagesResponse withImages(List<GlanceShowImageResponseBody> images) {
        this.images = images;
        return this;
    }

    public GlanceListImagesResponse addImagesItem(GlanceShowImageResponseBody imagesItem) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(imagesItem);
        return this;
    }

    public GlanceListImagesResponse withImages(Consumer<List<GlanceShowImageResponseBody>> imagesSetter) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        imagesSetter.accept(this.images);
        return this;
    }

    public List<GlanceShowImageResponseBody> getImages() {
        return images;
    }

    public void setImages(List<GlanceShowImageResponseBody> images) {
        this.images = images;
    }

    public GlanceListImagesResponse withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public GlanceListImagesResponse withNext(String next) {
        this.next = next;
        return this;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GlanceListImagesResponse glanceListImagesResponse = (GlanceListImagesResponse) o;
        return Objects.equals(this.first, glanceListImagesResponse.first)
            && Objects.equals(this.images, glanceListImagesResponse.images)
            && Objects.equals(this.schema, glanceListImagesResponse.schema)
            && Objects.equals(this.next, glanceListImagesResponse.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, images, schema, next);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlanceListImagesResponse {\n");
        sb.append("    first: ").append(toIndentedString(first)).append("\n");
        sb.append("    images: ").append(toIndentedString(images)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    next: ").append(toIndentedString(next)).append("\n");
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
