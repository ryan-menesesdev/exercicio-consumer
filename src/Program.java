import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

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

//        MyConsumer mc = new MyConsumer();
//        products.forEach(mc);

//        Consumer<Product> SuperConsumer = new Consumer<Product>() {
//            @Override
//            public void accept(Product product) {
//                product.setPrice(product.getPrice() * 1.10);
//            }
//        };
//
//        products.forEach(SuperConsumer);

//        Consumer<Product> SuperConsumer = p -> p.setPrice(p.getPrice() * 1.10);
//        products.forEach(SuperConsumer);


//        products.forEach(Product::staticProductConsumer);

//        products.forEach(Product::nonStaticProductConsumer);

//        Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.10);
//        products.forEach(cons);

        products.forEach(p -> p.setPrice((p.getPrice() * 1.10)));

        System.out.println();

        products.forEach(System.out::println);
    }
}

