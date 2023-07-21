package Mthods.PasswordValidator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        System.out.print(passwordValidator(text));
    }

    public static String passwordValidator(String text){

        boolean hasDigit = false;
        boolean hasLetter = false;
        String txt = "";
        String regex = ".*\\d{3,}.*";

        for(char ch : text.toCharArray()) {
            if(Character.isDigit(ch)){
                hasDigit = true;
            }

            if(Character.isLetter(ch)){
                hasLetter = true;
            }
        }

        if(!hasDigit && hasLetter) {
            txt += "Password must consist only of letters and digits";
        }

        if (text.length() < 6 && text.length() > 10) {
            txt += "Password must be between 6 and 10 characters";
        }

        if (regex.matches(text)) {
            txt += "Password is valid";
        } else {
            txt += "Password must have at least 2 digits";
        }

        return txt;
    }
}
