package com.g42cloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateLogtankResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logtank")

    private LogtankItem logtank;

    public UpdateLogtankResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public UpdateLogtankResponse withLogtank(LogtankItem logtank) {
        this.logtank = logtank;
        return this;
    }

    public UpdateLogtankResponse withLogtank(Consumer<LogtankItem> logtankSetter) {
        if (this.logtank == null) {
            this.logtank = new LogtankItem();
            logtankSetter.accept(this.logtank);
        }

        return this;
    }

    public LogtankItem getLogtank() {
        return logtank;
    }

    public void setLogtank(LogtankItem logtank) {
        this.logtank = logtank;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateLogtankResponse that = (UpdateLogtankResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.logtank, that.logtank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, logtank);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLogtankResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    logtank: ").append(toIndentedString(logtank)).append("\n");
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
