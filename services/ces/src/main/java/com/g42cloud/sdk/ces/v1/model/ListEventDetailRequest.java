package com.g42cloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListEventDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_name")

    private String eventName;

    public static final class EventTypeEnum {

        /**
         * Enum EVENT_SYS for value: "EVENT.SYS"
         */
        public static final EventTypeEnum EVENT_SYS = new EventTypeEnum("EVENT.SYS");

        /**
         * Enum EVENT_CUSTOM for value: "EVENT.CUSTOM"
         */
        public static final EventTypeEnum EVENT_CUSTOM = new EventTypeEnum("EVENT.CUSTOM");

        private static final Map<String, EventTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EventTypeEnum> createStaticFields() {
            Map<String, EventTypeEnum> map = new HashMap<>();
            map.put("EVENT.SYS", EVENT_SYS);
            map.put("EVENT.CUSTOM", EVENT_CUSTOM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EventTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static EventTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            EventTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new EventTypeEnum(value);
            }
            return result;
        }

        public static EventTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            EventTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EventTypeEnum) {
                return this.value.equals(((EventTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private EventTypeEnum eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_source")

    private String eventSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_level")

    private String eventLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_user")

    private String eventUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_state")

    private String eventState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private Long from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private Long to;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private Integer start;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListEventDetailRequest withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public ListEventDetailRequest withEventType(EventTypeEnum eventType) {
        this.eventType = eventType;
        return this;
    }

    public EventTypeEnum getEventType() {
        return eventType;
    }

    public void setEventType(EventTypeEnum eventType) {
        this.eventType = eventType;
    }

    public ListEventDetailRequest withEventSource(String eventSource) {
        this.eventSource = eventSource;
        return this;
    }

    public String getEventSource() {
        return eventSource;
    }

    public void setEventSource(String eventSource) {
        this.eventSource = eventSource;
    }

    public ListEventDetailRequest withEventLevel(String eventLevel) {
        this.eventLevel = eventLevel;
        return this;
    }

    public String getEventLevel() {
        return eventLevel;
    }

    public void setEventLevel(String eventLevel) {
        this.eventLevel = eventLevel;
    }

    public ListEventDetailRequest withEventUser(String eventUser) {
        this.eventUser = eventUser;
        return this;
    }

    public String getEventUser() {
        return eventUser;
    }

    public void setEventUser(String eventUser) {
        this.eventUser = eventUser;
    }

    public ListEventDetailRequest withEventState(String eventState) {
        this.eventState = eventState;
        return this;
    }

    public String getEventState() {
        return eventState;
    }

    public void setEventState(String eventState) {
        this.eventState = eventState;
    }

    public ListEventDetailRequest withFrom(Long from) {
        this.from = from;
        return this;
    }

    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public ListEventDetailRequest withTo(Long to) {
        this.to = to;
        return this;
    }

    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }

    public ListEventDetailRequest withStart(Integer start) {
        this.start = start;
        return this;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public ListEventDetailRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEventDetailRequest listEventDetailRequest = (ListEventDetailRequest) o;
        return Objects.equals(this.eventName, listEventDetailRequest.eventName)
            && Objects.equals(this.eventType, listEventDetailRequest.eventType)
            && Objects.equals(this.eventSource, listEventDetailRequest.eventSource)
            && Objects.equals(this.eventLevel, listEventDetailRequest.eventLevel)
            && Objects.equals(this.eventUser, listEventDetailRequest.eventUser)
            && Objects.equals(this.eventState, listEventDetailRequest.eventState)
            && Objects.equals(this.from, listEventDetailRequest.from)
            && Objects.equals(this.to, listEventDetailRequest.to)
            && Objects.equals(this.start, listEventDetailRequest.start)
            && Objects.equals(this.limit, listEventDetailRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(eventName, eventType, eventSource, eventLevel, eventUser, eventState, from, to, start, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEventDetailRequest {\n");
        sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    eventSource: ").append(toIndentedString(eventSource)).append("\n");
        sb.append("    eventLevel: ").append(toIndentedString(eventLevel)).append("\n");
        sb.append("    eventUser: ").append(toIndentedString(eventUser)).append("\n");
        sb.append("    eventState: ").append(toIndentedString(eventState)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
