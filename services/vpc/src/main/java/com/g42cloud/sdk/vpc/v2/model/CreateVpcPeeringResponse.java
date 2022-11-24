package com.g42cloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateVpcPeeringResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peering")

    private VpcPeering peering;

    public CreateVpcPeeringResponse withPeering(VpcPeering peering) {
        this.peering = peering;
        return this;
    }

    public CreateVpcPeeringResponse withPeering(Consumer<VpcPeering> peeringSetter) {
        if (this.peering == null) {
            this.peering = new VpcPeering();
            peeringSetter.accept(this.peering);
        }

        return this;
    }

    public VpcPeering getPeering() {
        return peering;
    }

    public void setPeering(VpcPeering peering) {
        this.peering = peering;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateVpcPeeringResponse createVpcPeeringResponse = (CreateVpcPeeringResponse) o;
        return Objects.equals(this.peering, createVpcPeeringResponse.peering);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peering);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVpcPeeringResponse {\n");
        sb.append("    peering: ").append(toIndentedString(peering)).append("\n");
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
