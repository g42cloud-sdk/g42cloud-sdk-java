package com.g42cloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateDiskInfoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_id")

    private String sourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private PutDiskInfoReq body;

    public UpdateDiskInfoRequest withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public UpdateDiskInfoRequest withBody(PutDiskInfoReq body) {
        this.body = body;
        return this;
    }

    public UpdateDiskInfoRequest withBody(Consumer<PutDiskInfoReq> bodySetter) {
        if (this.body == null) {
            this.body = new PutDiskInfoReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public PutDiskInfoReq getBody() {
        return body;
    }

    public void setBody(PutDiskInfoReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDiskInfoRequest that = (UpdateDiskInfoRequest) obj;
        return Objects.equals(this.sourceId, that.sourceId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDiskInfoRequest {\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
