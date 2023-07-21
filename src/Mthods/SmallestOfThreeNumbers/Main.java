package Mthods.SmallestOfThreeNumbers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(smallestOfThreeNumbers(a, b, c));
    }

    public static int smallestOfThreeNumbers(int a, int b, int c){

        int minAFromB = Math.min(a, b);
        return Math.min(minAFromB, c);
    }
}
