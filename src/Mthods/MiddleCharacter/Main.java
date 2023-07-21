package Mthods.MiddleCharacter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        middleCharacter(text);

    }

    public static void middleCharacter(String text){

        char[] chArray = text.toCharArray();
        int midSize = text.length() / 2;

        if(text.length() % 2 != 0){
            for(int i = midSize; i < midSize + 1; i++){
                System.out.print(chArray[i]);
            }
        } else {
            for(int i = midSize - 1; i < midSize + 1; i++){
                System.out.print(chArray[i]);
            }
        }
    }
}
