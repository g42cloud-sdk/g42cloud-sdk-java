package com.g42cloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ChangeAvailabilityZoneResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance")

    private EnterpriseRouter instance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ChangeAvailabilityZoneResponse withInstance(EnterpriseRouter instance) {
        this.instance = instance;
        return this;
    }

    public ChangeAvailabilityZoneResponse withInstance(Consumer<EnterpriseRouter> instanceSetter) {
        if (this.instance == null) {
            this.instance = new EnterpriseRouter();
            instanceSetter.accept(this.instance);
        }

        return this;
    }

    public EnterpriseRouter getInstance() {
        return instance;
    }

    public void setInstance(EnterpriseRouter instance) {
        this.instance = instance;
    }

    public ChangeAvailabilityZoneResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChangeAvailabilityZoneResponse changeAvailabilityZoneResponse = (ChangeAvailabilityZoneResponse) o;
        return Objects.equals(this.instance, changeAvailabilityZoneResponse.instance)
            && Objects.equals(this.requestId, changeAvailabilityZoneResponse.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instance, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeAvailabilityZoneResponse {\n");
        sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
