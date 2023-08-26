package com.g42cloud.sdk.bms.v1.model;

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
public class ShowBaremetalServerVolumeInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumeAttachments")

    private List<VolumeAttachments> volumeAttachments = null;

    public ShowBaremetalServerVolumeInfoResponse withVolumeAttachments(List<VolumeAttachments> volumeAttachments) {
        this.volumeAttachments = volumeAttachments;
        return this;
    }

    public ShowBaremetalServerVolumeInfoResponse addVolumeAttachmentsItem(VolumeAttachments volumeAttachmentsItem) {
        if (this.volumeAttachments == null) {
            this.volumeAttachments = new ArrayList<>();
        }
        this.volumeAttachments.add(volumeAttachmentsItem);
        return this;
    }

    public ShowBaremetalServerVolumeInfoResponse withVolumeAttachments(
        Consumer<List<VolumeAttachments>> volumeAttachmentsSetter) {
        if (this.volumeAttachments == null) {
            this.volumeAttachments = new ArrayList<>();
        }
        volumeAttachmentsSetter.accept(this.volumeAttachments);
        return this;
    }

    public List<VolumeAttachments> getVolumeAttachments() {
        return volumeAttachments;
    }

    public void setVolumeAttachments(List<VolumeAttachments> volumeAttachments) {
        this.volumeAttachments = volumeAttachments;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBaremetalServerVolumeInfoResponse that = (ShowBaremetalServerVolumeInfoResponse) obj;
        return Objects.equals(this.volumeAttachments, that.volumeAttachments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volumeAttachments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBaremetalServerVolumeInfoResponse {\n");
        sb.append("    volumeAttachments: ").append(toIndentedString(volumeAttachments)).append("\n");
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
