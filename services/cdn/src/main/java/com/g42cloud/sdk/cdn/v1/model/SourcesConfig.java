package com.g42cloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 源站配置。
 */
public class SourcesConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_addr")

    private String originAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_type")

    private String originType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_web_hosting_status")

    private String obsWebHostingStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_port")

    private Integer httpPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "https_port")

    private Integer httpsPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    public SourcesConfig withOriginAddr(String originAddr) {
        this.originAddr = originAddr;
        return this;
    }

    public String getOriginAddr() {
        return originAddr;
    }

    public void setOriginAddr(String originAddr) {
        this.originAddr = originAddr;
    }

    public SourcesConfig withOriginType(String originType) {
        this.originType = originType;
        return this;
    }

    public String getOriginType() {
        return originType;
    }

    public void setOriginType(String originType) {
        this.originType = originType;
    }

    public SourcesConfig withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public SourcesConfig withObsWebHostingStatus(String obsWebHostingStatus) {
        this.obsWebHostingStatus = obsWebHostingStatus;
        return this;
    }

    public String getObsWebHostingStatus() {
        return obsWebHostingStatus;
    }

    public void setObsWebHostingStatus(String obsWebHostingStatus) {
        this.obsWebHostingStatus = obsWebHostingStatus;
    }

    public SourcesConfig withHttpPort(Integer httpPort) {
        this.httpPort = httpPort;
        return this;
    }

    public Integer getHttpPort() {
        return httpPort;
    }

    public void setHttpPort(Integer httpPort) {
        this.httpPort = httpPort;
    }

    public SourcesConfig withHttpsPort(Integer httpsPort) {
        this.httpsPort = httpsPort;
        return this;
    }

    public Integer getHttpsPort() {
        return httpsPort;
    }

    public void setHttpsPort(Integer httpsPort) {
        this.httpsPort = httpsPort;
    }

    public SourcesConfig withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SourcesConfig that = (SourcesConfig) obj;
        return Objects.equals(this.originAddr, that.originAddr) && Objects.equals(this.originType, that.originType)
            && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.obsWebHostingStatus, that.obsWebHostingStatus)
            && Objects.equals(this.httpPort, that.httpPort) && Objects.equals(this.httpsPort, that.httpsPort)
            && Objects.equals(this.hostName, that.hostName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(originAddr, originType, priority, obsWebHostingStatus, httpPort, httpsPort, hostName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SourcesConfig {\n");
        sb.append("    originAddr: ").append(toIndentedString(originAddr)).append("\n");
        sb.append("    originType: ").append(toIndentedString(originType)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    obsWebHostingStatus: ").append(toIndentedString(obsWebHostingStatus)).append("\n");
        sb.append("    httpPort: ").append(toIndentedString(httpPort)).append("\n");
        sb.append("    httpsPort: ").append(toIndentedString(httpsPort)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
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
