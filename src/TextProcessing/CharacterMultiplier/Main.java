package TextProcessing.CharacterMultiplier;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var text = scanner.nextLine().split(" ");

        System.out.println(totalSumChars(text[0], text[1]));
    }

    private static int totalSumChars(String str1, String str2){
        int sum = 0;
        int minLength = Math.min(str1.length(), str2.length());

        for (int i = 0; i < minLength; i++) {
            sum += str1.charAt(i) * str2.charAt(i);
        }

        if (str1.length() > minLength) {
            for (int i = minLength; i < str1.length(); i++) {
                sum += str1.charAt(i);
            }
        }

        if (str2.length() > minLength) {
            for (int i = minLength; i < str2.length(); i++) {
                sum += str2.charAt(i);
            }
        }

        return sum;
    }
}
