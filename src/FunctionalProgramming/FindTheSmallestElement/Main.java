package FunctionalProgramming.FindTheSmallestElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var array = scanner.nextLine().split(" ");

        List<Integer> numbers = new ArrayList<>();
        for (var num : array){
            numbers.add(Integer.parseInt(num));
        }

        Function<List<Integer>, Integer> minNum = (x) -> {
            var temp = Integer.MAX_VALUE;
            for (var min : x){
                if (min < temp){
                    temp = min;
                }
            }
            return numbers.indexOf(temp);
        };

        var minIndex = minNum.apply(numbers);
        System.out.print(minIndex);
    }
}
