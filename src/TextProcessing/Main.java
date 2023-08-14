package TextProcessing;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user names separated by commas: ");
        String userInput = scanner.nextLine();

        String[] usernames = userInput.split(", ");

        System.out.println("Valid Usernames:");
        printValidUserName(usernames);

    }

    private static boolean isValidUsername(String username) {
        if (username.length() >= 3 && username.length() <= 16) {
            Pattern pattern = Pattern.compile("^[a-zA-Z0-9_-]+$");
            Matcher matcher = pattern.matcher(username);
            return matcher.matches();
        }
        return false;
    }

    private static void printValidUserName(String[] users){
        for (String username : users) {
            if (isValidUsername(username)) {
                System.out.println(username);
            }
        }
    }
}
