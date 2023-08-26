package com.g42cloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 磁盘初始化配置管理参数。  该参数配置逻辑较为复杂，详细说明请参见[节点磁盘挂载](node_storage_example.xml)。  该参数缺省时，按照extendParam中的DockerLVMConfigOverride参数进行磁盘管理。此参数对1.15.11及以上集群版本支持。 
 */
public class Storage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storageSelectors")

    private List<StorageSelectors> storageSelectors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storageGroups")

    private List<StorageGroups> storageGroups = null;

    public Storage withStorageSelectors(List<StorageSelectors> storageSelectors) {
        this.storageSelectors = storageSelectors;
        return this;
    }

    public Storage addStorageSelectorsItem(StorageSelectors storageSelectorsItem) {
        if (this.storageSelectors == null) {
            this.storageSelectors = new ArrayList<>();
        }
        this.storageSelectors.add(storageSelectorsItem);
        return this;
    }

    public Storage withStorageSelectors(Consumer<List<StorageSelectors>> storageSelectorsSetter) {
        if (this.storageSelectors == null) {
            this.storageSelectors = new ArrayList<>();
        }
        storageSelectorsSetter.accept(this.storageSelectors);
        return this;
    }

    public List<StorageSelectors> getStorageSelectors() {
        return storageSelectors;
    }

    public void setStorageSelectors(List<StorageSelectors> storageSelectors) {
        this.storageSelectors = storageSelectors;
    }

    public Storage withStorageGroups(List<StorageGroups> storageGroups) {
        this.storageGroups = storageGroups;
        return this;
    }

    public Storage addStorageGroupsItem(StorageGroups storageGroupsItem) {
        if (this.storageGroups == null) {
            this.storageGroups = new ArrayList<>();
        }
        this.storageGroups.add(storageGroupsItem);
        return this;
    }

    public Storage withStorageGroups(Consumer<List<StorageGroups>> storageGroupsSetter) {
        if (this.storageGroups == null) {
            this.storageGroups = new ArrayList<>();
        }
        storageGroupsSetter.accept(this.storageGroups);
        return this;
    }

    public List<StorageGroups> getStorageGroups() {
        return storageGroups;
    }

    public void setStorageGroups(List<StorageGroups> storageGroups) {
        this.storageGroups = storageGroups;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Storage that = (Storage) obj;
        return Objects.equals(this.storageSelectors, that.storageSelectors)
            && Objects.equals(this.storageGroups, that.storageGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storageSelectors, storageGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Storage {\n");
        sb.append("    storageSelectors: ").append(toIndentedString(storageSelectors)).append("\n");
        sb.append("    storageGroups: ").append(toIndentedString(storageGroups)).append("\n");
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
