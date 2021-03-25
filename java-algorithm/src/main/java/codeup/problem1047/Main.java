package codeup.problem1047;

import java.util.Scanner;

public class Main {
    static void solution() {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        System.out.printf("%d\n", num << 1);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }
}
