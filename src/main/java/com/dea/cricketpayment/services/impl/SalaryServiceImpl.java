package com.dea.cricketpayment.services.impl;

import com.dea.cricketpayment.Dto.PaymentDto;
import com.dea.cricketpayment.model.PaymentHistory;
import com.dea.cricketpayment.model.Salary;
import com.dea.cricketpayment.repository.SalaryRepository;
import com.dea.cricketpayment.services.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryServiceImpl implements SalaryService {

    @Autowired
    SalaryRepository salaryRepository;

    @Override
    public List<Salary> getSalaryById(Salary salary){

       //.....


        return null;

    }
}
