package Array.MaxSequenceOfEqualElements;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String textNumber  = scanner.nextLine();

        int[] number = longestArray(textNumber);
        printLongestArray(number[0], number[1]);
    }

    private static int[] longestArray(String array){

        int temp = 0;
        int[] returnInt = new int[2];
        String[] arraySplit = array.split(" ");

        for(int i = 0; i < arraySplit.length; i++){
            int count = 0;
            for(int j = i + 1; j < arraySplit.length; j++){
                if(arraySplit[i].equals(arraySplit[j])){
                    count++;
                } else {
                    break;
                }
            }
            if(count > temp){
                temp = count;
                returnInt[0] = Integer.parseInt(arraySplit[i]);
            }
        }
        returnInt[1] = temp;
        return returnInt;
    }

    private static void printLongestArray(int number, int temp){

        for(int i = 0; i <= temp; i++){
            System.out.print(number + " ");
        }
    }
}
