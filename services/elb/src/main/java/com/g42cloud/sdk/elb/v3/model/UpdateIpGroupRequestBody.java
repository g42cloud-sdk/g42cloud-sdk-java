package com.g42cloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class UpdateIpGroupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipgroup")

    private UpdateIpGroupOption ipgroup;

    public UpdateIpGroupRequestBody withIpgroup(UpdateIpGroupOption ipgroup) {
        this.ipgroup = ipgroup;
        return this;
    }

    public UpdateIpGroupRequestBody withIpgroup(Consumer<UpdateIpGroupOption> ipgroupSetter) {
        if (this.ipgroup == null) {
            this.ipgroup = new UpdateIpGroupOption();
            ipgroupSetter.accept(this.ipgroup);
        }

        return this;
    }

    public UpdateIpGroupOption getIpgroup() {
        return ipgroup;
    }

    public void setIpgroup(UpdateIpGroupOption ipgroup) {
        this.ipgroup = ipgroup;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateIpGroupRequestBody updateIpGroupRequestBody = (UpdateIpGroupRequestBody) o;
        return Objects.equals(this.ipgroup, updateIpGroupRequestBody.ipgroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipgroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateIpGroupRequestBody {\n");
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
