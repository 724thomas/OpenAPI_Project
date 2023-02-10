package com.example.openapi_project.crawling;

import com.example.openapi_project.entity.EntityCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrawlingRepositoryCompany extends JpaRepository<EntityCompany, String>{

}
