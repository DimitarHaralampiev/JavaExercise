package StackAndQueue.MaximumElement;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var size = Integer.parseInt(scanner.nextLine());

        var stack = new Stack<Integer>();

        processStackCommands(stack, size, scanner);
    }

    private static void processStackCommands(Stack<Integer> stack, int size, Scanner scanner){
        for (int i = 0; i < size; i++){
            String[] command = scanner.nextLine().split(" ");
            String cmd = command[0];

            if (cmd.equals("1")){
                int num = Integer.parseInt(command[1]);
                stack.push(num);
            } else if (cmd.equals("2")) {
                stack.pop();
            } else if (cmd.equals("3")) {
                maxElement(stack);
            }
        }
    }

    private static void maxElement(Stack<Integer> stack){
        int temp = 0;
        for (int j = 0; j < stack.size(); j++){
            if (temp < stack.get(j)){
                temp = stack.get(j);
            }
        }
        print(temp);
    }

    private static void print(int num){
        System.out.print(num);
    }
}
