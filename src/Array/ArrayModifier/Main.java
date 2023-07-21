package Array.ArrayModifier;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        String arrayNumber = scanner1.nextLine();
        String[] number = arrayNumber.split(" ");

        while (true){
            String command = scanner.nextLine();
            String[] cmd = command.split(" ");

            if(cmd[0].equals("end")){
                break;
            }

            if(cmd[0].equals("swap")){
                int indexOne = Integer.parseInt(cmd[1]);
                int indexTwo = Integer.parseInt(cmd[2]);
                String temp = number[indexOne];
                number[indexOne] = number[indexTwo];
                number[indexTwo] = temp;
            } else if(cmd[0].equals("multiply")){
                int indexOne = Integer.parseInt(cmd[1]);
                int indexTwo = Integer.parseInt(cmd[2]);
                int parseNumOne = Integer.parseInt(number[indexOne]);
                int parseNumTwo = Integer.parseInt(number[indexTwo]);
                int total = parseNumOne * parseNumTwo;
                number[indexOne] = String.valueOf(total);
            } else if(cmd[0].equals("decrease")){
                for(int i = 0; i < number.length; i++){
                    int decrease = Integer.parseInt(number[i]);
                    number[i] = String.valueOf(decrease - 1);
                }
            }
        }
        System.out.println(Arrays.toString(number));
    }
}
