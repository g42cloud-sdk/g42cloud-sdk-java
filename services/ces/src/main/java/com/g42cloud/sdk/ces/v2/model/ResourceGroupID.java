package com.g42cloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * 资源分组ID，监控范围为资源分组时必传
 */
public class ResourceGroupID {

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceGroupID {\n");
        sb.append("}");
        return sb.toString();
    }

}
