package com.g42cloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * flavors数据结构说明
 */
public class FlavorsResp {

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

    private List<LinksInfo> links = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_extra_specs")

    private OsExtraSpecs osExtraSpecs;

    public FlavorsResp withId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FlavorsResp withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FlavorsResp withVcpus(String vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    public String getVcpus() {
        return vcpus;
    }

    public void setVcpus(String vcpus) {
        this.vcpus = vcpus;
    }

    public FlavorsResp withRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public FlavorsResp withDisk(String disk) {
        this.disk = disk;
        return this;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public FlavorsResp withSwap(String swap) {
        this.swap = swap;
        return this;
    }

    public String getSwap() {
        return swap;
    }

    public void setSwap(String swap) {
        this.swap = swap;
    }

    public FlavorsResp withOsFLVEXTDATAEphemeral(Integer osFLVEXTDATAEphemeral) {
        this.osFLVEXTDATAEphemeral = osFLVEXTDATAEphemeral;
        return this;
    }

    public Integer getOsFLVEXTDATAEphemeral() {
        return osFLVEXTDATAEphemeral;
    }

    public void setOsFLVEXTDATAEphemeral(Integer osFLVEXTDATAEphemeral) {
        this.osFLVEXTDATAEphemeral = osFLVEXTDATAEphemeral;
    }

    public FlavorsResp withOsFLVDISABLEDDisabled(Boolean osFLVDISABLEDDisabled) {
        this.osFLVDISABLEDDisabled = osFLVDISABLEDDisabled;
        return this;
    }

    public Boolean getOsFLVDISABLEDDisabled() {
        return osFLVDISABLEDDisabled;
    }

    public void setOsFLVDISABLEDDisabled(Boolean osFLVDISABLEDDisabled) {
        this.osFLVDISABLEDDisabled = osFLVDISABLEDDisabled;
    }

    public FlavorsResp withRxtxFactor(Float rxtxFactor) {
        this.rxtxFactor = rxtxFactor;
        return this;
    }

    public Float getRxtxFactor() {
        return rxtxFactor;
    }

    public void setRxtxFactor(Float rxtxFactor) {
        this.rxtxFactor = rxtxFactor;
    }

    public FlavorsResp withRxtxQuota(String rxtxQuota) {
        this.rxtxQuota = rxtxQuota;
        return this;
    }

    public String getRxtxQuota() {
        return rxtxQuota;
    }

    public void setRxtxQuota(String rxtxQuota) {
        this.rxtxQuota = rxtxQuota;
    }

    public FlavorsResp withRxtxCap(String rxtxCap) {
        this.rxtxCap = rxtxCap;
        return this;
    }

    public String getRxtxCap() {
        return rxtxCap;
    }

    public void setRxtxCap(String rxtxCap) {
        this.rxtxCap = rxtxCap;
    }

    public FlavorsResp withOsFlavorAccessIsPublic(Boolean osFlavorAccessIsPublic) {
        this.osFlavorAccessIsPublic = osFlavorAccessIsPublic;
        return this;
    }

    public Boolean getOsFlavorAccessIsPublic() {
        return osFlavorAccessIsPublic;
    }

    public void setOsFlavorAccessIsPublic(Boolean osFlavorAccessIsPublic) {
        this.osFlavorAccessIsPublic = osFlavorAccessIsPublic;
    }

    public FlavorsResp withLinks(List<LinksInfo> links) {
        this.links = links;
        return this;
    }

    public FlavorsResp addLinksItem(LinksInfo linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    public FlavorsResp withLinks(Consumer<List<LinksInfo>> linksSetter) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    public List<LinksInfo> getLinks() {
        return links;
    }

    public void setLinks(List<LinksInfo> links) {
        this.links = links;
    }

    public FlavorsResp withOsExtraSpecs(OsExtraSpecs osExtraSpecs) {
        this.osExtraSpecs = osExtraSpecs;
        return this;
    }

    public FlavorsResp withOsExtraSpecs(Consumer<OsExtraSpecs> osExtraSpecsSetter) {
        if (this.osExtraSpecs == null) {
            this.osExtraSpecs = new OsExtraSpecs();
            osExtraSpecsSetter.accept(this.osExtraSpecs);
        }

        return this;
    }

    public OsExtraSpecs getOsExtraSpecs() {
        return osExtraSpecs;
    }

    public void setOsExtraSpecs(OsExtraSpecs osExtraSpecs) {
        this.osExtraSpecs = osExtraSpecs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlavorsResp that = (FlavorsResp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.vcpus, that.vcpus) && Objects.equals(this.ram, that.ram)
            && Objects.equals(this.disk, that.disk) && Objects.equals(this.swap, that.swap)
            && Objects.equals(this.osFLVEXTDATAEphemeral, that.osFLVEXTDATAEphemeral)
            && Objects.equals(this.osFLVDISABLEDDisabled, that.osFLVDISABLEDDisabled)
            && Objects.equals(this.rxtxFactor, that.rxtxFactor) && Objects.equals(this.rxtxQuota, that.rxtxQuota)
            && Objects.equals(this.rxtxCap, that.rxtxCap)
            && Objects.equals(this.osFlavorAccessIsPublic, that.osFlavorAccessIsPublic)
            && Objects.equals(this.links, that.links) && Objects.equals(this.osExtraSpecs, that.osExtraSpecs);
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
            osExtraSpecs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlavorsResp {\n");
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
