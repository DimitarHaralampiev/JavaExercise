package Mthods.CharacterInRange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        char first = a.charAt(0);
        char second = b.charAt(0);

        charInRange(first, second);
    }

    public static void charInRange(char startChar, char endChar){

        for(char ch = (char) (startChar+1); ch < endChar; ch++){
            System.out.print(ch);
        }
    }
}
