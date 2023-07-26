package com.bhaskarmantralahub.jiraintegration.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@DynamicUpdate
@DynamoDBTable(tableName = "jira_user")
@Entity(name = "jira_user")
public class JiraUserEntity {

    @Id
    @DynamoDBHashKey
    private String env;

    @DynamoDBAttribute
    private String user;

}
