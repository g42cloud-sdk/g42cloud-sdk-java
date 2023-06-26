package com.g42cloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SubAudioFile
 */
public class SubAudioFile {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracks_info")

    private List<TracksInfo> tracksInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private ObsObjInfo input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private ObsObjInfo output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_filename")

    private String outputFilename;

    public SubAudioFile withTracksInfo(List<TracksInfo> tracksInfo) {
        this.tracksInfo = tracksInfo;
        return this;
    }

    public SubAudioFile addTracksInfoItem(TracksInfo tracksInfoItem) {
        if (this.tracksInfo == null) {
            this.tracksInfo = new ArrayList<>();
        }
        this.tracksInfo.add(tracksInfoItem);
        return this;
    }

    public SubAudioFile withTracksInfo(Consumer<List<TracksInfo>> tracksInfoSetter) {
        if (this.tracksInfo == null) {
            this.tracksInfo = new ArrayList<>();
        }
        tracksInfoSetter.accept(this.tracksInfo);
        return this;
    }

    public List<TracksInfo> getTracksInfo() {
        return tracksInfo;
    }

    public void setTracksInfo(List<TracksInfo> tracksInfo) {
        this.tracksInfo = tracksInfo;
    }

    public SubAudioFile withInput(ObsObjInfo input) {
        this.input = input;
        return this;
    }

    public SubAudioFile withInput(Consumer<ObsObjInfo> inputSetter) {
        if (this.input == null) {
            this.input = new ObsObjInfo();
            inputSetter.accept(this.input);
        }

        return this;
    }

    public ObsObjInfo getInput() {
        return input;
    }

    public void setInput(ObsObjInfo input) {
        this.input = input;
    }

    public SubAudioFile withOutput(ObsObjInfo output) {
        this.output = output;
        return this;
    }

    public SubAudioFile withOutput(Consumer<ObsObjInfo> outputSetter) {
        if (this.output == null) {
            this.output = new ObsObjInfo();
            outputSetter.accept(this.output);
        }

        return this;
    }

    public ObsObjInfo getOutput() {
        return output;
    }

    public void setOutput(ObsObjInfo output) {
        this.output = output;
    }

    public SubAudioFile withOutputFilename(String outputFilename) {
        this.outputFilename = outputFilename;
        return this;
    }

    public String getOutputFilename() {
        return outputFilename;
    }

    public void setOutputFilename(String outputFilename) {
        this.outputFilename = outputFilename;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubAudioFile subAudioFile = (SubAudioFile) o;
        return Objects.equals(this.tracksInfo, subAudioFile.tracksInfo)
            && Objects.equals(this.input, subAudioFile.input) && Objects.equals(this.output, subAudioFile.output)
            && Objects.equals(this.outputFilename, subAudioFile.outputFilename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tracksInfo, input, output, outputFilename);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubAudioFile {\n");
        sb.append("    tracksInfo: ").append(toIndentedString(tracksInfo)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    outputFilename: ").append(toIndentedString(outputFilename)).append("\n");
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
