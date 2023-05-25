package jaguides.springboottransaction.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    private int id;
    private int itemId;
    private String itemName;
    private int quantity;
    private double unitPrice;

}
