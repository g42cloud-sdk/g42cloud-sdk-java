package com.g42cloud.sdk.ecs.v2.model;

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
public class BatchResetServersPasswordResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response")

    private List<ServerId> response = null;

    public BatchResetServersPasswordResponse withResponse(List<ServerId> response) {
        this.response = response;
        return this;
    }

    public BatchResetServersPasswordResponse addResponseItem(ServerId responseItem) {
        if (this.response == null) {
            this.response = new ArrayList<>();
        }
        this.response.add(responseItem);
        return this;
    }

    public BatchResetServersPasswordResponse withResponse(Consumer<List<ServerId>> responseSetter) {
        if (this.response == null) {
            this.response = new ArrayList<>();
        }
        responseSetter.accept(this.response);
        return this;
    }

    public List<ServerId> getResponse() {
        return response;
    }

    public void setResponse(List<ServerId> response) {
        this.response = response;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchResetServersPasswordResponse batchResetServersPasswordResponse = (BatchResetServersPasswordResponse) o;
        return Objects.equals(this.response, batchResetServersPasswordResponse.response);
    }

    @Override
    public int hashCode() {
        return Objects.hash(response);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchResetServersPasswordResponse {\n");
        sb.append("    response: ").append(toIndentedString(response)).append("\n");
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
