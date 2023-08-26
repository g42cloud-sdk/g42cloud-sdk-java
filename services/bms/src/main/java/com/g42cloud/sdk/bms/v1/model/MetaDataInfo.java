package com.g42cloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * metadata字段数据结构说明
 */
public class MetaDataInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "op_svc_userid")

    private String opSvcUserid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_pass")

    private String adminPass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "BYOL")

    private String byol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    public MetaDataInfo withOpSvcUserid(String opSvcUserid) {
        this.opSvcUserid = opSvcUserid;
        return this;
    }

    public String getOpSvcUserid() {
        return opSvcUserid;
    }

    public void setOpSvcUserid(String opSvcUserid) {
        this.opSvcUserid = opSvcUserid;
    }

    public MetaDataInfo withAdminPass(String adminPass) {
        this.adminPass = adminPass;
        return this;
    }

    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }

    public MetaDataInfo withByol(String byol) {
        this.byol = byol;
        return this;
    }

    public String getByol() {
        return byol;
    }

    public void setByol(String byol) {
        this.byol = byol;
    }

    public MetaDataInfo withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetaDataInfo that = (MetaDataInfo) obj;
        return Objects.equals(this.opSvcUserid, that.opSvcUserid) && Objects.equals(this.adminPass, that.adminPass)
            && Objects.equals(this.byol, that.byol) && Objects.equals(this.agencyName, that.agencyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(opSvcUserid, adminPass, byol, agencyName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetaDataInfo {\n");
        sb.append("    opSvcUserid: ").append(toIndentedString(opSvcUserid)).append("\n");
        sb.append("    adminPass: ").append(toIndentedString(adminPass)).append("\n");
        sb.append("    byol: ").append(toIndentedString(byol)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
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
