package com.g42cloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DownloadKieRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Enterprise-Project-ID")

    private String xEnterpriseProjectID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-engine-id")

    private String xEngineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    public static final class MatchEnum {

        /**
         * Enum EXACT for value: "exact"
         */
        public static final MatchEnum EXACT = new MatchEnum("exact");

        private static final Map<String, MatchEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MatchEnum> createStaticFields() {
            Map<String, MatchEnum> map = new HashMap<>();
            map.put("exact", EXACT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MatchEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static MatchEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            MatchEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new MatchEnum(value);
            }
            return result;
        }

        public static MatchEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            MatchEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MatchEnum) {
                return this.value.equals(((MatchEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match")

    private MatchEnum match;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DownloadKieReqBody body;

    public DownloadKieRequest withXEnterpriseProjectID(String xEnterpriseProjectID) {
        this.xEnterpriseProjectID = xEnterpriseProjectID;
        return this;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Enterprise-Project-ID")
    public String getXEnterpriseProjectID() {
        return xEnterpriseProjectID;
    }

    public void setXEnterpriseProjectID(String xEnterpriseProjectID) {
        this.xEnterpriseProjectID = xEnterpriseProjectID;
    }

    public DownloadKieRequest withXEngineId(String xEngineId) {
        this.xEngineId = xEngineId;
        return this;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-engine-id")
    public String getXEngineId() {
        return xEngineId;
    }

    public void setXEngineId(String xEngineId) {
        this.xEngineId = xEngineId;
    }

    public DownloadKieRequest withLabel(String label) {
        this.label = label;
        return this;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public DownloadKieRequest withMatch(MatchEnum match) {
        this.match = match;
        return this;
    }

    public MatchEnum getMatch() {
        return match;
    }

    public void setMatch(MatchEnum match) {
        this.match = match;
    }

    public DownloadKieRequest withBody(DownloadKieReqBody body) {
        this.body = body;
        return this;
    }

    public DownloadKieRequest withBody(Consumer<DownloadKieReqBody> bodySetter) {
        if (this.body == null) {
            this.body = new DownloadKieReqBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public DownloadKieReqBody getBody() {
        return body;
    }

    public void setBody(DownloadKieReqBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DownloadKieRequest downloadKieRequest = (DownloadKieRequest) o;
        return Objects.equals(this.xEnterpriseProjectID, downloadKieRequest.xEnterpriseProjectID)
            && Objects.equals(this.xEngineId, downloadKieRequest.xEngineId)
            && Objects.equals(this.label, downloadKieRequest.label)
            && Objects.equals(this.match, downloadKieRequest.match)
            && Objects.equals(this.body, downloadKieRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xEnterpriseProjectID, xEngineId, label, match, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadKieRequest {\n");
        sb.append("    xEnterpriseProjectID: ").append(toIndentedString(xEnterpriseProjectID)).append("\n");
        sb.append("    xEngineId: ").append(toIndentedString(xEngineId)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    match: ").append(toIndentedString(match)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
