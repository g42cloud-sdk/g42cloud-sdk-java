package com.g42cloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 云服务器规格。
 */
public class Flavor {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vcpus")

    private String vcpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ram")

    private Integer ram;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk")

    private String disk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "swap")

    private String swap;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-FLV-EXT-DATA:ephemeral")

    private Integer osFLVEXTDATAEphemeral;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-FLV-DISABLED:disabled")

    private Boolean osFLVDISABLEDDisabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rxtx_factor")

    private Float rxtxFactor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rxtx_quota")

    private String rxtxQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rxtx_cap")

    private String rxtxCap;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os-flavor-access:is_public")

    private Boolean osFlavorAccessIsPublic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private List<FlavorLink> links = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_extra_specs")

    private FlavorExtraSpec osExtraSpecs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachableQuantity")

    private ServerAttachableQuantity attachableQuantity;

    public Flavor withId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Flavor withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flavor withVcpus(String vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    public String getVcpus() {
        return vcpus;
    }

    public void setVcpus(String vcpus) {
        this.vcpus = vcpus;
    }

    public Flavor withRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Flavor withDisk(String disk) {
        this.disk = disk;
        return this;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public Flavor withSwap(String swap) {
        this.swap = swap;
        return this;
    }

    public String getSwap() {
        return swap;
    }

    public void setSwap(String swap) {
        this.swap = swap;
    }

    public Flavor withOsFLVEXTDATAEphemeral(Integer osFLVEXTDATAEphemeral) {
        this.osFLVEXTDATAEphemeral = osFLVEXTDATAEphemeral;
        return this;
    }

    public Integer getOsFLVEXTDATAEphemeral() {
        return osFLVEXTDATAEphemeral;
    }

    public void setOsFLVEXTDATAEphemeral(Integer osFLVEXTDATAEphemeral) {
        this.osFLVEXTDATAEphemeral = osFLVEXTDATAEphemeral;
    }

    public Flavor withOsFLVDISABLEDDisabled(Boolean osFLVDISABLEDDisabled) {
        this.osFLVDISABLEDDisabled = osFLVDISABLEDDisabled;
        return this;
    }

    public Boolean getOsFLVDISABLEDDisabled() {
        return osFLVDISABLEDDisabled;
    }

    public void setOsFLVDISABLEDDisabled(Boolean osFLVDISABLEDDisabled) {
        this.osFLVDISABLEDDisabled = osFLVDISABLEDDisabled;
    }

    public Flavor withRxtxFactor(Float rxtxFactor) {
        this.rxtxFactor = rxtxFactor;
        return this;
    }

    public Float getRxtxFactor() {
        return rxtxFactor;
    }

    public void setRxtxFactor(Float rxtxFactor) {
        this.rxtxFactor = rxtxFactor;
    }

    public Flavor withRxtxQuota(String rxtxQuota) {
        this.rxtxQuota = rxtxQuota;
        return this;
    }

    public String getRxtxQuota() {
        return rxtxQuota;
    }

    public void setRxtxQuota(String rxtxQuota) {
        this.rxtxQuota = rxtxQuota;
    }

    public Flavor withRxtxCap(String rxtxCap) {
        this.rxtxCap = rxtxCap;
        return this;
    }

    public String getRxtxCap() {
        return rxtxCap;
    }

    public void setRxtxCap(String rxtxCap) {
        this.rxtxCap = rxtxCap;
    }

    public Flavor withOsFlavorAccessIsPublic(Boolean osFlavorAccessIsPublic) {
        this.osFlavorAccessIsPublic = osFlavorAccessIsPublic;
        return this;
    }

    public Boolean getOsFlavorAccessIsPublic() {
        return osFlavorAccessIsPublic;
    }

    public void setOsFlavorAccessIsPublic(Boolean osFlavorAccessIsPublic) {
        this.osFlavorAccessIsPublic = osFlavorAccessIsPublic;
    }

    public Flavor withLinks(List<FlavorLink> links) {
        this.links = links;
        return this;
    }

    public Flavor addLinksItem(FlavorLink linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    public Flavor withLinks(Consumer<List<FlavorLink>> linksSetter) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    public List<FlavorLink> getLinks() {
        return links;
    }

    public void setLinks(List<FlavorLink> links) {
        this.links = links;
    }

    public Flavor withOsExtraSpecs(FlavorExtraSpec osExtraSpecs) {
        this.osExtraSpecs = osExtraSpecs;
        return this;
    }

    public Flavor withOsExtraSpecs(Consumer<FlavorExtraSpec> osExtraSpecsSetter) {
        if (this.osExtraSpecs == null) {
            this.osExtraSpecs = new FlavorExtraSpec();
            osExtraSpecsSetter.accept(this.osExtraSpecs);
        }

        return this;
    }

    public FlavorExtraSpec getOsExtraSpecs() {
        return osExtraSpecs;
    }

    public void setOsExtraSpecs(FlavorExtraSpec osExtraSpecs) {
        this.osExtraSpecs = osExtraSpecs;
    }

    public Flavor withAttachableQuantity(ServerAttachableQuantity attachableQuantity) {
        this.attachableQuantity = attachableQuantity;
        return this;
    }

    public Flavor withAttachableQuantity(Consumer<ServerAttachableQuantity> attachableQuantitySetter) {
        if (this.attachableQuantity == null) {
            this.attachableQuantity = new ServerAttachableQuantity();
            attachableQuantitySetter.accept(this.attachableQuantity);
        }

        return this;
    }

    public ServerAttachableQuantity getAttachableQuantity() {
        return attachableQuantity;
    }

    public void setAttachableQuantity(ServerAttachableQuantity attachableQuantity) {
        this.attachableQuantity = attachableQuantity;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Flavor flavor = (Flavor) o;
        return Objects.equals(this.id, flavor.id) && Objects.equals(this.name, flavor.name)
            && Objects.equals(this.vcpus, flavor.vcpus) && Objects.equals(this.ram, flavor.ram)
            && Objects.equals(this.disk, flavor.disk) && Objects.equals(this.swap, flavor.swap)
            && Objects.equals(this.osFLVEXTDATAEphemeral, flavor.osFLVEXTDATAEphemeral)
            && Objects.equals(this.osFLVDISABLEDDisabled, flavor.osFLVDISABLEDDisabled)
            && Objects.equals(this.rxtxFactor, flavor.rxtxFactor) && Objects.equals(this.rxtxQuota, flavor.rxtxQuota)
            && Objects.equals(this.rxtxCap, flavor.rxtxCap)
            && Objects.equals(this.osFlavorAccessIsPublic, flavor.osFlavorAccessIsPublic)
            && Objects.equals(this.links, flavor.links) && Objects.equals(this.osExtraSpecs, flavor.osExtraSpecs)
            && Objects.equals(this.attachableQuantity, flavor.attachableQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            vcpus,
            ram,
            disk,
            swap,
            osFLVEXTDATAEphemeral,
            osFLVDISABLEDDisabled,
            rxtxFactor,
            rxtxQuota,
            rxtxCap,
            osFlavorAccessIsPublic,
            links,
            osExtraSpecs,
            attachableQuantity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Flavor {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
        sb.append("    disk: ").append(toIndentedString(disk)).append("\n");
        sb.append("    swap: ").append(toIndentedString(swap)).append("\n");
        sb.append("    osFLVEXTDATAEphemeral: ").append(toIndentedString(osFLVEXTDATAEphemeral)).append("\n");
        sb.append("    osFLVDISABLEDDisabled: ").append(toIndentedString(osFLVDISABLEDDisabled)).append("\n");
        sb.append("    rxtxFactor: ").append(toIndentedString(rxtxFactor)).append("\n");
        sb.append("    rxtxQuota: ").append(toIndentedString(rxtxQuota)).append("\n");
        sb.append("    rxtxCap: ").append(toIndentedString(rxtxCap)).append("\n");
        sb.append("    osFlavorAccessIsPublic: ").append(toIndentedString(osFlavorAccessIsPublic)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    osExtraSpecs: ").append(toIndentedString(osExtraSpecs)).append("\n");
        sb.append("    attachableQuantity: ").append(toIndentedString(attachableQuantity)).append("\n");
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
