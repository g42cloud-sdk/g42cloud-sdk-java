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
public class ListOffSiteBackupsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backups")

    private List<OffSiteBackupForList> backups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListOffSiteBackupsResponse withBackups(List<OffSiteBackupForList> backups) {
        this.backups = backups;
        return this;
    }

    public ListOffSiteBackupsResponse addBackupsItem(OffSiteBackupForList backupsItem) {
        if (this.backups == null) {
            this.backups = new ArrayList<>();
        }
        this.backups.add(backupsItem);
        return this;
    }

    public ListOffSiteBackupsResponse withBackups(Consumer<List<OffSiteBackupForList>> backupsSetter) {
        if (this.backups == null) {
            this.backups = new ArrayList<>();
        }
        backupsSetter.accept(this.backups);
        return this;
    }

    public List<OffSiteBackupForList> getBackups() {
        return backups;
    }

    public void setBackups(List<OffSiteBackupForList> backups) {
        this.backups = backups;
    }

    public ListOffSiteBackupsResponse withTotalCount(Integer totalCount) {
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
        ListOffSiteBackupsResponse listOffSiteBackupsResponse = (ListOffSiteBackupsResponse) o;
        return Objects.equals(this.backups, listOffSiteBackupsResponse.backups)
            && Objects.equals(this.totalCount, listOffSiteBackupsResponse.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backups, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOffSiteBackupsResponse {\n");
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
