package 이것이코딩테스트다.greedy.볼링공_고르기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solution());
    }

    public int solution() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] array = new int[n];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n; j++) {
                if (i == j || array[i] == array[j]) {
                    continue;
                }
                answer += 1;
            }
        }

        return answer;
    }
}
