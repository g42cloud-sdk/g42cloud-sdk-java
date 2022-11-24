package com.g42cloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 
 */
public class DisassociateServerVirtualIpOption {

    public static final class SubnetIdEnum {

        /**
         * Enum EMPTY for value: ""
         */
        public static final SubnetIdEnum EMPTY = new SubnetIdEnum("");

        private static final Map<String, SubnetIdEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SubnetIdEnum> createStaticFields() {
            Map<String, SubnetIdEnum> map = new HashMap<>();
            map.put("", EMPTY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SubnetIdEnum(String value) {
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
        public static SubnetIdEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SubnetIdEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SubnetIdEnum(value);
            }
            return result;
        }

        public static SubnetIdEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SubnetIdEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SubnetIdEnum) {
                return this.value.equals(((SubnetIdEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private SubnetIdEnum subnetId;

    public static final class IpAddressEnum {

        /**
         * Enum EMPTY for value: ""
         */
        public static final IpAddressEnum EMPTY = new IpAddressEnum("");

        private static final Map<String, IpAddressEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IpAddressEnum> createStaticFields() {
            Map<String, IpAddressEnum> map = new HashMap<>();
            map.put("", EMPTY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IpAddressEnum(String value) {
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
        public static IpAddressEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            IpAddressEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new IpAddressEnum(value);
            }
            return result;
        }

        public static IpAddressEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            IpAddressEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IpAddressEnum) {
                return this.value.equals(((IpAddressEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_address")

    private IpAddressEnum ipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reverse_binding")

    private Boolean reverseBinding;

    public DisassociateServerVirtualIpOption withSubnetId(SubnetIdEnum subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public SubnetIdEnum getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(SubnetIdEnum subnetId) {
        this.subnetId = subnetId;
    }

    public DisassociateServerVirtualIpOption withIpAddress(IpAddressEnum ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    public IpAddressEnum getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(IpAddressEnum ipAddress) {
        this.ipAddress = ipAddress;
    }

    public DisassociateServerVirtualIpOption withReverseBinding(Boolean reverseBinding) {
        this.reverseBinding = reverseBinding;
        return this;
    }

    public Boolean getReverseBinding() {
        return reverseBinding;
    }

    public void setReverseBinding(Boolean reverseBinding) {
        this.reverseBinding = reverseBinding;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DisassociateServerVirtualIpOption disassociateServerVirtualIpOption = (DisassociateServerVirtualIpOption) o;
        return Objects.equals(this.subnetId, disassociateServerVirtualIpOption.subnetId)
            && Objects.equals(this.ipAddress, disassociateServerVirtualIpOption.ipAddress)
            && Objects.equals(this.reverseBinding, disassociateServerVirtualIpOption.reverseBinding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subnetId, ipAddress, reverseBinding);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisassociateServerVirtualIpOption {\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    reverseBinding: ").append(toIndentedString(reverseBinding)).append("\n");
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
