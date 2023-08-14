package TextProcessing.CaesarCipher;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String replacedText = "";

        for (int i = 0; i < text.length() - 1; i++){
            char ch = (char) (text.charAt(i) + 3);
            replacedText += ch;
        }

        System.out.println(replacedText);
    }
}
