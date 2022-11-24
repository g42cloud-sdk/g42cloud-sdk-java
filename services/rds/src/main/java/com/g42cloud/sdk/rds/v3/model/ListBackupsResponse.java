package com.g42cloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListBackupsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backups")

    private List<BackupForList> backups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListBackupsResponse withBackups(List<BackupForList> backups) {
        this.backups = backups;
        return this;
    }

    public ListBackupsResponse addBackupsItem(BackupForList backupsItem) {
        if (this.backups == null) {
            this.backups = new ArrayList<>();
        }
        this.backups.add(backupsItem);
        return this;
    }

    public ListBackupsResponse withBackups(Consumer<List<BackupForList>> backupsSetter) {
        if (this.backups == null) {
            this.backups = new ArrayList<>();
        }
        backupsSetter.accept(this.backups);
        return this;
    }

    public List<BackupForList> getBackups() {
        return backups;
    }

    public void setBackups(List<BackupForList> backups) {
        this.backups = backups;
    }

    public ListBackupsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListBackupsResponse listBackupsResponse = (ListBackupsResponse) o;
        return Objects.equals(this.backups, listBackupsResponse.backups)
            && Objects.equals(this.totalCount, listBackupsResponse.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backups, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBackupsResponse {\n");
        sb.append("    backups: ").append(toIndentedString(backups)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
