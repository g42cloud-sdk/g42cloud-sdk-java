package com.g42cloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ClusterExtendParam
 */
public class ClusterExtendParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterAZ")

    private String clusterAZ;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dssMasterVolumes")

    private String dssMasterVolumes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterpriseProjectId")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kubeProxyMode")

    private String kubeProxyMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterExternalIP")

    private String clusterExternalIP;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alpha.cce/fixPoolMask")

    private String alphaCceFixPoolMask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "decMasterFlavor")

    private String decMasterFlavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dockerUmaskMode")

    private String dockerUmaskMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kubernetes.io/cpuManagerPolicy")

    private String kubernetesIoCpuManagerPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orderID")

    private String orderID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "periodType")

    private String periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "periodNum")

    private Integer periodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAutoRenew")

    private String isAutoRenew;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAutoPay")

    private String isAutoPay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgradefrom")

    private String upgradefrom;

    public ClusterExtendParam withClusterAZ(String clusterAZ) {
        this.clusterAZ = clusterAZ;
        return this;
    }

    public String getClusterAZ() {
        return clusterAZ;
    }

    public void setClusterAZ(String clusterAZ) {
        this.clusterAZ = clusterAZ;
    }

    public ClusterExtendParam withDssMasterVolumes(String dssMasterVolumes) {
        this.dssMasterVolumes = dssMasterVolumes;
        return this;
    }

    public String getDssMasterVolumes() {
        return dssMasterVolumes;
    }

    public void setDssMasterVolumes(String dssMasterVolumes) {
        this.dssMasterVolumes = dssMasterVolumes;
    }

    public ClusterExtendParam withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ClusterExtendParam withKubeProxyMode(String kubeProxyMode) {
        this.kubeProxyMode = kubeProxyMode;
        return this;
    }

    public String getKubeProxyMode() {
        return kubeProxyMode;
    }

    public void setKubeProxyMode(String kubeProxyMode) {
        this.kubeProxyMode = kubeProxyMode;
    }

    public ClusterExtendParam withClusterExternalIP(String clusterExternalIP) {
        this.clusterExternalIP = clusterExternalIP;
        return this;
    }

    public String getClusterExternalIP() {
        return clusterExternalIP;
    }

    public void setClusterExternalIP(String clusterExternalIP) {
        this.clusterExternalIP = clusterExternalIP;
    }

    public ClusterExtendParam withAlphaCceFixPoolMask(String alphaCceFixPoolMask) {
        this.alphaCceFixPoolMask = alphaCceFixPoolMask;
        return this;
    }

    public String getAlphaCceFixPoolMask() {
        return alphaCceFixPoolMask;
    }

    public void setAlphaCceFixPoolMask(String alphaCceFixPoolMask) {
        this.alphaCceFixPoolMask = alphaCceFixPoolMask;
    }

    public ClusterExtendParam withDecMasterFlavor(String decMasterFlavor) {
        this.decMasterFlavor = decMasterFlavor;
        return this;
    }

    public String getDecMasterFlavor() {
        return decMasterFlavor;
    }

    public void setDecMasterFlavor(String decMasterFlavor) {
        this.decMasterFlavor = decMasterFlavor;
    }

    public ClusterExtendParam withDockerUmaskMode(String dockerUmaskMode) {
        this.dockerUmaskMode = dockerUmaskMode;
        return this;
    }

    public String getDockerUmaskMode() {
        return dockerUmaskMode;
    }

    public void setDockerUmaskMode(String dockerUmaskMode) {
        this.dockerUmaskMode = dockerUmaskMode;
    }

    public ClusterExtendParam withKubernetesIoCpuManagerPolicy(String kubernetesIoCpuManagerPolicy) {
        this.kubernetesIoCpuManagerPolicy = kubernetesIoCpuManagerPolicy;
        return this;
    }

    public String getKubernetesIoCpuManagerPolicy() {
        return kubernetesIoCpuManagerPolicy;
    }

    public void setKubernetesIoCpuManagerPolicy(String kubernetesIoCpuManagerPolicy) {
        this.kubernetesIoCpuManagerPolicy = kubernetesIoCpuManagerPolicy;
    }

    public ClusterExtendParam withOrderID(String orderID) {
        this.orderID = orderID;
        return this;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public ClusterExtendParam withPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }

    public String getPeriodType() {
        return periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    public ClusterExtendParam withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public ClusterExtendParam withIsAutoRenew(String isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    public String getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(String isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    public ClusterExtendParam withIsAutoPay(String isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    public String getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(String isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    public ClusterExtendParam withUpgradefrom(String upgradefrom) {
        this.upgradefrom = upgradefrom;
        return this;
    }

    public String getUpgradefrom() {
        return upgradefrom;
    }

    public void setUpgradefrom(String upgradefrom) {
        this.upgradefrom = upgradefrom;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterExtendParam that = (ClusterExtendParam) obj;
        return Objects.equals(this.clusterAZ, that.clusterAZ)
            && Objects.equals(this.dssMasterVolumes, that.dssMasterVolumes)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.kubeProxyMode, that.kubeProxyMode)
            && Objects.equals(this.clusterExternalIP, that.clusterExternalIP)
            && Objects.equals(this.alphaCceFixPoolMask, that.alphaCceFixPoolMask)
            && Objects.equals(this.decMasterFlavor, that.decMasterFlavor)
            && Objects.equals(this.dockerUmaskMode, that.dockerUmaskMode)
            && Objects.equals(this.kubernetesIoCpuManagerPolicy, that.kubernetesIoCpuManagerPolicy)
            && Objects.equals(this.orderID, that.orderID) && Objects.equals(this.periodType, that.periodType)
            && Objects.equals(this.periodNum, that.periodNum) && Objects.equals(this.isAutoRenew, that.isAutoRenew)
            && Objects.equals(this.isAutoPay, that.isAutoPay) && Objects.equals(this.upgradefrom, that.upgradefrom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterAZ,
            dssMasterVolumes,
            enterpriseProjectId,
            kubeProxyMode,
            clusterExternalIP,
            alphaCceFixPoolMask,
            decMasterFlavor,
            dockerUmaskMode,
            kubernetesIoCpuManagerPolicy,
            orderID,
            periodType,
            periodNum,
            isAutoRenew,
            isAutoPay,
            upgradefrom);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterExtendParam {\n");
        sb.append("    clusterAZ: ").append(toIndentedString(clusterAZ)).append("\n");
        sb.append("    dssMasterVolumes: ").append(toIndentedString(dssMasterVolumes)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    kubeProxyMode: ").append(toIndentedString(kubeProxyMode)).append("\n");
        sb.append("    clusterExternalIP: ").append(toIndentedString(clusterExternalIP)).append("\n");
        sb.append("    alphaCceFixPoolMask: ").append(toIndentedString(alphaCceFixPoolMask)).append("\n");
        sb.append("    decMasterFlavor: ").append(toIndentedString(decMasterFlavor)).append("\n");
        sb.append("    dockerUmaskMode: ").append(toIndentedString(dockerUmaskMode)).append("\n");
        sb.append("    kubernetesIoCpuManagerPolicy: ")
            .append(toIndentedString(kubernetesIoCpuManagerPolicy))
            .append("\n");
        sb.append("    orderID: ").append(toIndentedString(orderID)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    isAutoRenew: ").append(toIndentedString(isAutoRenew)).append("\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
        sb.append("    upgradefrom: ").append(toIndentedString(upgradefrom)).append("\n");
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
