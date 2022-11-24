package com.g42cloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowPrivateipResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privateip")

    private Privateip privateip;

    public ShowPrivateipResponse withPrivateip(Privateip privateip) {
        this.privateip = privateip;
        return this;
    }

    public ShowPrivateipResponse withPrivateip(Consumer<Privateip> privateipSetter) {
        if (this.privateip == null) {
            this.privateip = new Privateip();
            privateipSetter.accept(this.privateip);
        }

        return this;
    }

    public Privateip getPrivateip() {
        return privateip;
    }

    public void setPrivateip(Privateip privateip) {
        this.privateip = privateip;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowPrivateipResponse showPrivateipResponse = (ShowPrivateipResponse) o;
        return Objects.equals(this.privateip, showPrivateipResponse.privateip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(privateip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPrivateipResponse {\n");
        sb.append("    privateip: ").append(toIndentedString(privateip)).append("\n");
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
