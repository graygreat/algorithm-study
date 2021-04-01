package 이것이코딩테스트다.greedy.곱하기_혹은_더하기;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solution());
    }

    private int solution() {
        String[] s = scanner.next().split("");
        int result = Integer.parseInt(s[0]);
        int number = 0;

        for (int i = 1; i < s.length; i++) {
            number = Integer.parseInt(s[i]);
            if (number <= 1 || result <= 1) {
                result += number;
            } else {
                result *= number;
            }
        }

        return result;
    }


}
