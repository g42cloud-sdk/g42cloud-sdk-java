package com.g42cloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListTopicAttributesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    private TopicAttribute attributes;

    public ListTopicAttributesResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListTopicAttributesResponse withAttributes(TopicAttribute attributes) {
        this.attributes = attributes;
        return this;
    }

    public ListTopicAttributesResponse withAttributes(Consumer<TopicAttribute> attributesSetter) {
        if (this.attributes == null) {
            this.attributes = new TopicAttribute();
            attributesSetter.accept(this.attributes);
        }

        return this;
    }

    public TopicAttribute getAttributes() {
        return attributes;
    }

    public void setAttributes(TopicAttribute attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTopicAttributesResponse listTopicAttributesResponse = (ListTopicAttributesResponse) o;
        return Objects.equals(this.requestId, listTopicAttributesResponse.requestId)
            && Objects.equals(this.attributes, listTopicAttributesResponse.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, attributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTopicAttributesResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
