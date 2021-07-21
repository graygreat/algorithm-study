package 이것이코딩테스트다.dp.바닥_공사;

import java.util.Scanner;

public class Main {

    private static int[] d = new int[1001];

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solution());
    }

    public int solution() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        d[1] = 1;
        d[2] = 3;

        for (int i = 3; i <= n; i++) {
            d[i] = (d[i - 1] + (2 * d[i - 2])) % 796796;
        }

        return d[n];
    }
}
