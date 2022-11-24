package com.g42cloud.sdk.vpc.v2.model;

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
public class ListVpcPeeringsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peerings")

    private List<VpcPeering> peerings = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peerings_links")

    private List<NeutronPageLink> peeringsLinks = null;

    public ListVpcPeeringsResponse withPeerings(List<VpcPeering> peerings) {
        this.peerings = peerings;
        return this;
    }

    public ListVpcPeeringsResponse addPeeringsItem(VpcPeering peeringsItem) {
        if (this.peerings == null) {
            this.peerings = new ArrayList<>();
        }
        this.peerings.add(peeringsItem);
        return this;
    }

    public ListVpcPeeringsResponse withPeerings(Consumer<List<VpcPeering>> peeringsSetter) {
        if (this.peerings == null) {
            this.peerings = new ArrayList<>();
        }
        peeringsSetter.accept(this.peerings);
        return this;
    }

    public List<VpcPeering> getPeerings() {
        return peerings;
    }

    public void setPeerings(List<VpcPeering> peerings) {
        this.peerings = peerings;
    }

    public ListVpcPeeringsResponse withPeeringsLinks(List<NeutronPageLink> peeringsLinks) {
        this.peeringsLinks = peeringsLinks;
        return this;
    }

    public ListVpcPeeringsResponse addPeeringsLinksItem(NeutronPageLink peeringsLinksItem) {
        if (this.peeringsLinks == null) {
            this.peeringsLinks = new ArrayList<>();
        }
        this.peeringsLinks.add(peeringsLinksItem);
        return this;
    }

    public ListVpcPeeringsResponse withPeeringsLinks(Consumer<List<NeutronPageLink>> peeringsLinksSetter) {
        if (this.peeringsLinks == null) {
            this.peeringsLinks = new ArrayList<>();
        }
        peeringsLinksSetter.accept(this.peeringsLinks);
        return this;
    }

    public List<NeutronPageLink> getPeeringsLinks() {
        return peeringsLinks;
    }

    public void setPeeringsLinks(List<NeutronPageLink> peeringsLinks) {
        this.peeringsLinks = peeringsLinks;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListVpcPeeringsResponse listVpcPeeringsResponse = (ListVpcPeeringsResponse) o;
        return Objects.equals(this.peerings, listVpcPeeringsResponse.peerings)
            && Objects.equals(this.peeringsLinks, listVpcPeeringsResponse.peeringsLinks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peerings, peeringsLinks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVpcPeeringsResponse {\n");
        sb.append("    peerings: ").append(toIndentedString(peerings)).append("\n");
        sb.append("    peeringsLinks: ").append(toIndentedString(peeringsLinks)).append("\n");
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
