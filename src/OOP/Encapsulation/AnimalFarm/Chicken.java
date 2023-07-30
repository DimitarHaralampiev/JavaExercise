package OOP.Encapsulation.AnimalFarm;

public class Chicken {

    private static final int minAge = 0;
    private static final int maxAge = 15;

    private String name;
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    public double productPerDay(){
        return calculateProductPerDay();
    }

    private double calculateProductPerDay(){
        if (getAge() <= 5){
            return 5.00;
        } else if (getAge() <= 11 && getAge() > 5) {
            return 1.00;
        }
        return 0.75;
    }

    @Override
    public String toString() {
        return "Chicken " + name + " (" + age + ") can produce " + productPerDay() + " eggs per day.";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.equals(" ")){
            throw  new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (minAge > age || maxAge <age){
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }
}
