package jaguides.springboottransaction.Integration;

import jaguides.springboottransaction.entity.Item;
import jaguides.springboottransaction.entity.ItemRequest;
import jaguides.springboottransaction.entity.ShoppingCart;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ShoppingCartService {
    private final RestTemplate restTemplate;
    private final String baseUrl = "http://localhost:8080";

    public ShoppingCartService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ShoppingCart createShoppingCart() {
        String url = baseUrl + "/carts";
        return restTemplate.postForObject(url, null, ShoppingCart.class);
    }

    public Item addItemToCart(long cartId, ItemRequest itemRequest) {
        String url = baseUrl + "/carts/" + cartId + "/items";
        return restTemplate.postForObject(url, itemRequest, Item.class);
    }

    public Item updateItemInCart(long cartId, ItemRequest itemRequest) {
        String url = baseUrl + "/carts/" + cartId + "/items";
        restTemplate.put(url, itemRequest);
        return getItemFromCart(cartId, itemRequest.getItemId());
    }

    public void removeItemFromCart(long cartId, long itemId) {
        String url = baseUrl + "/carts/" + cartId + "/items/" + itemId;
        restTemplate.delete(url);
    }

    public ShoppingCart getCartDetails(long cartId) {
        String url = baseUrl + "/carts/" + cartId;
        return restTemplate.getForObject(url, ShoppingCart.class);
    }

    public void checkoutCart(long cartId) {
        String url = baseUrl + "/carts/" + cartId + "/checkout";
        restTemplate.patchForObject(url, null, Void.class);
    }

    public void deleteCart(long cartId) {
        String url = baseUrl + "/carts/" + cartId;
        restTemplate.delete(url);
    }

    public Item getItemFromCart(long cartId, long itemId) {
        String url = baseUrl + "/carts/" + cartId + "/items/" + itemId;
        return restTemplate.getForObject(url, Item.class);
    }
}
