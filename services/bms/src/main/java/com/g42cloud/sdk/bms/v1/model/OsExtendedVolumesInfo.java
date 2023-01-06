package com.g42cloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * os-extended-volumes:volumes_attached数据结构说明
 */
public class OsExtendedVolumesInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private UUID id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_on_termination")

    private String deleteOnTermination;

    public static final class BootIndexEnum {

        /**
         * Enum _0 for value: "0"
         */
        public static final BootIndexEnum _0 = new BootIndexEnum("0");

        /**
         * Enum _1 for value: "-1"
         */
        public static final BootIndexEnum _1 = new BootIndexEnum("-1");

        private static final Map<String, BootIndexEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BootIndexEnum> createStaticFields() {
            Map<String, BootIndexEnum> map = new HashMap<>();
            map.put("0", _0);
            map.put("-1", _1);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BootIndexEnum(String value) {
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
        public static BootIndexEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            BootIndexEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new BootIndexEnum(value);
            }
            return result;
        }

        public static BootIndexEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            BootIndexEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BootIndexEnum) {
                return this.value.equals(((BootIndexEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bootIndex")

    private BootIndexEnum bootIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device")

    private String device;

    public OsExtendedVolumesInfo withId(UUID id) {
        this.id = id;
        return this;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public OsExtendedVolumesInfo withDeleteOnTermination(String deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    public String getDeleteOnTermination() {
        return deleteOnTermination;
    }

    public void setDeleteOnTermination(String deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    public OsExtendedVolumesInfo withBootIndex(BootIndexEnum bootIndex) {
        this.bootIndex = bootIndex;
        return this;
    }

    public BootIndexEnum getBootIndex() {
        return bootIndex;
    }

    public void setBootIndex(BootIndexEnum bootIndex) {
        this.bootIndex = bootIndex;
    }

    public OsExtendedVolumesInfo withDevice(String device) {
        this.device = device;
        return this;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OsExtendedVolumesInfo osExtendedVolumesInfo = (OsExtendedVolumesInfo) o;
        return Objects.equals(this.id, osExtendedVolumesInfo.id)
            && Objects.equals(this.deleteOnTermination, osExtendedVolumesInfo.deleteOnTermination)
            && Objects.equals(this.bootIndex, osExtendedVolumesInfo.bootIndex)
            && Objects.equals(this.device, osExtendedVolumesInfo.device);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, deleteOnTermination, bootIndex, device);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OsExtendedVolumesInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    deleteOnTermination: ").append(toIndentedString(deleteOnTermination)).append("\n");
        sb.append("    bootIndex: ").append(toIndentedString(bootIndex)).append("\n");
        sb.append("    device: ").append(toIndentedString(device)).append("\n");
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
