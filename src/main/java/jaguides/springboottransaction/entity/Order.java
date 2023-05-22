package jaguides.springboottransaction.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "orders")
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String orderTrackingNumber;
    private String userEmail;
    private int totalQuantity;
    private BigDecimal totalPrice;
    private String status;
    @CreationTimestamp
    private LocalTime dateCreated;
    @UpdateTimestamp
    private LocalTime lastUpdated;
    private Long shoppingCartId;

}
