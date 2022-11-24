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
public class ListAuthorizedDatabasesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases")

    private List<DatabaseWithPrivilege> databases = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListAuthorizedDatabasesResponse withDatabases(List<DatabaseWithPrivilege> databases) {
        this.databases = databases;
        return this;
    }

    public ListAuthorizedDatabasesResponse addDatabasesItem(DatabaseWithPrivilege databasesItem) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public ListAuthorizedDatabasesResponse withDatabases(Consumer<List<DatabaseWithPrivilege>> databasesSetter) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    public List<DatabaseWithPrivilege> getDatabases() {
        return databases;
    }

    public void setDatabases(List<DatabaseWithPrivilege> databases) {
        this.databases = databases;
    }

    public ListAuthorizedDatabasesResponse withTotalCount(Integer totalCount) {
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
        ListAuthorizedDatabasesResponse listAuthorizedDatabasesResponse = (ListAuthorizedDatabasesResponse) o;
        return Objects.equals(this.databases, listAuthorizedDatabasesResponse.databases)
            && Objects.equals(this.totalCount, listAuthorizedDatabasesResponse.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databases, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuthorizedDatabasesResponse {\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
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
