package hackerrank.java_stack;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String input = scanner.next();

            System.out.println(isBalanced(input));
        }
    }

    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack();

        for (char c : input.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    Character pop = stack.pop();
                    if ((c == ')' && pop == '(')
                            || (c == ']' && pop == '[')
                            || (c == '}' && pop == '{')) {
                        continue;
                    } else {
                        return false;
                    }
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
