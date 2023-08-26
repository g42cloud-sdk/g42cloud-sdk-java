package com.g42cloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 域名信息
 */
public class DomainsWithPort {

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

    private List<SourceWithPort> sources = null;

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
    @JsonProperty(value = "auto_refresh_preheat")

    private Integer autoRefreshPreheat;

    public static final class ServiceAreaEnum {

        /**
         * Enum MAINLAND_CHINA for value: "mainland_china"
         */
        public static final ServiceAreaEnum MAINLAND_CHINA = new ServiceAreaEnum("mainland_china");

        /**
         * Enum OUTSIDE_MAINLAND_CHINA for value: "outside_mainland_china"
         */
        public static final ServiceAreaEnum OUTSIDE_MAINLAND_CHINA = new ServiceAreaEnum("outside_mainland_china");

        /**
         * Enum GLOBAL for value: "global"
         */
        public static final ServiceAreaEnum GLOBAL = new ServiceAreaEnum("global");

        private static final Map<String, ServiceAreaEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ServiceAreaEnum> createStaticFields() {
            Map<String, ServiceAreaEnum> map = new HashMap<>();
            map.put("mainland_china", MAINLAND_CHINA);
            map.put("outside_mainland_china", OUTSIDE_MAINLAND_CHINA);
            map.put("global", GLOBAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ServiceAreaEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ServiceAreaEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ServiceAreaEnum(value));
        }

        public static ServiceAreaEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ServiceAreaEnum) {
                return this.value.equals(((ServiceAreaEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_area")

    private ServiceAreaEnum serviceArea;

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
    @JsonProperty(value = "banned_reason")

    private String bannedReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locked_reason")

    private String lockedReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public DomainsWithPort withId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DomainsWithPort withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public DomainsWithPort withBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public DomainsWithPort withUserDomainId(String userDomainId) {
        this.userDomainId = userDomainId;
        return this;
    }

    public String getUserDomainId() {
        return userDomainId;
    }

    public void setUserDomainId(String userDomainId) {
        this.userDomainId = userDomainId;
    }

    public DomainsWithPort withDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
        return this;
    }

    public String getDomainStatus() {
        return domainStatus;
    }

    public void setDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
    }

    public DomainsWithPort withCname(String cname) {
        this.cname = cname;
        return this;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public DomainsWithPort withSources(List<SourceWithPort> sources) {
        this.sources = sources;
        return this;
    }

    public DomainsWithPort addSourcesItem(SourceWithPort sourcesItem) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(sourcesItem);
        return this;
    }

    public DomainsWithPort withSources(Consumer<List<SourceWithPort>> sourcesSetter) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        sourcesSetter.accept(this.sources);
        return this;
    }

    public List<SourceWithPort> getSources() {
        return sources;
    }

    public void setSources(List<SourceWithPort> sources) {
        this.sources = sources;
    }

    public DomainsWithPort withDomainOriginHost(DomainOriginHost domainOriginHost) {
        this.domainOriginHost = domainOriginHost;
        return this;
    }

    public DomainsWithPort withDomainOriginHost(Consumer<DomainOriginHost> domainOriginHostSetter) {
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

    public DomainsWithPort withHttpsStatus(Integer httpsStatus) {
        this.httpsStatus = httpsStatus;
        return this;
    }

    public Integer getHttpsStatus() {
        return httpsStatus;
    }

    public void setHttpsStatus(Integer httpsStatus) {
        this.httpsStatus = httpsStatus;
    }

    public DomainsWithPort withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public DomainsWithPort withModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    public Long getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
    }

    public DomainsWithPort withDisabled(Integer disabled) {
        this.disabled = disabled;
        return this;
    }

    public Integer getDisabled() {
        return disabled;
    }

    public void setDisabled(Integer disabled) {
        this.disabled = disabled;
    }

    public DomainsWithPort withLocked(Integer locked) {
        this.locked = locked;
        return this;
    }

    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    public DomainsWithPort withAutoRefreshPreheat(Integer autoRefreshPreheat) {
        this.autoRefreshPreheat = autoRefreshPreheat;
        return this;
    }

    public Integer getAutoRefreshPreheat() {
        return autoRefreshPreheat;
    }

    public void setAutoRefreshPreheat(Integer autoRefreshPreheat) {
        this.autoRefreshPreheat = autoRefreshPreheat;
    }

    public DomainsWithPort withServiceArea(ServiceAreaEnum serviceArea) {
        this.serviceArea = serviceArea;
        return this;
    }

    public ServiceAreaEnum getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(ServiceAreaEnum serviceArea) {
        this.serviceArea = serviceArea;
    }

    public DomainsWithPort withRangeStatus(String rangeStatus) {
        this.rangeStatus = rangeStatus;
        return this;
    }

    public String getRangeStatus() {
        return rangeStatus;
    }

    public void setRangeStatus(String rangeStatus) {
        this.rangeStatus = rangeStatus;
    }

    public DomainsWithPort withFollowStatus(String followStatus) {
        this.followStatus = followStatus;
        return this;
    }

    public String getFollowStatus() {
        return followStatus;
    }

    public void setFollowStatus(String followStatus) {
        this.followStatus = followStatus;
    }

    public DomainsWithPort withOriginStatus(String originStatus) {
        this.originStatus = originStatus;
        return this;
    }

    public String getOriginStatus() {
        return originStatus;
    }

    public void setOriginStatus(String originStatus) {
        this.originStatus = originStatus;
    }

    public DomainsWithPort withBannedReason(String bannedReason) {
        this.bannedReason = bannedReason;
        return this;
    }

    public String getBannedReason() {
        return bannedReason;
    }

    public void setBannedReason(String bannedReason) {
        this.bannedReason = bannedReason;
    }

    public DomainsWithPort withLockedReason(String lockedReason) {
        this.lockedReason = lockedReason;
        return this;
    }

    public String getLockedReason() {
        return lockedReason;
    }

    public void setLockedReason(String lockedReason) {
        this.lockedReason = lockedReason;
    }

    public DomainsWithPort withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DomainsWithPort that = (DomainsWithPort) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.businessType, that.businessType)
            && Objects.equals(this.userDomainId, that.userDomainId)
            && Objects.equals(this.domainStatus, that.domainStatus) && Objects.equals(this.cname, that.cname)
            && Objects.equals(this.sources, that.sources)
            && Objects.equals(this.domainOriginHost, that.domainOriginHost)
            && Objects.equals(this.httpsStatus, that.httpsStatus) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.modifyTime, that.modifyTime) && Objects.equals(this.disabled, that.disabled)
            && Objects.equals(this.locked, that.locked)
            && Objects.equals(this.autoRefreshPreheat, that.autoRefreshPreheat)
            && Objects.equals(this.serviceArea, that.serviceArea) && Objects.equals(this.rangeStatus, that.rangeStatus)
            && Objects.equals(this.followStatus, that.followStatus)
            && Objects.equals(this.originStatus, that.originStatus)
            && Objects.equals(this.bannedReason, that.bannedReason)
            && Objects.equals(this.lockedReason, that.lockedReason)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            domainName,
            businessType,
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
            autoRefreshPreheat,
            serviceArea,
            rangeStatus,
            followStatus,
            originStatus,
            bannedReason,
            lockedReason,
            enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DomainsWithPort {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
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
        sb.append("    autoRefreshPreheat: ").append(toIndentedString(autoRefreshPreheat)).append("\n");
        sb.append("    serviceArea: ").append(toIndentedString(serviceArea)).append("\n");
        sb.append("    rangeStatus: ").append(toIndentedString(rangeStatus)).append("\n");
        sb.append("    followStatus: ").append(toIndentedString(followStatus)).append("\n");
        sb.append("    originStatus: ").append(toIndentedString(originStatus)).append("\n");
        sb.append("    bannedReason: ").append(toIndentedString(bannedReason)).append("\n");
        sb.append("    lockedReason: ").append(toIndentedString(lockedReason)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
