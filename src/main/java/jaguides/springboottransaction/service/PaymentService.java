package jaguides.springboottransaction.service;

import jaguides.springboottransaction.entity.Payment;
import jaguides.springboottransaction.exception.PaymentException;
import jaguides.springboottransaction.repository.PaymentRepository;
import org.springframework.stereotype.Service;

@Service

public class PaymentService {
    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public Payment processPayment(Payment payment) {
        if (!payment.getType().equals("DEBIT")) {
            throw new PaymentException("Payment card does not support");
        }

        boolean isValidPayment = validatePayment(payment);
        if (!isValidPayment) {

            throw new IllegalArgumentException("Invalid payment details");
        }

        boolean paymentSuccess = initiatePayment(payment);
        if (!paymentSuccess) {
            throw new RuntimeException("Payment processing failed");
        }

        payment.setPaymentStatus("PAID");

        Payment processedPayment = paymentRepository.save(payment);

        return processedPayment;
    }


    private boolean validatePayment(Payment payment) {
        return payment.getCardNumber() != null && payment.getExpiryYear() > 0 && payment.getExpiryMonth() > 0;
    }

    private boolean initiatePayment(Payment payment) {
        return true;
    }
}
