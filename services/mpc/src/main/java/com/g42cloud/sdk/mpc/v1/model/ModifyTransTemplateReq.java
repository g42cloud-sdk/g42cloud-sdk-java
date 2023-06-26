package com.g42cloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ModifyTransTemplateReq
 */
public class ModifyTransTemplateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private Long templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video")

    private Video video;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio")

    private Audio audio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "common")

    private Common common;

    public ModifyTransTemplateReq withTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }

    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public ModifyTransTemplateReq withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public ModifyTransTemplateReq withVideo(Video video) {
        this.video = video;
        return this;
    }

    public ModifyTransTemplateReq withVideo(Consumer<Video> videoSetter) {
        if (this.video == null) {
            this.video = new Video();
            videoSetter.accept(this.video);
        }

        return this;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public ModifyTransTemplateReq withAudio(Audio audio) {
        this.audio = audio;
        return this;
    }

    public ModifyTransTemplateReq withAudio(Consumer<Audio> audioSetter) {
        if (this.audio == null) {
            this.audio = new Audio();
            audioSetter.accept(this.audio);
        }

        return this;
    }

    public Audio getAudio() {
        return audio;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public ModifyTransTemplateReq withCommon(Common common) {
        this.common = common;
        return this;
    }

    public ModifyTransTemplateReq withCommon(Consumer<Common> commonSetter) {
        if (this.common == null) {
            this.common = new Common();
            commonSetter.accept(this.common);
        }

        return this;
    }

    public Common getCommon() {
        return common;
    }

    public void setCommon(Common common) {
        this.common = common;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModifyTransTemplateReq modifyTransTemplateReq = (ModifyTransTemplateReq) o;
        return Objects.equals(this.templateId, modifyTransTemplateReq.templateId)
            && Objects.equals(this.templateName, modifyTransTemplateReq.templateName)
            && Objects.equals(this.video, modifyTransTemplateReq.video)
            && Objects.equals(this.audio, modifyTransTemplateReq.audio)
            && Objects.equals(this.common, modifyTransTemplateReq.common);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateId, templateName, video, audio, common);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyTransTemplateReq {\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    video: ").append(toIndentedString(video)).append("\n");
        sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
        sb.append("    common: ").append(toIndentedString(common)).append("\n");
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
