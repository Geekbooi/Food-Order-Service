package jaguides.springboottransaction.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ItemRequest {
    private int itemId;
    private String itemName;
    private int quantity;
    private double unitPrice;
}
