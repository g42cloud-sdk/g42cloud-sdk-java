package com.g42cloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ImageWatermarkSetting
 */
public class ImageWatermarkSetting {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dx")

    private String dx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dy")

    private String dy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "referpos")

    private String referpos;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeline_start")

    private String timelineStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeline_duration")

    private String timelineDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overlay_input")

    private String overlayInput;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private ObsObjInfo input;

    public static final class BaseEnum {

        /**
         * Enum INPUT for value: "input"
         */
        public static final BaseEnum INPUT = new BaseEnum("input");

        /**
         * Enum OUTPUT for value: "output"
         */
        public static final BaseEnum OUTPUT = new BaseEnum("output");

        private static final Map<String, BaseEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BaseEnum> createStaticFields() {
            Map<String, BaseEnum> map = new HashMap<>();
            map.put("input", INPUT);
            map.put("output", OUTPUT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BaseEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static BaseEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            BaseEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new BaseEnum(value);
            }
            return result;
        }

        public static BaseEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            BaseEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BaseEnum) {
                return this.value.equals(((BaseEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base")

    private BaseEnum base;

    public ImageWatermarkSetting withDx(String dx) {
        this.dx = dx;
        return this;
    }

    public String getDx() {
        return dx;
    }

    public void setDx(String dx) {
        this.dx = dx;
    }

    public ImageWatermarkSetting withDy(String dy) {
        this.dy = dy;
        return this;
    }

    public String getDy() {
        return dy;
    }

    public void setDy(String dy) {
        this.dy = dy;
    }

    public ImageWatermarkSetting withReferpos(String referpos) {
        this.referpos = referpos;
        return this;
    }

    public String getReferpos() {
        return referpos;
    }

    public void setReferpos(String referpos) {
        this.referpos = referpos;
    }

    public ImageWatermarkSetting withTimelineStart(String timelineStart) {
        this.timelineStart = timelineStart;
        return this;
    }

    public String getTimelineStart() {
        return timelineStart;
    }

    public void setTimelineStart(String timelineStart) {
        this.timelineStart = timelineStart;
    }

    public ImageWatermarkSetting withTimelineDuration(String timelineDuration) {
        this.timelineDuration = timelineDuration;
        return this;
    }

    public String getTimelineDuration() {
        return timelineDuration;
    }

    public void setTimelineDuration(String timelineDuration) {
        this.timelineDuration = timelineDuration;
    }

    public ImageWatermarkSetting withOverlayInput(String overlayInput) {
        this.overlayInput = overlayInput;
        return this;
    }

    public String getOverlayInput() {
        return overlayInput;
    }

    public void setOverlayInput(String overlayInput) {
        this.overlayInput = overlayInput;
    }

    public ImageWatermarkSetting withInput(ObsObjInfo input) {
        this.input = input;
        return this;
    }

    public ImageWatermarkSetting withInput(Consumer<ObsObjInfo> inputSetter) {
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

    public ImageWatermarkSetting withBase(BaseEnum base) {
        this.base = base;
        return this;
    }

    public BaseEnum getBase() {
        return base;
    }

    public void setBase(BaseEnum base) {
        this.base = base;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageWatermarkSetting imageWatermarkSetting = (ImageWatermarkSetting) o;
        return Objects.equals(this.dx, imageWatermarkSetting.dx) && Objects.equals(this.dy, imageWatermarkSetting.dy)
            && Objects.equals(this.referpos, imageWatermarkSetting.referpos)
            && Objects.equals(this.timelineStart, imageWatermarkSetting.timelineStart)
            && Objects.equals(this.timelineDuration, imageWatermarkSetting.timelineDuration)
            && Objects.equals(this.overlayInput, imageWatermarkSetting.overlayInput)
            && Objects.equals(this.input, imageWatermarkSetting.input)
            && Objects.equals(this.base, imageWatermarkSetting.base);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dx, dy, referpos, timelineStart, timelineDuration, overlayInput, input, base);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageWatermarkSetting {\n");
        sb.append("    dx: ").append(toIndentedString(dx)).append("\n");
        sb.append("    dy: ").append(toIndentedString(dy)).append("\n");
        sb.append("    referpos: ").append(toIndentedString(referpos)).append("\n");
        sb.append("    timelineStart: ").append(toIndentedString(timelineStart)).append("\n");
        sb.append("    timelineDuration: ").append(toIndentedString(timelineDuration)).append("\n");
        sb.append("    overlayInput: ").append(toIndentedString(overlayInput)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    base: ").append(toIndentedString(base)).append("\n");
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