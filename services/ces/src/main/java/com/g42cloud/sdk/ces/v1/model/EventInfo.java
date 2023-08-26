package com.g42cloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 一条事件监控信息
 */
public class EventInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_name")

    private String eventName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private String eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_count")

    private Integer eventCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_occur_time")

    private Long latestOccurTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_event_source")

    private String latestEventSource;

    public EventInfo withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public EventInfo withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public EventInfo withEventCount(Integer eventCount) {
        this.eventCount = eventCount;
        return this;
    }

    public Integer getEventCount() {
        return eventCount;
    }

    public void setEventCount(Integer eventCount) {
        this.eventCount = eventCount;
    }

    public EventInfo withLatestOccurTime(Long latestOccurTime) {
        this.latestOccurTime = latestOccurTime;
        return this;
    }

    public Long getLatestOccurTime() {
        return latestOccurTime;
    }

    public void setLatestOccurTime(Long latestOccurTime) {
        this.latestOccurTime = latestOccurTime;
    }

    public EventInfo withLatestEventSource(String latestEventSource) {
        this.latestEventSource = latestEventSource;
        return this;
    }

    public String getLatestEventSource() {
        return latestEventSource;
    }

    public void setLatestEventSource(String latestEventSource) {
        this.latestEventSource = latestEventSource;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventInfo that = (EventInfo) obj;
        return Objects.equals(this.eventName, that.eventName) && Objects.equals(this.eventType, that.eventType)
            && Objects.equals(this.eventCount, that.eventCount)
            && Objects.equals(this.latestOccurTime, that.latestOccurTime)
            && Objects.equals(this.latestEventSource, that.latestEventSource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventName, eventType, eventCount, latestOccurTime, latestEventSource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventInfo {\n");
        sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    eventCount: ").append(toIndentedString(eventCount)).append("\n");
        sb.append("    latestOccurTime: ").append(toIndentedString(latestOccurTime)).append("\n");
        sb.append("    latestEventSource: ").append(toIndentedString(latestEventSource)).append("\n");
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
