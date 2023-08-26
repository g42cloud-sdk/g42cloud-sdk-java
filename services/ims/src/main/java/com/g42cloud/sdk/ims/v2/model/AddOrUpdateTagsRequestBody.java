package com.g42cloud.sdk.ims.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 请求参数
 */
public class AddOrUpdateTagsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_tag")

    private ResourceTag imageTag;

    public AddOrUpdateTagsRequestBody withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public AddOrUpdateTagsRequestBody withTag(String tag) {
        this.tag = tag;
        return this;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public AddOrUpdateTagsRequestBody withImageTag(ResourceTag imageTag) {
        this.imageTag = imageTag;
        return this;
    }

    public AddOrUpdateTagsRequestBody withImageTag(Consumer<ResourceTag> imageTagSetter) {
        if (this.imageTag == null) {
            this.imageTag = new ResourceTag();
            imageTagSetter.accept(this.imageTag);
        }

        return this;
    }

    public ResourceTag getImageTag() {
        return imageTag;
    }

    public void setImageTag(ResourceTag imageTag) {
        this.imageTag = imageTag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddOrUpdateTagsRequestBody that = (AddOrUpdateTagsRequestBody) obj;
        return Objects.equals(this.imageId, that.imageId) && Objects.equals(this.tag, that.tag)
            && Objects.equals(this.imageTag, that.imageTag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageId, tag, imageTag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddOrUpdateTagsRequestBody {\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    imageTag: ").append(toIndentedString(imageTag)).append("\n");
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
