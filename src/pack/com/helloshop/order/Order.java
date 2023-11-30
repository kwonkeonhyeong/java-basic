package src.pack.com.helloshop.order;

import src.pack.com.helloshop.product.Product;
import src.pack.com.helloshop.user.User;

public class Order {
    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
