package Generics.GenericSwapMethodStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(String.valueOf(scanner.nextLine()));

        List<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++){
            String text = scanner.nextLine();
            list.add(String.valueOf(new GenericSwapMethodStrings<>(text)));
        }

        String[] array = scanner.nextLine().split(" ");
        int indexOne = Integer.parseInt(array[0]);
        int indexTwo = Integer.parseInt(array[1]);

        swapElements(list, indexOne, indexTwo);

        for (String swap : list){
            System.out.println(swap);
        }
    }

    public static <T> void swapElements(List<T> extendClass, int indexOne, int indexTwo){

        if (indexOne > extendClass.size() || indexTwo > extendClass.size()){
            System.out.println("Invalid indexes");
        }

        T temp = extendClass.get(indexOne);
        extendClass.set(indexOne, extendClass.get(indexTwo));
        extendClass.set(indexTwo, temp);
    }
}
