package model.entities;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static void staticProductConsumer(Product p) {
        p.setPrice(p.getPrice() * 1.10);
    }

    public void nonStaticProductConsumer() {
        setPrice(getPrice() * 1.10);
    }

    @Override
    public String toString() {
        return getName() + " - " + getPrice();
    }
}
