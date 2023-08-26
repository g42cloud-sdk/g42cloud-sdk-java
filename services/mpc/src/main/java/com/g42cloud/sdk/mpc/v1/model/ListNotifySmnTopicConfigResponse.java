package com.g42cloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListNotifySmnTopicConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notifications")

    private List<Notification> notifications = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListNotifySmnTopicConfigResponse withNotifications(List<Notification> notifications) {
        this.notifications = notifications;
        return this;
    }

    public ListNotifySmnTopicConfigResponse addNotificationsItem(Notification notificationsItem) {
        if (this.notifications == null) {
            this.notifications = new ArrayList<>();
        }
        this.notifications.add(notificationsItem);
        return this;
    }

    public ListNotifySmnTopicConfigResponse withNotifications(Consumer<List<Notification>> notificationsSetter) {
        if (this.notifications == null) {
            this.notifications = new ArrayList<>();
        }
        notificationsSetter.accept(this.notifications);
        return this;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }

    public ListNotifySmnTopicConfigResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListNotifySmnTopicConfigResponse that = (ListNotifySmnTopicConfigResponse) obj;
        return Objects.equals(this.notifications, that.notifications) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notifications, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNotifySmnTopicConfigResponse {\n");
        sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
