package com.g42cloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowMigprojectResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isdefault")

    private Boolean isdefault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template")

    private TemplateResponseBody template;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_target_server")

    private Boolean startTargetServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speed_limit")

    private Integer speedLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_public_ip")

    private Boolean usePublicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exist_server")

    private Boolean existServer;

    public static final class TypeEnum {

        /**
         * Enum MIGRATE_BLOCK for value: "MIGRATE_BLOCK"
         */
        public static final TypeEnum MIGRATE_BLOCK = new TypeEnum("MIGRATE_BLOCK");

        /**
         * Enum MIGRATE_FILE for value: "MIGRATE_FILE"
         */
        public static final TypeEnum MIGRATE_FILE = new TypeEnum("MIGRATE_FILE");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("MIGRATE_BLOCK", MIGRATE_BLOCK);
            map.put("MIGRATE_FILE", MIGRATE_FILE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project")

    private String enterpriseProject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "syncing")

    private Boolean syncing;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_network_check")

    private Boolean startNetworkCheck;

    public ShowMigprojectResponse withId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowMigprojectResponse withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowMigprojectResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowMigprojectResponse withIsdefault(Boolean isdefault) {
        this.isdefault = isdefault;
        return this;
    }

    public Boolean getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(Boolean isdefault) {
        this.isdefault = isdefault;
    }

    public ShowMigprojectResponse withTemplate(TemplateResponseBody template) {
        this.template = template;
        return this;
    }

    public ShowMigprojectResponse withTemplate(Consumer<TemplateResponseBody> templateSetter) {
        if (this.template == null) {
            this.template = new TemplateResponseBody();
            templateSetter.accept(this.template);
        }

        return this;
    }

    public TemplateResponseBody getTemplate() {
        return template;
    }

    public void setTemplate(TemplateResponseBody template) {
        this.template = template;
    }

    public ShowMigprojectResponse withRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ShowMigprojectResponse withStartTargetServer(Boolean startTargetServer) {
        this.startTargetServer = startTargetServer;
        return this;
    }

    public Boolean getStartTargetServer() {
        return startTargetServer;
    }

    public void setStartTargetServer(Boolean startTargetServer) {
        this.startTargetServer = startTargetServer;
    }

    public ShowMigprojectResponse withSpeedLimit(Integer speedLimit) {
        this.speedLimit = speedLimit;
        return this;
    }

    public Integer getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(Integer speedLimit) {
        this.speedLimit = speedLimit;
    }

    public ShowMigprojectResponse withUsePublicIp(Boolean usePublicIp) {
        this.usePublicIp = usePublicIp;
        return this;
    }

    public Boolean getUsePublicIp() {
        return usePublicIp;
    }

    public void setUsePublicIp(Boolean usePublicIp) {
        this.usePublicIp = usePublicIp;
    }

    public ShowMigprojectResponse withExistServer(Boolean existServer) {
        this.existServer = existServer;
        return this;
    }

    public Boolean getExistServer() {
        return existServer;
    }

    public void setExistServer(Boolean existServer) {
        this.existServer = existServer;
    }

    public ShowMigprojectResponse withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ShowMigprojectResponse withEnterpriseProject(String enterpriseProject) {
        this.enterpriseProject = enterpriseProject;
        return this;
    }

    public String getEnterpriseProject() {
        return enterpriseProject;
    }

    public void setEnterpriseProject(String enterpriseProject) {
        this.enterpriseProject = enterpriseProject;
    }

    public ShowMigprojectResponse withSyncing(Boolean syncing) {
        this.syncing = syncing;
        return this;
    }

    public Boolean getSyncing() {
        return syncing;
    }

    public void setSyncing(Boolean syncing) {
        this.syncing = syncing;
    }

    public ShowMigprojectResponse withStartNetworkCheck(Boolean startNetworkCheck) {
        this.startNetworkCheck = startNetworkCheck;
        return this;
    }

    public Boolean getStartNetworkCheck() {
        return startNetworkCheck;
    }

    public void setStartNetworkCheck(Boolean startNetworkCheck) {
        this.startNetworkCheck = startNetworkCheck;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMigprojectResponse that = (ShowMigprojectResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.isdefault, that.isdefault)
            && Objects.equals(this.template, that.template) && Objects.equals(this.region, that.region)
            && Objects.equals(this.startTargetServer, that.startTargetServer)
            && Objects.equals(this.speedLimit, that.speedLimit) && Objects.equals(this.usePublicIp, that.usePublicIp)
            && Objects.equals(this.existServer, that.existServer) && Objects.equals(this.type, that.type)
            && Objects.equals(this.enterpriseProject, that.enterpriseProject)
            && Objects.equals(this.syncing, that.syncing)
            && Objects.equals(this.startNetworkCheck, that.startNetworkCheck);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            isdefault,
            template,
            region,
            startTargetServer,
            speedLimit,
            usePublicIp,
            existServer,
            type,
            enterpriseProject,
            syncing,
            startNetworkCheck);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMigprojectResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    isdefault: ").append(toIndentedString(isdefault)).append("\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    startTargetServer: ").append(toIndentedString(startTargetServer)).append("\n");
        sb.append("    speedLimit: ").append(toIndentedString(speedLimit)).append("\n");
        sb.append("    usePublicIp: ").append(toIndentedString(usePublicIp)).append("\n");
        sb.append("    existServer: ").append(toIndentedString(existServer)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    enterpriseProject: ").append(toIndentedString(enterpriseProject)).append("\n");
        sb.append("    syncing: ").append(toIndentedString(syncing)).append("\n");
        sb.append("    startNetworkCheck: ").append(toIndentedString(startNetworkCheck)).append("\n");
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
