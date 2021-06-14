package 백준.코딩_테스트_준비_기초.수학._2_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }

    public void solution() {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int result = 0;

            for (int i = 1; ; i++) {
                result = result * 10 + 1;
                result %= n;
                if (result == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
