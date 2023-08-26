package com.g42cloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowBackupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup")

    private BackupResp backup;

    public ShowBackupResponse withBackup(BackupResp backup) {
        this.backup = backup;
        return this;
    }

    public ShowBackupResponse withBackup(Consumer<BackupResp> backupSetter) {
        if (this.backup == null) {
            this.backup = new BackupResp();
            backupSetter.accept(this.backup);
        }

        return this;
    }

    public BackupResp getBackup() {
        return backup;
    }

    public void setBackup(BackupResp backup) {
        this.backup = backup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBackupResponse that = (ShowBackupResponse) obj;
        return Objects.equals(this.backup, that.backup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBackupResponse {\n");
        sb.append("    backup: ").append(toIndentedString(backup)).append("\n");
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
