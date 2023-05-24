package jaguides.springboottransaction.service;

import jaguides.springboottransaction.entity.CartItem;
import jaguides.springboottransaction.entity.ShoppingCart;
import org.springframework.stereotype.Service;

@Service
public class CartService {
        public ShoppingCart getShoppingCartById(Long cartId) {

            ShoppingCart cart = new ShoppingCart();
            cart.setId("1");
            cart.addItem(new CartItem("1", 5, 60.0));
            cart.addItem(new CartItem("1", 2, 30.0));
            cart.addItem(new CartItem("1", 3, 20.0));
            cart.addItem(new CartItem("1", 1, 10.0));

            return cart;
        }
}
