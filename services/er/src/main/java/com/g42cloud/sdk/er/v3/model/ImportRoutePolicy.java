package com.g42cloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 入方向路由策略
 */
public class ImportRoutePolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "import_policy_id")

    private String importPolicyId;

    public ImportRoutePolicy withImportPolicyId(String importPolicyId) {
        this.importPolicyId = importPolicyId;
        return this;
    }

    public String getImportPolicyId() {
        return importPolicyId;
    }

    public void setImportPolicyId(String importPolicyId) {
        this.importPolicyId = importPolicyId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportRoutePolicy that = (ImportRoutePolicy) obj;
        return Objects.equals(this.importPolicyId, that.importPolicyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(importPolicyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportRoutePolicy {\n");
        sb.append("    importPolicyId: ").append(toIndentedString(importPolicyId)).append("\n");
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
