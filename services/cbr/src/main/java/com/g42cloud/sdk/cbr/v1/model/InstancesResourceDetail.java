package com.g42cloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class InstancesResourceDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault")

    private Vault vault;

    public InstancesResourceDetail withVault(Vault vault) {
        this.vault = vault;
        return this;
    }

    public InstancesResourceDetail withVault(Consumer<Vault> vaultSetter) {
        if (this.vault == null) {
            this.vault = new Vault();
            vaultSetter.accept(this.vault);
        }

        return this;
    }

    public Vault getVault() {
        return vault;
    }

    public void setVault(Vault vault) {
        this.vault = vault;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstancesResourceDetail instancesResourceDetail = (InstancesResourceDetail) o;
        return Objects.equals(this.vault, instancesResourceDetail.vault);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vault);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstancesResourceDetail {\n");
        sb.append("    vault: ").append(toIndentedString(vault)).append("\n");
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
