package OOP.Interface.FoodShortage;

import OOP.Interface.FoodShortage.Classes.Citizen;
import OOP.Interface.FoodShortage.Classes.Rebel;
import OOP.Interface.FoodShortage.Interfaces.Buyer;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Buyer> buyers = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);

            if (tokens.length == 4) {
                String id = tokens[2];
                String birthdate = tokens[3];
                buyers.put(name, new Citizen(name, age, id, birthdate));
            } else if (tokens.length == 3) {
                String group = tokens[2];
                buyers.put(name, new Rebel(name, age, group));
            }
        }

        while (true) {
            String name = scanner.nextLine();

            if (name.equals("End")){
                break;
            }

            if (buyers.containsKey(name)) {
                buyers.get(name).buyFood();
            }
        }

        int totalFood = buyers.values().stream().mapToInt(Buyer::getFood).sum();
        System.out.println(totalFood);
    }
}
