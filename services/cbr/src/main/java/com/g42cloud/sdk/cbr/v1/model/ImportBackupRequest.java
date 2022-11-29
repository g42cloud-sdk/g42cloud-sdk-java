package com.g42cloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ImportBackupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BackupSyncReq body;

    public ImportBackupRequest withBody(BackupSyncReq body) {
        this.body = body;
        return this;
    }

    public ImportBackupRequest withBody(Consumer<BackupSyncReq> bodySetter) {
        if (this.body == null) {
            this.body = new BackupSyncReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public BackupSyncReq getBody() {
        return body;
    }

    public void setBody(BackupSyncReq body) {
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
        ImportBackupRequest importBackupRequest = (ImportBackupRequest) o;
        return Objects.equals(this.body, importBackupRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportBackupRequest {\n");
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
