package com.dea.cricketpayment.services;

import com.dea.cricketpayment.Dto.PaymentDto;

import java.util.HashMap;

public interface PaymentService {

    HashMap<String, Double> doPayment(PaymentDto paymentDto);


}
