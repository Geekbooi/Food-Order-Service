package jaguides.springboottransaction.service;

import jaguides.springboottransaction.dto.OrderRequest;
import jaguides.springboottransaction.dto.OrderResponse;
import jaguides.springboottransaction.entity.Item;
import jaguides.springboottransaction.entity.ItemRequest;
import jaguides.springboottransaction.entity.Order;
import jaguides.springboottransaction.entity.ShoppingCart;

public interface OrderService {
    OrderResponse placeOrder(OrderRequest oderRequest);
    Order getOrder(String orderId);
    boolean refundOrder(String orderId);
    boolean deleteOrder(String orderId);
}