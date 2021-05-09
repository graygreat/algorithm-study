package 백준.주유소;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solution());
    }

    public long solution() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] distances = new long[n - 1];
        long[] prices = new long[n];
        long answer = 0;

        for (int i = 0; i < n - 1; i++) {
            distances[i] = scanner.nextLong();
        }
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextLong();
        }

        answer += distances[0] * prices[0];

        for (int i = 1; i < n - 1; i++) {
            if (prices[i - 1] < prices[i]) {
                prices[i] = prices[i - 1];
            }
            answer += distances[i] * prices[i];

        }
        return answer;
    }
}
