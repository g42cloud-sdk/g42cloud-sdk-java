package com.g42cloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class NeutronRemoveFirewallRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall_rules")

    private List<String> firewallRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audited")

    private Boolean audited;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public")

    private Boolean _public;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    public NeutronRemoveFirewallRuleResponse withId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NeutronRemoveFirewallRuleResponse withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NeutronRemoveFirewallRuleResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NeutronRemoveFirewallRuleResponse withFirewallRules(List<String> firewallRules) {
        this.firewallRules = firewallRules;
        return this;
    }

    public NeutronRemoveFirewallRuleResponse addFirewallRulesItem(String firewallRulesItem) {
        if (this.firewallRules == null) {
            this.firewallRules = new ArrayList<>();
        }
        this.firewallRules.add(firewallRulesItem);
        return this;
    }

    public NeutronRemoveFirewallRuleResponse withFirewallRules(Consumer<List<String>> firewallRulesSetter) {
        if (this.firewallRules == null) {
            this.firewallRules = new ArrayList<>();
        }
        firewallRulesSetter.accept(this.firewallRules);
        return this;
    }

    public List<String> getFirewallRules() {
        return firewallRules;
    }

    public void setFirewallRules(List<String> firewallRules) {
        this.firewallRules = firewallRules;
    }

    public NeutronRemoveFirewallRuleResponse withAudited(Boolean audited) {
        this.audited = audited;
        return this;
    }

    public Boolean getAudited() {
        return audited;
    }

    public void setAudited(Boolean audited) {
        this.audited = audited;
    }

    public NeutronRemoveFirewallRuleResponse withPublic(Boolean _public) {
        this._public = _public;
        return this;
    }

    public Boolean getPublic() {
        return _public;
    }

    public void setPublic(Boolean _public) {
        this._public = _public;
    }

    public NeutronRemoveFirewallRuleResponse withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public NeutronRemoveFirewallRuleResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronRemoveFirewallRuleResponse neutronRemoveFirewallRuleResponse = (NeutronRemoveFirewallRuleResponse) o;
        return Objects.equals(this.id, neutronRemoveFirewallRuleResponse.id)
            && Objects.equals(this.name, neutronRemoveFirewallRuleResponse.name)
            && Objects.equals(this.description, neutronRemoveFirewallRuleResponse.description)
            && Objects.equals(this.firewallRules, neutronRemoveFirewallRuleResponse.firewallRules)
            && Objects.equals(this.audited, neutronRemoveFirewallRuleResponse.audited)
            && Objects.equals(this._public, neutronRemoveFirewallRuleResponse._public)
            && Objects.equals(this.tenantId, neutronRemoveFirewallRuleResponse.tenantId)
            && Objects.equals(this.projectId, neutronRemoveFirewallRuleResponse.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, firewallRules, audited, _public, tenantId, projectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronRemoveFirewallRuleResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    firewallRules: ").append(toIndentedString(firewallRules)).append("\n");
        sb.append("    audited: ").append(toIndentedString(audited)).append("\n");
        sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
