package com.g42cloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchCreateVolumeTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_id")

    private String volumeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchCreateVolumeTagsRequestBody body;

    public BatchCreateVolumeTagsRequest withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    public BatchCreateVolumeTagsRequest withBody(BatchCreateVolumeTagsRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchCreateVolumeTagsRequest withBody(Consumer<BatchCreateVolumeTagsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchCreateVolumeTagsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public BatchCreateVolumeTagsRequestBody getBody() {
        return body;
    }

    public void setBody(BatchCreateVolumeTagsRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchCreateVolumeTagsRequest batchCreateVolumeTagsRequest = (BatchCreateVolumeTagsRequest) o;
        return Objects.equals(this.volumeId, batchCreateVolumeTagsRequest.volumeId)
            && Objects.equals(this.body, batchCreateVolumeTagsRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volumeId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateVolumeTagsRequest {\n");
        sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
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
