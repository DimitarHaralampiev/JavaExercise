package List.Train;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> wagons = new ArrayList<>();
        String[] initialWagons = scanner.nextLine().split(" ");

        for (String wagon : initialWagons) {
            wagons.add(Integer.parseInt(wagon));
        }

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            String[] command = input.split(" ");

            if (command[0].equals("Add")) {
                int passengers = Integer.parseInt(command[1]);
                if (passengers <= maxCapacity) {
                    wagons.add(passengers);
                }
            } else {
                int passengers = Integer.parseInt(command[0]);

                for (int i = 0; i < wagons.size(); i++) {
                    int currentWagonCapacity = wagons.get(i);
                    if (currentWagonCapacity + passengers <= maxCapacity) {
                        wagons.set(i, currentWagonCapacity + passengers);
                        break;
                    }
                }
            }
        }

        for (Integer wagon : wagons) {
            System.out.print(wagon + " ");
        }
    }
}
