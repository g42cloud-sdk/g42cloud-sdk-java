package com.g42cloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class MigrateSubNetworkInterfaceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dry_run")

    private Boolean dryRun;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migration_info")

    private MigrateSubNetworkInterfaceOption migrationInfo;

    public MigrateSubNetworkInterfaceRequestBody withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    public MigrateSubNetworkInterfaceRequestBody withMigrationInfo(MigrateSubNetworkInterfaceOption migrationInfo) {
        this.migrationInfo = migrationInfo;
        return this;
    }

    public MigrateSubNetworkInterfaceRequestBody withMigrationInfo(
        Consumer<MigrateSubNetworkInterfaceOption> migrationInfoSetter) {
        if (this.migrationInfo == null) {
            this.migrationInfo = new MigrateSubNetworkInterfaceOption();
            migrationInfoSetter.accept(this.migrationInfo);
        }

        return this;
    }

    public MigrateSubNetworkInterfaceOption getMigrationInfo() {
        return migrationInfo;
    }

    public void setMigrationInfo(MigrateSubNetworkInterfaceOption migrationInfo) {
        this.migrationInfo = migrationInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MigrateSubNetworkInterfaceRequestBody that = (MigrateSubNetworkInterfaceRequestBody) obj;
        return Objects.equals(this.dryRun, that.dryRun) && Objects.equals(this.migrationInfo, that.migrationInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dryRun, migrationInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrateSubNetworkInterfaceRequestBody {\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    migrationInfo: ").append(toIndentedString(migrationInfo)).append("\n");
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
