package com.g42cloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateSubscriptionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    private String topicUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_urn")

    private String subscriptionUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateSubscriptionRequestBody body;

    public UpdateSubscriptionRequest withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public UpdateSubscriptionRequest withSubscriptionUrn(String subscriptionUrn) {
        this.subscriptionUrn = subscriptionUrn;
        return this;
    }

    public String getSubscriptionUrn() {
        return subscriptionUrn;
    }

    public void setSubscriptionUrn(String subscriptionUrn) {
        this.subscriptionUrn = subscriptionUrn;
    }

    public UpdateSubscriptionRequest withBody(UpdateSubscriptionRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateSubscriptionRequest withBody(Consumer<UpdateSubscriptionRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateSubscriptionRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public UpdateSubscriptionRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateSubscriptionRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateSubscriptionRequest updateSubscriptionRequest = (UpdateSubscriptionRequest) o;
        return Objects.equals(this.topicUrn, updateSubscriptionRequest.topicUrn)
            && Objects.equals(this.subscriptionUrn, updateSubscriptionRequest.subscriptionUrn)
            && Objects.equals(this.body, updateSubscriptionRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topicUrn, subscriptionUrn, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSubscriptionRequest {\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    subscriptionUrn: ").append(toIndentedString(subscriptionUrn)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
