package com.g42cloud.sdk.ims.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询操作系统列表响应体
 */
public class ListOsVersionsResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform")

    private String platform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_list")

    private List<OsVersionInfo> versionList = null;

    public ListOsVersionsResponseBody withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public ListOsVersionsResponseBody withVersionList(List<OsVersionInfo> versionList) {
        this.versionList = versionList;
        return this;
    }

    public ListOsVersionsResponseBody addVersionListItem(OsVersionInfo versionListItem) {
        if (this.versionList == null) {
            this.versionList = new ArrayList<>();
        }
        this.versionList.add(versionListItem);
        return this;
    }

    public ListOsVersionsResponseBody withVersionList(Consumer<List<OsVersionInfo>> versionListSetter) {
        if (this.versionList == null) {
            this.versionList = new ArrayList<>();
        }
        versionListSetter.accept(this.versionList);
        return this;
    }

    public List<OsVersionInfo> getVersionList() {
        return versionList;
    }

    public void setVersionList(List<OsVersionInfo> versionList) {
        this.versionList = versionList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListOsVersionsResponseBody listOsVersionsResponseBody = (ListOsVersionsResponseBody) o;
        return Objects.equals(this.platform, listOsVersionsResponseBody.platform)
            && Objects.equals(this.versionList, listOsVersionsResponseBody.versionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(platform, versionList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOsVersionsResponseBody {\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    versionList: ").append(toIndentedString(versionList)).append("\n");
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
