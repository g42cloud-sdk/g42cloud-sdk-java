package com.g42cloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * VideoProcess
 */
public class VideoProcess {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hls_init_count")

    private Integer hlsInitCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hls_init_interval")

    private Integer hlsInitInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rotate")

    private Integer rotate;

    public static final class AdaptationEnum {

        /**
         * Enum SHORT for value: "SHORT"
         */
        public static final AdaptationEnum SHORT = new AdaptationEnum("SHORT");

        /**
         * Enum LONG for value: "LONG"
         */
        public static final AdaptationEnum LONG = new AdaptationEnum("LONG");

        /**
         * Enum NONE for value: "NONE"
         */
        public static final AdaptationEnum NONE = new AdaptationEnum("NONE");

        private static final Map<String, AdaptationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AdaptationEnum> createStaticFields() {
            Map<String, AdaptationEnum> map = new HashMap<>();
            map.put("SHORT", SHORT);
            map.put("LONG", LONG);
            map.put("NONE", NONE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AdaptationEnum(String value) {
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
        public static AdaptationEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AdaptationEnum(value));
        }

        public static AdaptationEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AdaptationEnum) {
                return this.value.equals(((AdaptationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adaptation")

    private AdaptationEnum adaptation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upsample")

    private Integer upsample;

    public VideoProcess withHlsInitCount(Integer hlsInitCount) {
        this.hlsInitCount = hlsInitCount;
        return this;
    }

    public Integer getHlsInitCount() {
        return hlsInitCount;
    }

    public void setHlsInitCount(Integer hlsInitCount) {
        this.hlsInitCount = hlsInitCount;
    }

    public VideoProcess withHlsInitInterval(Integer hlsInitInterval) {
        this.hlsInitInterval = hlsInitInterval;
        return this;
    }

    public Integer getHlsInitInterval() {
        return hlsInitInterval;
    }

    public void setHlsInitInterval(Integer hlsInitInterval) {
        this.hlsInitInterval = hlsInitInterval;
    }

    public VideoProcess withRotate(Integer rotate) {
        this.rotate = rotate;
        return this;
    }

    public Integer getRotate() {
        return rotate;
    }

    public void setRotate(Integer rotate) {
        this.rotate = rotate;
    }

    public VideoProcess withAdaptation(AdaptationEnum adaptation) {
        this.adaptation = adaptation;
        return this;
    }

    public AdaptationEnum getAdaptation() {
        return adaptation;
    }

    public void setAdaptation(AdaptationEnum adaptation) {
        this.adaptation = adaptation;
    }

    public VideoProcess withUpsample(Integer upsample) {
        this.upsample = upsample;
        return this;
    }

    public Integer getUpsample() {
        return upsample;
    }

    public void setUpsample(Integer upsample) {
        this.upsample = upsample;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VideoProcess that = (VideoProcess) obj;
        return Objects.equals(this.hlsInitCount, that.hlsInitCount)
            && Objects.equals(this.hlsInitInterval, that.hlsInitInterval) && Objects.equals(this.rotate, that.rotate)
            && Objects.equals(this.adaptation, that.adaptation) && Objects.equals(this.upsample, that.upsample);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hlsInitCount, hlsInitInterval, rotate, adaptation, upsample);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoProcess {\n");
        sb.append("    hlsInitCount: ").append(toIndentedString(hlsInitCount)).append("\n");
        sb.append("    hlsInitInterval: ").append(toIndentedString(hlsInitInterval)).append("\n");
        sb.append("    rotate: ").append(toIndentedString(rotate)).append("\n");
        sb.append("    adaptation: ").append(toIndentedString(adaptation)).append("\n");
        sb.append("    upsample: ").append(toIndentedString(upsample)).append("\n");
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
