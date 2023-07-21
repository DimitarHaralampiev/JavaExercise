package Array.MinElement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size = readIntegers();
        int[] elements = readElements(size);
        int findMinElement = findMin(elements);
        System.out.println(findMinElement);
    }

    private static int readIntegers(){

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] readElements(int size){

        int[] array = new int[size];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array){

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
