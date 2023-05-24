package jaguides.springboottransaction.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CartItem {
    private String productId;
    private int quantity;
    private double price;
}
