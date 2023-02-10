package com.example.openapi_project.service;

import com.example.openapi_project.dto.TestResponse;

import java.util.ArrayList;
import java.util.List;


public interface TestService {

     List<Object[]> selectAllFProducts();

     List<Object[]> selectByCompanyName(String companyName);

     List<Object[]> selectByFProductName(String fProductName);

     List<Object[]> selectByLoanType(String loanType);

     List<Object[]> selectByInterestType(String interestType);
}
