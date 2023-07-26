package com.bhaskarmantralahub.jiraintegration.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.bhaskarmantralahub.jiraintegration.entity.JiraUserEntity;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@EnableScan
public class JiraUserRepository {

    @Autowired
    private DynamoDBMapper dynamoDBMapper;

    public JiraUserEntity findByEnv(String env) {
        return dynamoDBMapper.load(JiraUserEntity.class, env);
    }

}
