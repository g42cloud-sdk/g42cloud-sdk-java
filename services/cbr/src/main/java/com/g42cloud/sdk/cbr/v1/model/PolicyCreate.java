package com.g42cloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * PolicyCreate
 */
public class PolicyCreate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_definition")

    private PolicyoODCreate operationDefinition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_type")

    private String operationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger")

    private PolicyTriggerReq trigger;

    public PolicyCreate withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public PolicyCreate withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PolicyCreate withOperationDefinition(PolicyoODCreate operationDefinition) {
        this.operationDefinition = operationDefinition;
        return this;
    }

    public PolicyCreate withOperationDefinition(Consumer<PolicyoODCreate> operationDefinitionSetter) {
        if (this.operationDefinition == null) {
            this.operationDefinition = new PolicyoODCreate();
            operationDefinitionSetter.accept(this.operationDefinition);
        }

        return this;
    }

    public PolicyoODCreate getOperationDefinition() {
        return operationDefinition;
    }

    public void setOperationDefinition(PolicyoODCreate operationDefinition) {
        this.operationDefinition = operationDefinition;
    }

    public PolicyCreate withOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public PolicyCreate withTrigger(PolicyTriggerReq trigger) {
        this.trigger = trigger;
        return this;
    }

    public PolicyCreate withTrigger(Consumer<PolicyTriggerReq> triggerSetter) {
        if (this.trigger == null) {
            this.trigger = new PolicyTriggerReq();
            triggerSetter.accept(this.trigger);
        }

        return this;
    }

    public PolicyTriggerReq getTrigger() {
        return trigger;
    }

    public void setTrigger(PolicyTriggerReq trigger) {
        this.trigger = trigger;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PolicyCreate policyCreate = (PolicyCreate) o;
        return Objects.equals(this.enabled, policyCreate.enabled) && Objects.equals(this.name, policyCreate.name)
            && Objects.equals(this.operationDefinition, policyCreate.operationDefinition)
            && Objects.equals(this.operationType, policyCreate.operationType)
            && Objects.equals(this.trigger, policyCreate.trigger);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, name, operationDefinition, operationType, trigger);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyCreate {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    operationDefinition: ").append(toIndentedString(operationDefinition)).append("\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
        sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
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
