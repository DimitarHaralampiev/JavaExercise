package Generics.CustomList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CustomList<String> customList = new CustomList<>();

        while (true){
            String[] array = scanner.nextLine().split(" ");
            String cmd = array[0];

            if (cmd.equals("END")){
                break;
            }

            if (cmd.equals("Add")){
                String element = array[1];
                customList.add(element);
            } else if (cmd.equals("Remove")) {
                int index = Integer.parseInt(array[1]);
                customList.remove(index);
            } else if (cmd.equals("Contains")) {
                String element = array[1];
                System.out.println(customList.contains(element));
            } else if (cmd.equals("Swap")) {
                int indexOne = Integer.parseInt(array[1]);
                int indexTwo = Integer.parseInt(array[2]);
                customList.swap(indexOne, indexTwo);
            } else if (cmd.equals("Greater")) {
                String element = array[1];
                System.out.println(customList.getGreaterThan(element));
            } else if (cmd.equals("Max")) {
                System.out.println(customList.getMax());
            } else if (cmd.equals("Min")) {
                System.out.println(customList.getMin());
            } else {
                customList.print();
            }
        }
    }
}
