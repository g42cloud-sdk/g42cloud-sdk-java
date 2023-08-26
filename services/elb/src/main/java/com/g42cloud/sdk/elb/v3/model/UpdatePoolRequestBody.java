package com.g42cloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class UpdatePoolRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool")

    private UpdatePoolOption pool;

    public UpdatePoolRequestBody withPool(UpdatePoolOption pool) {
        this.pool = pool;
        return this;
    }

    public UpdatePoolRequestBody withPool(Consumer<UpdatePoolOption> poolSetter) {
        if (this.pool == null) {
            this.pool = new UpdatePoolOption();
            poolSetter.accept(this.pool);
        }

        return this;
    }

    public UpdatePoolOption getPool() {
        return pool;
    }

    public void setPool(UpdatePoolOption pool) {
        this.pool = pool;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePoolRequestBody that = (UpdatePoolRequestBody) obj;
        return Objects.equals(this.pool, that.pool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pool);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePoolRequestBody {\n");
        sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
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
