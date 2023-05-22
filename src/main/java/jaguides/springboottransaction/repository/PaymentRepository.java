package jaguides.springboottransaction.repository;

import jaguides.springboottransaction.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
