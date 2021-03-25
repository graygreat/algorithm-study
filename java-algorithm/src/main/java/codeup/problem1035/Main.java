package codeup.problem1035;

import java.util.Scanner;

public class Main {
    static void solution() {
        Scanner scanner = new Scanner(System.in);
        String octalNum = scanner.next();
        int num = Integer.parseInt(octalNum, 16);
        System.out.printf("%o", num);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }
}
