package jaguides.springboottransaction.controller;

import jaguides.springboottransaction.dto.OrderRequest;
import jaguides.springboottransaction.dto.OrderResponse;
import jaguides.springboottransaction.entity.Order;
import jaguides.springboottransaction.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    private OrderService orderService;

    @GetMapping("/healthCheck")
    public ResponseEntity<?> healthCheck(){
        return ResponseEntity.ok("working");
    }
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<OrderResponse> placeOrder(@RequestBody OrderRequest orderRequest){
        return ResponseEntity.ok(orderService.placeOrder(orderRequest));
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<Order> getOrder(@PathVariable String orderId) {
        Order order = orderService.getOrder(orderId);
        if (order != null) {
            return ResponseEntity.ok(order);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{orderId}")
    public ResponseEntity<Boolean> refundOrder(@PathVariable String orderId) {
        boolean isCancelled = orderService.refundOrder(orderId);
        return ResponseEntity.noContent().build();
    }
}