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
 * AudioProcess
 */
public class AudioProcess {

    public static final class VolumeEnum {

        /**
         * Enum AUTO for value: "auto"
         */
        public static final VolumeEnum AUTO = new VolumeEnum("auto");

        /**
         * Enum DYNAMIC for value: "dynamic"
         */
        public static final VolumeEnum DYNAMIC = new VolumeEnum("dynamic");

        /**
         * Enum ORIGINAL for value: "original"
         */
        public static final VolumeEnum ORIGINAL = new VolumeEnum("original");

        private static final Map<String, VolumeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VolumeEnum> createStaticFields() {
            Map<String, VolumeEnum> map = new HashMap<>();
            map.put("auto", AUTO);
            map.put("dynamic", DYNAMIC);
            map.put("original", ORIGINAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VolumeEnum(String value) {
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
        public static VolumeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            VolumeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new VolumeEnum(value);
            }
            return result;
        }

        public static VolumeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            VolumeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VolumeEnum) {
                return this.value.equals(((VolumeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume")

    private VolumeEnum volume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_expr")

    private Integer volumeExpr;

    public AudioProcess withVolume(VolumeEnum volume) {
        this.volume = volume;
        return this;
    }

    public VolumeEnum getVolume() {
        return volume;
    }

    public void setVolume(VolumeEnum volume) {
        this.volume = volume;
    }

    public AudioProcess withVolumeExpr(Integer volumeExpr) {
        this.volumeExpr = volumeExpr;
        return this;
    }

    public Integer getVolumeExpr() {
        return volumeExpr;
    }

    public void setVolumeExpr(Integer volumeExpr) {
        this.volumeExpr = volumeExpr;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AudioProcess audioProcess = (AudioProcess) o;
        return Objects.equals(this.volume, audioProcess.volume)
            && Objects.equals(this.volumeExpr, audioProcess.volumeExpr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volume, volumeExpr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AudioProcess {\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    volumeExpr: ").append(toIndentedString(volumeExpr)).append("\n");
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
