package com.g42cloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class CreateListenerRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listener")

    private CreateListenerOption listener;

    public CreateListenerRequestBody withListener(CreateListenerOption listener) {
        this.listener = listener;
        return this;
    }

    public CreateListenerRequestBody withListener(Consumer<CreateListenerOption> listenerSetter) {
        if (this.listener == null) {
            this.listener = new CreateListenerOption();
            listenerSetter.accept(this.listener);
        }

        return this;
    }

    public CreateListenerOption getListener() {
        return listener;
    }

    public void setListener(CreateListenerOption listener) {
        this.listener = listener;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateListenerRequestBody createListenerRequestBody = (CreateListenerRequestBody) o;
        return Objects.equals(this.listener, createListenerRequestBody.listener);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listener);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateListenerRequestBody {\n");
        sb.append("    listener: ").append(toIndentedString(listener)).append("\n");
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
