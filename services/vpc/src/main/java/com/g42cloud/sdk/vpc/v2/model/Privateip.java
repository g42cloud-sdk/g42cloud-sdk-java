package com.g42cloud.sdk.vpc.v2.model;

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
public class Privateip {

    public static final class StatusEnum {

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");

        /**
         * Enum DOWN for value: "DOWN"
         */
        public static final StatusEnum DOWN = new StatusEnum("DOWN");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put("DOWN", DOWN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    public static final class DeviceOwnerEnum {

        /**
         * Enum NETWORK_DHCP for value: "network:dhcp"
         */
        public static final DeviceOwnerEnum NETWORK_DHCP = new DeviceOwnerEnum("network:dhcp");

        /**
         * Enum NETWORK_ROUTER_INTERFACE_DISTRIBUTED for value: "network:router_interface_distributed"
         */
        public static final DeviceOwnerEnum NETWORK_ROUTER_INTERFACE_DISTRIBUTED =
            new DeviceOwnerEnum("network:router_interface_distributed");

        /**
         * Enum COMPUTE_XXX for value: "compute:xxx"
         */
        public static final DeviceOwnerEnum COMPUTE_XXX = new DeviceOwnerEnum("compute:xxx");

        private static final Map<String, DeviceOwnerEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DeviceOwnerEnum> createStaticFields() {
            Map<String, DeviceOwnerEnum> map = new HashMap<>();
            map.put("network:dhcp", NETWORK_DHCP);
            map.put("network:router_interface_distributed", NETWORK_ROUTER_INTERFACE_DISTRIBUTED);
            map.put("compute:xxx", COMPUTE_XXX);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DeviceOwnerEnum(String value) {
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
        public static DeviceOwnerEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DeviceOwnerEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DeviceOwnerEnum(value);
            }
            return result;
        }

        public static DeviceOwnerEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DeviceOwnerEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DeviceOwnerEnum) {
                return this.value.equals(((DeviceOwnerEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_owner")

    private DeviceOwnerEnum deviceOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_address")

    private String ipAddress;

    public Privateip withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Privateip withId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Privateip withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public Privateip withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public Privateip withDeviceOwner(DeviceOwnerEnum deviceOwner) {
        this.deviceOwner = deviceOwner;
        return this;
    }

    public DeviceOwnerEnum getDeviceOwner() {
        return deviceOwner;
    }

    public void setDeviceOwner(DeviceOwnerEnum deviceOwner) {
        this.deviceOwner = deviceOwner;
    }

    public Privateip withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Privateip privateip = (Privateip) o;
        return Objects.equals(this.status, privateip.status) && Objects.equals(this.id, privateip.id)
            && Objects.equals(this.subnetId, privateip.subnetId) && Objects.equals(this.tenantId, privateip.tenantId)
            && Objects.equals(this.deviceOwner, privateip.deviceOwner)
            && Objects.equals(this.ipAddress, privateip.ipAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, id, subnetId, tenantId, deviceOwner, ipAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Privateip {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    deviceOwner: ").append(toIndentedString(deviceOwner)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
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
