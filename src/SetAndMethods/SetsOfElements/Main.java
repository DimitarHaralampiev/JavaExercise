package SetAndMethods.SetsOfElements;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var size = scanner.nextLine().split(" ");

        Set<Integer> firstSet = new HashSet<>();
        Set<Integer> secondSet = new HashSet<>();

        var first = fillSet(firstSet, Integer.parseInt(size[0]), scanner);
        var second = fillSet(secondSet, Integer.parseInt(size[1]), scanner);

        first.retainAll(second);
        System.out.println(firstSet);
    }

    private static Set<Integer> fillSet(Set<Integer> set, int size, Scanner scanner){
        for (int i = 0; i < size; i++){
            set.add(scanner.nextInt());
        }

        return set;
    }
}
