package 이것이코딩테스트다.greedy._1일_될_때까지;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solution());
    }

    public int solution() {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int count = 0;

        while (n != 1) {
            if (n % k == 0) {
                n /= k;
            } else {
                n -= 1;
            }
            count++;
        }
        return count;
    }
}
