package com.g42cloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateDomainOriginResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin")

    private ResourceBody origin;

    public UpdateDomainOriginResponse withOrigin(ResourceBody origin) {
        this.origin = origin;
        return this;
    }

    public UpdateDomainOriginResponse withOrigin(Consumer<ResourceBody> originSetter) {
        if (this.origin == null) {
            this.origin = new ResourceBody();
            originSetter.accept(this.origin);
        }

        return this;
    }

    public ResourceBody getOrigin() {
        return origin;
    }

    public void setOrigin(ResourceBody origin) {
        this.origin = origin;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDomainOriginResponse updateDomainOriginResponse = (UpdateDomainOriginResponse) o;
        return Objects.equals(this.origin, updateDomainOriginResponse.origin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(origin);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDomainOriginResponse {\n");
        sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
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
