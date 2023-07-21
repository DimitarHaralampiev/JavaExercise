package Basic;

import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        long average = 0;

        while (true){
            String nextEntry = scanner.nextLine();
            try {
                int validNum = Integer.parseInt(nextEntry);
                sum += validNum;
                count++;
            } catch (NumberFormatException nfe){
                break;
            }
        }

        if (count > 0){
            average = Math.round((double) sum / count);
        }
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}
