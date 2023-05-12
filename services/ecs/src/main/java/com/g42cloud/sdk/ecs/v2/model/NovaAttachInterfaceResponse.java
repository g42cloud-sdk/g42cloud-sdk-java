package com.g42cloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class NovaAttachInterfaceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interfaceAttachment")

    private NovaServerInterfaceDetail interfaceAttachment;

    public NovaAttachInterfaceResponse withInterfaceAttachment(NovaServerInterfaceDetail interfaceAttachment) {
        this.interfaceAttachment = interfaceAttachment;
        return this;
    }

    public NovaAttachInterfaceResponse withInterfaceAttachment(
        Consumer<NovaServerInterfaceDetail> interfaceAttachmentSetter) {
        if (this.interfaceAttachment == null) {
            this.interfaceAttachment = new NovaServerInterfaceDetail();
            interfaceAttachmentSetter.accept(this.interfaceAttachment);
        }

        return this;
    }

    public NovaServerInterfaceDetail getInterfaceAttachment() {
        return interfaceAttachment;
    }

    public void setInterfaceAttachment(NovaServerInterfaceDetail interfaceAttachment) {
        this.interfaceAttachment = interfaceAttachment;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NovaAttachInterfaceResponse novaAttachInterfaceResponse = (NovaAttachInterfaceResponse) o;
        return Objects.equals(this.interfaceAttachment, novaAttachInterfaceResponse.interfaceAttachment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(interfaceAttachment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaAttachInterfaceResponse {\n");
        sb.append("    interfaceAttachment: ").append(toIndentedString(interfaceAttachment)).append("\n");
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
