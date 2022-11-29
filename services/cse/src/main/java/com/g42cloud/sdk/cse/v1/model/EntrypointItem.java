package com.g42cloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * EntrypointItem
 */
public class EntrypointItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_entrypoint")

    private String masterEntrypoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_entrypoint_ipv6")

    private String masterEntrypointIpv6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slave_entrypoint")

    private String slaveEntrypoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slave_entrypoint_ipv6")

    private String slaveEntrypointIpv6;

    public static final class TypeEnum {

        /**
         * Enum REGISTRY for value: "REGISTRY"
         */
        public static final TypeEnum REGISTRY = new TypeEnum("REGISTRY");

        /**
         * Enum SERVICE for value: "SERVICE"
         */
        public static final TypeEnum SERVICE = new TypeEnum("SERVICE");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("REGISTRY", REGISTRY);
            map.put("SERVICE", SERVICE);
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
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    public EntrypointItem withMasterEntrypoint(String masterEntrypoint) {
        this.masterEntrypoint = masterEntrypoint;
        return this;
    }

    public String getMasterEntrypoint() {
        return masterEntrypoint;
    }

    public void setMasterEntrypoint(String masterEntrypoint) {
        this.masterEntrypoint = masterEntrypoint;
    }

    public EntrypointItem withMasterEntrypointIpv6(String masterEntrypointIpv6) {
        this.masterEntrypointIpv6 = masterEntrypointIpv6;
        return this;
    }

    public String getMasterEntrypointIpv6() {
        return masterEntrypointIpv6;
    }

    public void setMasterEntrypointIpv6(String masterEntrypointIpv6) {
        this.masterEntrypointIpv6 = masterEntrypointIpv6;
    }

    public EntrypointItem withSlaveEntrypoint(String slaveEntrypoint) {
        this.slaveEntrypoint = slaveEntrypoint;
        return this;
    }

    public String getSlaveEntrypoint() {
        return slaveEntrypoint;
    }

    public void setSlaveEntrypoint(String slaveEntrypoint) {
        this.slaveEntrypoint = slaveEntrypoint;
    }

    public EntrypointItem withSlaveEntrypointIpv6(String slaveEntrypointIpv6) {
        this.slaveEntrypointIpv6 = slaveEntrypointIpv6;
        return this;
    }

    public String getSlaveEntrypointIpv6() {
        return slaveEntrypointIpv6;
    }

    public void setSlaveEntrypointIpv6(String slaveEntrypointIpv6) {
        this.slaveEntrypointIpv6 = slaveEntrypointIpv6;
    }

    public EntrypointItem withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EntrypointItem entrypointItem = (EntrypointItem) o;
        return Objects.equals(this.masterEntrypoint, entrypointItem.masterEntrypoint)
            && Objects.equals(this.masterEntrypointIpv6, entrypointItem.masterEntrypointIpv6)
            && Objects.equals(this.slaveEntrypoint, entrypointItem.slaveEntrypoint)
            && Objects.equals(this.slaveEntrypointIpv6, entrypointItem.slaveEntrypointIpv6)
            && Objects.equals(this.type, entrypointItem.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(masterEntrypoint, masterEntrypointIpv6, slaveEntrypoint, slaveEntrypointIpv6, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EntrypointItem {\n");
        sb.append("    masterEntrypoint: ").append(toIndentedString(masterEntrypoint)).append("\n");
        sb.append("    masterEntrypointIpv6: ").append(toIndentedString(masterEntrypointIpv6)).append("\n");
        sb.append("    slaveEntrypoint: ").append(toIndentedString(slaveEntrypoint)).append("\n");
        sb.append("    slaveEntrypointIpv6: ").append(toIndentedString(slaveEntrypointIpv6)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
