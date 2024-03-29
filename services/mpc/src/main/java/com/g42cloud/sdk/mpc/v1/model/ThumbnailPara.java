package com.g42cloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ThumbnailPara
 */
public class ThumbnailPara {

    public static final class TypeEnum {

        /**
         * Enum TIME for value: "TIME"
         */
        public static final TypeEnum TIME = new TypeEnum("TIME");

        /**
         * Enum DOTS for value: "DOTS"
         */
        public static final TypeEnum DOTS = new TypeEnum("DOTS");

        /**
         * Enum DOTS_MS for value: "DOTS_MS"
         */
        public static final TypeEnum DOTS_MS = new TypeEnum("DOTS_MS");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("TIME", TIME);
            map.put("DOTS", DOTS);
            map.put("DOTS_MS", DOTS_MS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private Integer time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Integer startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dots")

    private List<Integer> dots = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dots_ms")

    private List<Integer> dotsMs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_filename")

    private String outputFilename;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private Integer format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private Integer width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private Integer height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_length")

    private Integer maxLength;

    public ThumbnailPara withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ThumbnailPara withTime(Integer time) {
        this.time = time;
        return this;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public ThumbnailPara withStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public ThumbnailPara withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public ThumbnailPara withDots(List<Integer> dots) {
        this.dots = dots;
        return this;
    }

    public ThumbnailPara addDotsItem(Integer dotsItem) {
        if (this.dots == null) {
            this.dots = new ArrayList<>();
        }
        this.dots.add(dotsItem);
        return this;
    }

    public ThumbnailPara withDots(Consumer<List<Integer>> dotsSetter) {
        if (this.dots == null) {
            this.dots = new ArrayList<>();
        }
        dotsSetter.accept(this.dots);
        return this;
    }

    public List<Integer> getDots() {
        return dots;
    }

    public void setDots(List<Integer> dots) {
        this.dots = dots;
    }

    public ThumbnailPara withDotsMs(List<Integer> dotsMs) {
        this.dotsMs = dotsMs;
        return this;
    }

    public ThumbnailPara addDotsMsItem(Integer dotsMsItem) {
        if (this.dotsMs == null) {
            this.dotsMs = new ArrayList<>();
        }
        this.dotsMs.add(dotsMsItem);
        return this;
    }

    public ThumbnailPara withDotsMs(Consumer<List<Integer>> dotsMsSetter) {
        if (this.dotsMs == null) {
            this.dotsMs = new ArrayList<>();
        }
        dotsMsSetter.accept(this.dotsMs);
        return this;
    }

    public List<Integer> getDotsMs() {
        return dotsMs;
    }

    public void setDotsMs(List<Integer> dotsMs) {
        this.dotsMs = dotsMs;
    }

    public ThumbnailPara withOutputFilename(String outputFilename) {
        this.outputFilename = outputFilename;
        return this;
    }

    public String getOutputFilename() {
        return outputFilename;
    }

    public void setOutputFilename(String outputFilename) {
        this.outputFilename = outputFilename;
    }

    public ThumbnailPara withFormat(Integer format) {
        this.format = format;
        return this;
    }

    public Integer getFormat() {
        return format;
    }

    public void setFormat(Integer format) {
        this.format = format;
    }

    public ThumbnailPara withWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public ThumbnailPara withHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public ThumbnailPara withMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ThumbnailPara that = (ThumbnailPara) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.time, that.time)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.dots, that.dots) && Objects.equals(this.dotsMs, that.dotsMs)
            && Objects.equals(this.outputFilename, that.outputFilename) && Objects.equals(this.format, that.format)
            && Objects.equals(this.width, that.width) && Objects.equals(this.height, that.height)
            && Objects.equals(this.maxLength, that.maxLength);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(type, time, startTime, duration, dots, dotsMs, outputFilename, format, width, height, maxLength);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThumbnailPara {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    dots: ").append(toIndentedString(dots)).append("\n");
        sb.append("    dotsMs: ").append(toIndentedString(dotsMs)).append("\n");
        sb.append("    outputFilename: ").append(toIndentedString(outputFilename)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
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
