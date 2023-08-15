package StackAndQueue.BalancedParentheses;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var text = scanner.nextLine();

        if (text.length() % 2 == 0 && text.length() > 1 && text.length() <= 1000){
            if (isBalanced(text)){
                System.out.print("YES");
            } else {
                System.out.print("NO");
            }
        }
    }

    private static boolean isBalanced(String sequence) {
        Stack<Character> stack = new Stack<>();

        for (char ch : sequence.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return true;
    }
}
