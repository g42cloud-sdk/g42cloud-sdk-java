package com.g42cloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PwdResetRequest
 */
public class PwdResetRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_user_pwd")

    private String dbUserPwd;

    public PwdResetRequest withDbUserPwd(String dbUserPwd) {
        this.dbUserPwd = dbUserPwd;
        return this;
    }

    public String getDbUserPwd() {
        return dbUserPwd;
    }

    public void setDbUserPwd(String dbUserPwd) {
        this.dbUserPwd = dbUserPwd;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PwdResetRequest that = (PwdResetRequest) obj;
        return Objects.equals(this.dbUserPwd, that.dbUserPwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbUserPwd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PwdResetRequest {\n");
        sb.append("    dbUserPwd: ").append(toIndentedString(dbUserPwd)).append("\n");
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
