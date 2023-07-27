package OOP.Abstraction.CardRank;

import java.util.Scanner;

public class Main {

    enum CardRank { ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        System.out.println(text + ":");
        for (CardRank card : CardRank.values()){
            System.out.println("Ordinal values: " + card.ordinal() + "; " + "Name value: " + card);
        }
    }
}
