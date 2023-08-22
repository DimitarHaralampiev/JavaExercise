package FunctionalProgramming.KnightsOfHonor;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = List.of(scanner.nextLine().split(" "));

        Consumer<String> printSir = (name) -> System.out.println("Sir " + name);
        names.forEach(printSir);
    }
}
