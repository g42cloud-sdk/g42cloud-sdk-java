package com.g42cloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CopyCheckpointResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication")

    private CheckpointReplicateRespBody replication;

    public CopyCheckpointResponse withReplication(CheckpointReplicateRespBody replication) {
        this.replication = replication;
        return this;
    }

    public CopyCheckpointResponse withReplication(Consumer<CheckpointReplicateRespBody> replicationSetter) {
        if (this.replication == null) {
            this.replication = new CheckpointReplicateRespBody();
            replicationSetter.accept(this.replication);
        }

        return this;
    }

    public CheckpointReplicateRespBody getReplication() {
        return replication;
    }

    public void setReplication(CheckpointReplicateRespBody replication) {
        this.replication = replication;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CopyCheckpointResponse copyCheckpointResponse = (CopyCheckpointResponse) o;
        return Objects.equals(this.replication, copyCheckpointResponse.replication);
    }

    @Override
    public int hashCode() {
        return Objects.hash(replication);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopyCheckpointResponse {\n");
        sb.append("    replication: ").append(toIndentedString(replication)).append("\n");
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
