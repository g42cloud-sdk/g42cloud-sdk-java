package com.g42cloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据库信息。
 */
public class PostgresqlDatabaseForCreation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "character_set")

    private String characterSet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template")

    private String template;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lc_collate")

    private String lcCollate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lc_ctype")

    private String lcCtype;

    public PostgresqlDatabaseForCreation withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PostgresqlDatabaseForCreation withCharacterSet(String characterSet) {
        this.characterSet = characterSet;
        return this;
    }

    public String getCharacterSet() {
        return characterSet;
    }

    public void setCharacterSet(String characterSet) {
        this.characterSet = characterSet;
    }

    public PostgresqlDatabaseForCreation withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public PostgresqlDatabaseForCreation withTemplate(String template) {
        this.template = template;
        return this;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public PostgresqlDatabaseForCreation withLcCollate(String lcCollate) {
        this.lcCollate = lcCollate;
        return this;
    }

    public String getLcCollate() {
        return lcCollate;
    }

    public void setLcCollate(String lcCollate) {
        this.lcCollate = lcCollate;
    }

    public PostgresqlDatabaseForCreation withLcCtype(String lcCtype) {
        this.lcCtype = lcCtype;
        return this;
    }

    public String getLcCtype() {
        return lcCtype;
    }

    public void setLcCtype(String lcCtype) {
        this.lcCtype = lcCtype;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PostgresqlDatabaseForCreation that = (PostgresqlDatabaseForCreation) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.characterSet, that.characterSet)
            && Objects.equals(this.owner, that.owner) && Objects.equals(this.template, that.template)
            && Objects.equals(this.lcCollate, that.lcCollate) && Objects.equals(this.lcCtype, that.lcCtype);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, characterSet, owner, template, lcCollate, lcCtype);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostgresqlDatabaseForCreation {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    characterSet: ").append(toIndentedString(characterSet)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
        sb.append("    lcCollate: ").append(toIndentedString(lcCollate)).append("\n");
        sb.append("    lcCtype: ").append(toIndentedString(lcCtype)).append("\n");
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
