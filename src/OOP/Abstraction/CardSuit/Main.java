package OOP.Abstraction.CardSuit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        System.out.println(text + ":");
        for (CardSuit card : CardSuit.values()){
            System.out.println("Ordinal values: " + card.ordinal() + "; " + "Name value: " + card);
        }
    }
}
