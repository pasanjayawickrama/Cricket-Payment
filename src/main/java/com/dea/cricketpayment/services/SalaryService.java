package com.dea.cricketpayment.services;

import com.dea.cricketpayment.model.Salary;

import java.util.List;

public interface SalaryService {

    List<Salary> getSalaryById(Salary salary);
}
