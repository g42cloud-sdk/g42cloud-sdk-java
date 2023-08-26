package com.g42cloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 负载均衡相关各类资源的配额信息。仅返回资源的总配额，不包括剩余可用配额。
 */
public class Quota {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer")

    private Integer loadbalancer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate")

    private Integer certificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listener")

    private Integer listener;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l7policy")

    private Integer l7policy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool")

    private Integer pool;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "healthmonitor")

    private Integer healthmonitor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member")

    private Integer member;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "members_per_pool")

    private Integer membersPerPool;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipgroup")

    private Integer ipgroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_policy")

    private Integer securityPolicy;

    public Quota withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Quota withLoadbalancer(Integer loadbalancer) {
        this.loadbalancer = loadbalancer;
        return this;
    }

    public Integer getLoadbalancer() {
        return loadbalancer;
    }

    public void setLoadbalancer(Integer loadbalancer) {
        this.loadbalancer = loadbalancer;
    }

    public Quota withCertificate(Integer certificate) {
        this.certificate = certificate;
        return this;
    }

    public Integer getCertificate() {
        return certificate;
    }

    public void setCertificate(Integer certificate) {
        this.certificate = certificate;
    }

    public Quota withListener(Integer listener) {
        this.listener = listener;
        return this;
    }

    public Integer getListener() {
        return listener;
    }

    public void setListener(Integer listener) {
        this.listener = listener;
    }

    public Quota withL7policy(Integer l7policy) {
        this.l7policy = l7policy;
        return this;
    }

    public Integer getL7policy() {
        return l7policy;
    }

    public void setL7policy(Integer l7policy) {
        this.l7policy = l7policy;
    }

    public Quota withPool(Integer pool) {
        this.pool = pool;
        return this;
    }

    public Integer getPool() {
        return pool;
    }

    public void setPool(Integer pool) {
        this.pool = pool;
    }

    public Quota withHealthmonitor(Integer healthmonitor) {
        this.healthmonitor = healthmonitor;
        return this;
    }

    public Integer getHealthmonitor() {
        return healthmonitor;
    }

    public void setHealthmonitor(Integer healthmonitor) {
        this.healthmonitor = healthmonitor;
    }

    public Quota withMember(Integer member) {
        this.member = member;
        return this;
    }

    public Integer getMember() {
        return member;
    }

    public void setMember(Integer member) {
        this.member = member;
    }

    public Quota withMembersPerPool(Integer membersPerPool) {
        this.membersPerPool = membersPerPool;
        return this;
    }

    public Integer getMembersPerPool() {
        return membersPerPool;
    }

    public void setMembersPerPool(Integer membersPerPool) {
        this.membersPerPool = membersPerPool;
    }

    public Quota withIpgroup(Integer ipgroup) {
        this.ipgroup = ipgroup;
        return this;
    }

    public Integer getIpgroup() {
        return ipgroup;
    }

    public void setIpgroup(Integer ipgroup) {
        this.ipgroup = ipgroup;
    }

    public Quota withSecurityPolicy(Integer securityPolicy) {
        this.securityPolicy = securityPolicy;
        return this;
    }

    public Integer getSecurityPolicy() {
        return securityPolicy;
    }

    public void setSecurityPolicy(Integer securityPolicy) {
        this.securityPolicy = securityPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Quota that = (Quota) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.loadbalancer, that.loadbalancer)
            && Objects.equals(this.certificate, that.certificate) && Objects.equals(this.listener, that.listener)
            && Objects.equals(this.l7policy, that.l7policy) && Objects.equals(this.pool, that.pool)
            && Objects.equals(this.healthmonitor, that.healthmonitor) && Objects.equals(this.member, that.member)
            && Objects.equals(this.membersPerPool, that.membersPerPool) && Objects.equals(this.ipgroup, that.ipgroup)
            && Objects.equals(this.securityPolicy, that.securityPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId,
            loadbalancer,
            certificate,
            listener,
            l7policy,
            pool,
            healthmonitor,
            member,
            membersPerPool,
            ipgroup,
            securityPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Quota {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    loadbalancer: ").append(toIndentedString(loadbalancer)).append("\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
        sb.append("    listener: ").append(toIndentedString(listener)).append("\n");
        sb.append("    l7policy: ").append(toIndentedString(l7policy)).append("\n");
        sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
        sb.append("    healthmonitor: ").append(toIndentedString(healthmonitor)).append("\n");
        sb.append("    member: ").append(toIndentedString(member)).append("\n");
        sb.append("    membersPerPool: ").append(toIndentedString(membersPerPool)).append("\n");
        sb.append("    ipgroup: ").append(toIndentedString(ipgroup)).append("\n");
        sb.append("    securityPolicy: ").append(toIndentedString(securityPolicy)).append("\n");
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
