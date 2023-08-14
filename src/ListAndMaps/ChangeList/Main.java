package ListAndMaps.ChangeList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] array = inputArray();

        List<Integer> listIntegers = fillList(array);
        listIntegers = changeList((ArrayList<Integer>) listIntegers);
        printArray(listIntegers);
    }

    public static String[] inputArray(){

        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        return array;
    }

    public static List<Integer> changeList(ArrayList<Integer> listIntegers) {

        while (true) {

            String[] command = inputArray();
            String cmd = command[0];

            if (cmd.equals("end")) {
                break;
            }

            int firstNum = Integer.parseInt(command[1]);

            if (cmd.equals("Delete")) {
                listIntegers.removeAll(Collections.singleton(firstNum));
            } else if (cmd.equals("Insert")) {
                int secondNum = Integer.parseInt(command[2]);
                listIntegers.add(secondNum, firstNum);
            }
        }
        return listIntegers;
    }

    public static List<Integer> fillList(String[] array){

        List<Integer> listIntegers = new ArrayList<>();

        for (String number : array) {
            listIntegers.add(Integer.parseInt(number));
        }

        return listIntegers;
    }

    public static void printArray(List<Integer> listIntegers){

        for (int number : listIntegers) {
            System.out.print(number + " ");
        }
    }
}
