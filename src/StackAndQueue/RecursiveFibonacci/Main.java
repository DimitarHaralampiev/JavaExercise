package StackAndQueue.RecursiveFibonacci;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.print(recursiveFibonacci(num));
    }

    private static int recursiveFibonacci(int num){
        if (num == 0 || num == 1){
            return 1;
        }

        return recursiveFibonacci(num - 1) + recursiveFibonacci(num - 2);
    }
}
