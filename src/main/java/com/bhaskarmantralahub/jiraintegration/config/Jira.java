package com.bhaskarmantralahub.jiraintegration.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component
@ConfigurationProperties("jira")
public class Jira {

    private String userName;

    private String token;

    private String project;

    private String issueType;

    private String baseuri;

}
