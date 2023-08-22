package FunctionalProgramming.PredicateForNames;

import java.util.Scanner;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthName = Integer.parseInt(scanner.nextLine());
        String[] names = scanner.nextLine().split(" ");

        Predicate<String> isValid = (x) -> x.length() >= lengthName;

        for (var name : names){
            if (isValid.test(name)){
                System.out.println(name);
            }
        }
    }
}
