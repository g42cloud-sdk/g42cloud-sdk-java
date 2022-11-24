package com.g42cloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RestoreTablesRequestBody
 */
public class RestoreTablesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restoreTime")

    private Long restoreTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restoreTables")

    private List<RestoreDatabasesInfo> restoreTables = null;

    public RestoreTablesRequestBody withRestoreTime(Long restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }

    public Long getRestoreTime() {
        return restoreTime;
    }

    public void setRestoreTime(Long restoreTime) {
        this.restoreTime = restoreTime;
    }

    public RestoreTablesRequestBody withRestoreTables(List<RestoreDatabasesInfo> restoreTables) {
        this.restoreTables = restoreTables;
        return this;
    }

    public RestoreTablesRequestBody addRestoreTablesItem(RestoreDatabasesInfo restoreTablesItem) {
        if (this.restoreTables == null) {
            this.restoreTables = new ArrayList<>();
        }
        this.restoreTables.add(restoreTablesItem);
        return this;
    }

    public RestoreTablesRequestBody withRestoreTables(Consumer<List<RestoreDatabasesInfo>> restoreTablesSetter) {
        if (this.restoreTables == null) {
            this.restoreTables = new ArrayList<>();
        }
        restoreTablesSetter.accept(this.restoreTables);
        return this;
    }

    public List<RestoreDatabasesInfo> getRestoreTables() {
        return restoreTables;
    }

    public void setRestoreTables(List<RestoreDatabasesInfo> restoreTables) {
        this.restoreTables = restoreTables;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestoreTablesRequestBody restoreTablesRequestBody = (RestoreTablesRequestBody) o;
        return Objects.equals(this.restoreTime, restoreTablesRequestBody.restoreTime)
            && Objects.equals(this.restoreTables, restoreTablesRequestBody.restoreTables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restoreTime, restoreTables);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreTablesRequestBody {\n");
        sb.append("    restoreTime: ").append(toIndentedString(restoreTime)).append("\n");
        sb.append("    restoreTables: ").append(toIndentedString(restoreTables)).append("\n");
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
