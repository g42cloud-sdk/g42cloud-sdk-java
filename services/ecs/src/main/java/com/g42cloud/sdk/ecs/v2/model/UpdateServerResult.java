package com.g42cloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 云服务器详情。
 */
public class UpdateServerResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private String image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessIPv4")

    private String accessIPv4;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessIPv6")

    private String accessIPv6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Map<String, String> metadata = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addresses")

    private Map<String, List<UpdateServerAddress>> addresses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostId")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private SimpleFlavor flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-DCF:diskConfig")

    private String osDCFDiskConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private Integer progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private List<Link> links = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locked")

    private Boolean locked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-SRV-ATTR:hostname")

    private String osEXTSRVATTRHostname;

    public UpdateServerResult withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public UpdateServerResult withImage(String image) {
        this.image = image;
        return this;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public UpdateServerResult withAccessIPv4(String accessIPv4) {
        this.accessIPv4 = accessIPv4;
        return this;
    }

    public String getAccessIPv4() {
        return accessIPv4;
    }

    public void setAccessIPv4(String accessIPv4) {
        this.accessIPv4 = accessIPv4;
    }

    public UpdateServerResult withAccessIPv6(String accessIPv6) {
        this.accessIPv6 = accessIPv6;
        return this;
    }

    public String getAccessIPv6() {
        return accessIPv6;
    }

    public void setAccessIPv6(String accessIPv6) {
        this.accessIPv6 = accessIPv6;
    }

    public UpdateServerResult withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public UpdateServerResult putMetadataItem(String key, String metadataItem) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        this.metadata.put(key, metadataItem);
        return this;
    }

    public UpdateServerResult withMetadata(Consumer<Map<String, String>> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        metadataSetter.accept(this.metadata);
        return this;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public UpdateServerResult withAddresses(Map<String, List<UpdateServerAddress>> addresses) {
        this.addresses = addresses;
        return this;
    }

    public UpdateServerResult putAddressesItem(String key, List<UpdateServerAddress> addressesItem) {
        if (this.addresses == null) {
            this.addresses = new HashMap<>();
        }
        this.addresses.put(key, addressesItem);
        return this;
    }

    public UpdateServerResult withAddresses(Consumer<Map<String, List<UpdateServerAddress>>> addressesSetter) {
        if (this.addresses == null) {
            this.addresses = new HashMap<>();
        }
        addressesSetter.accept(this.addresses);
        return this;
    }

    public Map<String, List<UpdateServerAddress>> getAddresses() {
        return addresses;
    }

    public void setAddresses(Map<String, List<UpdateServerAddress>> addresses) {
        this.addresses = addresses;
    }

    public UpdateServerResult withCreated(String created) {
        this.created = created;
        return this;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public UpdateServerResult withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public UpdateServerResult withFlavor(SimpleFlavor flavor) {
        this.flavor = flavor;
        return this;
    }

    public UpdateServerResult withFlavor(Consumer<SimpleFlavor> flavorSetter) {
        if (this.flavor == null) {
            this.flavor = new SimpleFlavor();
            flavorSetter.accept(this.flavor);
        }

        return this;
    }

    public SimpleFlavor getFlavor() {
        return flavor;
    }

    public void setFlavor(SimpleFlavor flavor) {
        this.flavor = flavor;
    }

    public UpdateServerResult withOsDCFDiskConfig(String osDCFDiskConfig) {
        this.osDCFDiskConfig = osDCFDiskConfig;
        return this;
    }

    public String getOsDCFDiskConfig() {
        return osDCFDiskConfig;
    }

    public void setOsDCFDiskConfig(String osDCFDiskConfig) {
        this.osDCFDiskConfig = osDCFDiskConfig;
    }

    public UpdateServerResult withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UpdateServerResult withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateServerResult withProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public UpdateServerResult withLinks(List<Link> links) {
        this.links = links;
        return this;
    }

    public UpdateServerResult addLinksItem(Link linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    public UpdateServerResult withLinks(Consumer<List<Link>> linksSetter) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public UpdateServerResult withId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateServerResult withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public UpdateServerResult withLocked(Boolean locked) {
        this.locked = locked;
        return this;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public UpdateServerResult withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateServerResult withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public UpdateServerResult addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public UpdateServerResult withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public UpdateServerResult withStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UpdateServerResult withOsEXTSRVATTRHostname(String osEXTSRVATTRHostname) {
        this.osEXTSRVATTRHostname = osEXTSRVATTRHostname;
        return this;
    }

    public String getOsEXTSRVATTRHostname() {
        return osEXTSRVATTRHostname;
    }

    public void setOsEXTSRVATTRHostname(String osEXTSRVATTRHostname) {
        this.osEXTSRVATTRHostname = osEXTSRVATTRHostname;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateServerResult updateServerResult = (UpdateServerResult) o;
        return Objects.equals(this.tenantId, updateServerResult.tenantId)
            && Objects.equals(this.image, updateServerResult.image)
            && Objects.equals(this.accessIPv4, updateServerResult.accessIPv4)
            && Objects.equals(this.accessIPv6, updateServerResult.accessIPv6)
            && Objects.equals(this.metadata, updateServerResult.metadata)
            && Objects.equals(this.addresses, updateServerResult.addresses)
            && Objects.equals(this.created, updateServerResult.created)
            && Objects.equals(this.hostId, updateServerResult.hostId)
            && Objects.equals(this.flavor, updateServerResult.flavor)
            && Objects.equals(this.osDCFDiskConfig, updateServerResult.osDCFDiskConfig)
            && Objects.equals(this.userId, updateServerResult.userId)
            && Objects.equals(this.name, updateServerResult.name)
            && Objects.equals(this.progress, updateServerResult.progress)
            && Objects.equals(this.links, updateServerResult.links) && Objects.equals(this.id, updateServerResult.id)
            && Objects.equals(this.updated, updateServerResult.updated)
            && Objects.equals(this.locked, updateServerResult.locked)
            && Objects.equals(this.description, updateServerResult.description)
            && Objects.equals(this.tags, updateServerResult.tags)
            && Objects.equals(this.status, updateServerResult.status)
            && Objects.equals(this.osEXTSRVATTRHostname, updateServerResult.osEXTSRVATTRHostname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenantId,
            image,
            accessIPv4,
            accessIPv6,
            metadata,
            addresses,
            created,
            hostId,
            flavor,
            osDCFDiskConfig,
            userId,
            name,
            progress,
            links,
            id,
            updated,
            locked,
            description,
            tags,
            status,
            osEXTSRVATTRHostname);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateServerResult {\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    accessIPv4: ").append(toIndentedString(accessIPv4)).append("\n");
        sb.append("    accessIPv6: ").append(toIndentedString(accessIPv6)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    osDCFDiskConfig: ").append(toIndentedString(osDCFDiskConfig)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    osEXTSRVATTRHostname: ").append(toIndentedString(osEXTSRVATTRHostname)).append("\n");
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
