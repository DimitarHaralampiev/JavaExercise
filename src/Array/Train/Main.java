package Array.Train;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        int sum = 0;
        for(int i = 0; i < size; i++){
            int wagonPeople = scanner.nextInt();
            sum += wagonPeople;
            array[i] = wagonPeople;
        }

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
