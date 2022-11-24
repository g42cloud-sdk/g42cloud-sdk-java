package com.g42cloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RestoreTableInfo
 */
public class RestoreTableInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oldName")

    private String oldName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "newName")

    private String newName;

    public RestoreTableInfo withOldName(String oldName) {
        this.oldName = oldName;
        return this;
    }

    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    public RestoreTableInfo withNewName(String newName) {
        this.newName = newName;
        return this;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestoreTableInfo restoreTableInfo = (RestoreTableInfo) o;
        return Objects.equals(this.oldName, restoreTableInfo.oldName)
            && Objects.equals(this.newName, restoreTableInfo.newName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oldName, newName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreTableInfo {\n");
        sb.append("    oldName: ").append(toIndentedString(oldName)).append("\n");
        sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
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
