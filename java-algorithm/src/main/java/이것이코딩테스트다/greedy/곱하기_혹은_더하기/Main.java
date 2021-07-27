package 이것이코딩테스트다.greedy.곱하기_혹은_더하기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solution());
    }

    public long solution() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        long answer = 0;

        for (char c : s.toCharArray()) {
            int num = c - '0';
            if (num <= 1 || answer <= 1) {
                answer += num;
            } else {
                answer *= num;
            }
        }
        return answer;
    }
}
