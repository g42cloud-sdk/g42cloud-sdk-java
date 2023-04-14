package com.g42cloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 路由表
 */
public class RouteTable {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_default_association")

    private Boolean isDefaultAssociation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_default_propagation")

    private Boolean isDefaultPropagation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    public RouteTable withId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RouteTable withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RouteTable withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RouteTable withIsDefaultAssociation(Boolean isDefaultAssociation) {
        this.isDefaultAssociation = isDefaultAssociation;
        return this;
    }

    public Boolean getIsDefaultAssociation() {
        return isDefaultAssociation;
    }

    public void setIsDefaultAssociation(Boolean isDefaultAssociation) {
        this.isDefaultAssociation = isDefaultAssociation;
    }

    public RouteTable withIsDefaultPropagation(Boolean isDefaultPropagation) {
        this.isDefaultPropagation = isDefaultPropagation;
        return this;
    }

    public Boolean getIsDefaultPropagation() {
        return isDefaultPropagation;
    }

    public void setIsDefaultPropagation(Boolean isDefaultPropagation) {
        this.isDefaultPropagation = isDefaultPropagation;
    }

    public RouteTable withState(String state) {
        this.state = state;
        return this;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public RouteTable withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public RouteTable addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public RouteTable withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public RouteTable withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public RouteTable withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RouteTable routeTable = (RouteTable) o;
        return Objects.equals(this.id, routeTable.id) && Objects.equals(this.name, routeTable.name)
            && Objects.equals(this.description, routeTable.description)
            && Objects.equals(this.isDefaultAssociation, routeTable.isDefaultAssociation)
            && Objects.equals(this.isDefaultPropagation, routeTable.isDefaultPropagation)
            && Objects.equals(this.state, routeTable.state) && Objects.equals(this.tags, routeTable.tags)
            && Objects.equals(this.createdAt, routeTable.createdAt)
            && Objects.equals(this.updatedAt, routeTable.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, name, description, isDefaultAssociation, isDefaultPropagation, state, tags, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RouteTable {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    isDefaultAssociation: ").append(toIndentedString(isDefaultAssociation)).append("\n");
        sb.append("    isDefaultPropagation: ").append(toIndentedString(isDefaultPropagation)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
