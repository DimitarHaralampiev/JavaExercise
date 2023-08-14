package StackAndQueue.ReverseNumbersWithStack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var arrNum = scanner.nextLine().split(" ");

        var deq = fillDeq(arrNum);
        printPoolDeq(deq);
    }

    private static Deque<Integer> fillDeq(String[] arrNum){
        Deque<Integer> deq = new ArrayDeque<>();

        for (int i = 0; i < arrNum.length; i++){
            deq.add(Integer.valueOf(arrNum[i]));
        }

        return deq;
    }

    private static void printPoolDeq(Deque<Integer> deq){
        while (!deq.isEmpty()){
            System.out.print(deq.pollLast() + " ");
        }
    }
}
