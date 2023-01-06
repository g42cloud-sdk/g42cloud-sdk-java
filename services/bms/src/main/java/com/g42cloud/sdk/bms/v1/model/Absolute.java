package com.g42cloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * absolute数据结构说明
 */
public class Absolute {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxTotalInstances")

    private Integer maxTotalInstances;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxTotalCores")

    private Integer maxTotalCores;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxTotalRAMSize")

    private Integer maxTotalRAMSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxTotalKeypairs")

    private Integer maxTotalKeypairs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxServerMeta")

    private Integer maxServerMeta;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxPersonality")

    private Integer maxPersonality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxPersonalitySize")

    private Integer maxPersonalitySize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxServerGroups")

    private Integer maxServerGroups;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxServerGroupMembers")

    private Integer maxServerGroupMembers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalServerGroupsUsed")

    private Integer totalServerGroupsUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxSecurityGroups")

    private Integer maxSecurityGroups;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxSecurityGroupRules")

    private Integer maxSecurityGroupRules;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxTotalFloatingIps")

    private Integer maxTotalFloatingIps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxImageMeta")

    private Integer maxImageMeta;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalInstancesUsed")

    private Integer totalInstancesUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalCoresUsed")

    private Integer totalCoresUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalRAMUsed")

    private Integer totalRAMUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalSecurityGroupsUsed")

    private Integer totalSecurityGroupsUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalFloatingIpsUsed")

    private Integer totalFloatingIpsUsed;

    public Absolute withMaxTotalInstances(Integer maxTotalInstances) {
        this.maxTotalInstances = maxTotalInstances;
        return this;
    }

    public Integer getMaxTotalInstances() {
        return maxTotalInstances;
    }

    public void setMaxTotalInstances(Integer maxTotalInstances) {
        this.maxTotalInstances = maxTotalInstances;
    }

    public Absolute withMaxTotalCores(Integer maxTotalCores) {
        this.maxTotalCores = maxTotalCores;
        return this;
    }

    public Integer getMaxTotalCores() {
        return maxTotalCores;
    }

    public void setMaxTotalCores(Integer maxTotalCores) {
        this.maxTotalCores = maxTotalCores;
    }

    public Absolute withMaxTotalRAMSize(Integer maxTotalRAMSize) {
        this.maxTotalRAMSize = maxTotalRAMSize;
        return this;
    }

    public Integer getMaxTotalRAMSize() {
        return maxTotalRAMSize;
    }

    public void setMaxTotalRAMSize(Integer maxTotalRAMSize) {
        this.maxTotalRAMSize = maxTotalRAMSize;
    }

    public Absolute withMaxTotalKeypairs(Integer maxTotalKeypairs) {
        this.maxTotalKeypairs = maxTotalKeypairs;
        return this;
    }

    public Integer getMaxTotalKeypairs() {
        return maxTotalKeypairs;
    }

    public void setMaxTotalKeypairs(Integer maxTotalKeypairs) {
        this.maxTotalKeypairs = maxTotalKeypairs;
    }

    public Absolute withMaxServerMeta(Integer maxServerMeta) {
        this.maxServerMeta = maxServerMeta;
        return this;
    }

    public Integer getMaxServerMeta() {
        return maxServerMeta;
    }

    public void setMaxServerMeta(Integer maxServerMeta) {
        this.maxServerMeta = maxServerMeta;
    }

    public Absolute withMaxPersonality(Integer maxPersonality) {
        this.maxPersonality = maxPersonality;
        return this;
    }

    public Integer getMaxPersonality() {
        return maxPersonality;
    }

    public void setMaxPersonality(Integer maxPersonality) {
        this.maxPersonality = maxPersonality;
    }

    public Absolute withMaxPersonalitySize(Integer maxPersonalitySize) {
        this.maxPersonalitySize = maxPersonalitySize;
        return this;
    }

    public Integer getMaxPersonalitySize() {
        return maxPersonalitySize;
    }

    public void setMaxPersonalitySize(Integer maxPersonalitySize) {
        this.maxPersonalitySize = maxPersonalitySize;
    }

    public Absolute withMaxServerGroups(Integer maxServerGroups) {
        this.maxServerGroups = maxServerGroups;
        return this;
    }

    public Integer getMaxServerGroups() {
        return maxServerGroups;
    }

    public void setMaxServerGroups(Integer maxServerGroups) {
        this.maxServerGroups = maxServerGroups;
    }

    public Absolute withMaxServerGroupMembers(Integer maxServerGroupMembers) {
        this.maxServerGroupMembers = maxServerGroupMembers;
        return this;
    }

    public Integer getMaxServerGroupMembers() {
        return maxServerGroupMembers;
    }

    public void setMaxServerGroupMembers(Integer maxServerGroupMembers) {
        this.maxServerGroupMembers = maxServerGroupMembers;
    }

    public Absolute withTotalServerGroupsUsed(Integer totalServerGroupsUsed) {
        this.totalServerGroupsUsed = totalServerGroupsUsed;
        return this;
    }

    public Integer getTotalServerGroupsUsed() {
        return totalServerGroupsUsed;
    }

    public void setTotalServerGroupsUsed(Integer totalServerGroupsUsed) {
        this.totalServerGroupsUsed = totalServerGroupsUsed;
    }

    public Absolute withMaxSecurityGroups(Integer maxSecurityGroups) {
        this.maxSecurityGroups = maxSecurityGroups;
        return this;
    }

    public Integer getMaxSecurityGroups() {
        return maxSecurityGroups;
    }

    public void setMaxSecurityGroups(Integer maxSecurityGroups) {
        this.maxSecurityGroups = maxSecurityGroups;
    }

    public Absolute withMaxSecurityGroupRules(Integer maxSecurityGroupRules) {
        this.maxSecurityGroupRules = maxSecurityGroupRules;
        return this;
    }

    public Integer getMaxSecurityGroupRules() {
        return maxSecurityGroupRules;
    }

    public void setMaxSecurityGroupRules(Integer maxSecurityGroupRules) {
        this.maxSecurityGroupRules = maxSecurityGroupRules;
    }

    public Absolute withMaxTotalFloatingIps(Integer maxTotalFloatingIps) {
        this.maxTotalFloatingIps = maxTotalFloatingIps;
        return this;
    }

    public Integer getMaxTotalFloatingIps() {
        return maxTotalFloatingIps;
    }

    public void setMaxTotalFloatingIps(Integer maxTotalFloatingIps) {
        this.maxTotalFloatingIps = maxTotalFloatingIps;
    }

    public Absolute withMaxImageMeta(Integer maxImageMeta) {
        this.maxImageMeta = maxImageMeta;
        return this;
    }

    public Integer getMaxImageMeta() {
        return maxImageMeta;
    }

    public void setMaxImageMeta(Integer maxImageMeta) {
        this.maxImageMeta = maxImageMeta;
    }

    public Absolute withTotalInstancesUsed(Integer totalInstancesUsed) {
        this.totalInstancesUsed = totalInstancesUsed;
        return this;
    }

    public Integer getTotalInstancesUsed() {
        return totalInstancesUsed;
    }

    public void setTotalInstancesUsed(Integer totalInstancesUsed) {
        this.totalInstancesUsed = totalInstancesUsed;
    }

    public Absolute withTotalCoresUsed(Integer totalCoresUsed) {
        this.totalCoresUsed = totalCoresUsed;
        return this;
    }

    public Integer getTotalCoresUsed() {
        return totalCoresUsed;
    }

    public void setTotalCoresUsed(Integer totalCoresUsed) {
        this.totalCoresUsed = totalCoresUsed;
    }

    public Absolute withTotalRAMUsed(Integer totalRAMUsed) {
        this.totalRAMUsed = totalRAMUsed;
        return this;
    }

    public Integer getTotalRAMUsed() {
        return totalRAMUsed;
    }

    public void setTotalRAMUsed(Integer totalRAMUsed) {
        this.totalRAMUsed = totalRAMUsed;
    }

    public Absolute withTotalSecurityGroupsUsed(Integer totalSecurityGroupsUsed) {
        this.totalSecurityGroupsUsed = totalSecurityGroupsUsed;
        return this;
    }

    public Integer getTotalSecurityGroupsUsed() {
        return totalSecurityGroupsUsed;
    }

    public void setTotalSecurityGroupsUsed(Integer totalSecurityGroupsUsed) {
        this.totalSecurityGroupsUsed = totalSecurityGroupsUsed;
    }

    public Absolute withTotalFloatingIpsUsed(Integer totalFloatingIpsUsed) {
        this.totalFloatingIpsUsed = totalFloatingIpsUsed;
        return this;
    }

    public Integer getTotalFloatingIpsUsed() {
        return totalFloatingIpsUsed;
    }

    public void setTotalFloatingIpsUsed(Integer totalFloatingIpsUsed) {
        this.totalFloatingIpsUsed = totalFloatingIpsUsed;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Absolute absolute = (Absolute) o;
        return Objects.equals(this.maxTotalInstances, absolute.maxTotalInstances)
            && Objects.equals(this.maxTotalCores, absolute.maxTotalCores)
            && Objects.equals(this.maxTotalRAMSize, absolute.maxTotalRAMSize)
            && Objects.equals(this.maxTotalKeypairs, absolute.maxTotalKeypairs)
            && Objects.equals(this.maxServerMeta, absolute.maxServerMeta)
            && Objects.equals(this.maxPersonality, absolute.maxPersonality)
            && Objects.equals(this.maxPersonalitySize, absolute.maxPersonalitySize)
            && Objects.equals(this.maxServerGroups, absolute.maxServerGroups)
            && Objects.equals(this.maxServerGroupMembers, absolute.maxServerGroupMembers)
            && Objects.equals(this.totalServerGroupsUsed, absolute.totalServerGroupsUsed)
            && Objects.equals(this.maxSecurityGroups, absolute.maxSecurityGroups)
            && Objects.equals(this.maxSecurityGroupRules, absolute.maxSecurityGroupRules)
            && Objects.equals(this.maxTotalFloatingIps, absolute.maxTotalFloatingIps)
            && Objects.equals(this.maxImageMeta, absolute.maxImageMeta)
            && Objects.equals(this.totalInstancesUsed, absolute.totalInstancesUsed)
            && Objects.equals(this.totalCoresUsed, absolute.totalCoresUsed)
            && Objects.equals(this.totalRAMUsed, absolute.totalRAMUsed)
            && Objects.equals(this.totalSecurityGroupsUsed, absolute.totalSecurityGroupsUsed)
            && Objects.equals(this.totalFloatingIpsUsed, absolute.totalFloatingIpsUsed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxTotalInstances,
            maxTotalCores,
            maxTotalRAMSize,
            maxTotalKeypairs,
            maxServerMeta,
            maxPersonality,
            maxPersonalitySize,
            maxServerGroups,
            maxServerGroupMembers,
            totalServerGroupsUsed,
            maxSecurityGroups,
            maxSecurityGroupRules,
            maxTotalFloatingIps,
            maxImageMeta,
            totalInstancesUsed,
            totalCoresUsed,
            totalRAMUsed,
            totalSecurityGroupsUsed,
            totalFloatingIpsUsed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Absolute {\n");
        sb.append("    maxTotalInstances: ").append(toIndentedString(maxTotalInstances)).append("\n");
        sb.append("    maxTotalCores: ").append(toIndentedString(maxTotalCores)).append("\n");
        sb.append("    maxTotalRAMSize: ").append(toIndentedString(maxTotalRAMSize)).append("\n");
        sb.append("    maxTotalKeypairs: ").append(toIndentedString(maxTotalKeypairs)).append("\n");
        sb.append("    maxServerMeta: ").append(toIndentedString(maxServerMeta)).append("\n");
        sb.append("    maxPersonality: ").append(toIndentedString(maxPersonality)).append("\n");
        sb.append("    maxPersonalitySize: ").append(toIndentedString(maxPersonalitySize)).append("\n");
        sb.append("    maxServerGroups: ").append(toIndentedString(maxServerGroups)).append("\n");
        sb.append("    maxServerGroupMembers: ").append(toIndentedString(maxServerGroupMembers)).append("\n");
        sb.append("    totalServerGroupsUsed: ").append(toIndentedString(totalServerGroupsUsed)).append("\n");
        sb.append("    maxSecurityGroups: ").append(toIndentedString(maxSecurityGroups)).append("\n");
        sb.append("    maxSecurityGroupRules: ").append(toIndentedString(maxSecurityGroupRules)).append("\n");
        sb.append("    maxTotalFloatingIps: ").append(toIndentedString(maxTotalFloatingIps)).append("\n");
        sb.append("    maxImageMeta: ").append(toIndentedString(maxImageMeta)).append("\n");
        sb.append("    totalInstancesUsed: ").append(toIndentedString(totalInstancesUsed)).append("\n");
        sb.append("    totalCoresUsed: ").append(toIndentedString(totalCoresUsed)).append("\n");
        sb.append("    totalRAMUsed: ").append(toIndentedString(totalRAMUsed)).append("\n");
        sb.append("    totalSecurityGroupsUsed: ").append(toIndentedString(totalSecurityGroupsUsed)).append("\n");
        sb.append("    totalFloatingIpsUsed: ").append(toIndentedString(totalFloatingIpsUsed)).append("\n");
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
