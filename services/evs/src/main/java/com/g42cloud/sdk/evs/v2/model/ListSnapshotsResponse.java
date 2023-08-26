package com.g42cloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListSnapshotsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshots")

    private List<SnapshotList> snapshots = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshots_links")

    private List<Link> snapshotsLinks = null;

    public ListSnapshotsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListSnapshotsResponse withSnapshots(List<SnapshotList> snapshots) {
        this.snapshots = snapshots;
        return this;
    }

    public ListSnapshotsResponse addSnapshotsItem(SnapshotList snapshotsItem) {
        if (this.snapshots == null) {
            this.snapshots = new ArrayList<>();
        }
        this.snapshots.add(snapshotsItem);
        return this;
    }

    public ListSnapshotsResponse withSnapshots(Consumer<List<SnapshotList>> snapshotsSetter) {
        if (this.snapshots == null) {
            this.snapshots = new ArrayList<>();
        }
        snapshotsSetter.accept(this.snapshots);
        return this;
    }

    public List<SnapshotList> getSnapshots() {
        return snapshots;
    }

    public void setSnapshots(List<SnapshotList> snapshots) {
        this.snapshots = snapshots;
    }

    public ListSnapshotsResponse withSnapshotsLinks(List<Link> snapshotsLinks) {
        this.snapshotsLinks = snapshotsLinks;
        return this;
    }

    public ListSnapshotsResponse addSnapshotsLinksItem(Link snapshotsLinksItem) {
        if (this.snapshotsLinks == null) {
            this.snapshotsLinks = new ArrayList<>();
        }
        this.snapshotsLinks.add(snapshotsLinksItem);
        return this;
    }

    public ListSnapshotsResponse withSnapshotsLinks(Consumer<List<Link>> snapshotsLinksSetter) {
        if (this.snapshotsLinks == null) {
            this.snapshotsLinks = new ArrayList<>();
        }
        snapshotsLinksSetter.accept(this.snapshotsLinks);
        return this;
    }

    public List<Link> getSnapshotsLinks() {
        return snapshotsLinks;
    }

    public void setSnapshotsLinks(List<Link> snapshotsLinks) {
        this.snapshotsLinks = snapshotsLinks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSnapshotsResponse that = (ListSnapshotsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.snapshots, that.snapshots)
            && Objects.equals(this.snapshotsLinks, that.snapshotsLinks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, snapshots, snapshotsLinks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSnapshotsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    snapshots: ").append(toIndentedString(snapshots)).append("\n");
        sb.append("    snapshotsLinks: ").append(toIndentedString(snapshotsLinks)).append("\n");
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
