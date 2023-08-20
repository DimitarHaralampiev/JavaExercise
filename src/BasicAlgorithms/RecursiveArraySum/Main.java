package BasicAlgorithms.RecursiveArraySum;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the integer array elements separated by spaces: ");
        String input = scanner.nextLine();
        String[] inputArr = input.split(" ");
        int[] arr = new int[inputArr.length];

        for (int i = 0; i < inputArr.length; i++) {
            arr[i] = Integer.parseInt(inputArr[i]);
        }

        int sum = arraySum(arr, 0);
        System.out.println("Sum of array elements: " + sum);

    }

    private static int arraySum(int[] arrNum, int index){
        if (index == arrNum.length) {
            return 0;
        }
        return arrNum[index] + arraySum(arrNum, index + 1);
    }
}
