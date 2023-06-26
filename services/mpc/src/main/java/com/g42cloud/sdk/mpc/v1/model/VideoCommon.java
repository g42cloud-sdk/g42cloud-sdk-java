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
 * VideoCommon
 */
public class VideoCommon {

    public static final class OutputPolicyEnum {

        /**
         * Enum TRANSCODE for value: "transcode"
         */
        public static final OutputPolicyEnum TRANSCODE = new OutputPolicyEnum("transcode");

        /**
         * Enum DISCARD for value: "discard"
         */
        public static final OutputPolicyEnum DISCARD = new OutputPolicyEnum("discard");

        /**
         * Enum COPY for value: "copy"
         */
        public static final OutputPolicyEnum COPY = new OutputPolicyEnum("copy");

        private static final Map<String, OutputPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OutputPolicyEnum> createStaticFields() {
            Map<String, OutputPolicyEnum> map = new HashMap<>();
            map.put("transcode", TRANSCODE);
            map.put("discard", DISCARD);
            map.put("copy", COPY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OutputPolicyEnum(String value) {
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
        public static OutputPolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            OutputPolicyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OutputPolicyEnum(value);
            }
            return result;
        }

        public static OutputPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            OutputPolicyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OutputPolicyEnum) {
                return this.value.equals(((OutputPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_policy")

    private OutputPolicyEnum outputPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codec")

    private Integer codec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "profile")

    private Integer profile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private Integer level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preset")

    private Integer preset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_iframes_interval")

    private Integer maxIframesInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bframes_count")

    private Integer bframesCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frame_rate")

    private Integer frameRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "black_cut")

    private Integer blackCut;

    public VideoCommon withOutputPolicy(OutputPolicyEnum outputPolicy) {
        this.outputPolicy = outputPolicy;
        return this;
    }

    public OutputPolicyEnum getOutputPolicy() {
        return outputPolicy;
    }

    public void setOutputPolicy(OutputPolicyEnum outputPolicy) {
        this.outputPolicy = outputPolicy;
    }

    public VideoCommon withCodec(Integer codec) {
        this.codec = codec;
        return this;
    }

    public Integer getCodec() {
        return codec;
    }

    public void setCodec(Integer codec) {
        this.codec = codec;
    }

    public VideoCommon withProfile(Integer profile) {
        this.profile = profile;
        return this;
    }

    public Integer getProfile() {
        return profile;
    }

    public void setProfile(Integer profile) {
        this.profile = profile;
    }

    public VideoCommon withLevel(Integer level) {
        this.level = level;
        return this;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public VideoCommon withPreset(Integer preset) {
        this.preset = preset;
        return this;
    }

    public Integer getPreset() {
        return preset;
    }

    public void setPreset(Integer preset) {
        this.preset = preset;
    }

    public VideoCommon withMaxIframesInterval(Integer maxIframesInterval) {
        this.maxIframesInterval = maxIframesInterval;
        return this;
    }

    public Integer getMaxIframesInterval() {
        return maxIframesInterval;
    }

    public void setMaxIframesInterval(Integer maxIframesInterval) {
        this.maxIframesInterval = maxIframesInterval;
    }

    public VideoCommon withBframesCount(Integer bframesCount) {
        this.bframesCount = bframesCount;
        return this;
    }

    public Integer getBframesCount() {
        return bframesCount;
    }

    public void setBframesCount(Integer bframesCount) {
        this.bframesCount = bframesCount;
    }

    public VideoCommon withFrameRate(Integer frameRate) {
        this.frameRate = frameRate;
        return this;
    }

    public Integer getFrameRate() {
        return frameRate;
    }

    public void setFrameRate(Integer frameRate) {
        this.frameRate = frameRate;
    }

    public VideoCommon withBlackCut(Integer blackCut) {
        this.blackCut = blackCut;
        return this;
    }

    public Integer getBlackCut() {
        return blackCut;
    }

    public void setBlackCut(Integer blackCut) {
        this.blackCut = blackCut;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoCommon videoCommon = (VideoCommon) o;
        return Objects.equals(this.outputPolicy, videoCommon.outputPolicy)
            && Objects.equals(this.codec, videoCommon.codec) && Objects.equals(this.profile, videoCommon.profile)
            && Objects.equals(this.level, videoCommon.level) && Objects.equals(this.preset, videoCommon.preset)
            && Objects.equals(this.maxIframesInterval, videoCommon.maxIframesInterval)
            && Objects.equals(this.bframesCount, videoCommon.bframesCount)
            && Objects.equals(this.frameRate, videoCommon.frameRate)
            && Objects.equals(this.blackCut, videoCommon.blackCut);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(outputPolicy, codec, profile, level, preset, maxIframesInterval, bframesCount, frameRate, blackCut);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoCommon {\n");
        sb.append("    outputPolicy: ").append(toIndentedString(outputPolicy)).append("\n");
        sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
        sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    preset: ").append(toIndentedString(preset)).append("\n");
        sb.append("    maxIframesInterval: ").append(toIndentedString(maxIframesInterval)).append("\n");
        sb.append("    bframesCount: ").append(toIndentedString(bframesCount)).append("\n");
        sb.append("    frameRate: ").append(toIndentedString(frameRate)).append("\n");
        sb.append("    blackCut: ").append(toIndentedString(blackCut)).append("\n");
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
