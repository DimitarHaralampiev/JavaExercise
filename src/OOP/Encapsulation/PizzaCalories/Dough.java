package OOP.Encapsulation.PizzaCalories;

public class Dough {

    private static final double White = 1.5;
    private static final double Wholegrain = 1.0;
    private static final double Crispy = 0.9;
    private static final double Chewy = 1.1;
    private static final double Homemade = 1.0;

    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    public double calculateCalories(){
        double caloriesPerGrams = 2;
        double modifier = 1.0;

        if (flourType.equals("White")){
            weight = White;
        } else if (flourType.equals("Wholegrain")) {
            weight = Wholegrain;
        } else if (flourType.equals("Crispy")) {
            weight = Crispy;
        } else if (flourType.equals("Chewy")) {
            weight = Chewy;
        } else if (flourType.equals("Homemade")) {
            weight = Homemade;
        }

        return weight * caloriesPerGrams * modifier;
    }

    public void setFlourType(String flourType) {
        if (!flourType.equals("White") && !flourType.equals("Wholegrain") &&
                !flourType.equals("Crispy") && !flourType.equals("Chewy") && !flourType.equals("Homemade")){
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.flourType = flourType;
    }

    public void setBakingTechnique(String bakingTechnique) {
        this.bakingTechnique = bakingTechnique;
    }

    public void setWeight(double weight) {
        if (weight < 1 || weight > 200){
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }
}
