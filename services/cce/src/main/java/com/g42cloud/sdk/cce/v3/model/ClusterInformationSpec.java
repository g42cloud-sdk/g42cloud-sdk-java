package com.g42cloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class ClusterInformationSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customSan")

    private List<String> customSan = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "containerNetwork")

    private ContainerNetworkUpdate containerNetwork;

    public ClusterInformationSpec withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ClusterInformationSpec withCustomSan(List<String> customSan) {
        this.customSan = customSan;
        return this;
    }

    public ClusterInformationSpec addCustomSanItem(String customSanItem) {
        if (this.customSan == null) {
            this.customSan = new ArrayList<>();
        }
        this.customSan.add(customSanItem);
        return this;
    }

    public ClusterInformationSpec withCustomSan(Consumer<List<String>> customSanSetter) {
        if (this.customSan == null) {
            this.customSan = new ArrayList<>();
        }
        customSanSetter.accept(this.customSan);
        return this;
    }

    public List<String> getCustomSan() {
        return customSan;
    }

    public void setCustomSan(List<String> customSan) {
        this.customSan = customSan;
    }

    public ClusterInformationSpec withContainerNetwork(ContainerNetworkUpdate containerNetwork) {
        this.containerNetwork = containerNetwork;
        return this;
    }

    public ClusterInformationSpec withContainerNetwork(Consumer<ContainerNetworkUpdate> containerNetworkSetter) {
        if (this.containerNetwork == null) {
            this.containerNetwork = new ContainerNetworkUpdate();
            containerNetworkSetter.accept(this.containerNetwork);
        }

        return this;
    }

    public ContainerNetworkUpdate getContainerNetwork() {
        return containerNetwork;
    }

    public void setContainerNetwork(ContainerNetworkUpdate containerNetwork) {
        this.containerNetwork = containerNetwork;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterInformationSpec that = (ClusterInformationSpec) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.customSan, that.customSan)
            && Objects.equals(this.containerNetwork, that.containerNetwork);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, customSan, containerNetwork);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterInformationSpec {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    customSan: ").append(toIndentedString(customSan)).append("\n");
        sb.append("    containerNetwork: ").append(toIndentedString(containerNetwork)).append("\n");
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
