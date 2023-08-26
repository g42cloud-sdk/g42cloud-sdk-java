package com.g42cloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量删除参数
 */
public class DeleteIds {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ids")

    private List<String> ids = null;

    public DeleteIds withIds(List<String> ids) {
        this.ids = ids;
        return this;
    }

    public DeleteIds addIdsItem(String idsItem) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(idsItem);
        return this;
    }

    public DeleteIds withIds(Consumer<List<String>> idsSetter) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        idsSetter.accept(this.ids);
        return this;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteIds that = (DeleteIds) obj;
        return Objects.equals(this.ids, that.ids);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ids);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteIds {\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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
