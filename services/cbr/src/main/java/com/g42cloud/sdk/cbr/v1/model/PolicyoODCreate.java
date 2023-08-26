package com.g42cloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PolicyoODCreate
 */
public class PolicyoODCreate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "day_backups")

    private Integer dayBackups;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_project_id")

    private String destinationProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_region")

    private String destinationRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_acceleration")

    private Boolean enableAcceleration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_backups")

    private Integer maxBackups;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "month_backups")

    private Integer monthBackups;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_duration_days")

    private Integer retentionDurationDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timezone")

    private String timezone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "week_backups")

    private Integer weekBackups;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "year_backups")

    private Integer yearBackups;

    public PolicyoODCreate withDayBackups(Integer dayBackups) {
        this.dayBackups = dayBackups;
        return this;
    }

    public Integer getDayBackups() {
        return dayBackups;
    }

    public void setDayBackups(Integer dayBackups) {
        this.dayBackups = dayBackups;
    }

    public PolicyoODCreate withDestinationProjectId(String destinationProjectId) {
        this.destinationProjectId = destinationProjectId;
        return this;
    }

    public String getDestinationProjectId() {
        return destinationProjectId;
    }

    public void setDestinationProjectId(String destinationProjectId) {
        this.destinationProjectId = destinationProjectId;
    }

    public PolicyoODCreate withDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
        return this;
    }

    public String getDestinationRegion() {
        return destinationRegion;
    }

    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }

    public PolicyoODCreate withEnableAcceleration(Boolean enableAcceleration) {
        this.enableAcceleration = enableAcceleration;
        return this;
    }

    public Boolean getEnableAcceleration() {
        return enableAcceleration;
    }

    public void setEnableAcceleration(Boolean enableAcceleration) {
        this.enableAcceleration = enableAcceleration;
    }

    public PolicyoODCreate withMaxBackups(Integer maxBackups) {
        this.maxBackups = maxBackups;
        return this;
    }

    public Integer getMaxBackups() {
        return maxBackups;
    }

    public void setMaxBackups(Integer maxBackups) {
        this.maxBackups = maxBackups;
    }

    public PolicyoODCreate withMonthBackups(Integer monthBackups) {
        this.monthBackups = monthBackups;
        return this;
    }

    public Integer getMonthBackups() {
        return monthBackups;
    }

    public void setMonthBackups(Integer monthBackups) {
        this.monthBackups = monthBackups;
    }

    public PolicyoODCreate withRetentionDurationDays(Integer retentionDurationDays) {
        this.retentionDurationDays = retentionDurationDays;
        return this;
    }

    public Integer getRetentionDurationDays() {
        return retentionDurationDays;
    }

    public void setRetentionDurationDays(Integer retentionDurationDays) {
        this.retentionDurationDays = retentionDurationDays;
    }

    public PolicyoODCreate withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public PolicyoODCreate withWeekBackups(Integer weekBackups) {
        this.weekBackups = weekBackups;
        return this;
    }

    public Integer getWeekBackups() {
        return weekBackups;
    }

    public void setWeekBackups(Integer weekBackups) {
        this.weekBackups = weekBackups;
    }

    public PolicyoODCreate withYearBackups(Integer yearBackups) {
        this.yearBackups = yearBackups;
        return this;
    }

    public Integer getYearBackups() {
        return yearBackups;
    }

    public void setYearBackups(Integer yearBackups) {
        this.yearBackups = yearBackups;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PolicyoODCreate that = (PolicyoODCreate) obj;
        return Objects.equals(this.dayBackups, that.dayBackups)
            && Objects.equals(this.destinationProjectId, that.destinationProjectId)
            && Objects.equals(this.destinationRegion, that.destinationRegion)
            && Objects.equals(this.enableAcceleration, that.enableAcceleration)
            && Objects.equals(this.maxBackups, that.maxBackups) && Objects.equals(this.monthBackups, that.monthBackups)
            && Objects.equals(this.retentionDurationDays, that.retentionDurationDays)
            && Objects.equals(this.timezone, that.timezone) && Objects.equals(this.weekBackups, that.weekBackups)
            && Objects.equals(this.yearBackups, that.yearBackups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dayBackups,
            destinationProjectId,
            destinationRegion,
            enableAcceleration,
            maxBackups,
            monthBackups,
            retentionDurationDays,
            timezone,
            weekBackups,
            yearBackups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyoODCreate {\n");
        sb.append("    dayBackups: ").append(toIndentedString(dayBackups)).append("\n");
        sb.append("    destinationProjectId: ").append(toIndentedString(destinationProjectId)).append("\n");
        sb.append("    destinationRegion: ").append(toIndentedString(destinationRegion)).append("\n");
        sb.append("    enableAcceleration: ").append(toIndentedString(enableAcceleration)).append("\n");
        sb.append("    maxBackups: ").append(toIndentedString(maxBackups)).append("\n");
        sb.append("    monthBackups: ").append(toIndentedString(monthBackups)).append("\n");
        sb.append("    retentionDurationDays: ").append(toIndentedString(retentionDurationDays)).append("\n");
        sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
        sb.append("    weekBackups: ").append(toIndentedString(weekBackups)).append("\n");
        sb.append("    yearBackups: ").append(toIndentedString(yearBackups)).append("\n");
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
