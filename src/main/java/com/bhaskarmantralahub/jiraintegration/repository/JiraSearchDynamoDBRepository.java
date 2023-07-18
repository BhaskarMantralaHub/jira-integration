package com.bhaskarmantralahub.jiraintegration.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.bhaskarmantralahub.jiraintegration.entity.JiraSearchEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class JiraSearchDynamoDBRepository {

    @Autowired
    private DynamoDBMapper dynamoDBMapper;

    public JiraSearchEntity save(JiraSearchEntity jiraSearchEntity) {
        dynamoDBMapper.save(jiraSearchEntity);
        return jiraSearchEntity;
    }

    public JiraSearchEntity getByIssueName(String issueName) {
        return dynamoDBMapper.load(JiraSearchEntity.class, issueName);
    }

    public JiraSearchEntity updateIssue(JiraSearchEntity jiraSearchEntity, String issueName) {
        dynamoDBMapper.save(jiraSearchEntity, new DynamoDBSaveExpression()
                .withExpectedEntry("issueName", new ExpectedAttributeValue(new AttributeValue().withS(issueName))));
        return dynamoDBMapper.load(JiraSearchEntity.class, issueName);
    }

}
