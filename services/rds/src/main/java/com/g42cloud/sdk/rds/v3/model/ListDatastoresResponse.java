package com.g42cloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListDatastoresResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataStores")

    private List<LDatastore> dataStores = null;

    public ListDatastoresResponse withDataStores(List<LDatastore> dataStores) {
        this.dataStores = dataStores;
        return this;
    }

    public ListDatastoresResponse addDataStoresItem(LDatastore dataStoresItem) {
        if (this.dataStores == null) {
            this.dataStores = new ArrayList<>();
        }
        this.dataStores.add(dataStoresItem);
        return this;
    }

    public ListDatastoresResponse withDataStores(Consumer<List<LDatastore>> dataStoresSetter) {
        if (this.dataStores == null) {
            this.dataStores = new ArrayList<>();
        }
        dataStoresSetter.accept(this.dataStores);
        return this;
    }

    public List<LDatastore> getDataStores() {
        return dataStores;
    }

    public void setDataStores(List<LDatastore> dataStores) {
        this.dataStores = dataStores;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDatastoresResponse listDatastoresResponse = (ListDatastoresResponse) o;
        return Objects.equals(this.dataStores, listDatastoresResponse.dataStores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataStores);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDatastoresResponse {\n");
        sb.append("    dataStores: ").append(toIndentedString(dataStores)).append("\n");
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
