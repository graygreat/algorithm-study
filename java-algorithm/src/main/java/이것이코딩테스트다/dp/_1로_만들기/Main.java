package 이것이코딩테스트다.dp._1로_만들기;

import java.util.Scanner;

public class Main {

    public static int[] d = new int[30001];

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solution());
    }

    public int solution() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        for (int i = 2; i <= x; i++) {
            d[i] = d[i - 1] + 1;

            if (i % 2 == 0) {
                d[i] = Math.min(d[i], d[i / 2] + 1);
            }
            if (i % 3 == 0) {
                d[i] = Math.min(d[i], d[i / 3] + 1);
            }
            if (i % 5 == 0) {
                d[i] = Math.min(d[i], d[i / 5] + 1);
            }
        }
        return d[x];
    }
}
