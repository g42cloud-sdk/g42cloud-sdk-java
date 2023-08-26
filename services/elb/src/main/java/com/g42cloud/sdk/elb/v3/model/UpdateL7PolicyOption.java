package com.g42cloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新七层转发策略的请求参数。
 */
public class UpdateL7PolicyOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_listener_id")

    private String redirectListenerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_pool_id")

    private String redirectPoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_url_config")

    private UpdateRedirectUrlConfig redirectUrlConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fixed_response_config")

    private UpdateFixtedResponseConfig fixedResponseConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rules")

    private List<CreateRuleOption> rules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_pools_config")

    private List<CreateRedirectPoolsConfig> redirectPoolsConfig = null;

    public UpdateL7PolicyOption withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public UpdateL7PolicyOption withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateL7PolicyOption withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateL7PolicyOption withRedirectListenerId(String redirectListenerId) {
        this.redirectListenerId = redirectListenerId;
        return this;
    }

    public String getRedirectListenerId() {
        return redirectListenerId;
    }

    public void setRedirectListenerId(String redirectListenerId) {
        this.redirectListenerId = redirectListenerId;
    }

    public UpdateL7PolicyOption withRedirectPoolId(String redirectPoolId) {
        this.redirectPoolId = redirectPoolId;
        return this;
    }

    public String getRedirectPoolId() {
        return redirectPoolId;
    }

    public void setRedirectPoolId(String redirectPoolId) {
        this.redirectPoolId = redirectPoolId;
    }

    public UpdateL7PolicyOption withRedirectUrlConfig(UpdateRedirectUrlConfig redirectUrlConfig) {
        this.redirectUrlConfig = redirectUrlConfig;
        return this;
    }

    public UpdateL7PolicyOption withRedirectUrlConfig(Consumer<UpdateRedirectUrlConfig> redirectUrlConfigSetter) {
        if (this.redirectUrlConfig == null) {
            this.redirectUrlConfig = new UpdateRedirectUrlConfig();
            redirectUrlConfigSetter.accept(this.redirectUrlConfig);
        }

        return this;
    }

    public UpdateRedirectUrlConfig getRedirectUrlConfig() {
        return redirectUrlConfig;
    }

    public void setRedirectUrlConfig(UpdateRedirectUrlConfig redirectUrlConfig) {
        this.redirectUrlConfig = redirectUrlConfig;
    }

    public UpdateL7PolicyOption withFixedResponseConfig(UpdateFixtedResponseConfig fixedResponseConfig) {
        this.fixedResponseConfig = fixedResponseConfig;
        return this;
    }

    public UpdateL7PolicyOption withFixedResponseConfig(
        Consumer<UpdateFixtedResponseConfig> fixedResponseConfigSetter) {
        if (this.fixedResponseConfig == null) {
            this.fixedResponseConfig = new UpdateFixtedResponseConfig();
            fixedResponseConfigSetter.accept(this.fixedResponseConfig);
        }

        return this;
    }

    public UpdateFixtedResponseConfig getFixedResponseConfig() {
        return fixedResponseConfig;
    }

    public void setFixedResponseConfig(UpdateFixtedResponseConfig fixedResponseConfig) {
        this.fixedResponseConfig = fixedResponseConfig;
    }

    public UpdateL7PolicyOption withRules(List<CreateRuleOption> rules) {
        this.rules = rules;
        return this;
    }

    public UpdateL7PolicyOption addRulesItem(CreateRuleOption rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public UpdateL7PolicyOption withRules(Consumer<List<CreateRuleOption>> rulesSetter) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    public List<CreateRuleOption> getRules() {
        return rules;
    }

    public void setRules(List<CreateRuleOption> rules) {
        this.rules = rules;
    }

    public UpdateL7PolicyOption withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public UpdateL7PolicyOption withRedirectPoolsConfig(List<CreateRedirectPoolsConfig> redirectPoolsConfig) {
        this.redirectPoolsConfig = redirectPoolsConfig;
        return this;
    }

    public UpdateL7PolicyOption addRedirectPoolsConfigItem(CreateRedirectPoolsConfig redirectPoolsConfigItem) {
        if (this.redirectPoolsConfig == null) {
            this.redirectPoolsConfig = new ArrayList<>();
        }
        this.redirectPoolsConfig.add(redirectPoolsConfigItem);
        return this;
    }

    public UpdateL7PolicyOption withRedirectPoolsConfig(
        Consumer<List<CreateRedirectPoolsConfig>> redirectPoolsConfigSetter) {
        if (this.redirectPoolsConfig == null) {
            this.redirectPoolsConfig = new ArrayList<>();
        }
        redirectPoolsConfigSetter.accept(this.redirectPoolsConfig);
        return this;
    }

    public List<CreateRedirectPoolsConfig> getRedirectPoolsConfig() {
        return redirectPoolsConfig;
    }

    public void setRedirectPoolsConfig(List<CreateRedirectPoolsConfig> redirectPoolsConfig) {
        this.redirectPoolsConfig = redirectPoolsConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateL7PolicyOption that = (UpdateL7PolicyOption) obj;
        return Objects.equals(this.adminStateUp, that.adminStateUp)
            && Objects.equals(this.description, that.description) && Objects.equals(this.name, that.name)
            && Objects.equals(this.redirectListenerId, that.redirectListenerId)
            && Objects.equals(this.redirectPoolId, that.redirectPoolId)
            && Objects.equals(this.redirectUrlConfig, that.redirectUrlConfig)
            && Objects.equals(this.fixedResponseConfig, that.fixedResponseConfig)
            && Objects.equals(this.rules, that.rules) && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.redirectPoolsConfig, that.redirectPoolsConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminStateUp,
            description,
            name,
            redirectListenerId,
            redirectPoolId,
            redirectUrlConfig,
            fixedResponseConfig,
            rules,
            priority,
            redirectPoolsConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateL7PolicyOption {\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    redirectListenerId: ").append(toIndentedString(redirectListenerId)).append("\n");
        sb.append("    redirectPoolId: ").append(toIndentedString(redirectPoolId)).append("\n");
        sb.append("    redirectUrlConfig: ").append(toIndentedString(redirectUrlConfig)).append("\n");
        sb.append("    fixedResponseConfig: ").append(toIndentedString(fixedResponseConfig)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    redirectPoolsConfig: ").append(toIndentedString(redirectPoolsConfig)).append("\n");
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
