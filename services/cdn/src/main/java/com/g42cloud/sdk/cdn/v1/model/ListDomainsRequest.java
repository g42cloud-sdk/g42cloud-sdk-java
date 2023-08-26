package com.g42cloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListDomainsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    public static final class BusinessTypeEnum {

        /**
         * Enum WEB for value: "web"
         */
        public static final BusinessTypeEnum WEB = new BusinessTypeEnum("web");

        /**
         * Enum DOWNLOAD for value: "download"
         */
        public static final BusinessTypeEnum DOWNLOAD = new BusinessTypeEnum("download");

        /**
         * Enum VIDEO for value: "video"
         */
        public static final BusinessTypeEnum VIDEO = new BusinessTypeEnum("video");

        /**
         * Enum WHOLESITE for value: "wholeSite"
         */
        public static final BusinessTypeEnum WHOLESITE = new BusinessTypeEnum("wholeSite");

        private static final Map<String, BusinessTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BusinessTypeEnum> createStaticFields() {
            Map<String, BusinessTypeEnum> map = new HashMap<>();
            map.put("web", WEB);
            map.put("download", DOWNLOAD);
            map.put("video", VIDEO);
            map.put("wholeSite", WHOLESITE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BusinessTypeEnum(String value) {
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
        public static BusinessTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BusinessTypeEnum(value));
        }

        public static BusinessTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BusinessTypeEnum) {
                return this.value.equals(((BusinessTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_type")

    private BusinessTypeEnum businessType;

    public static final class DomainStatusEnum {

        /**
         * Enum ONLINE for value: "online"
         */
        public static final DomainStatusEnum ONLINE = new DomainStatusEnum("online");

        /**
         * Enum OFFLINE for value: "offline"
         */
        public static final DomainStatusEnum OFFLINE = new DomainStatusEnum("offline");

        /**
         * Enum CONFIGURING for value: "configuring"
         */
        public static final DomainStatusEnum CONFIGURING = new DomainStatusEnum("configuring");

        /**
         * Enum CONFIGURE_FAILED for value: "configure_failed"
         */
        public static final DomainStatusEnum CONFIGURE_FAILED = new DomainStatusEnum("configure_failed");

        /**
         * Enum CHECKING for value: "checking"
         */
        public static final DomainStatusEnum CHECKING = new DomainStatusEnum("checking");

        /**
         * Enum CHECK_FAILED for value: "check_failed"
         */
        public static final DomainStatusEnum CHECK_FAILED = new DomainStatusEnum("check_failed");

        /**
         * Enum DELETING for value: "deleting"
         */
        public static final DomainStatusEnum DELETING = new DomainStatusEnum("deleting");

        private static final Map<String, DomainStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DomainStatusEnum> createStaticFields() {
            Map<String, DomainStatusEnum> map = new HashMap<>();
            map.put("online", ONLINE);
            map.put("offline", OFFLINE);
            map.put("configuring", CONFIGURING);
            map.put("configure_failed", CONFIGURE_FAILED);
            map.put("checking", CHECKING);
            map.put("check_failed", CHECK_FAILED);
            map.put("deleting", DELETING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DomainStatusEnum(String value) {
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
        public static DomainStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DomainStatusEnum(value));
        }

        public static DomainStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DomainStatusEnum) {
                return this.value.equals(((DomainStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_status")

    private DomainStatusEnum domainStatus;

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
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_number")

    private Integer pageNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public ListDomainsRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public ListDomainsRequest withBusinessType(BusinessTypeEnum businessType) {
        this.businessType = businessType;
        return this;
    }

    public BusinessTypeEnum getBusinessType() {
        return businessType;
    }

    public void setBusinessType(BusinessTypeEnum businessType) {
        this.businessType = businessType;
    }

    public ListDomainsRequest withDomainStatus(DomainStatusEnum domainStatus) {
        this.domainStatus = domainStatus;
        return this;
    }

    public DomainStatusEnum getDomainStatus() {
        return domainStatus;
    }

    public void setDomainStatus(DomainStatusEnum domainStatus) {
        this.domainStatus = domainStatus;
    }

    public ListDomainsRequest withServiceArea(ServiceAreaEnum serviceArea) {
        this.serviceArea = serviceArea;
        return this;
    }

    public ServiceAreaEnum getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(ServiceAreaEnum serviceArea) {
        this.serviceArea = serviceArea;
    }

    public ListDomainsRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ListDomainsRequest withPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public ListDomainsRequest withEnterpriseProjectId(String enterpriseProjectId) {
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
        ListDomainsRequest that = (ListDomainsRequest) obj;
        return Objects.equals(this.domainName, that.domainName) && Objects.equals(this.businessType, that.businessType)
            && Objects.equals(this.domainStatus, that.domainStatus)
            && Objects.equals(this.serviceArea, that.serviceArea) && Objects.equals(this.pageSize, that.pageSize)
            && Objects.equals(this.pageNumber, that.pageNumber)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(domainName, businessType, domainStatus, serviceArea, pageSize, pageNumber, enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDomainsRequest {\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
        sb.append("    domainStatus: ").append(toIndentedString(domainStatus)).append("\n");
        sb.append("    serviceArea: ").append(toIndentedString(serviceArea)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
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
