package com.g42cloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowOffSiteBackupPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_para")

    private List<GetOffSiteBackupPolicy> policyPara = null;

    public ShowOffSiteBackupPolicyResponse withPolicyPara(List<GetOffSiteBackupPolicy> policyPara) {
        this.policyPara = policyPara;
        return this;
    }

    public ShowOffSiteBackupPolicyResponse addPolicyParaItem(GetOffSiteBackupPolicy policyParaItem) {
        if (this.policyPara == null) {
            this.policyPara = new ArrayList<>();
        }
        this.policyPara.add(policyParaItem);
        return this;
    }

    public ShowOffSiteBackupPolicyResponse withPolicyPara(Consumer<List<GetOffSiteBackupPolicy>> policyParaSetter) {
        if (this.policyPara == null) {
            this.policyPara = new ArrayList<>();
        }
        policyParaSetter.accept(this.policyPara);
        return this;
    }

    public List<GetOffSiteBackupPolicy> getPolicyPara() {
        return policyPara;
    }

    public void setPolicyPara(List<GetOffSiteBackupPolicy> policyPara) {
        this.policyPara = policyPara;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowOffSiteBackupPolicyResponse showOffSiteBackupPolicyResponse = (ShowOffSiteBackupPolicyResponse) o;
        return Objects.equals(this.policyPara, showOffSiteBackupPolicyResponse.policyPara);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyPara);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOffSiteBackupPolicyResponse {\n");
        sb.append("    policyPara: ").append(toIndentedString(policyPara)).append("\n");
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
