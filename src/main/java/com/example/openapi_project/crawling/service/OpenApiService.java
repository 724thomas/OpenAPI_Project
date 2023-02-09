package com.example.openapi_project.crawling.service;

import com.example.openapi_project.crawling.CrawlingRepositoryCompany;
import com.example.openapi_project.crawling.EntityCompany;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OpenApiService {

    private final CrawlingRepositoryCompany crawlingRepository;

    public void save(EntityCompany entityCompany) {
        crawlingRepository.save(entityCompany);
    }


}
