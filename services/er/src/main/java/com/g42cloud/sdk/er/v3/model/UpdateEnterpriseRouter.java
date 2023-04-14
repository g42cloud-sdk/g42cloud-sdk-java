package com.g42cloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更新企业路由器请求体
 */
public class UpdateEnterpriseRouter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_default_propagation")

    private Boolean enableDefaultPropagation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_default_association")

    private Boolean enableDefaultAssociation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_propagation_route_table_id")

    private String defaultPropagationRouteTableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_association_route_table_id")

    private String defaultAssociationRouteTableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_accept_shared_attachments")

    private Boolean autoAcceptSharedAttachments;

    public UpdateEnterpriseRouter withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateEnterpriseRouter withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateEnterpriseRouter withEnableDefaultPropagation(Boolean enableDefaultPropagation) {
        this.enableDefaultPropagation = enableDefaultPropagation;
        return this;
    }

    public Boolean getEnableDefaultPropagation() {
        return enableDefaultPropagation;
    }

    public void setEnableDefaultPropagation(Boolean enableDefaultPropagation) {
        this.enableDefaultPropagation = enableDefaultPropagation;
    }

    public UpdateEnterpriseRouter withEnableDefaultAssociation(Boolean enableDefaultAssociation) {
        this.enableDefaultAssociation = enableDefaultAssociation;
        return this;
    }

    public Boolean getEnableDefaultAssociation() {
        return enableDefaultAssociation;
    }

    public void setEnableDefaultAssociation(Boolean enableDefaultAssociation) {
        this.enableDefaultAssociation = enableDefaultAssociation;
    }

    public UpdateEnterpriseRouter withDefaultPropagationRouteTableId(String defaultPropagationRouteTableId) {
        this.defaultPropagationRouteTableId = defaultPropagationRouteTableId;
        return this;
    }

    public String getDefaultPropagationRouteTableId() {
        return defaultPropagationRouteTableId;
    }

    public void setDefaultPropagationRouteTableId(String defaultPropagationRouteTableId) {
        this.defaultPropagationRouteTableId = defaultPropagationRouteTableId;
    }

    public UpdateEnterpriseRouter withDefaultAssociationRouteTableId(String defaultAssociationRouteTableId) {
        this.defaultAssociationRouteTableId = defaultAssociationRouteTableId;
        return this;
    }

    public String getDefaultAssociationRouteTableId() {
        return defaultAssociationRouteTableId;
    }

    public void setDefaultAssociationRouteTableId(String defaultAssociationRouteTableId) {
        this.defaultAssociationRouteTableId = defaultAssociationRouteTableId;
    }

    public UpdateEnterpriseRouter withAutoAcceptSharedAttachments(Boolean autoAcceptSharedAttachments) {
        this.autoAcceptSharedAttachments = autoAcceptSharedAttachments;
        return this;
    }

    public Boolean getAutoAcceptSharedAttachments() {
        return autoAcceptSharedAttachments;
    }

    public void setAutoAcceptSharedAttachments(Boolean autoAcceptSharedAttachments) {
        this.autoAcceptSharedAttachments = autoAcceptSharedAttachments;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateEnterpriseRouter updateEnterpriseRouter = (UpdateEnterpriseRouter) o;
        return Objects.equals(this.name, updateEnterpriseRouter.name)
            && Objects.equals(this.description, updateEnterpriseRouter.description)
            && Objects.equals(this.enableDefaultPropagation, updateEnterpriseRouter.enableDefaultPropagation)
            && Objects.equals(this.enableDefaultAssociation, updateEnterpriseRouter.enableDefaultAssociation)
            && Objects.equals(this.defaultPropagationRouteTableId,
                updateEnterpriseRouter.defaultPropagationRouteTableId)
            && Objects.equals(this.defaultAssociationRouteTableId,
                updateEnterpriseRouter.defaultAssociationRouteTableId)
            && Objects.equals(this.autoAcceptSharedAttachments, updateEnterpriseRouter.autoAcceptSharedAttachments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            enableDefaultPropagation,
            enableDefaultAssociation,
            defaultPropagationRouteTableId,
            defaultAssociationRouteTableId,
            autoAcceptSharedAttachments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEnterpriseRouter {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enableDefaultPropagation: ").append(toIndentedString(enableDefaultPropagation)).append("\n");
        sb.append("    enableDefaultAssociation: ").append(toIndentedString(enableDefaultAssociation)).append("\n");
        sb.append("    defaultPropagationRouteTableId: ")
            .append(toIndentedString(defaultPropagationRouteTableId))
            .append("\n");
        sb.append("    defaultAssociationRouteTableId: ")
            .append(toIndentedString(defaultAssociationRouteTableId))
            .append("\n");
        sb.append("    autoAcceptSharedAttachments: ")
            .append(toIndentedString(autoAcceptSharedAttachments))
            .append("\n");
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
