package FunctionalProgramming.CustomComparator;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var array = scanner.nextLine().split(" ");

        Integer[] numbers = new Integer[array.length];
        for (int i = 0; i < array.length; i++){
            numbers[i] = Integer.parseInt(array[i]);
        }

        Comparator<Integer> comparator = (num1, num2) -> {
            if (num1 % 2 == 0 && num2 % 2 == 1){
                return -1;
            } else if (num2 % 2 == 0 && num1 % 2 == 1) {
                return 1;
            } else {
                return num1.compareTo(num2);
            }
        };

        Arrays.sort(numbers, comparator);
        System.out.print(Arrays.toString(numbers));
    }
}
