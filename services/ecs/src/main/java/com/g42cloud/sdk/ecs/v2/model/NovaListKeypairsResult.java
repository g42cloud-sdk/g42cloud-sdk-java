package com.g42cloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class NovaListKeypairsResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keypair")

    private NovaSimpleKeypair keypair;

    public NovaListKeypairsResult withKeypair(NovaSimpleKeypair keypair) {
        this.keypair = keypair;
        return this;
    }

    public NovaListKeypairsResult withKeypair(Consumer<NovaSimpleKeypair> keypairSetter) {
        if (this.keypair == null) {
            this.keypair = new NovaSimpleKeypair();
            keypairSetter.accept(this.keypair);
        }

        return this;
    }

    public NovaSimpleKeypair getKeypair() {
        return keypair;
    }

    public void setKeypair(NovaSimpleKeypair keypair) {
        this.keypair = keypair;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NovaListKeypairsResult novaListKeypairsResult = (NovaListKeypairsResult) o;
        return Objects.equals(this.keypair, novaListKeypairsResult.keypair);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keypair);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaListKeypairsResult {\n");
        sb.append("    keypair: ").append(toIndentedString(keypair)).append("\n");
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
