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
public class ServerLimits {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxImageMeta")

    private Integer maxImageMeta;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxPersonality")

    private Integer maxPersonality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxPersonalitySize")

    private Integer maxPersonalitySize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxSecurityGroupRules")

    private Integer maxSecurityGroupRules;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxSecurityGroups")

    private Integer maxSecurityGroups;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxServerGroupMembers")

    private Integer maxServerGroupMembers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxServerGroups")

    private Integer maxServerGroups;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxServerMeta")

    private Integer maxServerMeta;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxTotalCores")

    private Integer maxTotalCores;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxTotalFloatingIps")

    private Integer maxTotalFloatingIps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxTotalInstances")

    private Integer maxTotalInstances;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxTotalKeypairs")

    private Integer maxTotalKeypairs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxTotalRAMSize")

    private Integer maxTotalRAMSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalCoresUsed")

    private Integer totalCoresUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalFloatingIpsUsed")

    private Integer totalFloatingIpsUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalInstancesUsed")

    private Integer totalInstancesUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalRAMUsed")

    private Integer totalRAMUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalSecurityGroupsUsed")

    private Integer totalSecurityGroupsUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalServerGroupsUsed")

    private Integer totalServerGroupsUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxTotalSpotInstances")

    private Integer maxTotalSpotInstances;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxTotalSpotCores")

    private Integer maxTotalSpotCores;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxTotalSpotRAMSize")

    private Integer maxTotalSpotRAMSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalSpotInstancesUsed")

    private Integer totalSpotInstancesUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalSpotCoresUsed")

    private Integer totalSpotCoresUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalSpotRAMUsed")

    private Integer totalSpotRAMUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_by_flavor")

    private List<ProjectFlavorLimit> limitByFlavor = null;

    public ServerLimits withMaxImageMeta(Integer maxImageMeta) {
        this.maxImageMeta = maxImageMeta;
        return this;
    }

    public Integer getMaxImageMeta() {
        return maxImageMeta;
    }

    public void setMaxImageMeta(Integer maxImageMeta) {
        this.maxImageMeta = maxImageMeta;
    }

    public ServerLimits withMaxPersonality(Integer maxPersonality) {
        this.maxPersonality = maxPersonality;
        return this;
    }

    public Integer getMaxPersonality() {
        return maxPersonality;
    }

    public void setMaxPersonality(Integer maxPersonality) {
        this.maxPersonality = maxPersonality;
    }

    public ServerLimits withMaxPersonalitySize(Integer maxPersonalitySize) {
        this.maxPersonalitySize = maxPersonalitySize;
        return this;
    }

    public Integer getMaxPersonalitySize() {
        return maxPersonalitySize;
    }

    public void setMaxPersonalitySize(Integer maxPersonalitySize) {
        this.maxPersonalitySize = maxPersonalitySize;
    }

    public ServerLimits withMaxSecurityGroupRules(Integer maxSecurityGroupRules) {
        this.maxSecurityGroupRules = maxSecurityGroupRules;
        return this;
    }

    public Integer getMaxSecurityGroupRules() {
        return maxSecurityGroupRules;
    }

    public void setMaxSecurityGroupRules(Integer maxSecurityGroupRules) {
        this.maxSecurityGroupRules = maxSecurityGroupRules;
    }

    public ServerLimits withMaxSecurityGroups(Integer maxSecurityGroups) {
        this.maxSecurityGroups = maxSecurityGroups;
        return this;
    }

    public Integer getMaxSecurityGroups() {
        return maxSecurityGroups;
    }

    public void setMaxSecurityGroups(Integer maxSecurityGroups) {
        this.maxSecurityGroups = maxSecurityGroups;
    }

    public ServerLimits withMaxServerGroupMembers(Integer maxServerGroupMembers) {
        this.maxServerGroupMembers = maxServerGroupMembers;
        return this;
    }

    public Integer getMaxServerGroupMembers() {
        return maxServerGroupMembers;
    }

    public void setMaxServerGroupMembers(Integer maxServerGroupMembers) {
        this.maxServerGroupMembers = maxServerGroupMembers;
    }

    public ServerLimits withMaxServerGroups(Integer maxServerGroups) {
        this.maxServerGroups = maxServerGroups;
        return this;
    }

    public Integer getMaxServerGroups() {
        return maxServerGroups;
    }

    public void setMaxServerGroups(Integer maxServerGroups) {
        this.maxServerGroups = maxServerGroups;
    }

    public ServerLimits withMaxServerMeta(Integer maxServerMeta) {
        this.maxServerMeta = maxServerMeta;
        return this;
    }

    public Integer getMaxServerMeta() {
        return maxServerMeta;
    }

    public void setMaxServerMeta(Integer maxServerMeta) {
        this.maxServerMeta = maxServerMeta;
    }

    public ServerLimits withMaxTotalCores(Integer maxTotalCores) {
        this.maxTotalCores = maxTotalCores;
        return this;
    }

    public Integer getMaxTotalCores() {
        return maxTotalCores;
    }

    public void setMaxTotalCores(Integer maxTotalCores) {
        this.maxTotalCores = maxTotalCores;
    }

    public ServerLimits withMaxTotalFloatingIps(Integer maxTotalFloatingIps) {
        this.maxTotalFloatingIps = maxTotalFloatingIps;
        return this;
    }

    public Integer getMaxTotalFloatingIps() {
        return maxTotalFloatingIps;
    }

    public void setMaxTotalFloatingIps(Integer maxTotalFloatingIps) {
        this.maxTotalFloatingIps = maxTotalFloatingIps;
    }

    public ServerLimits withMaxTotalInstances(Integer maxTotalInstances) {
        this.maxTotalInstances = maxTotalInstances;
        return this;
    }

    public Integer getMaxTotalInstances() {
        return maxTotalInstances;
    }

    public void setMaxTotalInstances(Integer maxTotalInstances) {
        this.maxTotalInstances = maxTotalInstances;
    }

    public ServerLimits withMaxTotalKeypairs(Integer maxTotalKeypairs) {
        this.maxTotalKeypairs = maxTotalKeypairs;
        return this;
    }

    public Integer getMaxTotalKeypairs() {
        return maxTotalKeypairs;
    }

    public void setMaxTotalKeypairs(Integer maxTotalKeypairs) {
        this.maxTotalKeypairs = maxTotalKeypairs;
    }

    public ServerLimits withMaxTotalRAMSize(Integer maxTotalRAMSize) {
        this.maxTotalRAMSize = maxTotalRAMSize;
        return this;
    }

    public Integer getMaxTotalRAMSize() {
        return maxTotalRAMSize;
    }

    public void setMaxTotalRAMSize(Integer maxTotalRAMSize) {
        this.maxTotalRAMSize = maxTotalRAMSize;
    }

    public ServerLimits withTotalCoresUsed(Integer totalCoresUsed) {
        this.totalCoresUsed = totalCoresUsed;
        return this;
    }

    public Integer getTotalCoresUsed() {
        return totalCoresUsed;
    }

    public void setTotalCoresUsed(Integer totalCoresUsed) {
        this.totalCoresUsed = totalCoresUsed;
    }

    public ServerLimits withTotalFloatingIpsUsed(Integer totalFloatingIpsUsed) {
        this.totalFloatingIpsUsed = totalFloatingIpsUsed;
        return this;
    }

    public Integer getTotalFloatingIpsUsed() {
        return totalFloatingIpsUsed;
    }

    public void setTotalFloatingIpsUsed(Integer totalFloatingIpsUsed) {
        this.totalFloatingIpsUsed = totalFloatingIpsUsed;
    }

    public ServerLimits withTotalInstancesUsed(Integer totalInstancesUsed) {
        this.totalInstancesUsed = totalInstancesUsed;
        return this;
    }

    public Integer getTotalInstancesUsed() {
        return totalInstancesUsed;
    }

    public void setTotalInstancesUsed(Integer totalInstancesUsed) {
        this.totalInstancesUsed = totalInstancesUsed;
    }

    public ServerLimits withTotalRAMUsed(Integer totalRAMUsed) {
        this.totalRAMUsed = totalRAMUsed;
        return this;
    }

    public Integer getTotalRAMUsed() {
        return totalRAMUsed;
    }

    public void setTotalRAMUsed(Integer totalRAMUsed) {
        this.totalRAMUsed = totalRAMUsed;
    }

    public ServerLimits withTotalSecurityGroupsUsed(Integer totalSecurityGroupsUsed) {
        this.totalSecurityGroupsUsed = totalSecurityGroupsUsed;
        return this;
    }

    public Integer getTotalSecurityGroupsUsed() {
        return totalSecurityGroupsUsed;
    }

    public void setTotalSecurityGroupsUsed(Integer totalSecurityGroupsUsed) {
        this.totalSecurityGroupsUsed = totalSecurityGroupsUsed;
    }

    public ServerLimits withTotalServerGroupsUsed(Integer totalServerGroupsUsed) {
        this.totalServerGroupsUsed = totalServerGroupsUsed;
        return this;
    }

    public Integer getTotalServerGroupsUsed() {
        return totalServerGroupsUsed;
    }

    public void setTotalServerGroupsUsed(Integer totalServerGroupsUsed) {
        this.totalServerGroupsUsed = totalServerGroupsUsed;
    }

    public ServerLimits withMaxTotalSpotInstances(Integer maxTotalSpotInstances) {
        this.maxTotalSpotInstances = maxTotalSpotInstances;
        return this;
    }

    public Integer getMaxTotalSpotInstances() {
        return maxTotalSpotInstances;
    }

    public void setMaxTotalSpotInstances(Integer maxTotalSpotInstances) {
        this.maxTotalSpotInstances = maxTotalSpotInstances;
    }

    public ServerLimits withMaxTotalSpotCores(Integer maxTotalSpotCores) {
        this.maxTotalSpotCores = maxTotalSpotCores;
        return this;
    }

    public Integer getMaxTotalSpotCores() {
        return maxTotalSpotCores;
    }

    public void setMaxTotalSpotCores(Integer maxTotalSpotCores) {
        this.maxTotalSpotCores = maxTotalSpotCores;
    }

    public ServerLimits withMaxTotalSpotRAMSize(Integer maxTotalSpotRAMSize) {
        this.maxTotalSpotRAMSize = maxTotalSpotRAMSize;
        return this;
    }

    public Integer getMaxTotalSpotRAMSize() {
        return maxTotalSpotRAMSize;
    }

    public void setMaxTotalSpotRAMSize(Integer maxTotalSpotRAMSize) {
        this.maxTotalSpotRAMSize = maxTotalSpotRAMSize;
    }

    public ServerLimits withTotalSpotInstancesUsed(Integer totalSpotInstancesUsed) {
        this.totalSpotInstancesUsed = totalSpotInstancesUsed;
        return this;
    }

    public Integer getTotalSpotInstancesUsed() {
        return totalSpotInstancesUsed;
    }

    public void setTotalSpotInstancesUsed(Integer totalSpotInstancesUsed) {
        this.totalSpotInstancesUsed = totalSpotInstancesUsed;
    }

    public ServerLimits withTotalSpotCoresUsed(Integer totalSpotCoresUsed) {
        this.totalSpotCoresUsed = totalSpotCoresUsed;
        return this;
    }

    public Integer getTotalSpotCoresUsed() {
        return totalSpotCoresUsed;
    }

    public void setTotalSpotCoresUsed(Integer totalSpotCoresUsed) {
        this.totalSpotCoresUsed = totalSpotCoresUsed;
    }

    public ServerLimits withTotalSpotRAMUsed(Integer totalSpotRAMUsed) {
        this.totalSpotRAMUsed = totalSpotRAMUsed;
        return this;
    }

    public Integer getTotalSpotRAMUsed() {
        return totalSpotRAMUsed;
    }

    public void setTotalSpotRAMUsed(Integer totalSpotRAMUsed) {
        this.totalSpotRAMUsed = totalSpotRAMUsed;
    }

    public ServerLimits withLimitByFlavor(List<ProjectFlavorLimit> limitByFlavor) {
        this.limitByFlavor = limitByFlavor;
        return this;
    }

    public ServerLimits addLimitByFlavorItem(ProjectFlavorLimit limitByFlavorItem) {
        if (this.limitByFlavor == null) {
            this.limitByFlavor = new ArrayList<>();
        }
        this.limitByFlavor.add(limitByFlavorItem);
        return this;
    }

    public ServerLimits withLimitByFlavor(Consumer<List<ProjectFlavorLimit>> limitByFlavorSetter) {
        if (this.limitByFlavor == null) {
            this.limitByFlavor = new ArrayList<>();
        }
        limitByFlavorSetter.accept(this.limitByFlavor);
        return this;
    }

    public List<ProjectFlavorLimit> getLimitByFlavor() {
        return limitByFlavor;
    }

    public void setLimitByFlavor(List<ProjectFlavorLimit> limitByFlavor) {
        this.limitByFlavor = limitByFlavor;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServerLimits serverLimits = (ServerLimits) o;
        return Objects.equals(this.maxImageMeta, serverLimits.maxImageMeta)
            && Objects.equals(this.maxPersonality, serverLimits.maxPersonality)
            && Objects.equals(this.maxPersonalitySize, serverLimits.maxPersonalitySize)
            && Objects.equals(this.maxSecurityGroupRules, serverLimits.maxSecurityGroupRules)
            && Objects.equals(this.maxSecurityGroups, serverLimits.maxSecurityGroups)
            && Objects.equals(this.maxServerGroupMembers, serverLimits.maxServerGroupMembers)
            && Objects.equals(this.maxServerGroups, serverLimits.maxServerGroups)
            && Objects.equals(this.maxServerMeta, serverLimits.maxServerMeta)
            && Objects.equals(this.maxTotalCores, serverLimits.maxTotalCores)
            && Objects.equals(this.maxTotalFloatingIps, serverLimits.maxTotalFloatingIps)
            && Objects.equals(this.maxTotalInstances, serverLimits.maxTotalInstances)
            && Objects.equals(this.maxTotalKeypairs, serverLimits.maxTotalKeypairs)
            && Objects.equals(this.maxTotalRAMSize, serverLimits.maxTotalRAMSize)
            && Objects.equals(this.totalCoresUsed, serverLimits.totalCoresUsed)
            && Objects.equals(this.totalFloatingIpsUsed, serverLimits.totalFloatingIpsUsed)
            && Objects.equals(this.totalInstancesUsed, serverLimits.totalInstancesUsed)
            && Objects.equals(this.totalRAMUsed, serverLimits.totalRAMUsed)
            && Objects.equals(this.totalSecurityGroupsUsed, serverLimits.totalSecurityGroupsUsed)
            && Objects.equals(this.totalServerGroupsUsed, serverLimits.totalServerGroupsUsed)
            && Objects.equals(this.maxTotalSpotInstances, serverLimits.maxTotalSpotInstances)
            && Objects.equals(this.maxTotalSpotCores, serverLimits.maxTotalSpotCores)
            && Objects.equals(this.maxTotalSpotRAMSize, serverLimits.maxTotalSpotRAMSize)
            && Objects.equals(this.totalSpotInstancesUsed, serverLimits.totalSpotInstancesUsed)
            && Objects.equals(this.totalSpotCoresUsed, serverLimits.totalSpotCoresUsed)
            && Objects.equals(this.totalSpotRAMUsed, serverLimits.totalSpotRAMUsed)
            && Objects.equals(this.limitByFlavor, serverLimits.limitByFlavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxImageMeta,
            maxPersonality,
            maxPersonalitySize,
            maxSecurityGroupRules,
            maxSecurityGroups,
            maxServerGroupMembers,
            maxServerGroups,
            maxServerMeta,
            maxTotalCores,
            maxTotalFloatingIps,
            maxTotalInstances,
            maxTotalKeypairs,
            maxTotalRAMSize,
            totalCoresUsed,
            totalFloatingIpsUsed,
            totalInstancesUsed,
            totalRAMUsed,
            totalSecurityGroupsUsed,
            totalServerGroupsUsed,
            maxTotalSpotInstances,
            maxTotalSpotCores,
            maxTotalSpotRAMSize,
            totalSpotInstancesUsed,
            totalSpotCoresUsed,
            totalSpotRAMUsed,
            limitByFlavor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerLimits {\n");
        sb.append("    maxImageMeta: ").append(toIndentedString(maxImageMeta)).append("\n");
        sb.append("    maxPersonality: ").append(toIndentedString(maxPersonality)).append("\n");
        sb.append("    maxPersonalitySize: ").append(toIndentedString(maxPersonalitySize)).append("\n");
        sb.append("    maxSecurityGroupRules: ").append(toIndentedString(maxSecurityGroupRules)).append("\n");
        sb.append("    maxSecurityGroups: ").append(toIndentedString(maxSecurityGroups)).append("\n");
        sb.append("    maxServerGroupMembers: ").append(toIndentedString(maxServerGroupMembers)).append("\n");
        sb.append("    maxServerGroups: ").append(toIndentedString(maxServerGroups)).append("\n");
        sb.append("    maxServerMeta: ").append(toIndentedString(maxServerMeta)).append("\n");
        sb.append("    maxTotalCores: ").append(toIndentedString(maxTotalCores)).append("\n");
        sb.append("    maxTotalFloatingIps: ").append(toIndentedString(maxTotalFloatingIps)).append("\n");
        sb.append("    maxTotalInstances: ").append(toIndentedString(maxTotalInstances)).append("\n");
        sb.append("    maxTotalKeypairs: ").append(toIndentedString(maxTotalKeypairs)).append("\n");
        sb.append("    maxTotalRAMSize: ").append(toIndentedString(maxTotalRAMSize)).append("\n");
        sb.append("    totalCoresUsed: ").append(toIndentedString(totalCoresUsed)).append("\n");
        sb.append("    totalFloatingIpsUsed: ").append(toIndentedString(totalFloatingIpsUsed)).append("\n");
        sb.append("    totalInstancesUsed: ").append(toIndentedString(totalInstancesUsed)).append("\n");
        sb.append("    totalRAMUsed: ").append(toIndentedString(totalRAMUsed)).append("\n");
        sb.append("    totalSecurityGroupsUsed: ").append(toIndentedString(totalSecurityGroupsUsed)).append("\n");
        sb.append("    totalServerGroupsUsed: ").append(toIndentedString(totalServerGroupsUsed)).append("\n");
        sb.append("    maxTotalSpotInstances: ").append(toIndentedString(maxTotalSpotInstances)).append("\n");
        sb.append("    maxTotalSpotCores: ").append(toIndentedString(maxTotalSpotCores)).append("\n");
        sb.append("    maxTotalSpotRAMSize: ").append(toIndentedString(maxTotalSpotRAMSize)).append("\n");
        sb.append("    totalSpotInstancesUsed: ").append(toIndentedString(totalSpotInstancesUsed)).append("\n");
        sb.append("    totalSpotCoresUsed: ").append(toIndentedString(totalSpotCoresUsed)).append("\n");
        sb.append("    totalSpotRAMUsed: ").append(toIndentedString(totalSpotRAMUsed)).append("\n");
        sb.append("    limitByFlavor: ").append(toIndentedString(limitByFlavor)).append("\n");
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
