package com.g42cloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class UpdateSubnetOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_enable")

    private Boolean ipv6Enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dhcp_enable")

    private Boolean dhcpEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_dns")

    private String primaryDns;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secondary_dns")

    private String secondaryDns;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dnsList")

    private List<String> dnsList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_dhcp_opts")

    private List<ExtraDhcpOption> extraDhcpOpts = null;

    public UpdateSubnetOption withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateSubnetOption withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateSubnetOption withIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
        return this;
    }

    public Boolean getIpv6Enable() {
        return ipv6Enable;
    }

    public void setIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
    }

    public UpdateSubnetOption withDhcpEnable(Boolean dhcpEnable) {
        this.dhcpEnable = dhcpEnable;
        return this;
    }

    public Boolean getDhcpEnable() {
        return dhcpEnable;
    }

    public void setDhcpEnable(Boolean dhcpEnable) {
        this.dhcpEnable = dhcpEnable;
    }

    public UpdateSubnetOption withPrimaryDns(String primaryDns) {
        this.primaryDns = primaryDns;
        return this;
    }

    public String getPrimaryDns() {
        return primaryDns;
    }

    public void setPrimaryDns(String primaryDns) {
        this.primaryDns = primaryDns;
    }

    public UpdateSubnetOption withSecondaryDns(String secondaryDns) {
        this.secondaryDns = secondaryDns;
        return this;
    }

    public String getSecondaryDns() {
        return secondaryDns;
    }

    public void setSecondaryDns(String secondaryDns) {
        this.secondaryDns = secondaryDns;
    }

    public UpdateSubnetOption withDnsList(List<String> dnsList) {
        this.dnsList = dnsList;
        return this;
    }

    public UpdateSubnetOption addDnsListItem(String dnsListItem) {
        if (this.dnsList == null) {
            this.dnsList = new ArrayList<>();
        }
        this.dnsList.add(dnsListItem);
        return this;
    }

    public UpdateSubnetOption withDnsList(Consumer<List<String>> dnsListSetter) {
        if (this.dnsList == null) {
            this.dnsList = new ArrayList<>();
        }
        dnsListSetter.accept(this.dnsList);
        return this;
    }

    public List<String> getDnsList() {
        return dnsList;
    }

    public void setDnsList(List<String> dnsList) {
        this.dnsList = dnsList;
    }

    public UpdateSubnetOption withExtraDhcpOpts(List<ExtraDhcpOption> extraDhcpOpts) {
        this.extraDhcpOpts = extraDhcpOpts;
        return this;
    }

    public UpdateSubnetOption addExtraDhcpOptsItem(ExtraDhcpOption extraDhcpOptsItem) {
        if (this.extraDhcpOpts == null) {
            this.extraDhcpOpts = new ArrayList<>();
        }
        this.extraDhcpOpts.add(extraDhcpOptsItem);
        return this;
    }

    public UpdateSubnetOption withExtraDhcpOpts(Consumer<List<ExtraDhcpOption>> extraDhcpOptsSetter) {
        if (this.extraDhcpOpts == null) {
            this.extraDhcpOpts = new ArrayList<>();
        }
        extraDhcpOptsSetter.accept(this.extraDhcpOpts);
        return this;
    }

    public List<ExtraDhcpOption> getExtraDhcpOpts() {
        return extraDhcpOpts;
    }

    public void setExtraDhcpOpts(List<ExtraDhcpOption> extraDhcpOpts) {
        this.extraDhcpOpts = extraDhcpOpts;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateSubnetOption updateSubnetOption = (UpdateSubnetOption) o;
        return Objects.equals(this.name, updateSubnetOption.name)
            && Objects.equals(this.description, updateSubnetOption.description)
            && Objects.equals(this.ipv6Enable, updateSubnetOption.ipv6Enable)
            && Objects.equals(this.dhcpEnable, updateSubnetOption.dhcpEnable)
            && Objects.equals(this.primaryDns, updateSubnetOption.primaryDns)
            && Objects.equals(this.secondaryDns, updateSubnetOption.secondaryDns)
            && Objects.equals(this.dnsList, updateSubnetOption.dnsList)
            && Objects.equals(this.extraDhcpOpts, updateSubnetOption.extraDhcpOpts);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, description, ipv6Enable, dhcpEnable, primaryDns, secondaryDns, dnsList, extraDhcpOpts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSubnetOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ipv6Enable: ").append(toIndentedString(ipv6Enable)).append("\n");
        sb.append("    dhcpEnable: ").append(toIndentedString(dhcpEnable)).append("\n");
        sb.append("    primaryDns: ").append(toIndentedString(primaryDns)).append("\n");
        sb.append("    secondaryDns: ").append(toIndentedString(secondaryDns)).append("\n");
        sb.append("    dnsList: ").append(toIndentedString(dnsList)).append("\n");
        sb.append("    extraDhcpOpts: ").append(toIndentedString(extraDhcpOpts)).append("\n");
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
