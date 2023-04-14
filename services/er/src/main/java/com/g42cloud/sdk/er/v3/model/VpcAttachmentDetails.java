package com.g42cloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * VPC类型连接
 */
public class VpcAttachmentDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virsubnet_id")

    private String virsubnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_create_vpc_routes")

    private Boolean autoCreateVpcRoutes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_project_id")

    private String vpcProjectId;

    public VpcAttachmentDetails withId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VpcAttachmentDetails withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VpcAttachmentDetails withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public VpcAttachmentDetails withVirsubnetId(String virsubnetId) {
        this.virsubnetId = virsubnetId;
        return this;
    }

    public String getVirsubnetId() {
        return virsubnetId;
    }

    public void setVirsubnetId(String virsubnetId) {
        this.virsubnetId = virsubnetId;
    }

    public VpcAttachmentDetails withAutoCreateVpcRoutes(Boolean autoCreateVpcRoutes) {
        this.autoCreateVpcRoutes = autoCreateVpcRoutes;
        return this;
    }

    public Boolean getAutoCreateVpcRoutes() {
        return autoCreateVpcRoutes;
    }

    public void setAutoCreateVpcRoutes(Boolean autoCreateVpcRoutes) {
        this.autoCreateVpcRoutes = autoCreateVpcRoutes;
    }

    public VpcAttachmentDetails withState(String state) {
        this.state = state;
        return this;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public VpcAttachmentDetails withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public VpcAttachmentDetails withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public VpcAttachmentDetails withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public VpcAttachmentDetails addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public VpcAttachmentDetails withTags(Consumer<List<Tag>> tagsSetter) {
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

    public VpcAttachmentDetails withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VpcAttachmentDetails withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public VpcAttachmentDetails withVpcProjectId(String vpcProjectId) {
        this.vpcProjectId = vpcProjectId;
        return this;
    }

    public String getVpcProjectId() {
        return vpcProjectId;
    }

    public void setVpcProjectId(String vpcProjectId) {
        this.vpcProjectId = vpcProjectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VpcAttachmentDetails vpcAttachmentDetails = (VpcAttachmentDetails) o;
        return Objects.equals(this.id, vpcAttachmentDetails.id) && Objects.equals(this.name, vpcAttachmentDetails.name)
            && Objects.equals(this.vpcId, vpcAttachmentDetails.vpcId)
            && Objects.equals(this.virsubnetId, vpcAttachmentDetails.virsubnetId)
            && Objects.equals(this.autoCreateVpcRoutes, vpcAttachmentDetails.autoCreateVpcRoutes)
            && Objects.equals(this.state, vpcAttachmentDetails.state)
            && Objects.equals(this.createdAt, vpcAttachmentDetails.createdAt)
            && Objects.equals(this.updatedAt, vpcAttachmentDetails.updatedAt)
            && Objects.equals(this.tags, vpcAttachmentDetails.tags)
            && Objects.equals(this.description, vpcAttachmentDetails.description)
            && Objects.equals(this.projectId, vpcAttachmentDetails.projectId)
            && Objects.equals(this.vpcProjectId, vpcAttachmentDetails.vpcProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            vpcId,
            virsubnetId,
            autoCreateVpcRoutes,
            state,
            createdAt,
            updatedAt,
            tags,
            description,
            projectId,
            vpcProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VpcAttachmentDetails {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    virsubnetId: ").append(toIndentedString(virsubnetId)).append("\n");
        sb.append("    autoCreateVpcRoutes: ").append(toIndentedString(autoCreateVpcRoutes)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    vpcProjectId: ").append(toIndentedString(vpcProjectId)).append("\n");
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
