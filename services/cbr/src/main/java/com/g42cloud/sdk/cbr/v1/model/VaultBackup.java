package com.g42cloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * VaultBackup
 */
public class VaultBackup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private CheckpointParam parameters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_id")

    private String vaultId;

    public VaultBackup withParameters(CheckpointParam parameters) {
        this.parameters = parameters;
        return this;
    }

    public VaultBackup withParameters(Consumer<CheckpointParam> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new CheckpointParam();
            parametersSetter.accept(this.parameters);
        }

        return this;
    }

    public CheckpointParam getParameters() {
        return parameters;
    }

    public void setParameters(CheckpointParam parameters) {
        this.parameters = parameters;
    }

    public VaultBackup withVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }

    public String getVaultId() {
        return vaultId;
    }

    public void setVaultId(String vaultId) {
        this.vaultId = vaultId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VaultBackup vaultBackup = (VaultBackup) o;
        return Objects.equals(this.parameters, vaultBackup.parameters)
            && Objects.equals(this.vaultId, vaultBackup.vaultId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parameters, vaultId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VaultBackup {\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    vaultId: ").append(toIndentedString(vaultId)).append("\n");
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
