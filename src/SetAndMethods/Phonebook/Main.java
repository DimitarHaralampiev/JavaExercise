package SetAndMethods.Phonebook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phonebook = new HashMap<>();

        var map = fillHashMap(phonebook, scanner);
        checkPhonebook(map, scanner);
    }

    private static Map<String, String> fillHashMap(Map<String, String> phonebook, Scanner scanner){
        while (true){
            String[] nameAndPhone = scanner.nextLine().split("-");
            String name = nameAndPhone[0];

            if (name.equals("search")){
                break;
            }

            phonebook.put(name, nameAndPhone[1]);
        }

        return phonebook;
    }

    private static void checkPhonebook(Map<String, String> phonebook, Scanner scanner){
        while (true){
            String name = scanner.nextLine();

            if (name.equals("Stop")){
                break;
            }

            if (phonebook.containsKey(name)) {
                System.out.println(phonebook.keySet() + " -> " + phonebook.values());
            } else {
                System.out.println("Contact " + name + " does not exist.");
            }
        }
    }
}
