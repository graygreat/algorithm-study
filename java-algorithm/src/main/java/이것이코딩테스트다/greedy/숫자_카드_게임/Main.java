package 이것이코딩테스트다.greedy.숫자_카드_게임;

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
        int result = 0;

        for (int i = 0; i < n; i++) {
            int minValue = 10001;
            for (int j = 0; j < m; j++) {
                int num = scanner.nextInt();
                minValue = Math.min(minValue, num);
            }
            result = Math.max(minValue, result);
        }
        return result;
    }
}
