package jaguides.springboottransaction.service;

import jaguides.springboottransaction.entity.Payment;
import jaguides.springboottransaction.exception.PaymentException;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
        public void processPayment(Payment payment) {
            // Implement payment processing logic here
            // Example:
            if (!payment.getType().equals("DEBIT")) {
                throw new PaymentException("Payment card does not support");
            }
            // Save payment details or communicate with a payment gateway
        }
    }
