package com.g42cloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 错误日志信息。
 */
public class ErrorLog {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    public ErrorLog withTime(String time) {
        this.time = time;
        return this;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ErrorLog withLevel(String level) {
        this.level = level;
        return this;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public ErrorLog withContent(String content) {
        this.content = content;
        return this;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ErrorLog errorLog = (ErrorLog) o;
        return Objects.equals(this.time, errorLog.time) && Objects.equals(this.level, errorLog.level)
            && Objects.equals(this.content, errorLog.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, level, content);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorLog {\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
