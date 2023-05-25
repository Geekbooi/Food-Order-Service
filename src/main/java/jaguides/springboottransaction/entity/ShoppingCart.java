package jaguides.springboottransaction.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class ShoppingCart {
    private String Id;
    private List<ItemRequest> items = new ArrayList<>();
    public void addItem(ItemRequest item) {
        items.add(item);
    }

}
