package codeup.problem1025;

import java.util.Scanner;

public class Main {
    static void solution() {
        Scanner scanner = new Scanner(System.in);
        int[] dividingNumber = {10000, 1000, 100, 10, 1};
        String number = scanner.next();

        for (int i = 0; i < 5; i++) {
            char c = number.charAt(i);
            System.out.printf("[%d]\n", (c - '0') * dividingNumber[i]);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }
}
