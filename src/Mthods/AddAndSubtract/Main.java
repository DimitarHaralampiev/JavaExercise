package Mthods.AddAndSubtract;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(addAndSubtract(a, b, c));
    }

    public static int addAndSubtract(int a, int b, int c){

        return (a + b) - c;
    }
}
