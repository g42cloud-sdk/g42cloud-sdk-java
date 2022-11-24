package com.g42cloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ModifyDomainConfigRequestBody
 */
public class ModifyDomainConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configs")

    private Configs configs;

    public ModifyDomainConfigRequestBody withConfigs(Configs configs) {
        this.configs = configs;
        return this;
    }

    public ModifyDomainConfigRequestBody withConfigs(Consumer<Configs> configsSetter) {
        if (this.configs == null) {
            this.configs = new Configs();
            configsSetter.accept(this.configs);
        }

        return this;
    }

    public Configs getConfigs() {
        return configs;
    }

    public void setConfigs(Configs configs) {
        this.configs = configs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModifyDomainConfigRequestBody modifyDomainConfigRequestBody = (ModifyDomainConfigRequestBody) o;
        return Objects.equals(this.configs, modifyDomainConfigRequestBody.configs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyDomainConfigRequestBody {\n");
        sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
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
