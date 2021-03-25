package codeup.problem1051;

import java.util.Scanner;

public class Main {
    static void solution() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a <= b) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }
}
