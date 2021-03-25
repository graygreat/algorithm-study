package codeup.problem1029;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    static void solution() {
        Scanner scanner = new Scanner(System.in);
        BigDecimal bigDecimal = scanner.nextBigDecimal();
        System.out.printf("%.11f", bigDecimal);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }
}
