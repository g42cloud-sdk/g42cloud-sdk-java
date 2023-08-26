package com.g42cloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class SetBinlogClearPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resp")

    private String resp;

    public SetBinlogClearPolicyResponse withResp(String resp) {
        this.resp = resp;
        return this;
    }

    public String getResp() {
        return resp;
    }

    public void setResp(String resp) {
        this.resp = resp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetBinlogClearPolicyResponse that = (SetBinlogClearPolicyResponse) obj;
        return Objects.equals(this.resp, that.resp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetBinlogClearPolicyResponse {\n");
        sb.append("    resp: ").append(toIndentedString(resp)).append("\n");
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
