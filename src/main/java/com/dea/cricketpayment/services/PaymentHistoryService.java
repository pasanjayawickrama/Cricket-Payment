package com.dea.cricketpayment.services;

import com.dea.cricketpayment.Dto.PaymentDto;
import com.dea.cricketpayment.model.PaymentHistory;

import java.util.List;


public interface PaymentHistoryService {

    List<PaymentHistory> getAllPaymentHistory();

    List<PaymentHistory> addPaymantHistory(PaymentHistory paymentHistory);
}
