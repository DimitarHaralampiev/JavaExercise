package Generics.GenericCountMethodDoubles;

import Generics.GenericCountMethodStrings.GenericCountMethodStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());

        List<Integer> generic = new ArrayList<>();
        for (int i = 0; i <= size; i++){
            generic.add(Integer.parseInt(scanner.nextLine()));
        }

        int elementToCompare = Integer.parseInt(scanner.nextLine());
        GenericCountMethodStrings<Integer> elementsList = new GenericCountMethodStrings<>(elementToCompare);

        int countGreaterThanElement = elementsList.counterGreaterThan(generic, elementToCompare);
        System.out.println(countGreaterThanElement);
    }
}
