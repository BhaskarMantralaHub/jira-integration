package com.bhaskarmantralahub.jiraintegration.repository;

import com.bhaskarmantralahub.jiraintegration.entity.JiraSearchEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "JiraSearch", path ="JiraSearch")
public interface JiraSearchRepository extends JpaRepository<JiraSearchEntity, String> {
}
