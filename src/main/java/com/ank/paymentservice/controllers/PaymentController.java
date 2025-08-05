package com.ank.paymentservice.controllers;

import com.ank.paymentservice.services.PaymentService;
import com.stripe.exception.StripeException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    PaymentService paymentService;
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/initiate/{orderId}")
    public String initiatePayment(@PathVariable("orderId") String orderId) throws StripeException {
        // call order service to get order details
        // Logic to initiate payment
        return paymentService.initiatePayment(orderId);
    }

}
