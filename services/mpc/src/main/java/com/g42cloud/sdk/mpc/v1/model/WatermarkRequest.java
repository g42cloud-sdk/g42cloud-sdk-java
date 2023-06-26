package com.g42cloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * WatermarkRequest
 */
public class WatermarkRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private ObsObjInfo input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_context")

    private String textContext;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_watermark")

    private ImageWatermark imageWatermark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_watermark")

    private TextWatermark textWatermark;

    public WatermarkRequest withInput(ObsObjInfo input) {
        this.input = input;
        return this;
    }

    public WatermarkRequest withInput(Consumer<ObsObjInfo> inputSetter) {
        if (this.input == null) {
            this.input = new ObsObjInfo();
            inputSetter.accept(this.input);
        }

        return this;
    }

    public ObsObjInfo getInput() {
        return input;
    }

    public void setInput(ObsObjInfo input) {
        this.input = input;
    }

    public WatermarkRequest withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public WatermarkRequest withTextContext(String textContext) {
        this.textContext = textContext;
        return this;
    }

    public String getTextContext() {
        return textContext;
    }

    public void setTextContext(String textContext) {
        this.textContext = textContext;
    }

    public WatermarkRequest withImageWatermark(ImageWatermark imageWatermark) {
        this.imageWatermark = imageWatermark;
        return this;
    }

    public WatermarkRequest withImageWatermark(Consumer<ImageWatermark> imageWatermarkSetter) {
        if (this.imageWatermark == null) {
            this.imageWatermark = new ImageWatermark();
            imageWatermarkSetter.accept(this.imageWatermark);
        }

        return this;
    }

    public ImageWatermark getImageWatermark() {
        return imageWatermark;
    }

    public void setImageWatermark(ImageWatermark imageWatermark) {
        this.imageWatermark = imageWatermark;
    }

    public WatermarkRequest withTextWatermark(TextWatermark textWatermark) {
        this.textWatermark = textWatermark;
        return this;
    }

    public WatermarkRequest withTextWatermark(Consumer<TextWatermark> textWatermarkSetter) {
        if (this.textWatermark == null) {
            this.textWatermark = new TextWatermark();
            textWatermarkSetter.accept(this.textWatermark);
        }

        return this;
    }

    public TextWatermark getTextWatermark() {
        return textWatermark;
    }

    public void setTextWatermark(TextWatermark textWatermark) {
        this.textWatermark = textWatermark;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WatermarkRequest watermarkRequest = (WatermarkRequest) o;
        return Objects.equals(this.input, watermarkRequest.input)
            && Objects.equals(this.templateId, watermarkRequest.templateId)
            && Objects.equals(this.textContext, watermarkRequest.textContext)
            && Objects.equals(this.imageWatermark, watermarkRequest.imageWatermark)
            && Objects.equals(this.textWatermark, watermarkRequest.textWatermark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(input, templateId, textContext, imageWatermark, textWatermark);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WatermarkRequest {\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    textContext: ").append(toIndentedString(textContext)).append("\n");
        sb.append("    imageWatermark: ").append(toIndentedString(imageWatermark)).append("\n");
        sb.append("    textWatermark: ").append(toIndentedString(textWatermark)).append("\n");
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
