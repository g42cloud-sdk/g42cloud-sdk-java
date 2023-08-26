package com.g42cloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Response Object
 */
public class BatchDeleteIpListRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipgroup")

    private BatchDeleteIpListOption ipgroup;

    public BatchDeleteIpListRequestBody withIpgroup(BatchDeleteIpListOption ipgroup) {
        this.ipgroup = ipgroup;
        return this;
    }

    public BatchDeleteIpListRequestBody withIpgroup(Consumer<BatchDeleteIpListOption> ipgroupSetter) {
        if (this.ipgroup == null) {
            this.ipgroup = new BatchDeleteIpListOption();
            ipgroupSetter.accept(this.ipgroup);
        }

        return this;
    }

    public BatchDeleteIpListOption getIpgroup() {
        return ipgroup;
    }

    public void setIpgroup(BatchDeleteIpListOption ipgroup) {
        this.ipgroup = ipgroup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteIpListRequestBody that = (BatchDeleteIpListRequestBody) obj;
        return Objects.equals(this.ipgroup, that.ipgroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipgroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteIpListRequestBody {\n");
        sb.append("    ipgroup: ").append(toIndentedString(ipgroup)).append("\n");
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
