package com.g42cloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PaneSetting
 */
public class PaneSetting {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pane_id")

    private String paneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x")

    private String x;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "y")

    private String y;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private String width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private String height;

    public PaneSetting withPaneId(String paneId) {
        this.paneId = paneId;
        return this;
    }

    public String getPaneId() {
        return paneId;
    }

    public void setPaneId(String paneId) {
        this.paneId = paneId;
    }

    public PaneSetting withX(String x) {
        this.x = x;
        return this;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public PaneSetting withY(String y) {
        this.y = y;
        return this;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public PaneSetting withWidth(String width) {
        this.width = width;
        return this;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public PaneSetting withHeight(String height) {
        this.height = height;
        return this;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaneSetting paneSetting = (PaneSetting) o;
        return Objects.equals(this.paneId, paneSetting.paneId) && Objects.equals(this.x, paneSetting.x)
            && Objects.equals(this.y, paneSetting.y) && Objects.equals(this.width, paneSetting.width)
            && Objects.equals(this.height, paneSetting.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paneId, x, y, width, height);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaneSetting {\n");
        sb.append("    paneId: ").append(toIndentedString(paneId)).append("\n");
        sb.append("    x: ").append(toIndentedString(x)).append("\n");
        sb.append("    y: ").append(toIndentedString(y)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
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
