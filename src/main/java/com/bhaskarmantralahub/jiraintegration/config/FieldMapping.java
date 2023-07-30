package com.bhaskarmantralahub.jiraintegration.config;

import lombok.Getter;

@Getter
public enum FieldMapping {

    SUMMARY("summary", "summary", "summary"),
    ISSUE_STATUS("issueStatus", "issueStatus", "status.name"),
    PRIORITY("priority", "priority", "priority.name"),
    ASSIGNEE("assignee", "assignee", "assignee.displayName");

    private final String dynamoColumName;
    private final String fieldName;
    private final String fieldMapping;


    FieldMapping(String dynamoColumName, String fieldName, String fieldMapping) {
        this.dynamoColumName = dynamoColumName;
        this.fieldName = fieldName;
        this.fieldMapping = fieldMapping;
    }
}
