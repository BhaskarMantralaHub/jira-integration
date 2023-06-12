package com.bhaskarmantralahub.jiraintegration.model;

public enum IssueType {
    EPIC("Epic"),
    TASK("Task"),
    BUG("Bug");

    private final String type;

    IssueType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
