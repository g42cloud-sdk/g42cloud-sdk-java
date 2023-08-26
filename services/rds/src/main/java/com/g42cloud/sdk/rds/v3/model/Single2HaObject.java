package com.g42cloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 单机转主备时必填。
 */
public class Single2HaObject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_code_new_node")

    private String azCodeNewNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dsspool_id")

    private String dsspoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_pay")

    private Boolean isAutoPay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ad_domain_info")

    private ADDomainInfo adDomainInfo;

    public Single2HaObject withAzCodeNewNode(String azCodeNewNode) {
        this.azCodeNewNode = azCodeNewNode;
        return this;
    }

    public String getAzCodeNewNode() {
        return azCodeNewNode;
    }

    public void setAzCodeNewNode(String azCodeNewNode) {
        this.azCodeNewNode = azCodeNewNode;
    }

    public Single2HaObject withDsspoolId(String dsspoolId) {
        this.dsspoolId = dsspoolId;
        return this;
    }

    public String getDsspoolId() {
        return dsspoolId;
    }

    public void setDsspoolId(String dsspoolId) {
        this.dsspoolId = dsspoolId;
    }

    public Single2HaObject withIsAutoPay(Boolean isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    public Boolean getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(Boolean isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    public Single2HaObject withAdDomainInfo(ADDomainInfo adDomainInfo) {
        this.adDomainInfo = adDomainInfo;
        return this;
    }

    public Single2HaObject withAdDomainInfo(Consumer<ADDomainInfo> adDomainInfoSetter) {
        if (this.adDomainInfo == null) {
            this.adDomainInfo = new ADDomainInfo();
            adDomainInfoSetter.accept(this.adDomainInfo);
        }

        return this;
    }

    public ADDomainInfo getAdDomainInfo() {
        return adDomainInfo;
    }

    public void setAdDomainInfo(ADDomainInfo adDomainInfo) {
        this.adDomainInfo = adDomainInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Single2HaObject that = (Single2HaObject) obj;
        return Objects.equals(this.azCodeNewNode, that.azCodeNewNode) && Objects.equals(this.dsspoolId, that.dsspoolId)
            && Objects.equals(this.isAutoPay, that.isAutoPay) && Objects.equals(this.adDomainInfo, that.adDomainInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(azCodeNewNode, dsspoolId, isAutoPay, adDomainInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Single2HaObject {\n");
        sb.append("    azCodeNewNode: ").append(toIndentedString(azCodeNewNode)).append("\n");
        sb.append("    dsspoolId: ").append(toIndentedString(dsspoolId)).append("\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
        sb.append("    adDomainInfo: ").append(toIndentedString(adDomainInfo)).append("\n");
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
