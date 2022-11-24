package com.g42cloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class CreateSubNetworkInterfaceOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virsubnet_id")

    private String virsubnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vlan_id")

    private String vlanId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_enable")

    private Boolean ipv6Enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip_address")

    private String privateIpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_ip_address")

    private String ipv6IpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<String> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    public CreateSubNetworkInterfaceOption withVirsubnetId(String virsubnetId) {
        this.virsubnetId = virsubnetId;
        return this;
    }

    public String getVirsubnetId() {
        return virsubnetId;
    }

    public void setVirsubnetId(String virsubnetId) {
        this.virsubnetId = virsubnetId;
    }

    public CreateSubNetworkInterfaceOption withVlanId(String vlanId) {
        this.vlanId = vlanId;
        return this;
    }

    public String getVlanId() {
        return vlanId;
    }

    public void setVlanId(String vlanId) {
        this.vlanId = vlanId;
    }

    public CreateSubNetworkInterfaceOption withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public CreateSubNetworkInterfaceOption withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateSubNetworkInterfaceOption withIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
        return this;
    }

    public Boolean getIpv6Enable() {
        return ipv6Enable;
    }

    public void setIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
    }

    public CreateSubNetworkInterfaceOption withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public CreateSubNetworkInterfaceOption withIpv6IpAddress(String ipv6IpAddress) {
        this.ipv6IpAddress = ipv6IpAddress;
        return this;
    }

    public String getIpv6IpAddress() {
        return ipv6IpAddress;
    }

    public void setIpv6IpAddress(String ipv6IpAddress) {
        this.ipv6IpAddress = ipv6IpAddress;
    }

    public CreateSubNetworkInterfaceOption withSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public CreateSubNetworkInterfaceOption addSecurityGroupsItem(String securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public CreateSubNetworkInterfaceOption withSecurityGroups(Consumer<List<String>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    public List<String> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public CreateSubNetworkInterfaceOption withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSubNetworkInterfaceOption createSubNetworkInterfaceOption = (CreateSubNetworkInterfaceOption) o;
        return Objects.equals(this.virsubnetId, createSubNetworkInterfaceOption.virsubnetId)
            && Objects.equals(this.vlanId, createSubNetworkInterfaceOption.vlanId)
            && Objects.equals(this.parentId, createSubNetworkInterfaceOption.parentId)
            && Objects.equals(this.description, createSubNetworkInterfaceOption.description)
            && Objects.equals(this.ipv6Enable, createSubNetworkInterfaceOption.ipv6Enable)
            && Objects.equals(this.privateIpAddress, createSubNetworkInterfaceOption.privateIpAddress)
            && Objects.equals(this.ipv6IpAddress, createSubNetworkInterfaceOption.ipv6IpAddress)
            && Objects.equals(this.securityGroups, createSubNetworkInterfaceOption.securityGroups)
            && Objects.equals(this.projectId, createSubNetworkInterfaceOption.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(virsubnetId,
            vlanId,
            parentId,
            description,
            ipv6Enable,
            privateIpAddress,
            ipv6IpAddress,
            securityGroups,
            projectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSubNetworkInterfaceOption {\n");
        sb.append("    virsubnetId: ").append(toIndentedString(virsubnetId)).append("\n");
        sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ipv6Enable: ").append(toIndentedString(ipv6Enable)).append("\n");
        sb.append("    privateIpAddress: ").append(toIndentedString(privateIpAddress)).append("\n");
        sb.append("    ipv6IpAddress: ").append(toIndentedString(ipv6IpAddress)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
