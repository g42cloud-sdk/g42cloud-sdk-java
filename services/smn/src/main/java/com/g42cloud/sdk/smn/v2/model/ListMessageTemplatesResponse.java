package com.g42cloud.sdk.smn.v2.model;

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
public class ListMessageTemplatesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_template_count")

    private Integer messageTemplateCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_templates")

    private List<MessageTemplate> messageTemplates = null;

    public ListMessageTemplatesResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListMessageTemplatesResponse withMessageTemplateCount(Integer messageTemplateCount) {
        this.messageTemplateCount = messageTemplateCount;
        return this;
    }

    public Integer getMessageTemplateCount() {
        return messageTemplateCount;
    }

    public void setMessageTemplateCount(Integer messageTemplateCount) {
        this.messageTemplateCount = messageTemplateCount;
    }

    public ListMessageTemplatesResponse withMessageTemplates(List<MessageTemplate> messageTemplates) {
        this.messageTemplates = messageTemplates;
        return this;
    }

    public ListMessageTemplatesResponse addMessageTemplatesItem(MessageTemplate messageTemplatesItem) {
        if (this.messageTemplates == null) {
            this.messageTemplates = new ArrayList<>();
        }
        this.messageTemplates.add(messageTemplatesItem);
        return this;
    }

    public ListMessageTemplatesResponse withMessageTemplates(Consumer<List<MessageTemplate>> messageTemplatesSetter) {
        if (this.messageTemplates == null) {
            this.messageTemplates = new ArrayList<>();
        }
        messageTemplatesSetter.accept(this.messageTemplates);
        return this;
    }

    public List<MessageTemplate> getMessageTemplates() {
        return messageTemplates;
    }

    public void setMessageTemplates(List<MessageTemplate> messageTemplates) {
        this.messageTemplates = messageTemplates;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListMessageTemplatesResponse that = (ListMessageTemplatesResponse) obj;
        return Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.messageTemplateCount, that.messageTemplateCount)
            && Objects.equals(this.messageTemplates, that.messageTemplates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, messageTemplateCount, messageTemplates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMessageTemplatesResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    messageTemplateCount: ").append(toIndentedString(messageTemplateCount)).append("\n");
        sb.append("    messageTemplates: ").append(toIndentedString(messageTemplates)).append("\n");
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
