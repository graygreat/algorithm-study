package 이것이코딩테스트다.implementation.럭키_스트레이트;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solution());
    }

    public String solution() {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        int length = num.length();
        int sum = 0;

        for (int i = 0; i < length / 2; i++) {
            sum += num.charAt(i) - '0';
        }

        for (int i = length / 2; i < length; i++) {
            sum -= num.charAt(i) - '0';
            if (sum < 0) {
                return "READY";
            }
        }
        if (sum == 0) {
            return "LUCKY";
        } else {
            return "READY";
        }
    }
}
