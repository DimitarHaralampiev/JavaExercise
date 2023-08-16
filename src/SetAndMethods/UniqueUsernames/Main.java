package SetAndMethods.UniqueUsernames;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());

        Set<String> setText = new HashSet<>();

        for (int i = 0; i < size; i++){
            String text = scanner.nextLine();
            setText.add(text);
        }

        setText.forEach(System.out::println);
    }
}
