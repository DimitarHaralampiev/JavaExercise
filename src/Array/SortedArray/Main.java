package Array.SortedArray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int [] arr = getIntegers(5);
        printArray(arr);
        sortIntegers(arr);
        printArray(arr);
    }

    private static int[] getIntegers(int size){

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[size];
        for(int i = 0; i < size; i++){
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    private static int[] sortIntegers(int[] array) {

        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;

        while(flag) {
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++) {

                if (sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    private static void printArray(int[] arr){

        for(int i = 0; i < arr.length; i++){
            System.out.println("Element " + i + " contents " + arr[i]);
        }
    }
}
