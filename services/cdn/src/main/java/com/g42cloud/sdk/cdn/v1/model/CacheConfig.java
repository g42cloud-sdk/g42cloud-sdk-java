package com.g42cloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CacheConfig
 */
public class CacheConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ignore_url_parameter")

    private Boolean ignoreUrlParameter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "follow_origin")

    private Boolean followOrigin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compress")

    private CompressResponse compress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rules")

    private List<Rules> rules = null;

    public CacheConfig withIgnoreUrlParameter(Boolean ignoreUrlParameter) {
        this.ignoreUrlParameter = ignoreUrlParameter;
        return this;
    }

    public Boolean getIgnoreUrlParameter() {
        return ignoreUrlParameter;
    }

    public void setIgnoreUrlParameter(Boolean ignoreUrlParameter) {
        this.ignoreUrlParameter = ignoreUrlParameter;
    }

    public CacheConfig withFollowOrigin(Boolean followOrigin) {
        this.followOrigin = followOrigin;
        return this;
    }

    public Boolean getFollowOrigin() {
        return followOrigin;
    }

    public void setFollowOrigin(Boolean followOrigin) {
        this.followOrigin = followOrigin;
    }

    public CacheConfig withCompress(CompressResponse compress) {
        this.compress = compress;
        return this;
    }

    public CacheConfig withCompress(Consumer<CompressResponse> compressSetter) {
        if (this.compress == null) {
            this.compress = new CompressResponse();
            compressSetter.accept(this.compress);
        }

        return this;
    }

    public CompressResponse getCompress() {
        return compress;
    }

    public void setCompress(CompressResponse compress) {
        this.compress = compress;
    }

    public CacheConfig withRules(List<Rules> rules) {
        this.rules = rules;
        return this;
    }

    public CacheConfig addRulesItem(Rules rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public CacheConfig withRules(Consumer<List<Rules>> rulesSetter) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    public List<Rules> getRules() {
        return rules;
    }

    public void setRules(List<Rules> rules) {
        this.rules = rules;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CacheConfig cacheConfig = (CacheConfig) o;
        return Objects.equals(this.ignoreUrlParameter, cacheConfig.ignoreUrlParameter)
            && Objects.equals(this.followOrigin, cacheConfig.followOrigin)
            && Objects.equals(this.compress, cacheConfig.compress) && Objects.equals(this.rules, cacheConfig.rules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ignoreUrlParameter, followOrigin, compress, rules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CacheConfig {\n");
        sb.append("    ignoreUrlParameter: ").append(toIndentedString(ignoreUrlParameter)).append("\n");
        sb.append("    followOrigin: ").append(toIndentedString(followOrigin)).append("\n");
        sb.append("    compress: ").append(toIndentedString(compress)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
