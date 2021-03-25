package codeup.problem1041;

import java.util.Scanner;

public class Main {
    static void solution() {
        Scanner scanner = new Scanner(System.in);
        char alphabet = scanner.next().charAt(0);
        System.out.printf("%c\n", alphabet + 1);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }
}
