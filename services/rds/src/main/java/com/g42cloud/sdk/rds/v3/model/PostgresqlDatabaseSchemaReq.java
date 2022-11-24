package com.g42cloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建数据库schema信息。
 */
public class PostgresqlDatabaseSchemaReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schemas")

    private List<PostgresqlCreateSchemaReq> schemas = null;

    public PostgresqlDatabaseSchemaReq withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public PostgresqlDatabaseSchemaReq withSchemas(List<PostgresqlCreateSchemaReq> schemas) {
        this.schemas = schemas;
        return this;
    }

    public PostgresqlDatabaseSchemaReq addSchemasItem(PostgresqlCreateSchemaReq schemasItem) {
        if (this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        this.schemas.add(schemasItem);
        return this;
    }

    public PostgresqlDatabaseSchemaReq withSchemas(Consumer<List<PostgresqlCreateSchemaReq>> schemasSetter) {
        if (this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        schemasSetter.accept(this.schemas);
        return this;
    }

    public List<PostgresqlCreateSchemaReq> getSchemas() {
        return schemas;
    }

    public void setSchemas(List<PostgresqlCreateSchemaReq> schemas) {
        this.schemas = schemas;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostgresqlDatabaseSchemaReq postgresqlDatabaseSchemaReq = (PostgresqlDatabaseSchemaReq) o;
        return Objects.equals(this.dbName, postgresqlDatabaseSchemaReq.dbName)
            && Objects.equals(this.schemas, postgresqlDatabaseSchemaReq.schemas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbName, schemas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostgresqlDatabaseSchemaReq {\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
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
