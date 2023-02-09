package com.example.openapi_project.crawling;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrawlingRepository extends JpaRepository<EntityCompany, String>{

}
