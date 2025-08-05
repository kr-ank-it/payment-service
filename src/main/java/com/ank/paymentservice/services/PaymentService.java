package com.ank.paymentservice.services;


import com.stripe.exception.StripeException;

public interface PaymentService {
    String initiatePayment(String orderId) throws StripeException;
}
