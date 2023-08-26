package com.g42cloud.sdk.ims.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 操作系统详情
 */
public class OsVersionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform")

    private String platform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_version_key")

    private String osVersionKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_version")

    private String osVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_bit")

    private Integer osBit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    public OsVersionInfo withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public OsVersionInfo withOsVersionKey(String osVersionKey) {
        this.osVersionKey = osVersionKey;
        return this;
    }

    public String getOsVersionKey() {
        return osVersionKey;
    }

    public void setOsVersionKey(String osVersionKey) {
        this.osVersionKey = osVersionKey;
    }

    public OsVersionInfo withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public OsVersionInfo withOsBit(Integer osBit) {
        this.osBit = osBit;
        return this;
    }

    public Integer getOsBit() {
        return osBit;
    }

    public void setOsBit(Integer osBit) {
        this.osBit = osBit;
    }

    public OsVersionInfo withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OsVersionInfo that = (OsVersionInfo) obj;
        return Objects.equals(this.platform, that.platform) && Objects.equals(this.osVersionKey, that.osVersionKey)
            && Objects.equals(this.osVersion, that.osVersion) && Objects.equals(this.osBit, that.osBit)
            && Objects.equals(this.osType, that.osType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(platform, osVersionKey, osVersion, osBit, osType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OsVersionInfo {\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    osVersionKey: ").append(toIndentedString(osVersionKey)).append("\n");
        sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
        sb.append("    osBit: ").append(toIndentedString(osBit)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
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
