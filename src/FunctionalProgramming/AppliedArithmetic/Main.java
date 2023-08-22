package FunctionalProgramming.AppliedArithmetic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Stream.of(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<Integer, Integer> addFunction = num -> num + 1;
        Function<Integer, Integer> multiplyFunction = num -> num * 2;
        Function<Integer, Integer> subtractFunction = num -> num - 1;

        String command = scanner.nextLine();
        while (!command.equals("end")){
            switch (command){
                case "add" :
                    numbers = numbers.stream().map(addFunction).collect(Collectors.toList());
                    break;
                case "multiply":
                    numbers = numbers.stream().map(multiplyFunction).collect(Collectors.toList());
                    break;
                case "subtract":
                    numbers = numbers.stream().map(subtractFunction).collect(Collectors.toList());
                    break;
                case "print":
                    numbers.forEach(System.out::print);
                    break;
            }

            command = scanner.nextLine();
        }
    }
}
