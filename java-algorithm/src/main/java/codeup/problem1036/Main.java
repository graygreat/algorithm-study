package codeup.problem1036;

import java.util.Scanner;

public class Main {
    static void solution() {
        Scanner scanner = new Scanner(System.in);
        char alphabet = scanner.next().charAt(0);
        int decimalAlphabet = (int) alphabet;
        System.out.println(decimalAlphabet);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }
}
