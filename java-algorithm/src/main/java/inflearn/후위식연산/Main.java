package inflearn.후위식연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        System.out.println(main.solution());
    }

    public int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputData = br.readLine();
        Stack<Integer> stack = new Stack<>();

        for (char data : inputData.toCharArray()) {
            if (Character.isDigit(data)) {
                stack.push(data - '0');
            } else {
                int a = stack.pop();
                int b = stack.pop();
                int value = 0;
                if (data == '+') {
                    value = b + a;
                } else if (data == '-') {
                    value = b - a;
                } else if (data == '*') {
                    value = b * a;
                } else if (data == '/') {
                    value = b / a;
                }
                stack.push(value);
            }
        }
        return stack.peek();
    }
}
