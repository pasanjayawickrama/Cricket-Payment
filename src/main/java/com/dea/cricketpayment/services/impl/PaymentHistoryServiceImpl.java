package com.dea.cricketpayment.services.impl;

import com.dea.cricketpayment.Dto.PaymentDto;
import com.dea.cricketpayment.model.PaymentHistory;
import com.dea.cricketpayment.repository.PaymentHistoryRepository;
import com.dea.cricketpayment.repository.PlayerRepository;
import com.dea.cricketpayment.repository.SalaryRepository;
import com.dea.cricketpayment.services.PaymentHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentHistoryServiceImpl implements PaymentHistoryService {

    @Autowired
    PaymentHistoryRepository paymentHistoryRepository;

    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    SalaryRepository salaryRepository;

    @Autowired



    @Override
    public List<PaymentHistory> getAllPaymentHistory() {
        return paymentHistoryRepository.findAll();
    }

    @Override
    public List<PaymentHistory> addPaymantHistory(PaymentHistory paymentHistory){


        return null;
    }

}
