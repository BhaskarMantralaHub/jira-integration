package com.bhaskarmantralahub.jiraintegration.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class JiraQuery {

    private String issueType;
    private String issueStatus;
    private String project;
    private String baseUri;
    private String jquery;

    public static class JiraQueryBuilder {

        public String build() {
            StringBuilder stringBuilder = new StringBuilder(baseUri);
            boolean hasCondition = false;
            if (jquery != null) return jquery;
            if (issueType != null) {
                stringBuilder.append("issueType=").append(issueType);
                hasCondition = true;
            }
            if (project != null) {
                if (hasCondition) stringBuilder.append(" AND ");
                stringBuilder.append("project=").append(project);
                hasCondition = true;
            }
            if (issueStatus != null) {
                if (hasCondition) stringBuilder.append(" AND ");
                stringBuilder.append("status='").append(issueStatus).append("'");
                hasCondition = true;
            }

            return stringBuilder.toString();
        }
    }
}
