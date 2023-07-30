package OOP.Encapsulation.PizzaCalories;

public class Topping {

    private static final double Meat = 1.2;
    private static final double Veggies = 0.8;
    private static final double Cheese = 1.1;
    private static final double Sauce = 0.9;

    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    public double calculateCalories() {
        double caloriesPerGrams = 2;
        double modifier = 1.0;

        if (toppingType.equals("Meat")){
            weight = Meat;
        } else if (toppingType.equals("Veggies")) {
            weight = Veggies;
        } else if (toppingType.equals("Cheese")) {
            weight = Cheese;
        } else if (toppingType.equals("Sauce")) {
            weight = Sauce;
        }

        return weight * caloriesPerGrams * modifier;
    }

    public void setToppingType(String toppingType) {
        if (!toppingType.equals("Meat") && !toppingType.equals("Veggies")
                && !toppingType.equals("Cheese") && !toppingType.equals("Sauce")){
            throw new IllegalArgumentException("Cannot place" + toppingType + "on top of your pizza.");
        }
        this.toppingType = toppingType;
    }

    public void setWeight(double weight) {
        if (weight < 1 || weight > 50){
            throw new IllegalArgumentException(toppingType + " weight should be in the range [1..50].");
        }
        this.weight = weight;
    }
}
