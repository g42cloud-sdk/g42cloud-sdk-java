package com.g42cloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListEventDetailResponse extends SdkResponse {

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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EventTypeEnum(value));
        }

        public static EventTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "event_users")

    private List<String> eventUsers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_sources")

    private List<String> eventSources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_info")

    private List<EventInfoDetail> eventInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta_data")

    private TotalMetaData metaData;

    public ListEventDetailResponse withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public ListEventDetailResponse withEventType(EventTypeEnum eventType) {
        this.eventType = eventType;
        return this;
    }

    public EventTypeEnum getEventType() {
        return eventType;
    }

    public void setEventType(EventTypeEnum eventType) {
        this.eventType = eventType;
    }

    public ListEventDetailResponse withEventUsers(List<String> eventUsers) {
        this.eventUsers = eventUsers;
        return this;
    }

    public ListEventDetailResponse addEventUsersItem(String eventUsersItem) {
        if (this.eventUsers == null) {
            this.eventUsers = new ArrayList<>();
        }
        this.eventUsers.add(eventUsersItem);
        return this;
    }

    public ListEventDetailResponse withEventUsers(Consumer<List<String>> eventUsersSetter) {
        if (this.eventUsers == null) {
            this.eventUsers = new ArrayList<>();
        }
        eventUsersSetter.accept(this.eventUsers);
        return this;
    }

    public List<String> getEventUsers() {
        return eventUsers;
    }

    public void setEventUsers(List<String> eventUsers) {
        this.eventUsers = eventUsers;
    }

    public ListEventDetailResponse withEventSources(List<String> eventSources) {
        this.eventSources = eventSources;
        return this;
    }

    public ListEventDetailResponse addEventSourcesItem(String eventSourcesItem) {
        if (this.eventSources == null) {
            this.eventSources = new ArrayList<>();
        }
        this.eventSources.add(eventSourcesItem);
        return this;
    }

    public ListEventDetailResponse withEventSources(Consumer<List<String>> eventSourcesSetter) {
        if (this.eventSources == null) {
            this.eventSources = new ArrayList<>();
        }
        eventSourcesSetter.accept(this.eventSources);
        return this;
    }

    public List<String> getEventSources() {
        return eventSources;
    }

    public void setEventSources(List<String> eventSources) {
        this.eventSources = eventSources;
    }

    public ListEventDetailResponse withEventInfo(List<EventInfoDetail> eventInfo) {
        this.eventInfo = eventInfo;
        return this;
    }

    public ListEventDetailResponse addEventInfoItem(EventInfoDetail eventInfoItem) {
        if (this.eventInfo == null) {
            this.eventInfo = new ArrayList<>();
        }
        this.eventInfo.add(eventInfoItem);
        return this;
    }

    public ListEventDetailResponse withEventInfo(Consumer<List<EventInfoDetail>> eventInfoSetter) {
        if (this.eventInfo == null) {
            this.eventInfo = new ArrayList<>();
        }
        eventInfoSetter.accept(this.eventInfo);
        return this;
    }

    public List<EventInfoDetail> getEventInfo() {
        return eventInfo;
    }

    public void setEventInfo(List<EventInfoDetail> eventInfo) {
        this.eventInfo = eventInfo;
    }

    public ListEventDetailResponse withMetaData(TotalMetaData metaData) {
        this.metaData = metaData;
        return this;
    }

    public ListEventDetailResponse withMetaData(Consumer<TotalMetaData> metaDataSetter) {
        if (this.metaData == null) {
            this.metaData = new TotalMetaData();
            metaDataSetter.accept(this.metaData);
        }

        return this;
    }

    public TotalMetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(TotalMetaData metaData) {
        this.metaData = metaData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEventDetailResponse that = (ListEventDetailResponse) obj;
        return Objects.equals(this.eventName, that.eventName) && Objects.equals(this.eventType, that.eventType)
            && Objects.equals(this.eventUsers, that.eventUsers) && Objects.equals(this.eventSources, that.eventSources)
            && Objects.equals(this.eventInfo, that.eventInfo) && Objects.equals(this.metaData, that.metaData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventName, eventType, eventUsers, eventSources, eventInfo, metaData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEventDetailResponse {\n");
        sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    eventUsers: ").append(toIndentedString(eventUsers)).append("\n");
        sb.append("    eventSources: ").append(toIndentedString(eventSources)).append("\n");
        sb.append("    eventInfo: ").append(toIndentedString(eventInfo)).append("\n");
        sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
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
