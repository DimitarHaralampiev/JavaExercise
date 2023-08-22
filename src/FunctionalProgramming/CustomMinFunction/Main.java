package FunctionalProgramming.CustomMinFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var numsArray = scanner.nextLine().split(" ");

        Integer[] numbers = new Integer[numsArray.length];
        for (int i = 0; i < numsArray.length; i++){
            numbers[i] = Integer.parseInt(numsArray[i]);
        }

        Function<Integer[], Integer> minNum = (nums) -> {
            var temp = nums[0];
            for (var num : nums){
                if (num < temp){
                    temp = num;
                }
            }
            return temp;
        };

        var smallestNum = minNum.apply(numbers);
        System.out.println(smallestNum);
    }
}
