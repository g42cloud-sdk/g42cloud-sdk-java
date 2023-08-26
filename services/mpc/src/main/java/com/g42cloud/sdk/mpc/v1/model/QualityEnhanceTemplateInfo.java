package com.g42cloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * QualityEnhanceTemplateInfo
 */
public class QualityEnhanceTemplateInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private Integer templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template")

    private QualityEnhanceTemplate template;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private XCodeError error;

    public QualityEnhanceTemplateInfo withTemplateId(Integer templateId) {
        this.templateId = templateId;
        return this;
    }

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public QualityEnhanceTemplateInfo withTemplate(QualityEnhanceTemplate template) {
        this.template = template;
        return this;
    }

    public QualityEnhanceTemplateInfo withTemplate(Consumer<QualityEnhanceTemplate> templateSetter) {
        if (this.template == null) {
            this.template = new QualityEnhanceTemplate();
            templateSetter.accept(this.template);
        }

        return this;
    }

    public QualityEnhanceTemplate getTemplate() {
        return template;
    }

    public void setTemplate(QualityEnhanceTemplate template) {
        this.template = template;
    }

    public QualityEnhanceTemplateInfo withError(XCodeError error) {
        this.error = error;
        return this;
    }

    public QualityEnhanceTemplateInfo withError(Consumer<XCodeError> errorSetter) {
        if (this.error == null) {
            this.error = new XCodeError();
            errorSetter.accept(this.error);
        }

        return this;
    }

    public XCodeError getError() {
        return error;
    }

    public void setError(XCodeError error) {
        this.error = error;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QualityEnhanceTemplateInfo that = (QualityEnhanceTemplateInfo) obj;
        return Objects.equals(this.templateId, that.templateId) && Objects.equals(this.template, that.template)
            && Objects.equals(this.error, that.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateId, template, error);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QualityEnhanceTemplateInfo {\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
