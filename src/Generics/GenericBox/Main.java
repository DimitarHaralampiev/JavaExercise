package Generics.GenericBox;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);

        for (int i = 0; i < size; i++){
            String text = scanner1.nextLine();
            GenericBox<String> genericBox = new GenericBox<>(text);
            System.out.println(genericBox);
        }
    }
}
