package com.g42cloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateResourceTagRequestBody
 */
public class CreateResourceTagRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private ResourceTag tag;

    public CreateResourceTagRequestBody withTag(ResourceTag tag) {
        this.tag = tag;
        return this;
    }

    public CreateResourceTagRequestBody withTag(Consumer<ResourceTag> tagSetter) {
        if (this.tag == null) {
            this.tag = new ResourceTag();
            tagSetter.accept(this.tag);
        }

        return this;
    }

    public ResourceTag getTag() {
        return tag;
    }

    public void setTag(ResourceTag tag) {
        this.tag = tag;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateResourceTagRequestBody createResourceTagRequestBody = (CreateResourceTagRequestBody) o;
        return Objects.equals(this.tag, createResourceTagRequestBody.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateResourceTagRequestBody {\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
