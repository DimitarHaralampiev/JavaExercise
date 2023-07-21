package Mthods.VowelsCount;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};

        System.out.println(vowelsCount(text, vowels));
    }

    public static int vowelsCount(String text, char[] vowels){

        char[] charArray = text.toLowerCase().toCharArray();
        int count = 0;

        for(char vowel : vowels){
            for(char ch : charArray){
                if(ch == vowel){
                    count++;
                }
            }
        }
        return count;
    }
}
