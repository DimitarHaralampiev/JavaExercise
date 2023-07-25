package Generics.GenericBoxOfInteger;

import Generics.GenericBox.GenericBox;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++){
            int text = scanner.nextInt();
            GenericBox<Integer> genericBox = new GenericBox<>(text);
            System.out.println(genericBox);
        }
    }
}
