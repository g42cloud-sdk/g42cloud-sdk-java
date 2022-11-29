package com.g42cloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CopyBackupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_id")

    private String backupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BackupReplicateReq body;

    public CopyBackupRequest withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public CopyBackupRequest withBody(BackupReplicateReq body) {
        this.body = body;
        return this;
    }

    public CopyBackupRequest withBody(Consumer<BackupReplicateReq> bodySetter) {
        if (this.body == null) {
            this.body = new BackupReplicateReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public BackupReplicateReq getBody() {
        return body;
    }

    public void setBody(BackupReplicateReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CopyBackupRequest copyBackupRequest = (CopyBackupRequest) o;
        return Objects.equals(this.backupId, copyBackupRequest.backupId)
            && Objects.equals(this.body, copyBackupRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopyBackupRequest {\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
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
