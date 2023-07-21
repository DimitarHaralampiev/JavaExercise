package Array.ReverseArray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
    }

    private static void reverse(int[] array){

        int[] arr = new int[array.length];

        System.out.println("Array = " + Arrays.toString(array));
        for(int i = array.length - 1; i >= 0; i--){
            arr[array.length - 1 - i] = array[i];
        }
        System.out.println("Reversed array = " + Arrays.toString(arr));
    }
}
