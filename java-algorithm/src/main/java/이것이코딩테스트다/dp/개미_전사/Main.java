package 이것이코딩테스트다.dp.개미_전사;

import java.util.Scanner;

public class Main {

    private static int[] d = new int[101];

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solution());
    }

    public int solution() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] foods = new int[n];

        for (int i = 0; i < n; i++) {
            foods[i] = scanner.nextInt();
        }

        d[0] = foods[0];
        d[1] = Math.max(foods[0], foods[1]);
        for (int i = 2; i < n; i++) {
            d[i] = Math.max(d[i - 1], d[i - 2] + foods[i]);
        }
        return d[n - 1];
    }
}
