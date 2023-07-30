package OOP.Encapsulation.ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private double price;
    private List<Product> products;

    public Person(String name, double price) {
        setName(name);
        setPrice(price);
        this.products = new ArrayList<>();
    }

    public void buyProduct(Product product){
        if (price < product.getCost()){
            System.out.println(name + " can't afford " + product.getName());
        } else {
            products.add(product);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.price = price;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
