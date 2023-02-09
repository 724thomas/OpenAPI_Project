package com.example.openapi_project.crawling.service;

import com.example.openapi_project.crawling.CrawlingRepository;
import com.example.openapi_project.crawling.EntityCompany;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OpenApiService {

    private final CrawlingRepository crawlingRepository;

    public void save(EntityCompany entityCompany) {
        crawlingRepository.save(entityCompany);
    }
}
