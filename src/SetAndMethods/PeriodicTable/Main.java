package SetAndMethods.PeriodicTable;

import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var size = Integer.parseInt(scanner.nextLine());

        var set = new HashSet<>();

        for (int i = 0; i < size; i++){
            set.addAll(List.of(scanner.nextLine().split(" ")));
        }

        set.forEach(System.out::println);
    }
}
