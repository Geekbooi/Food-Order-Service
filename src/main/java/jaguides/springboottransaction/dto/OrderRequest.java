package jaguides.springboottransaction.dto;

import jaguides.springboottransaction.entity.Order;
import jaguides.springboottransaction.entity.Payment;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class OrderRequest {
    private Order order; // for send data from client to server
    private Payment payment;


}
