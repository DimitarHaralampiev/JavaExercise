package TextProcessing.ReplaceRepeatingChars;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = removeDuplicateLetters(input);
        System.out.println("Modified String: " + result);
    }

    public static String removeDuplicateLetters(String input) {
        StringBuilder result = new StringBuilder();

        char prevChar = '\0';
        for (char currentChar : input.toCharArray()) {
            if (currentChar != prevChar) {
                result.append(currentChar);
                prevChar = currentChar;
            }
        }

        return result.toString();
    }
}
