package com.g42cloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListMembersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_reverse")

    private Boolean pageReverse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private List<String> name = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private List<Integer> weight = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_cidr_id")

    private List<String> subnetCidrId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private List<String> address = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_port")

    private List<Integer> protocolPort = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private List<String> id = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operating_status")

    private List<String> operatingStatus = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private List<String> enterpriseProjectId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_version")

    private List<String> ipVersion = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_type")

    private List<String> memberType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private List<String> instanceId = null;

    public ListMembersRequest withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public ListMembersRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListMembersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListMembersRequest withPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
        return this;
    }

    public Boolean getPageReverse() {
        return pageReverse;
    }

    public void setPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
    }

    public ListMembersRequest withName(List<String> name) {
        this.name = name;
        return this;
    }

    public ListMembersRequest addNameItem(String nameItem) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public ListMembersRequest withName(Consumer<List<String>> nameSetter) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public ListMembersRequest withWeight(List<Integer> weight) {
        this.weight = weight;
        return this;
    }

    public ListMembersRequest addWeightItem(Integer weightItem) {
        if (this.weight == null) {
            this.weight = new ArrayList<>();
        }
        this.weight.add(weightItem);
        return this;
    }

    public ListMembersRequest withWeight(Consumer<List<Integer>> weightSetter) {
        if (this.weight == null) {
            this.weight = new ArrayList<>();
        }
        weightSetter.accept(this.weight);
        return this;
    }

    public List<Integer> getWeight() {
        return weight;
    }

    public void setWeight(List<Integer> weight) {
        this.weight = weight;
    }

    public ListMembersRequest withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public ListMembersRequest withSubnetCidrId(List<String> subnetCidrId) {
        this.subnetCidrId = subnetCidrId;
        return this;
    }

    public ListMembersRequest addSubnetCidrIdItem(String subnetCidrIdItem) {
        if (this.subnetCidrId == null) {
            this.subnetCidrId = new ArrayList<>();
        }
        this.subnetCidrId.add(subnetCidrIdItem);
        return this;
    }

    public ListMembersRequest withSubnetCidrId(Consumer<List<String>> subnetCidrIdSetter) {
        if (this.subnetCidrId == null) {
            this.subnetCidrId = new ArrayList<>();
        }
        subnetCidrIdSetter.accept(this.subnetCidrId);
        return this;
    }

    public List<String> getSubnetCidrId() {
        return subnetCidrId;
    }

    public void setSubnetCidrId(List<String> subnetCidrId) {
        this.subnetCidrId = subnetCidrId;
    }

    public ListMembersRequest withAddress(List<String> address) {
        this.address = address;
        return this;
    }

    public ListMembersRequest addAddressItem(String addressItem) {
        if (this.address == null) {
            this.address = new ArrayList<>();
        }
        this.address.add(addressItem);
        return this;
    }

    public ListMembersRequest withAddress(Consumer<List<String>> addressSetter) {
        if (this.address == null) {
            this.address = new ArrayList<>();
        }
        addressSetter.accept(this.address);
        return this;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public ListMembersRequest withProtocolPort(List<Integer> protocolPort) {
        this.protocolPort = protocolPort;
        return this;
    }

    public ListMembersRequest addProtocolPortItem(Integer protocolPortItem) {
        if (this.protocolPort == null) {
            this.protocolPort = new ArrayList<>();
        }
        this.protocolPort.add(protocolPortItem);
        return this;
    }

    public ListMembersRequest withProtocolPort(Consumer<List<Integer>> protocolPortSetter) {
        if (this.protocolPort == null) {
            this.protocolPort = new ArrayList<>();
        }
        protocolPortSetter.accept(this.protocolPort);
        return this;
    }

    public List<Integer> getProtocolPort() {
        return protocolPort;
    }

    public void setProtocolPort(List<Integer> protocolPort) {
        this.protocolPort = protocolPort;
    }

    public ListMembersRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListMembersRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListMembersRequest withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListMembersRequest withOperatingStatus(List<String> operatingStatus) {
        this.operatingStatus = operatingStatus;
        return this;
    }

    public ListMembersRequest addOperatingStatusItem(String operatingStatusItem) {
        if (this.operatingStatus == null) {
            this.operatingStatus = new ArrayList<>();
        }
        this.operatingStatus.add(operatingStatusItem);
        return this;
    }

    public ListMembersRequest withOperatingStatus(Consumer<List<String>> operatingStatusSetter) {
        if (this.operatingStatus == null) {
            this.operatingStatus = new ArrayList<>();
        }
        operatingStatusSetter.accept(this.operatingStatus);
        return this;
    }

    public List<String> getOperatingStatus() {
        return operatingStatus;
    }

    public void setOperatingStatus(List<String> operatingStatus) {
        this.operatingStatus = operatingStatus;
    }

    public ListMembersRequest withEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public ListMembersRequest addEnterpriseProjectIdItem(String enterpriseProjectIdItem) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        this.enterpriseProjectId.add(enterpriseProjectIdItem);
        return this;
    }

    public ListMembersRequest withEnterpriseProjectId(Consumer<List<String>> enterpriseProjectIdSetter) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        enterpriseProjectIdSetter.accept(this.enterpriseProjectId);
        return this;
    }

    public List<String> getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListMembersRequest withIpVersion(List<String> ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    public ListMembersRequest addIpVersionItem(String ipVersionItem) {
        if (this.ipVersion == null) {
            this.ipVersion = new ArrayList<>();
        }
        this.ipVersion.add(ipVersionItem);
        return this;
    }

    public ListMembersRequest withIpVersion(Consumer<List<String>> ipVersionSetter) {
        if (this.ipVersion == null) {
            this.ipVersion = new ArrayList<>();
        }
        ipVersionSetter.accept(this.ipVersion);
        return this;
    }

    public List<String> getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(List<String> ipVersion) {
        this.ipVersion = ipVersion;
    }

    public ListMembersRequest withMemberType(List<String> memberType) {
        this.memberType = memberType;
        return this;
    }

    public ListMembersRequest addMemberTypeItem(String memberTypeItem) {
        if (this.memberType == null) {
            this.memberType = new ArrayList<>();
        }
        this.memberType.add(memberTypeItem);
        return this;
    }

    public ListMembersRequest withMemberType(Consumer<List<String>> memberTypeSetter) {
        if (this.memberType == null) {
            this.memberType = new ArrayList<>();
        }
        memberTypeSetter.accept(this.memberType);
        return this;
    }

    public List<String> getMemberType() {
        return memberType;
    }

    public void setMemberType(List<String> memberType) {
        this.memberType = memberType;
    }

    public ListMembersRequest withInstanceId(List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public ListMembersRequest addInstanceIdItem(String instanceIdItem) {
        if (this.instanceId == null) {
            this.instanceId = new ArrayList<>();
        }
        this.instanceId.add(instanceIdItem);
        return this;
    }

    public ListMembersRequest withInstanceId(Consumer<List<String>> instanceIdSetter) {
        if (this.instanceId == null) {
            this.instanceId = new ArrayList<>();
        }
        instanceIdSetter.accept(this.instanceId);
        return this;
    }

    public List<String> getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(List<String> instanceId) {
        this.instanceId = instanceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListMembersRequest that = (ListMembersRequest) obj;
        return Objects.equals(this.poolId, that.poolId) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.pageReverse, that.pageReverse)
            && Objects.equals(this.name, that.name) && Objects.equals(this.weight, that.weight)
            && Objects.equals(this.adminStateUp, that.adminStateUp)
            && Objects.equals(this.subnetCidrId, that.subnetCidrId) && Objects.equals(this.address, that.address)
            && Objects.equals(this.protocolPort, that.protocolPort) && Objects.equals(this.id, that.id)
            && Objects.equals(this.operatingStatus, that.operatingStatus)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.ipVersion, that.ipVersion) && Objects.equals(this.memberType, that.memberType)
            && Objects.equals(this.instanceId, that.instanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poolId,
            marker,
            limit,
            pageReverse,
            name,
            weight,
            adminStateUp,
            subnetCidrId,
            address,
            protocolPort,
            id,
            operatingStatus,
            enterpriseProjectId,
            ipVersion,
            memberType,
            instanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMembersRequest {\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    subnetCidrId: ").append(toIndentedString(subnetCidrId)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    protocolPort: ").append(toIndentedString(protocolPort)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    operatingStatus: ").append(toIndentedString(operatingStatus)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    memberType: ").append(toIndentedString(memberType)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
