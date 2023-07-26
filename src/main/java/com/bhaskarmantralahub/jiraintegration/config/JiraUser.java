package com.bhaskarmantralahub.jiraintegration.config;


import lombok.Data;

@Data
public class JiraUser {
    private String userName;

    private String token;

    private String project;

    private String issueType;

    private String issueStatus;

    private String baseuri;

    private String domain;

    private String jquery;
}
