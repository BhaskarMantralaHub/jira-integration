package com.bhaskarmantralahub.jiraintegration.entity;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@Table(name = "jira_search")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@DynamicUpdate
public class JiraSearchEntity {

    @Id
    @Column(name = "issueName")
    private String issueName;

    @Column(name = "issueType")
    private String issueType;

    @Column(name = "project")
    private String project;

    @Column(name = "priority")
    private String priority;

    @Column(name = "assignee")
    private String assignee;

    @Column(name = "reporter")
    private String reporter;

    @Column(name = "updatedAt")
    private String updatedAt;

    @Column(name = "createdAt")
    private String createdAt;

    @Column(name = "currentStatus")
    private String currentStatus;

    @Column(name = "searchUrl")
    private String searchUrl;

    @Column(name = "description")
    private String description;

    @Column(name = "lastUpdatedByService")
    private String lastUpdatedByService;
}
