package com.g42cloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class UpdateAddressGroupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dry_run")

    private Boolean dryRun;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_group")

    private UpdateAddressGroupOption addressGroup;

    public UpdateAddressGroupRequestBody withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    public UpdateAddressGroupRequestBody withAddressGroup(UpdateAddressGroupOption addressGroup) {
        this.addressGroup = addressGroup;
        return this;
    }

    public UpdateAddressGroupRequestBody withAddressGroup(Consumer<UpdateAddressGroupOption> addressGroupSetter) {
        if (this.addressGroup == null) {
            this.addressGroup = new UpdateAddressGroupOption();
            addressGroupSetter.accept(this.addressGroup);
        }

        return this;
    }

    public UpdateAddressGroupOption getAddressGroup() {
        return addressGroup;
    }

    public void setAddressGroup(UpdateAddressGroupOption addressGroup) {
        this.addressGroup = addressGroup;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateAddressGroupRequestBody updateAddressGroupRequestBody = (UpdateAddressGroupRequestBody) o;
        return Objects.equals(this.dryRun, updateAddressGroupRequestBody.dryRun)
            && Objects.equals(this.addressGroup, updateAddressGroupRequestBody.addressGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dryRun, addressGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAddressGroupRequestBody {\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
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
