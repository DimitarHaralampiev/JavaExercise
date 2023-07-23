package List.ListOperations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] array = inputArray();

        List<Integer> listIntegers = fillList(array);
        listIntegers = listOperations((ArrayList<Integer>) listIntegers);
        printArray(listIntegers);
    }

    public static String[] inputArray(){

        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        return array;
    }

    public static List<Integer> listOperations(ArrayList<Integer> listIntegers) {

        while (true) {

            String[] command = inputArray();
            String cmd = command[0];

            if (cmd.equals("end")) {
                break;
            }

            if (cmd.equals("Remove")) {
                int firstNum = Integer.parseInt(command[1]);
                listIntegers.remove(Integer.valueOf(firstNum));
            } else if (cmd.equals("Add")) {
                int firstNum = Integer.parseInt(command[1]);
                listIntegers.add(firstNum);
            } else if (cmd.equals("Shift")){
                int thirdNum = Integer.parseInt(command[2]);
                if (command[1].equals("left")){
                    int firstIndex = listIntegers.get(thirdNum);
                    listIntegers.add(thirdNum, listIntegers.get(0));
                    listIntegers.add(0, firstIndex);
                } else {
                    int lastIndex = listIntegers.get(0);
                    listIntegers.add(0, listIntegers.get(thirdNum));
                    listIntegers.add(lastIndex, lastIndex);
                }
            } else if (cmd.equals("Insert")) {
                int firstNum = Integer.parseInt(command[1]);
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
