package com.g42cloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * StorageSelectors
 */
public class StorageSelectors {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storageType")

    private String storageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "matchLabels")

    private StorageSelectorsMatchLabels matchLabels;

    public StorageSelectors withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StorageSelectors withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public StorageSelectors withMatchLabels(StorageSelectorsMatchLabels matchLabels) {
        this.matchLabels = matchLabels;
        return this;
    }

    public StorageSelectors withMatchLabels(Consumer<StorageSelectorsMatchLabels> matchLabelsSetter) {
        if (this.matchLabels == null) {
            this.matchLabels = new StorageSelectorsMatchLabels();
            matchLabelsSetter.accept(this.matchLabels);
        }

        return this;
    }

    public StorageSelectorsMatchLabels getMatchLabels() {
        return matchLabels;
    }

    public void setMatchLabels(StorageSelectorsMatchLabels matchLabels) {
        this.matchLabels = matchLabels;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StorageSelectors that = (StorageSelectors) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.storageType, that.storageType)
            && Objects.equals(this.matchLabels, that.matchLabels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, storageType, matchLabels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StorageSelectors {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
        sb.append("    matchLabels: ").append(toIndentedString(matchLabels)).append("\n");
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
