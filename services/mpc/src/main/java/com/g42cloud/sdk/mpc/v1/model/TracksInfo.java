package com.g42cloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TracksInfo
 */
public class TracksInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_layout")

    private String channelLayout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    public TracksInfo withChannelLayout(String channelLayout) {
        this.channelLayout = channelLayout;
        return this;
    }

    public String getChannelLayout() {
        return channelLayout;
    }

    public void setChannelLayout(String channelLayout) {
        this.channelLayout = channelLayout;
    }

    public TracksInfo withLanguage(String language) {
        this.language = language;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TracksInfo tracksInfo = (TracksInfo) o;
        return Objects.equals(this.channelLayout, tracksInfo.channelLayout)
            && Objects.equals(this.language, tracksInfo.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channelLayout, language);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TracksInfo {\n");
        sb.append("    channelLayout: ").append(toIndentedString(channelLayout)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
