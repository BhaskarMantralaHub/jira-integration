package com.bhaskarmantralahub.jiraintegration.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
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
@DynamoDBTable(tableName = "jira_search")
public class JiraSearchEntity {

    @Id
    @DynamoDBHashKey
    @Column(name = "issueName")
    private String issueName;

    @Column(name = "issueType")
    @DynamoDBAttribute
    private String issueType;

    @Column(name = "project")
    @DynamoDBAttribute
    private String project;

    @Column(name = "priority")
    @DynamoDBAttribute
    private String priority;

    @Column(name = "assignee")
    @DynamoDBAttribute
    private String assignee;

    @Column(name = "reporter")
    @DynamoDBAttribute
    private String reporter;

    @Column(name = "updatedAt")
    @DynamoDBAttribute
    private String updatedAt;

    @Column(name = "createdAt")
    @DynamoDBAttribute
    private String createdAt;

    @Column(name = "currentStatus")
    @DynamoDBAttribute
    private String currentStatus;

    @Column(name = "searchUrl")
    @DynamoDBAttribute
    private String searchUrl;

    @Column(name = "description")
    @DynamoDBAttribute
    private String description;

    @Column(name = "lastUpdatedByService")
    @DynamoDBAttribute
    private String lastUpdatedByService;
}
