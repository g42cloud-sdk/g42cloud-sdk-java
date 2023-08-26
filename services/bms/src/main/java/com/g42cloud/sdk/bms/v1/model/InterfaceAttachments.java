package com.g42cloud.sdk.bms.v1.model;

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
import java.util.UUID;
import java.util.function.Consumer;

/**
 * interfaceAttachments字段数据结构说明
 */
public class InterfaceAttachments {

    public static final class PortStateEnum {

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final PortStateEnum ACTIVE = new PortStateEnum("ACTIVE");

        /**
         * Enum BUILD for value: "BUILD"
         */
        public static final PortStateEnum BUILD = new PortStateEnum("BUILD");

        /**
         * Enum DOWN for value: "DOWN"
         */
        public static final PortStateEnum DOWN = new PortStateEnum("DOWN");

        private static final Map<String, PortStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PortStateEnum> createStaticFields() {
            Map<String, PortStateEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put("BUILD", BUILD);
            map.put("DOWN", DOWN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PortStateEnum(String value) {
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
        public static PortStateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PortStateEnum(value));
        }

        public static PortStateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PortStateEnum) {
                return this.value.equals(((PortStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_state")

    private PortStateEnum portState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fixed_ips")

    private List<FixedIps> fixedIps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "net_id")

    private UUID netId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_id")

    private UUID portId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mac_addr")

    private String macAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "driver_mode")

    private String driverMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pci_address")

    private String pciAddress;

    public InterfaceAttachments withPortState(PortStateEnum portState) {
        this.portState = portState;
        return this;
    }

    public PortStateEnum getPortState() {
        return portState;
    }

    public void setPortState(PortStateEnum portState) {
        this.portState = portState;
    }

    public InterfaceAttachments withFixedIps(List<FixedIps> fixedIps) {
        this.fixedIps = fixedIps;
        return this;
    }

    public InterfaceAttachments addFixedIpsItem(FixedIps fixedIpsItem) {
        if (this.fixedIps == null) {
            this.fixedIps = new ArrayList<>();
        }
        this.fixedIps.add(fixedIpsItem);
        return this;
    }

    public InterfaceAttachments withFixedIps(Consumer<List<FixedIps>> fixedIpsSetter) {
        if (this.fixedIps == null) {
            this.fixedIps = new ArrayList<>();
        }
        fixedIpsSetter.accept(this.fixedIps);
        return this;
    }

    public List<FixedIps> getFixedIps() {
        return fixedIps;
    }

    public void setFixedIps(List<FixedIps> fixedIps) {
        this.fixedIps = fixedIps;
    }

    public InterfaceAttachments withNetId(UUID netId) {
        this.netId = netId;
        return this;
    }

    public UUID getNetId() {
        return netId;
    }

    public void setNetId(UUID netId) {
        this.netId = netId;
    }

    public InterfaceAttachments withPortId(UUID portId) {
        this.portId = portId;
        return this;
    }

    public UUID getPortId() {
        return portId;
    }

    public void setPortId(UUID portId) {
        this.portId = portId;
    }

    public InterfaceAttachments withMacAddr(String macAddr) {
        this.macAddr = macAddr;
        return this;
    }

    public String getMacAddr() {
        return macAddr;
    }

    public void setMacAddr(String macAddr) {
        this.macAddr = macAddr;
    }

    public InterfaceAttachments withDriverMode(String driverMode) {
        this.driverMode = driverMode;
        return this;
    }

    public String getDriverMode() {
        return driverMode;
    }

    public void setDriverMode(String driverMode) {
        this.driverMode = driverMode;
    }

    public InterfaceAttachments withPciAddress(String pciAddress) {
        this.pciAddress = pciAddress;
        return this;
    }

    public String getPciAddress() {
        return pciAddress;
    }

    public void setPciAddress(String pciAddress) {
        this.pciAddress = pciAddress;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InterfaceAttachments that = (InterfaceAttachments) obj;
        return Objects.equals(this.portState, that.portState) && Objects.equals(this.fixedIps, that.fixedIps)
            && Objects.equals(this.netId, that.netId) && Objects.equals(this.portId, that.portId)
            && Objects.equals(this.macAddr, that.macAddr) && Objects.equals(this.driverMode, that.driverMode)
            && Objects.equals(this.pciAddress, that.pciAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(portState, fixedIps, netId, portId, macAddr, driverMode, pciAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InterfaceAttachments {\n");
        sb.append("    portState: ").append(toIndentedString(portState)).append("\n");
        sb.append("    fixedIps: ").append(toIndentedString(fixedIps)).append("\n");
        sb.append("    netId: ").append(toIndentedString(netId)).append("\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
        sb.append("    macAddr: ").append(toIndentedString(macAddr)).append("\n");
        sb.append("    driverMode: ").append(toIndentedString(driverMode)).append("\n");
        sb.append("    pciAddress: ").append(toIndentedString(pciAddress)).append("\n");
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
