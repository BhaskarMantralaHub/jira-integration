package com.bhaskarmantralahub.jiraintegration.repository;

import com.bhaskarmantralahub.jiraintegration.entity.JiraLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "JiraLog", path ="JiraLog")
public interface JiraLogRepository extends JpaRepository<JiraLogEntity, Long> {
}
