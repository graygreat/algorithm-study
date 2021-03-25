package codeup.problem1042;

import java.util.Scanner;

public class Main {
    static void solution() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("%d\n", a / b);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }
}
