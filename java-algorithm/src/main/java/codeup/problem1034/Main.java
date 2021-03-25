package codeup.problem1034;

import java.util.Scanner;

public class Main {
    static void solution() {
        Scanner scanner = new Scanner(System.in);
        String octalNum = scanner.next();
        int num = Integer.parseInt(octalNum, 8);
        System.out.printf("%d", num);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }
}
