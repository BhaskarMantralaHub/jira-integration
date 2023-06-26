package com.bhaskarmantralahub.jiraintegration.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "jira_search")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class JiraSearchEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "issueId", unique = true)
    private String issueId;

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

    @Column(name = "searchUrl", unique = true)
    private String searchUrl;

    @Column(name = "description")
    private String description;
}
