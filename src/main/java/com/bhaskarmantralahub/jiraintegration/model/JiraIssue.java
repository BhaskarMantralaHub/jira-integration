package com.bhaskarmantralahub.jiraintegration.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class JiraIssue {
    private String issueName;
    private String issueType;
    private String project;
    private String priority;
    private String assignee;
    private String reporter;
    private String updatedAt;
    private String createdAt;
    private String currentStatus;
    private String searchUrl;
    private String description;
    private String lastUpdatedByService;
}
