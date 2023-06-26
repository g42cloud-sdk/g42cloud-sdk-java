package com.g42cloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Notification
 */
public class Notification {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_name")

    private String eventName;

    public static final class StatusEnum {

        /**
         * Enum ON for value: "on"
         */
        public static final StatusEnum ON = new StatusEnum("on");

        /**
         * Enum OFF for value: "off"
         */
        public static final StatusEnum OFF = new StatusEnum("off");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("on", ON);
            map.put("off", OFF);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msg_type")

    private Integer msgType;

    public Notification withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Notification withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Notification withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Notification withMsgType(Integer msgType) {
        this.msgType = msgType;
        return this;
    }

    public Integer getMsgType() {
        return msgType;
    }

    public void setMsgType(Integer msgType) {
        this.msgType = msgType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Notification notification = (Notification) o;
        return Objects.equals(this.eventName, notification.eventName)
            && Objects.equals(this.status, notification.status) && Objects.equals(this.topic, notification.topic)
            && Objects.equals(this.msgType, notification.msgType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventName, status, topic, msgType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Notification {\n");
        sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    msgType: ").append(toIndentedString(msgType)).append("\n");
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
