package com.g42cloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建域名返回信息
 */
public class CreateDomainResponseBodyContent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_type")

    private String businessType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_area")

    private String serviceArea;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_domain_id")

    private String userDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_status")

    private String domainStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cname")

    private String cname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sources")

    private List<Sources> sources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_origin_host")

    private DomainOriginHost domainOriginHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "https_status")

    private Integer httpsStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modify_time")

    private Long modifyTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disabled")

    private Integer disabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locked")

    private Integer locked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "range_status")

    private String rangeStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "follow_status")

    private String followStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_status")

    private String originStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_refresh_preheat")

    private Integer autoRefreshPreheat;

    public CreateDomainResponseBodyContent withId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateDomainResponseBodyContent withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public CreateDomainResponseBodyContent withBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public CreateDomainResponseBodyContent withServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
        return this;
    }

    public String getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
    }

    public CreateDomainResponseBodyContent withUserDomainId(String userDomainId) {
        this.userDomainId = userDomainId;
        return this;
    }

    public String getUserDomainId() {
        return userDomainId;
    }

    public void setUserDomainId(String userDomainId) {
        this.userDomainId = userDomainId;
    }

    public CreateDomainResponseBodyContent withDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
        return this;
    }

    public String getDomainStatus() {
        return domainStatus;
    }

    public void setDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
    }

    public CreateDomainResponseBodyContent withCname(String cname) {
        this.cname = cname;
        return this;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public CreateDomainResponseBodyContent withSources(List<Sources> sources) {
        this.sources = sources;
        return this;
    }

    public CreateDomainResponseBodyContent addSourcesItem(Sources sourcesItem) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(sourcesItem);
        return this;
    }

    public CreateDomainResponseBodyContent withSources(Consumer<List<Sources>> sourcesSetter) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        sourcesSetter.accept(this.sources);
        return this;
    }

    public List<Sources> getSources() {
        return sources;
    }

    public void setSources(List<Sources> sources) {
        this.sources = sources;
    }

    public CreateDomainResponseBodyContent withDomainOriginHost(DomainOriginHost domainOriginHost) {
        this.domainOriginHost = domainOriginHost;
        return this;
    }

    public CreateDomainResponseBodyContent withDomainOriginHost(Consumer<DomainOriginHost> domainOriginHostSetter) {
        if (this.domainOriginHost == null) {
            this.domainOriginHost = new DomainOriginHost();
            domainOriginHostSetter.accept(this.domainOriginHost);
        }

        return this;
    }

    public DomainOriginHost getDomainOriginHost() {
        return domainOriginHost;
    }

    public void setDomainOriginHost(DomainOriginHost domainOriginHost) {
        this.domainOriginHost = domainOriginHost;
    }

    public CreateDomainResponseBodyContent withHttpsStatus(Integer httpsStatus) {
        this.httpsStatus = httpsStatus;
        return this;
    }

    public Integer getHttpsStatus() {
        return httpsStatus;
    }

    public void setHttpsStatus(Integer httpsStatus) {
        this.httpsStatus = httpsStatus;
    }

    public CreateDomainResponseBodyContent withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public CreateDomainResponseBodyContent withModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    public Long getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
    }

    public CreateDomainResponseBodyContent withDisabled(Integer disabled) {
        this.disabled = disabled;
        return this;
    }

    public Integer getDisabled() {
        return disabled;
    }

    public void setDisabled(Integer disabled) {
        this.disabled = disabled;
    }

    public CreateDomainResponseBodyContent withLocked(Integer locked) {
        this.locked = locked;
        return this;
    }

    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    public CreateDomainResponseBodyContent withRangeStatus(String rangeStatus) {
        this.rangeStatus = rangeStatus;
        return this;
    }

    public String getRangeStatus() {
        return rangeStatus;
    }

    public void setRangeStatus(String rangeStatus) {
        this.rangeStatus = rangeStatus;
    }

    public CreateDomainResponseBodyContent withFollowStatus(String followStatus) {
        this.followStatus = followStatus;
        return this;
    }

    public String getFollowStatus() {
        return followStatus;
    }

    public void setFollowStatus(String followStatus) {
        this.followStatus = followStatus;
    }

    public CreateDomainResponseBodyContent withOriginStatus(String originStatus) {
        this.originStatus = originStatus;
        return this;
    }

    public String getOriginStatus() {
        return originStatus;
    }

    public void setOriginStatus(String originStatus) {
        this.originStatus = originStatus;
    }

    public CreateDomainResponseBodyContent withAutoRefreshPreheat(Integer autoRefreshPreheat) {
        this.autoRefreshPreheat = autoRefreshPreheat;
        return this;
    }

    public Integer getAutoRefreshPreheat() {
        return autoRefreshPreheat;
    }

    public void setAutoRefreshPreheat(Integer autoRefreshPreheat) {
        this.autoRefreshPreheat = autoRefreshPreheat;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDomainResponseBodyContent that = (CreateDomainResponseBodyContent) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.businessType, that.businessType)
            && Objects.equals(this.serviceArea, that.serviceArea)
            && Objects.equals(this.userDomainId, that.userDomainId)
            && Objects.equals(this.domainStatus, that.domainStatus) && Objects.equals(this.cname, that.cname)
            && Objects.equals(this.sources, that.sources)
            && Objects.equals(this.domainOriginHost, that.domainOriginHost)
            && Objects.equals(this.httpsStatus, that.httpsStatus) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.modifyTime, that.modifyTime) && Objects.equals(this.disabled, that.disabled)
            && Objects.equals(this.locked, that.locked) && Objects.equals(this.rangeStatus, that.rangeStatus)
            && Objects.equals(this.followStatus, that.followStatus)
            && Objects.equals(this.originStatus, that.originStatus)
            && Objects.equals(this.autoRefreshPreheat, that.autoRefreshPreheat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            domainName,
            businessType,
            serviceArea,
            userDomainId,
            domainStatus,
            cname,
            sources,
            domainOriginHost,
            httpsStatus,
            createTime,
            modifyTime,
            disabled,
            locked,
            rangeStatus,
            followStatus,
            originStatus,
            autoRefreshPreheat);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDomainResponseBodyContent {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
        sb.append("    serviceArea: ").append(toIndentedString(serviceArea)).append("\n");
        sb.append("    userDomainId: ").append(toIndentedString(userDomainId)).append("\n");
        sb.append("    domainStatus: ").append(toIndentedString(domainStatus)).append("\n");
        sb.append("    cname: ").append(toIndentedString(cname)).append("\n");
        sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
        sb.append("    domainOriginHost: ").append(toIndentedString(domainOriginHost)).append("\n");
        sb.append("    httpsStatus: ").append(toIndentedString(httpsStatus)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    modifyTime: ").append(toIndentedString(modifyTime)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
        sb.append("    rangeStatus: ").append(toIndentedString(rangeStatus)).append("\n");
        sb.append("    followStatus: ").append(toIndentedString(followStatus)).append("\n");
        sb.append("    originStatus: ").append(toIndentedString(originStatus)).append("\n");
        sb.append("    autoRefreshPreheat: ").append(toIndentedString(autoRefreshPreheat)).append("\n");
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
