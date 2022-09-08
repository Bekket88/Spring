package pro.sky.Spring.services;

import org.springframework.stereotype.Service;
import pro.sky.Spring.component.Cart;

import java.util.List;

@Service
public class CartService {

    private final Cart cart;

    public CartService(Cart cart) {
        this.cart = cart;
    }

    public List<Integer> addItems(List<Integer> idList) {
        return cart.addItems(idList);
    }

    public List<Integer> getItems() {
        return cart.getItems();
    }
}
