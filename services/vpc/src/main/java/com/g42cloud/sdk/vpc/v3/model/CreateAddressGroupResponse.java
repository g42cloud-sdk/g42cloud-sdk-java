package com.g42cloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateAddressGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_group")

    private AddressGroup addressGroup;

    public CreateAddressGroupResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public CreateAddressGroupResponse withAddressGroup(AddressGroup addressGroup) {
        this.addressGroup = addressGroup;
        return this;
    }

    public CreateAddressGroupResponse withAddressGroup(Consumer<AddressGroup> addressGroupSetter) {
        if (this.addressGroup == null) {
            this.addressGroup = new AddressGroup();
            addressGroupSetter.accept(this.addressGroup);
        }

        return this;
    }

    public AddressGroup getAddressGroup() {
        return addressGroup;
    }

    public void setAddressGroup(AddressGroup addressGroup) {
        this.addressGroup = addressGroup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAddressGroupResponse that = (CreateAddressGroupResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.addressGroup, that.addressGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, addressGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAddressGroupResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    addressGroup: ").append(toIndentedString(addressGroup)).append("\n");
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
