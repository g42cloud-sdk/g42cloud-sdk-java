package com.g42cloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据库信息。
 */
public class SqlserverDatabaseForDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "character_set")

    private String characterSet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    public SqlserverDatabaseForDetail withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SqlserverDatabaseForDetail withCharacterSet(String characterSet) {
        this.characterSet = characterSet;
        return this;
    }

    public String getCharacterSet() {
        return characterSet;
    }

    public void setCharacterSet(String characterSet) {
        this.characterSet = characterSet;
    }

    public SqlserverDatabaseForDetail withState(String state) {
        this.state = state;
        return this;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SqlserverDatabaseForDetail sqlserverDatabaseForDetail = (SqlserverDatabaseForDetail) o;
        return Objects.equals(this.name, sqlserverDatabaseForDetail.name)
            && Objects.equals(this.characterSet, sqlserverDatabaseForDetail.characterSet)
            && Objects.equals(this.state, sqlserverDatabaseForDetail.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, characterSet, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlserverDatabaseForDetail {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    characterSet: ").append(toIndentedString(characterSet)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
