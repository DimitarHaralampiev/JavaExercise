package SetAndMethods.FixEmails;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> nameAndEmail = collectValidEmail(scanner);

        nameAndEmail.forEach((name, email) -> {
            System.out.println(name + " -> " + email);
        });
    }

    private static Map<String, String> collectValidEmail(Scanner scanner){
        Map<String, String> nameAndEmail = new HashMap<>();

        while (true){
            String name = scanner.nextLine();

            if (name.equals("stop")){
                break;
            }

            String email = scanner.nextLine();

            if (!email.endsWith("com") ||
                    !email.endsWith("uk") ||
                    !email.endsWith("us")){
                nameAndEmail.put(name, email);
            }
        }

        return nameAndEmail;
    }
}
