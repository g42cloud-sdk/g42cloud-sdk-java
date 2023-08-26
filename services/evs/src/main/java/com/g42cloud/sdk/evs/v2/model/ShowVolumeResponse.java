package com.g42cloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowVolumeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume")

    private VolumeDetail volume;

    public ShowVolumeResponse withVolume(VolumeDetail volume) {
        this.volume = volume;
        return this;
    }

    public ShowVolumeResponse withVolume(Consumer<VolumeDetail> volumeSetter) {
        if (this.volume == null) {
            this.volume = new VolumeDetail();
            volumeSetter.accept(this.volume);
        }

        return this;
    }

    public VolumeDetail getVolume() {
        return volume;
    }

    public void setVolume(VolumeDetail volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVolumeResponse that = (ShowVolumeResponse) obj;
        return Objects.equals(this.volume, that.volume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volume);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVolumeResponse {\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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
