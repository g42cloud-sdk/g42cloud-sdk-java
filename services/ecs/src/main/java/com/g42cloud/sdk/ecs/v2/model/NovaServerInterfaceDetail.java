package com.g42cloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 *  
 */
public class NovaServerInterfaceDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fixed_ips")

    private List<NovaServerInterfaceFixedIp> fixedIps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mac_addr")

    private String macAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "net_id")

    private String netId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_id")

    private String portId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_state")

    private String portState;

    public NovaServerInterfaceDetail withFixedIps(List<NovaServerInterfaceFixedIp> fixedIps) {
        this.fixedIps = fixedIps;
        return this;
    }

    public NovaServerInterfaceDetail addFixedIpsItem(NovaServerInterfaceFixedIp fixedIpsItem) {
        if (this.fixedIps == null) {
            this.fixedIps = new ArrayList<>();
        }
        this.fixedIps.add(fixedIpsItem);
        return this;
    }

    public NovaServerInterfaceDetail withFixedIps(Consumer<List<NovaServerInterfaceFixedIp>> fixedIpsSetter) {
        if (this.fixedIps == null) {
            this.fixedIps = new ArrayList<>();
        }
        fixedIpsSetter.accept(this.fixedIps);
        return this;
    }

    public List<NovaServerInterfaceFixedIp> getFixedIps() {
        return fixedIps;
    }

    public void setFixedIps(List<NovaServerInterfaceFixedIp> fixedIps) {
        this.fixedIps = fixedIps;
    }

    public NovaServerInterfaceDetail withMacAddr(String macAddr) {
        this.macAddr = macAddr;
        return this;
    }

    public String getMacAddr() {
        return macAddr;
    }

    public void setMacAddr(String macAddr) {
        this.macAddr = macAddr;
    }

    public NovaServerInterfaceDetail withNetId(String netId) {
        this.netId = netId;
        return this;
    }

    public String getNetId() {
        return netId;
    }

    public void setNetId(String netId) {
        this.netId = netId;
    }

    public NovaServerInterfaceDetail withPortId(String portId) {
        this.portId = portId;
        return this;
    }

    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public NovaServerInterfaceDetail withPortState(String portState) {
        this.portState = portState;
        return this;
    }

    public String getPortState() {
        return portState;
    }

    public void setPortState(String portState) {
        this.portState = portState;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NovaServerInterfaceDetail that = (NovaServerInterfaceDetail) obj;
        return Objects.equals(this.fixedIps, that.fixedIps) && Objects.equals(this.macAddr, that.macAddr)
            && Objects.equals(this.netId, that.netId) && Objects.equals(this.portId, that.portId)
            && Objects.equals(this.portState, that.portState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fixedIps, macAddr, netId, portId, portState);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaServerInterfaceDetail {\n");
        sb.append("    fixedIps: ").append(toIndentedString(fixedIps)).append("\n");
        sb.append("    macAddr: ").append(toIndentedString(macAddr)).append("\n");
        sb.append("    netId: ").append(toIndentedString(netId)).append("\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
        sb.append("    portState: ").append(toIndentedString(portState)).append("\n");
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
