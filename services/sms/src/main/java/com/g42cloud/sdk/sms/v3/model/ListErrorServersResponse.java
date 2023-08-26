package com.g42cloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListErrorServersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migration_errors")

    private List<MigrationErrors> migrationErrors = null;

    public ListErrorServersResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListErrorServersResponse withMigrationErrors(List<MigrationErrors> migrationErrors) {
        this.migrationErrors = migrationErrors;
        return this;
    }

    public ListErrorServersResponse addMigrationErrorsItem(MigrationErrors migrationErrorsItem) {
        if (this.migrationErrors == null) {
            this.migrationErrors = new ArrayList<>();
        }
        this.migrationErrors.add(migrationErrorsItem);
        return this;
    }

    public ListErrorServersResponse withMigrationErrors(Consumer<List<MigrationErrors>> migrationErrorsSetter) {
        if (this.migrationErrors == null) {
            this.migrationErrors = new ArrayList<>();
        }
        migrationErrorsSetter.accept(this.migrationErrors);
        return this;
    }

    public List<MigrationErrors> getMigrationErrors() {
        return migrationErrors;
    }

    public void setMigrationErrors(List<MigrationErrors> migrationErrors) {
        this.migrationErrors = migrationErrors;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListErrorServersResponse that = (ListErrorServersResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.migrationErrors, that.migrationErrors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, migrationErrors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListErrorServersResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    migrationErrors: ").append(toIndentedString(migrationErrors)).append("\n");
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
