package com.g42cloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 网卡实体类
 */
public class NetWork {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "netmask")

    private String netmask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway")

    private String gateway;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mtu")

    private Integer mtu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mac")

    private String mac;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    public NetWork withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NetWork withIp(String ip) {
        this.ip = ip;
        return this;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public NetWork withNetmask(String netmask) {
        this.netmask = netmask;
        return this;
    }

    public String getNetmask() {
        return netmask;
    }

    public void setNetmask(String netmask) {
        this.netmask = netmask;
    }

    public NetWork withGateway(String gateway) {
        this.gateway = gateway;
        return this;
    }

    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public NetWork withMtu(Integer mtu) {
        this.mtu = mtu;
        return this;
    }

    public Integer getMtu() {
        return mtu;
    }

    public void setMtu(Integer mtu) {
        this.mtu = mtu;
    }

    public NetWork withMac(String mac) {
        this.mac = mac;
        return this;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public NetWork withId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetWork that = (NetWork) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.ip, that.ip)
            && Objects.equals(this.netmask, that.netmask) && Objects.equals(this.gateway, that.gateway)
            && Objects.equals(this.mtu, that.mtu) && Objects.equals(this.mac, that.mac)
            && Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ip, netmask, gateway, mtu, mac, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetWork {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    netmask: ").append(toIndentedString(netmask)).append("\n");
        sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
        sb.append("    mtu: ").append(toIndentedString(mtu)).append("\n");
        sb.append("    mac: ").append(toIndentedString(mac)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
