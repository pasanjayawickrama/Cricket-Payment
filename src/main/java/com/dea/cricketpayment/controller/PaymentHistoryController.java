package com.dea.cricketpayment.controller;

import com.dea.cricketpayment.Dto.PaymentDto;
import com.dea.cricketpayment.model.PaymentHistory;
import com.dea.cricketpayment.services.PaymentHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payment-history")
public class PaymentHistoryController {

    @Autowired
    PaymentHistoryService paymentHistoryService;

    @GetMapping("/get-all")
    List<PaymentHistory> getAllPaymentHistory(){
        return paymentHistoryService.getAllPaymentHistory();
    }

    @PostMapping("/add-payment-history")
    List<PaymentHistory> addPaymantHistory(@RequestBody PaymentHistory paymentHistory){
        return paymentHistoryService.addPaymantHistory(paymentHistory);
    }

}
