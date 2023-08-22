package FunctionalProgramming.ConsumerPrint;

import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = List.of(scanner.nextLine().split(" "));

        Consumer<String> print = System.out::println;
        names.forEach(print);
    }
}
