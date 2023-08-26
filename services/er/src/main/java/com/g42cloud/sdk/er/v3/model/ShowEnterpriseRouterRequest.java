package com.g42cloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowEnterpriseRouterRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "er_id")

    private String erId;

    public ShowEnterpriseRouterRequest withErId(String erId) {
        this.erId = erId;
        return this;
    }

    public String getErId() {
        return erId;
    }

    public void setErId(String erId) {
        this.erId = erId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowEnterpriseRouterRequest that = (ShowEnterpriseRouterRequest) obj;
        return Objects.equals(this.erId, that.erId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(erId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEnterpriseRouterRequest {\n");
        sb.append("    erId: ").append(toIndentedString(erId)).append("\n");
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
