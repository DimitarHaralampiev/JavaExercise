package Array.CommonElements;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        String str2 = scanner2.nextLine();

        compare(str, str2);
    }

    private static void compare(String arr, String arr2){
        String[] str = arr.split(" ");
        String[] str2 = arr2.split(" ");

        for(int i = 0; i < str.length; i++){
            for(int j = 0; j < str2.length; j++){
                if(str[i].equals(str2[j])){
                    System.out.print(str[i] + " ");
                }
            }
        }
    }
}
