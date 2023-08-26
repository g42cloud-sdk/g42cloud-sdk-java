package com.g42cloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * VirtualSpace
 */
public class VirtualSpace {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private String size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lvmConfig")

    private LVMConfig lvmConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtimeConfig")

    private RuntimeConfig runtimeConfig;

    public VirtualSpace withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VirtualSpace withSize(String size) {
        this.size = size;
        return this;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public VirtualSpace withLvmConfig(LVMConfig lvmConfig) {
        this.lvmConfig = lvmConfig;
        return this;
    }

    public VirtualSpace withLvmConfig(Consumer<LVMConfig> lvmConfigSetter) {
        if (this.lvmConfig == null) {
            this.lvmConfig = new LVMConfig();
            lvmConfigSetter.accept(this.lvmConfig);
        }

        return this;
    }

    public LVMConfig getLvmConfig() {
        return lvmConfig;
    }

    public void setLvmConfig(LVMConfig lvmConfig) {
        this.lvmConfig = lvmConfig;
    }

    public VirtualSpace withRuntimeConfig(RuntimeConfig runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
        return this;
    }

    public VirtualSpace withRuntimeConfig(Consumer<RuntimeConfig> runtimeConfigSetter) {
        if (this.runtimeConfig == null) {
            this.runtimeConfig = new RuntimeConfig();
            runtimeConfigSetter.accept(this.runtimeConfig);
        }

        return this;
    }

    public RuntimeConfig getRuntimeConfig() {
        return runtimeConfig;
    }

    public void setRuntimeConfig(RuntimeConfig runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VirtualSpace that = (VirtualSpace) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.size, that.size)
            && Objects.equals(this.lvmConfig, that.lvmConfig) && Objects.equals(this.runtimeConfig, that.runtimeConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size, lvmConfig, runtimeConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VirtualSpace {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    lvmConfig: ").append(toIndentedString(lvmConfig)).append("\n");
        sb.append("    runtimeConfig: ").append(toIndentedString(runtimeConfig)).append("\n");
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
