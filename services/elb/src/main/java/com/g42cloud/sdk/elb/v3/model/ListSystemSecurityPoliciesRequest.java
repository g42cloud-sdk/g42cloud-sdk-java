package com.g42cloud.sdk.elb.v3.model;

import java.util.Objects;

/**
 * Request Object
 */
public class ListSystemSecurityPoliciesRequest {

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
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
        sb.append("class ListSystemSecurityPoliciesRequest {\n");
        sb.append("}");
        return sb.toString();
    }

}