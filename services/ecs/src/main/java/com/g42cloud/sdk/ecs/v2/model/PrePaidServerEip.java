package com.g42cloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class PrePaidServerEip {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iptype")

    private String iptype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private PrePaidServerEipBandwidth bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendparam")

    private PrePaidServerEipExtendParam extendparam;

    public PrePaidServerEip withIptype(String iptype) {
        this.iptype = iptype;
        return this;
    }

    public String getIptype() {
        return iptype;
    }

    public void setIptype(String iptype) {
        this.iptype = iptype;
    }

    public PrePaidServerEip withBandwidth(PrePaidServerEipBandwidth bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public PrePaidServerEip withBandwidth(Consumer<PrePaidServerEipBandwidth> bandwidthSetter) {
        if (this.bandwidth == null) {
            this.bandwidth = new PrePaidServerEipBandwidth();
            bandwidthSetter.accept(this.bandwidth);
        }

        return this;
    }

    public PrePaidServerEipBandwidth getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(PrePaidServerEipBandwidth bandwidth) {
        this.bandwidth = bandwidth;
    }

    public PrePaidServerEip withExtendparam(PrePaidServerEipExtendParam extendparam) {
        this.extendparam = extendparam;
        return this;
    }

    public PrePaidServerEip withExtendparam(Consumer<PrePaidServerEipExtendParam> extendparamSetter) {
        if (this.extendparam == null) {
            this.extendparam = new PrePaidServerEipExtendParam();
            extendparamSetter.accept(this.extendparam);
        }

        return this;
    }

    public PrePaidServerEipExtendParam getExtendparam() {
        return extendparam;
    }

    public void setExtendparam(PrePaidServerEipExtendParam extendparam) {
        this.extendparam = extendparam;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrePaidServerEip prePaidServerEip = (PrePaidServerEip) o;
        return Objects.equals(this.iptype, prePaidServerEip.iptype)
            && Objects.equals(this.bandwidth, prePaidServerEip.bandwidth)
            && Objects.equals(this.extendparam, prePaidServerEip.extendparam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iptype, bandwidth, extendparam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrePaidServerEip {\n");
        sb.append("    iptype: ").append(toIndentedString(iptype)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    extendparam: ").append(toIndentedString(extendparam)).append("\n");
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
