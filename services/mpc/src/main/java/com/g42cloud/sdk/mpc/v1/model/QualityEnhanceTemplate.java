package com.g42cloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * QualityEnhanceTemplate
 */
public class QualityEnhanceTemplate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_description")

    private String templateDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video")

    private QualityEnhanceVideo video;

    public QualityEnhanceTemplate withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public QualityEnhanceTemplate withTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
        return this;
    }

    public String getTemplateDescription() {
        return templateDescription;
    }

    public void setTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
    }

    public QualityEnhanceTemplate withVideo(QualityEnhanceVideo video) {
        this.video = video;
        return this;
    }

    public QualityEnhanceTemplate withVideo(Consumer<QualityEnhanceVideo> videoSetter) {
        if (this.video == null) {
            this.video = new QualityEnhanceVideo();
            videoSetter.accept(this.video);
        }

        return this;
    }

    public QualityEnhanceVideo getVideo() {
        return video;
    }

    public void setVideo(QualityEnhanceVideo video) {
        this.video = video;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QualityEnhanceTemplate qualityEnhanceTemplate = (QualityEnhanceTemplate) o;
        return Objects.equals(this.templateName, qualityEnhanceTemplate.templateName)
            && Objects.equals(this.templateDescription, qualityEnhanceTemplate.templateDescription)
            && Objects.equals(this.video, qualityEnhanceTemplate.video);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateName, templateDescription, video);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QualityEnhanceTemplate {\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    templateDescription: ").append(toIndentedString(templateDescription)).append("\n");
        sb.append("    video: ").append(toIndentedString(video)).append("\n");
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
