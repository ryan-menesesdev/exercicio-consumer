package application;

import model.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("PC", 200.0));
        products.add(new Product("HD Case", 80.0));
        products.add(new Product("Pencil", 0.50));
        products.add(new Product("Game", 60.0));
        products.add(new Product("TV", 300.0));

        for(Product p : products) {
            System.out.println(p.getName() + " - " + p.getPrice());
        }

//        model.entities.MyConsumer mc = new model.entities.MyConsumer();
//        products.forEach(mc);

//        Consumer<model.entities.Product> SuperConsumer = new Consumer<model.entities.Product>() {
//            @Override
//            public void accept(model.entities.Product product) {
//                product.setPrice(product.getPrice() * 1.10);
//            }
//        };
//
//        products.forEach(SuperConsumer);

//        Consumer<model.entities.Product> SuperConsumer = p -> p.setPrice(p.getPrice() * 1.10);
//        products.forEach(SuperConsumer);


//        products.forEach(model.entities.Product::staticProductConsumer);

//        products.forEach(model.entities.Product::nonStaticProductConsumer);

//        Consumer<model.entities.Product> cons = p -> p.setPrice(p.getPrice() * 1.10);
//        products.forEach(cons);

        products.forEach(p -> p.setPrice((p.getPrice() * 1.10)));

        System.out.println();

        products.forEach(System.out::println);
    }
}

