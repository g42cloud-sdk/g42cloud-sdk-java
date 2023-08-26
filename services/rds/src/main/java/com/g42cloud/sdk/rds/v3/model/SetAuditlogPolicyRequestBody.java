package com.g42cloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SetAuditlogPolicyRequestBody
 */
public class SetAuditlogPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_days")

    private Integer keepDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reserve_auditlogs")

    private Boolean reserveAuditlogs;

    public SetAuditlogPolicyRequestBody withKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
        return this;
    }

    public Integer getKeepDays() {
        return keepDays;
    }

    public void setKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
    }

    public SetAuditlogPolicyRequestBody withReserveAuditlogs(Boolean reserveAuditlogs) {
        this.reserveAuditlogs = reserveAuditlogs;
        return this;
    }

    public Boolean getReserveAuditlogs() {
        return reserveAuditlogs;
    }

    public void setReserveAuditlogs(Boolean reserveAuditlogs) {
        this.reserveAuditlogs = reserveAuditlogs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetAuditlogPolicyRequestBody that = (SetAuditlogPolicyRequestBody) obj;
        return Objects.equals(this.keepDays, that.keepDays)
            && Objects.equals(this.reserveAuditlogs, that.reserveAuditlogs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keepDays, reserveAuditlogs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetAuditlogPolicyRequestBody {\n");
        sb.append("    keepDays: ").append(toIndentedString(keepDays)).append("\n");
        sb.append("    reserveAuditlogs: ").append(toIndentedString(reserveAuditlogs)).append("\n");
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
