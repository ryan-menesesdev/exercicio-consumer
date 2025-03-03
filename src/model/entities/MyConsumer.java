package model.entities;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<Product> {
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.10);
    }
}
