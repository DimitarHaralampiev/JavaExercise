package OOP.Inheritance.Restaurant;

import java.math.BigDecimal;

public class Cake extends Dessert{

    public Cake(String name) {
        super(name, BigDecimal.valueOf(5), 250, 1000);
    }
}
