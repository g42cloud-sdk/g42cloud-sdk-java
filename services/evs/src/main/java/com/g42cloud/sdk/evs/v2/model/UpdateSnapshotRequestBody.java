package com.g42cloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class UpdateSnapshotRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot")

    private UpdateSnapshotOption snapshot;

    public UpdateSnapshotRequestBody withSnapshot(UpdateSnapshotOption snapshot) {
        this.snapshot = snapshot;
        return this;
    }

    public UpdateSnapshotRequestBody withSnapshot(Consumer<UpdateSnapshotOption> snapshotSetter) {
        if (this.snapshot == null) {
            this.snapshot = new UpdateSnapshotOption();
            snapshotSetter.accept(this.snapshot);
        }

        return this;
    }

    public UpdateSnapshotOption getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(UpdateSnapshotOption snapshot) {
        this.snapshot = snapshot;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateSnapshotRequestBody updateSnapshotRequestBody = (UpdateSnapshotRequestBody) o;
        return Objects.equals(this.snapshot, updateSnapshotRequestBody.snapshot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snapshot);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSnapshotRequestBody {\n");
        sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
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
