package com.g42cloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * SetBackupPolicyRequestBody
 */
public class SetBackupPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_policy")

    private BackupPolicy backupPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reserve_backups")

    private Boolean reserveBackups;

    public SetBackupPolicyRequestBody withBackupPolicy(BackupPolicy backupPolicy) {
        this.backupPolicy = backupPolicy;
        return this;
    }

    public SetBackupPolicyRequestBody withBackupPolicy(Consumer<BackupPolicy> backupPolicySetter) {
        if (this.backupPolicy == null) {
            this.backupPolicy = new BackupPolicy();
            backupPolicySetter.accept(this.backupPolicy);
        }

        return this;
    }

    public BackupPolicy getBackupPolicy() {
        return backupPolicy;
    }

    public void setBackupPolicy(BackupPolicy backupPolicy) {
        this.backupPolicy = backupPolicy;
    }

    public SetBackupPolicyRequestBody withReserveBackups(Boolean reserveBackups) {
        this.reserveBackups = reserveBackups;
        return this;
    }

    public Boolean getReserveBackups() {
        return reserveBackups;
    }

    public void setReserveBackups(Boolean reserveBackups) {
        this.reserveBackups = reserveBackups;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetBackupPolicyRequestBody that = (SetBackupPolicyRequestBody) obj;
        return Objects.equals(this.backupPolicy, that.backupPolicy)
            && Objects.equals(this.reserveBackups, that.reserveBackups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupPolicy, reserveBackups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetBackupPolicyRequestBody {\n");
        sb.append("    backupPolicy: ").append(toIndentedString(backupPolicy)).append("\n");
        sb.append("    reserveBackups: ").append(toIndentedString(reserveBackups)).append("\n");
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
