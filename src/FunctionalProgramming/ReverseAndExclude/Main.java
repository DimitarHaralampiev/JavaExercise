package FunctionalProgramming.ReverseAndExclude;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");

        List<Integer> listNums = new ArrayList<>();
        for (var num : array){
            listNums.add(Integer.parseInt(num));
        }

        var div = scanner.nextInt();

        listNums.removeIf((x) -> x % div == 0);

        Collections.reverse(listNums);
        listNums.forEach(x -> System.out.print(x + " "));
    }
}
