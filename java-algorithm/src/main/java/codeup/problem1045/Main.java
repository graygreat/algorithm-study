package codeup.problem1045;

import java.util.Scanner;

public class Main {
    static void solution() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("%d\n%d\n%d\n%d\n%d\n%.2f\n", a + b, a - b, a * b, (int)a / b, a % b, (double)a / b);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }
}
