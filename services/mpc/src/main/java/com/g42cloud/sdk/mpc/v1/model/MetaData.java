package com.g42cloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MetaData
 */
public class MetaData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration_ms")

    private Double durationMs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Long duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private String format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bitrate")

    private Long bitrate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video")

    private List<VideoInfo> video = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio")

    private List<AudioInfo> audio = null;

    public MetaData withSize(Long size) {
        this.size = size;
        return this;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public MetaData withDurationMs(Double durationMs) {
        this.durationMs = durationMs;
        return this;
    }

    public Double getDurationMs() {
        return durationMs;
    }

    public void setDurationMs(Double durationMs) {
        this.durationMs = durationMs;
    }

    public MetaData withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public MetaData withFormat(String format) {
        this.format = format;
        return this;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public MetaData withBitrate(Long bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    public Long getBitrate() {
        return bitrate;
    }

    public void setBitrate(Long bitrate) {
        this.bitrate = bitrate;
    }

    public MetaData withVideo(List<VideoInfo> video) {
        this.video = video;
        return this;
    }

    public MetaData addVideoItem(VideoInfo videoItem) {
        if (this.video == null) {
            this.video = new ArrayList<>();
        }
        this.video.add(videoItem);
        return this;
    }

    public MetaData withVideo(Consumer<List<VideoInfo>> videoSetter) {
        if (this.video == null) {
            this.video = new ArrayList<>();
        }
        videoSetter.accept(this.video);
        return this;
    }

    public List<VideoInfo> getVideo() {
        return video;
    }

    public void setVideo(List<VideoInfo> video) {
        this.video = video;
    }

    public MetaData withAudio(List<AudioInfo> audio) {
        this.audio = audio;
        return this;
    }

    public MetaData addAudioItem(AudioInfo audioItem) {
        if (this.audio == null) {
            this.audio = new ArrayList<>();
        }
        this.audio.add(audioItem);
        return this;
    }

    public MetaData withAudio(Consumer<List<AudioInfo>> audioSetter) {
        if (this.audio == null) {
            this.audio = new ArrayList<>();
        }
        audioSetter.accept(this.audio);
        return this;
    }

    public List<AudioInfo> getAudio() {
        return audio;
    }

    public void setAudio(List<AudioInfo> audio) {
        this.audio = audio;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetaData that = (MetaData) obj;
        return Objects.equals(this.size, that.size) && Objects.equals(this.durationMs, that.durationMs)
            && Objects.equals(this.duration, that.duration) && Objects.equals(this.format, that.format)
            && Objects.equals(this.bitrate, that.bitrate) && Objects.equals(this.video, that.video)
            && Objects.equals(this.audio, that.audio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, durationMs, duration, format, bitrate, video, audio);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetaData {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    durationMs: ").append(toIndentedString(durationMs)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
        sb.append("    video: ").append(toIndentedString(video)).append("\n");
        sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
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
