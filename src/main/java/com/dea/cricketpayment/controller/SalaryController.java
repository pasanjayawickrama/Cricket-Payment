package com.dea.cricketpayment.controller;

import com.dea.cricketpayment.Dto.PaymentDto;
import com.dea.cricketpayment.model.PaymentHistory;
import com.dea.cricketpayment.model.Salary;
import com.dea.cricketpayment.services.PaymentService;
import com.dea.cricketpayment.services.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/salary")
public class SalaryController {

    @Autowired
    SalaryService salaryService;

    @PostMapping("/get-by-id")
    List<Salary> getSalaryById(@RequestBody Salary salary){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXX::");
        return null;
    }

}
