package 이것이코딩테스트다.greedy.큰_수의_법칙;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solution());
    }
    public int solution() {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        int[] dataSet = new int[n];
        for (int i = 0; i < n; i++) {
            dataSet[i] = scanner.nextInt();
        }
        Arrays.sort(dataSet);
        int firstValue = dataSet[n - 1];
        int secondValue = dataSet[n - 2];
        int answer = 0;
        int count = k;

        for (int i = 0; i < m; i++) {
            if (count == 0) {
                answer += secondValue;
                count = k;
            } else {
                answer += firstValue;
                count--;
            }
        }
        return answer;
    }
}
