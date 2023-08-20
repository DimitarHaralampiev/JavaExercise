package BasicAlgorithms.RecursiveFactorial;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var number = scanner.nextInt();

        System.out.println(recursiveFactorial(number));
    }

    private static int recursiveFactorial(int num){
        if (num == 1){
            return 1;
        }

        return num * recursiveFactorial(num - 1);
    }
}
