package com.g42cloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class NeutronFirewallGroup {

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
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "egress_firewall_policy_id")

    private String egressFirewallPolicyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ingress_firewall_policy_id")

    private String ingressFirewallPolicyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ports")

    private List<String> ports = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public")

    private Boolean _public;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    public NeutronFirewallGroup withId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NeutronFirewallGroup withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NeutronFirewallGroup withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NeutronFirewallGroup withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public NeutronFirewallGroup withEgressFirewallPolicyId(String egressFirewallPolicyId) {
        this.egressFirewallPolicyId = egressFirewallPolicyId;
        return this;
    }

    public String getEgressFirewallPolicyId() {
        return egressFirewallPolicyId;
    }

    public void setEgressFirewallPolicyId(String egressFirewallPolicyId) {
        this.egressFirewallPolicyId = egressFirewallPolicyId;
    }

    public NeutronFirewallGroup withIngressFirewallPolicyId(String ingressFirewallPolicyId) {
        this.ingressFirewallPolicyId = ingressFirewallPolicyId;
        return this;
    }

    public String getIngressFirewallPolicyId() {
        return ingressFirewallPolicyId;
    }

    public void setIngressFirewallPolicyId(String ingressFirewallPolicyId) {
        this.ingressFirewallPolicyId = ingressFirewallPolicyId;
    }

    public NeutronFirewallGroup withPorts(List<String> ports) {
        this.ports = ports;
        return this;
    }

    public NeutronFirewallGroup addPortsItem(String portsItem) {
        if (this.ports == null) {
            this.ports = new ArrayList<>();
        }
        this.ports.add(portsItem);
        return this;
    }

    public NeutronFirewallGroup withPorts(Consumer<List<String>> portsSetter) {
        if (this.ports == null) {
            this.ports = new ArrayList<>();
        }
        portsSetter.accept(this.ports);
        return this;
    }

    public List<String> getPorts() {
        return ports;
    }

    public void setPorts(List<String> ports) {
        this.ports = ports;
    }

    public NeutronFirewallGroup withPublic(Boolean _public) {
        this._public = _public;
        return this;
    }

    public Boolean getPublic() {
        return _public;
    }

    public void setPublic(Boolean _public) {
        this._public = _public;
    }

    public NeutronFirewallGroup withStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public NeutronFirewallGroup withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public NeutronFirewallGroup withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public NeutronFirewallGroup withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public NeutronFirewallGroup withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronFirewallGroup neutronFirewallGroup = (NeutronFirewallGroup) o;
        return Objects.equals(this.id, neutronFirewallGroup.id) && Objects.equals(this.name, neutronFirewallGroup.name)
            && Objects.equals(this.description, neutronFirewallGroup.description)
            && Objects.equals(this.adminStateUp, neutronFirewallGroup.adminStateUp)
            && Objects.equals(this.egressFirewallPolicyId, neutronFirewallGroup.egressFirewallPolicyId)
            && Objects.equals(this.ingressFirewallPolicyId, neutronFirewallGroup.ingressFirewallPolicyId)
            && Objects.equals(this.ports, neutronFirewallGroup.ports)
            && Objects.equals(this._public, neutronFirewallGroup._public)
            && Objects.equals(this.status, neutronFirewallGroup.status)
            && Objects.equals(this.tenantId, neutronFirewallGroup.tenantId)
            && Objects.equals(this.projectId, neutronFirewallGroup.projectId)
            && Objects.equals(this.createdAt, neutronFirewallGroup.createdAt)
            && Objects.equals(this.updatedAt, neutronFirewallGroup.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            adminStateUp,
            egressFirewallPolicyId,
            ingressFirewallPolicyId,
            ports,
            _public,
            status,
            tenantId,
            projectId,
            createdAt,
            updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronFirewallGroup {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    egressFirewallPolicyId: ").append(toIndentedString(egressFirewallPolicyId)).append("\n");
        sb.append("    ingressFirewallPolicyId: ").append(toIndentedString(ingressFirewallPolicyId)).append("\n");
        sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
        sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
