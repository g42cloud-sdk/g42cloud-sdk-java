package com.g42cloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateConfigurationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configuration")

    private ConfigurationSummaryForCreate _configuration;

    public CreateConfigurationResponse withConfiguration(ConfigurationSummaryForCreate _configuration) {
        this._configuration = _configuration;
        return this;
    }

    public CreateConfigurationResponse withConfiguration(Consumer<ConfigurationSummaryForCreate> _configurationSetter) {
        if (this._configuration == null) {
            this._configuration = new ConfigurationSummaryForCreate();
            _configurationSetter.accept(this._configuration);
        }

        return this;
    }

    public ConfigurationSummaryForCreate getConfiguration() {
        return _configuration;
    }

    public void setConfiguration(ConfigurationSummaryForCreate _configuration) {
        this._configuration = _configuration;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateConfigurationResponse createConfigurationResponse = (CreateConfigurationResponse) o;
        return Objects.equals(this._configuration, createConfigurationResponse._configuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_configuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateConfigurationResponse {\n");
        sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
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
