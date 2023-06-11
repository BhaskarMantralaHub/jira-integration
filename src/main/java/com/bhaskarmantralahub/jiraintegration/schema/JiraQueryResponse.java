
package com.bhaskarmantralahub.jiraintegration.schema;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "expand",
    "startAt",
    "maxResults",
    "total",
    "issues"
})
@Generated("jsonschema2pojo")
public class JiraQueryResponse {

    @JsonProperty("expand")
    private String expand;
    @JsonProperty("startAt")
    private Integer startAt;
    @JsonProperty("maxResults")
    private Integer maxResults;
    @JsonProperty("total")
    private Integer total;
    @JsonProperty("issues")
    private List<Issue> issues = new ArrayList<Issue>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("expand")
    public String getExpand() {
        return expand;
    }

    @JsonProperty("expand")
    public void setExpand(String expand) {
        this.expand = expand;
    }

    @JsonProperty("startAt")
    public Integer getStartAt() {
        return startAt;
    }

    @JsonProperty("startAt")
    public void setStartAt(Integer startAt) {
        this.startAt = startAt;
    }

    @JsonProperty("maxResults")
    public Integer getMaxResults() {
        return maxResults;
    }

    @JsonProperty("maxResults")
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    @JsonProperty("issues")
    public List<Issue> getIssues() {
        return issues;
    }

    @JsonProperty("issues")
    public void setIssues(List<Issue> issues) {
        this.issues = issues;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(JiraQueryResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("expand");
        sb.append('=');
        sb.append(((this.expand == null)?"<null>":this.expand));
        sb.append(',');
        sb.append("startAt");
        sb.append('=');
        sb.append(((this.startAt == null)?"<null>":this.startAt));
        sb.append(',');
        sb.append("maxResults");
        sb.append('=');
        sb.append(((this.maxResults == null)?"<null>":this.maxResults));
        sb.append(',');
        sb.append("total");
        sb.append('=');
        sb.append(((this.total == null)?"<null>":this.total));
        sb.append(',');
        sb.append("issues");
        sb.append('=');
        sb.append(((this.issues == null)?"<null>":this.issues));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.expand == null)? 0 :this.expand.hashCode()));
        result = ((result* 31)+((this.total == null)? 0 :this.total.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.issues == null)? 0 :this.issues.hashCode()));
        result = ((result* 31)+((this.startAt == null)? 0 :this.startAt.hashCode()));
        result = ((result* 31)+((this.maxResults == null)? 0 :this.maxResults.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JiraQueryResponse) == false) {
            return false;
        }
        JiraQueryResponse rhs = ((JiraQueryResponse) other);
        return (((((((this.expand == rhs.expand)||((this.expand!= null)&&this.expand.equals(rhs.expand)))&&((this.total == rhs.total)||((this.total!= null)&&this.total.equals(rhs.total))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.issues == rhs.issues)||((this.issues!= null)&&this.issues.equals(rhs.issues))))&&((this.startAt == rhs.startAt)||((this.startAt!= null)&&this.startAt.equals(rhs.startAt))))&&((this.maxResults == rhs.maxResults)||((this.maxResults!= null)&&this.maxResults.equals(rhs.maxResults))));
    }

}
