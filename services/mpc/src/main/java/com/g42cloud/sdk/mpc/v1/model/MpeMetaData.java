package com.g42cloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MpeMetaData
 */
public class MpeMetaData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pack_type")

    private String packType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Double duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_size")

    private Long videoSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private Integer width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private Integer height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bit_rate")

    private Integer bitRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_bit_rate")

    private Integer audioBitRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frame_rate")

    private Integer frameRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codec_name")

    private String codecName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_codec_name")

    private String audioCodecName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channels")

    private Integer channels;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sample")

    private Integer sample;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_audio")

    private Boolean isAudio;

    public MpeMetaData withPackType(String packType) {
        this.packType = packType;
        return this;
    }

    public String getPackType() {
        return packType;
    }

    public void setPackType(String packType) {
        this.packType = packType;
    }

    public MpeMetaData withDuration(Double duration) {
        this.duration = duration;
        return this;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public MpeMetaData withVideoSize(Long videoSize) {
        this.videoSize = videoSize;
        return this;
    }

    public Long getVideoSize() {
        return videoSize;
    }

    public void setVideoSize(Long videoSize) {
        this.videoSize = videoSize;
    }

    public MpeMetaData withWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public MpeMetaData withHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public MpeMetaData withBitRate(Integer bitRate) {
        this.bitRate = bitRate;
        return this;
    }

    public Integer getBitRate() {
        return bitRate;
    }

    public void setBitRate(Integer bitRate) {
        this.bitRate = bitRate;
    }

    public MpeMetaData withAudioBitRate(Integer audioBitRate) {
        this.audioBitRate = audioBitRate;
        return this;
    }

    public Integer getAudioBitRate() {
        return audioBitRate;
    }

    public void setAudioBitRate(Integer audioBitRate) {
        this.audioBitRate = audioBitRate;
    }

    public MpeMetaData withFrameRate(Integer frameRate) {
        this.frameRate = frameRate;
        return this;
    }

    public Integer getFrameRate() {
        return frameRate;
    }

    public void setFrameRate(Integer frameRate) {
        this.frameRate = frameRate;
    }

    public MpeMetaData withCodecName(String codecName) {
        this.codecName = codecName;
        return this;
    }

    public String getCodecName() {
        return codecName;
    }

    public void setCodecName(String codecName) {
        this.codecName = codecName;
    }

    public MpeMetaData withAudioCodecName(String audioCodecName) {
        this.audioCodecName = audioCodecName;
        return this;
    }

    public String getAudioCodecName() {
        return audioCodecName;
    }

    public void setAudioCodecName(String audioCodecName) {
        this.audioCodecName = audioCodecName;
    }

    public MpeMetaData withChannels(Integer channels) {
        this.channels = channels;
        return this;
    }

    public Integer getChannels() {
        return channels;
    }

    public void setChannels(Integer channels) {
        this.channels = channels;
    }

    public MpeMetaData withSample(Integer sample) {
        this.sample = sample;
        return this;
    }

    public Integer getSample() {
        return sample;
    }

    public void setSample(Integer sample) {
        this.sample = sample;
    }

    public MpeMetaData withIsAudio(Boolean isAudio) {
        this.isAudio = isAudio;
        return this;
    }

    public Boolean getIsAudio() {
        return isAudio;
    }

    public void setIsAudio(Boolean isAudio) {
        this.isAudio = isAudio;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MpeMetaData mpeMetaData = (MpeMetaData) o;
        return Objects.equals(this.packType, mpeMetaData.packType)
            && Objects.equals(this.duration, mpeMetaData.duration)
            && Objects.equals(this.videoSize, mpeMetaData.videoSize) && Objects.equals(this.width, mpeMetaData.width)
            && Objects.equals(this.height, mpeMetaData.height) && Objects.equals(this.bitRate, mpeMetaData.bitRate)
            && Objects.equals(this.audioBitRate, mpeMetaData.audioBitRate)
            && Objects.equals(this.frameRate, mpeMetaData.frameRate)
            && Objects.equals(this.codecName, mpeMetaData.codecName)
            && Objects.equals(this.audioCodecName, mpeMetaData.audioCodecName)
            && Objects.equals(this.channels, mpeMetaData.channels) && Objects.equals(this.sample, mpeMetaData.sample)
            && Objects.equals(this.isAudio, mpeMetaData.isAudio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packType,
            duration,
            videoSize,
            width,
            height,
            bitRate,
            audioBitRate,
            frameRate,
            codecName,
            audioCodecName,
            channels,
            sample,
            isAudio);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MpeMetaData {\n");
        sb.append("    packType: ").append(toIndentedString(packType)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    videoSize: ").append(toIndentedString(videoSize)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    bitRate: ").append(toIndentedString(bitRate)).append("\n");
        sb.append("    audioBitRate: ").append(toIndentedString(audioBitRate)).append("\n");
        sb.append("    frameRate: ").append(toIndentedString(frameRate)).append("\n");
        sb.append("    codecName: ").append(toIndentedString(codecName)).append("\n");
        sb.append("    audioCodecName: ").append(toIndentedString(audioCodecName)).append("\n");
        sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
        sb.append("    sample: ").append(toIndentedString(sample)).append("\n");
        sb.append("    isAudio: ").append(toIndentedString(isAudio)).append("\n");
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
