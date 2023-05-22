package jaguides.springboottransaction.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class OrderResponse { // for after client placed to order
    private Long id;
    private String orderTrackingNumber;
    private String status;
    private String message;
}
