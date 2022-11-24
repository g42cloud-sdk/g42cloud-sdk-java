package com.g42cloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class CinderDeleteVolumeTransferRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transfer_id")

    private String transferId;

    public CinderDeleteVolumeTransferRequest withTransferId(String transferId) {
        this.transferId = transferId;
        return this;
    }

    public String getTransferId() {
        return transferId;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CinderDeleteVolumeTransferRequest cinderDeleteVolumeTransferRequest = (CinderDeleteVolumeTransferRequest) o;
        return Objects.equals(this.transferId, cinderDeleteVolumeTransferRequest.transferId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transferId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CinderDeleteVolumeTransferRequest {\n");
        sb.append("    transferId: ").append(toIndentedString(transferId)).append("\n");
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
