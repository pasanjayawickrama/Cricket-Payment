package com.dea.cricketpayment.controller;

import com.dea.cricketpayment.Dto.PaymentDto;
import com.dea.cricketpayment.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/payment-process")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @PostMapping("/do-payment")
    public HashMap<String, Double> getPaymentById(@RequestBody PaymentDto paymentDto){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXX::");
        return paymentService.doPayment(paymentDto);
    }
}
