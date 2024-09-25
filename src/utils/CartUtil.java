package utils;

import domain.Cart;

public class CartUtil {
    public static Cart createSampleCart() {
        Cart cart = new Cart();
        BookUtil.createSampleBooks().forEach(book -> cart.addBook(book));
        return cart;
    }
}
