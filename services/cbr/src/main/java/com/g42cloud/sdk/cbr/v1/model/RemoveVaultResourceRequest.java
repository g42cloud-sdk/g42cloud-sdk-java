package com.g42cloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class RemoveVaultResourceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_id")

    private String vaultId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private VaultRemoveResourceReq body;

    public RemoveVaultResourceRequest withVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }

    public String getVaultId() {
        return vaultId;
    }

    public void setVaultId(String vaultId) {
        this.vaultId = vaultId;
    }

    public RemoveVaultResourceRequest withBody(VaultRemoveResourceReq body) {
        this.body = body;
        return this;
    }

    public RemoveVaultResourceRequest withBody(Consumer<VaultRemoveResourceReq> bodySetter) {
        if (this.body == null) {
            this.body = new VaultRemoveResourceReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public VaultRemoveResourceReq getBody() {
        return body;
    }

    public void setBody(VaultRemoveResourceReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RemoveVaultResourceRequest that = (RemoveVaultResourceRequest) obj;
        return Objects.equals(this.vaultId, that.vaultId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vaultId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemoveVaultResourceRequest {\n");
        sb.append("    vaultId: ").append(toIndentedString(vaultId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
