package ObjectsAndClasses.OpinionPoll;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<OpinionPoll> opinionPolls = new ArrayList<>();
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < size; i++){
            String[] nameAge = scanner1.nextLine().split(" ");

            String name = nameAge[0];
            int age = Integer.parseInt(nameAge[1]);

            if (age >= 30){
                opinionPolls.add(count, new OpinionPoll(name, age));
                count++;
            }
        }

        for (OpinionPoll obj : opinionPolls){
            System.out.println(obj);
        }
    }
}
