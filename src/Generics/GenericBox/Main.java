package Generics.GenericBox;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(String.valueOf(scanner.nextInt()));

        for (int i = 0; i < size; i++){
            String text = scanner.nextLine();
            GenericBox<String> genericBox = new GenericBox<>(text);
            System.out.println(genericBox);
        }
    }
}
