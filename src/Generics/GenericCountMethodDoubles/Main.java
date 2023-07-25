package Generics.GenericCountMethodDoubles;

import Generics.GenericCountMethodStrings.GenericCountMethodStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());

        List<Double> generic = new ArrayList<>();
        for (int i = 0; i < size; i++){
            generic.add(Double.parseDouble(scanner.nextLine()));
        }

        double elementToCompare = Double.parseDouble(scanner.nextLine());
        GenericCountMethodDoubles<Double> elementsList = new GenericCountMethodDoubles<>(elementToCompare);

        int countGreaterThanElement = elementsList.counterGreaterThan(generic, elementToCompare);
        System.out.println(countGreaterThanElement);
    }
}
