package Mthods.FactorialDivision;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();

        System.out.printf("%.2f", factorialDivision(firstNum, secondNum));
    }

    public static double factorialDivision(int firstNum, int secondNum){

        if(firstNum < 1 || secondNum < 1){
            return 1;
        }

        double firstSum = 1.0d;
        for(int i = firstNum; i > 1; i--){
            firstSum *= i;
        }

        double secondSum = 1.0d;
        for(int i = secondNum; i > 1; i--){
            secondSum *= i;
        }

        return firstSum / secondSum;
    }
}
