package jaguides.springboottransaction.service;

import jaguides.springboottransaction.dto.OrderRequest;
import jaguides.springboottransaction.dto.OrderResponse;
import jaguides.springboottransaction.entity.Order;

public interface OrderService {
    OrderResponse placeOrder(OrderRequest oderRequest);
    Order getOrder(String orderId);
    boolean refundOrder(String orderId);
}
