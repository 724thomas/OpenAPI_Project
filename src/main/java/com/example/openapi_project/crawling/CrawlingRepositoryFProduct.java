package com.example.openapi_project.crawling;

import com.example.openapi_project.entity.EntityFProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrawlingRepositoryFProduct extends JpaRepository<EntityFProduct, Long>{

}
