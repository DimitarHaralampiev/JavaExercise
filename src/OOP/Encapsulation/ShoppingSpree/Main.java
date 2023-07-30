package OOP.Encapsulation.ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line;
        List<Person> people = new ArrayList<>();
        List<Product> products = new ArrayList<>();

        while (true) {
            line = scanner.nextLine();
            if (line.equals("END")) {
                break;
            }

            String[] parts = line.split("\\s+");
            String name = parts[0];
            double money = Double.parseDouble(parts[1]);

            try {
                Person person = new Person(name, money);
                people.add(person);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                return;
            }
        }

        while (true) {
            line = scanner.nextLine();
            if (line.equals("END")) {
                break;
            }

            String[] parts = line.split("\\s+");
            String personName = parts[0];
            String productName = parts[1];

            Person person = findPersonByName(people, personName);
            Product product = findProductByName(products, productName);

            double cost = Double.parseDouble(parts[2]);

            try {
                Product newProduct = new Product(productName, cost);
                person.buyProduct(newProduct);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                return;
            }
        }

        for (Person person : people) {
            System.out.print(person.getName() + " - ");
            if (person.getProducts().isEmpty()) {
                System.out.println("Nothing bought");
            } else {
                List<Product> bag = person.getProducts();
                for (int i = 0; i < bag.size(); i++) {
                    System.out.print(bag.get(i).getName());
                    if (i < bag.size() - 1) {
                        System.out.print(", ");
                    } else {
                        System.out.println();
                    }
                }
            }
        }
    }

    private static Person findPersonByName(List<Person> people, String name) {
        for (Person person : people) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    private static Product findProductByName(List<Product> products, String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        Product newProduct = new Product(name, 0);
        products.add(newProduct);
        return newProduct;
    }
}
