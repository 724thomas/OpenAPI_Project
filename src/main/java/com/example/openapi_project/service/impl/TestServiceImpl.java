package com.example.openapi_project.service.impl;

import com.example.openapi_project.dto.TestResponse;
import com.example.openapi_project.repository.TestRepository;
import com.example.openapi_project.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class TestServiceImpl implements TestService {

    private final TestRepository testRepository;


    @Override
    public List<Object[]> selectAllFProducts() {
        return testRepository.selectAllFProducts();
    }

    @Override
    public List<Object[]> selectByCompanyName(String companyName) {
        return testRepository.selectByCompanyName(companyName);
    }

    @Override
    public List<Object[]> selectByFProductName(String fProductName) {
        return testRepository.selectByFProductName(fProductName);
    }

    @Override
    public List<Object[]> selectByLoanType(String loanType) {
        return testRepository.selectByLoanType(loanType);
    }

    @Override
    public List<Object[]> selectByInterestType(String interestType) {
        return testRepository.selectByInterestType(interestType);
    }

}
