package com.g42cloud.sdk.vpc.v2.model;

import java.util.Objects;

/**
 * Request Object
 */
public class ListVpcTagsRequest {

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
        sb.append("class ListVpcTagsRequest {\n");
        sb.append("}");
        return sb.toString();
    }

}
