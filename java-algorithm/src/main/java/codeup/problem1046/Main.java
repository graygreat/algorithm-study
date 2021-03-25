package codeup.problem1046;

import java.util.Scanner;

public class Main {
    static void solution() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int sum = a + b + c;
        System.out.printf("%d\n%.1f", sum, (float) sum / 3);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }
}
