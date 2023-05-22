package jaguides.springboottransaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CartService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${CART_SERVICE}")
    private String cartServiceUrl;

    public String getCartById(Long id) {
        return "";
    }
}
