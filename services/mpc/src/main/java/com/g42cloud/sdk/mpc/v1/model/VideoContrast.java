package com.g42cloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VideoContrast
 */
public class VideoContrast {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_order")

    private Integer executionOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contrast")

    private String contrast;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "brightness")

    private String brightness;

    public VideoContrast withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VideoContrast withExecutionOrder(Integer executionOrder) {
        this.executionOrder = executionOrder;
        return this;
    }

    public Integer getExecutionOrder() {
        return executionOrder;
    }

    public void setExecutionOrder(Integer executionOrder) {
        this.executionOrder = executionOrder;
    }

    public VideoContrast withContrast(String contrast) {
        this.contrast = contrast;
        return this;
    }

    public String getContrast() {
        return contrast;
    }

    public void setContrast(String contrast) {
        this.contrast = contrast;
    }

    public VideoContrast withBrightness(String brightness) {
        this.brightness = brightness;
        return this;
    }

    public String getBrightness() {
        return brightness;
    }

    public void setBrightness(String brightness) {
        this.brightness = brightness;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VideoContrast that = (VideoContrast) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.executionOrder, that.executionOrder)
            && Objects.equals(this.contrast, that.contrast) && Objects.equals(this.brightness, that.brightness);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, executionOrder, contrast, brightness);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoContrast {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    executionOrder: ").append(toIndentedString(executionOrder)).append("\n");
        sb.append("    contrast: ").append(toIndentedString(contrast)).append("\n");
        sb.append("    brightness: ").append(toIndentedString(brightness)).append("\n");
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
