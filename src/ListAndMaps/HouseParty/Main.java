package ListAndMaps.HouseParty;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        List<String> names = checkAndUpdateNamesList(size);
        printArray(names);
    }

    public static List<String> checkAndUpdateNamesList(int size){

        Scanner scanner = new Scanner(System.in);
        List<String> arrayNames = new ArrayList<>();

        for (int i = 0; i < size; i++){

            String[] names = scanner.nextLine().split(" ");
            String name = names[0];

            if (names.length > 3){
                if (arrayNames.contains(name)){
                    arrayNames.remove(name);
                    continue;
                }
                System.out.println(name + " is not in the list!");
                continue;
            }

            if (arrayNames.contains(name)){
                System.out.println(name + " is already in the list!");
                continue;
            }
            arrayNames.add(name);
        }
        return arrayNames;
    }

    public static void printArray(List<String> arrayNames){

        for (String name : arrayNames){
            System.out.println(name);
        }
    }
}
