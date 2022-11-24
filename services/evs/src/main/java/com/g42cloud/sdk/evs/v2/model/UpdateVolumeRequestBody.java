package com.g42cloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class UpdateVolumeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume")

    private UpdateVolumeOption volume;

    public UpdateVolumeRequestBody withVolume(UpdateVolumeOption volume) {
        this.volume = volume;
        return this;
    }

    public UpdateVolumeRequestBody withVolume(Consumer<UpdateVolumeOption> volumeSetter) {
        if (this.volume == null) {
            this.volume = new UpdateVolumeOption();
            volumeSetter.accept(this.volume);
        }

        return this;
    }

    public UpdateVolumeOption getVolume() {
        return volume;
    }

    public void setVolume(UpdateVolumeOption volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateVolumeRequestBody updateVolumeRequestBody = (UpdateVolumeRequestBody) o;
        return Objects.equals(this.volume, updateVolumeRequestBody.volume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volume);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVolumeRequestBody {\n");
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
