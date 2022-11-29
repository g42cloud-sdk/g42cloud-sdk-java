package com.g42cloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 操作微服务引擎专享版安全认证信息
 */
public class EngineRbacPwd {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pwd")

    private String pwd;

    public EngineRbacPwd withPwd(String pwd) {
        this.pwd = pwd;
        return this;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EngineRbacPwd engineRbacPwd = (EngineRbacPwd) o;
        return Objects.equals(this.pwd, engineRbacPwd.pwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pwd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EngineRbacPwd {\n");
        sb.append("    pwd: ").append(toIndentedString(pwd)).append("\n");
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
