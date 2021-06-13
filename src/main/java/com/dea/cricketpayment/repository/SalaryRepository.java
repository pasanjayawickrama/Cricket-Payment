package com.dea.cricketpayment.repository;

import com.dea.cricketpayment.model.PaymentHistory;
import com.dea.cricketpayment.model.Salary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryRepository extends JpaRepository<Salary, Integer> {


    Salary getSalaryByCategoryAndTier(String category, String tier);


}
