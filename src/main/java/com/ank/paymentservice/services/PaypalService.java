package com.ank.paymentservice.services;

import org.springframework.stereotype.Service;

@Service
public class PaypalService implements PaymentService {

    @Override
    public String initiatePayment(String orderId) {
        // Implement PayPal payment initiation logic here
        // This is a placeholder implementation
        return "PayPal is currently not supported. Please use Stripe for payments.";
    }
}
