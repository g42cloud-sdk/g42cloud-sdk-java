package com.g42cloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowTenantQuotaResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "absolute")

    private Absolute absolute;

    public ShowTenantQuotaResponse withAbsolute(Absolute absolute) {
        this.absolute = absolute;
        return this;
    }

    public ShowTenantQuotaResponse withAbsolute(Consumer<Absolute> absoluteSetter) {
        if (this.absolute == null) {
            this.absolute = new Absolute();
            absoluteSetter.accept(this.absolute);
        }

        return this;
    }

    public Absolute getAbsolute() {
        return absolute;
    }

    public void setAbsolute(Absolute absolute) {
        this.absolute = absolute;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTenantQuotaResponse showTenantQuotaResponse = (ShowTenantQuotaResponse) o;
        return Objects.equals(this.absolute, showTenantQuotaResponse.absolute);
    }

    @Override
    public int hashCode() {
        return Objects.hash(absolute);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTenantQuotaResponse {\n");
        sb.append("    absolute: ").append(toIndentedString(absolute)).append("\n");
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
