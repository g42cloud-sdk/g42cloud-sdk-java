package com.g42cloud.sdk.ims.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * resource字段数据结构说明
 */
public class ShowImageByTagsResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_detail")

    private QueryImageByTagsResourceDetail resourceDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagKeyValue> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    public ShowImageByTagsResource withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ShowImageByTagsResource withResourceDetail(QueryImageByTagsResourceDetail resourceDetail) {
        this.resourceDetail = resourceDetail;
        return this;
    }

    public ShowImageByTagsResource withResourceDetail(Consumer<QueryImageByTagsResourceDetail> resourceDetailSetter) {
        if (this.resourceDetail == null) {
            this.resourceDetail = new QueryImageByTagsResourceDetail();
            resourceDetailSetter.accept(this.resourceDetail);
        }

        return this;
    }

    public QueryImageByTagsResourceDetail getResourceDetail() {
        return resourceDetail;
    }

    public void setResourceDetail(QueryImageByTagsResourceDetail resourceDetail) {
        this.resourceDetail = resourceDetail;
    }

    public ShowImageByTagsResource withTags(List<TagKeyValue> tags) {
        this.tags = tags;
        return this;
    }

    public ShowImageByTagsResource addTagsItem(TagKeyValue tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ShowImageByTagsResource withTags(Consumer<List<TagKeyValue>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    public List<TagKeyValue> getTags() {
        return tags;
    }

    public void setTags(List<TagKeyValue> tags) {
        this.tags = tags;
    }

    public ShowImageByTagsResource withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowImageByTagsResource that = (ShowImageByTagsResource) obj;
        return Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.resourceDetail, that.resourceDetail) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.resourceName, that.resourceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, resourceDetail, tags, resourceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowImageByTagsResource {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceDetail: ").append(toIndentedString(resourceDetail)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
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
