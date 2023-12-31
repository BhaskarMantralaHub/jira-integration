package com.bhaskarmantralahub.jiraintegration.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.*;

import javax.persistence.*;

@Entity(name = "jira_log")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@DynamoDBTable(tableName = "jira_log")
public class JiraLogEntity {

    @Id
    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "lastUpdatedAt", unique = true)
    @DynamoDBAttribute
    private String lastUpdatedAt;

}
