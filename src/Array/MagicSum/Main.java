package Array.MagicSum;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        String array = scanner.nextLine();
        int number = scanner1.nextInt();

        String[] arrayNumber = array.split(" ");
        findPairsWithSum(arrayNumber, number);
    }

    public static void findPairsWithSum(String[] arrayNumber, int number) {

        for(int i = 0; i < arrayNumber.length; i++){
            int numberOne = Integer.parseInt(arrayNumber[i]);
            for(int j = i + 1; j < arrayNumber.length; j++){
                int numberTwo = Integer.parseInt(arrayNumber[j]);
                int total = numberOne + numberTwo;
                if(total == number){
                    System.out.println(arrayNumber[i] + " " + arrayNumber[j]);
                }
            }
        }
    }
}
