package com.g42cloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改自定义告警模板，请求参数
 */
public class UpdateAlarmTemplateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_description")

    private String templateDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension_name")

    private String dimensionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_items")

    private List<TemplateItem> templateItems = null;

    public UpdateAlarmTemplateRequestBody withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public UpdateAlarmTemplateRequestBody withTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
        return this;
    }

    public String getTemplateDescription() {
        return templateDescription;
    }

    public void setTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
    }

    public UpdateAlarmTemplateRequestBody withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public UpdateAlarmTemplateRequestBody withDimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
        return this;
    }

    public String getDimensionName() {
        return dimensionName;
    }

    public void setDimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
    }

    public UpdateAlarmTemplateRequestBody withTemplateItems(List<TemplateItem> templateItems) {
        this.templateItems = templateItems;
        return this;
    }

    public UpdateAlarmTemplateRequestBody addTemplateItemsItem(TemplateItem templateItemsItem) {
        if (this.templateItems == null) {
            this.templateItems = new ArrayList<>();
        }
        this.templateItems.add(templateItemsItem);
        return this;
    }

    public UpdateAlarmTemplateRequestBody withTemplateItems(Consumer<List<TemplateItem>> templateItemsSetter) {
        if (this.templateItems == null) {
            this.templateItems = new ArrayList<>();
        }
        templateItemsSetter.accept(this.templateItems);
        return this;
    }

    public List<TemplateItem> getTemplateItems() {
        return templateItems;
    }

    public void setTemplateItems(List<TemplateItem> templateItems) {
        this.templateItems = templateItems;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateAlarmTemplateRequestBody updateAlarmTemplateRequestBody = (UpdateAlarmTemplateRequestBody) o;
        return Objects.equals(this.templateName, updateAlarmTemplateRequestBody.templateName)
            && Objects.equals(this.templateDescription, updateAlarmTemplateRequestBody.templateDescription)
            && Objects.equals(this.namespace, updateAlarmTemplateRequestBody.namespace)
            && Objects.equals(this.dimensionName, updateAlarmTemplateRequestBody.dimensionName)
            && Objects.equals(this.templateItems, updateAlarmTemplateRequestBody.templateItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateName, templateDescription, namespace, dimensionName, templateItems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAlarmTemplateRequestBody {\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    templateDescription: ").append(toIndentedString(templateDescription)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    dimensionName: ").append(toIndentedString(dimensionName)).append("\n");
        sb.append("    templateItems: ").append(toIndentedString(templateItems)).append("\n");
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
