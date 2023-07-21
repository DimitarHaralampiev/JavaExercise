package Array.ZigZagArray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        printTwoArrays(size);
    }

    private static void printTwoArrays(int size){
        String[] arrayOne = new String[size];
        String[] arrayTwo = new String[size];

        for(int i = 0; i < size; i++){
            Scanner scanner1 = new Scanner(System.in);
            String array = scanner1.nextLine();

            String[] arr = array.split(" ");

            if(i % 2 == 0) {
                arrayOne[i] = arr[1];
                arrayTwo[i] = arr[0];
            } else {
                arrayTwo[i] = arr[0];
                arrayOne[i] = arr[1];
            }
        }
        System.out.println(Arrays.toString(arrayOne));
        System.out.println(Arrays.toString(arrayTwo));
    }
}
