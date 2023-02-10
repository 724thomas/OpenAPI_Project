package com.example.openapi_project.controller;

import com.example.openapi_project.dto.TestResponse;
import com.example.openapi_project.service.TestService;
import com.example.openapi_project.service.impl.TestServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class MockController {

    private final TestServiceImpl testService;

    @GetMapping("/all")
    public List<Object[]> all() {
        return testService.selectAllFProducts();
    }

    @GetMapping("/companyname") //kor_co_nm 금융회사명
    public List<Object[]> companyName(@RequestParam("companyName")String companyName) {
//        companyName = "우리은행";
        return testService.selectByCompanyName(companyName);
    }

    @GetMapping("/fproductname") //fin_prdt_nm 금융상품명
    public List<Object[]> fproductName(@RequestParam("fproductName")String fproductName) {
//        fproductName = "개인신용대출";
        return testService.selectByFProductName(fproductName);
    }

    @GetMapping("/loantype") //crdt_prdt_type_nm 대출종류명
    public List<Object[]> fproductType(@RequestParam("fproductType") String fproductType) {
//        fproductType = "마이너스한도대출";
        return testService.selectByLoanType(fproductType);
    }

    @GetMapping("/interesttype") //crdt_lend_rate_type_nm 금리구분
    public List<Object[]> interestType(@RequestParam("interestType") String interestType) {
//        http://localhost:8080/interesttype?interesttype=가산금
        interestType = "가산금리";
        return testService.selectByInterestType(interestType);
    }
}
