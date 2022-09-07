package pro.sky.Spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.Spring.services.CartService;

import java.util.List;

@RestController
@RequestMapping(path = "/store/order/")

public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping(path = "add")
    public List<Integer> addItems(@RequestParam List<Integer> itemIds) {
        return cartService.addItems(itemIds);
    }

    @GetMapping(path = "get")
    public List<Integer> getItems() {
        return cartService.getItems();
    }
}
