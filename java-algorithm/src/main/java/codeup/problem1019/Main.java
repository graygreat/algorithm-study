package codeup.problem1019;

import java.util.Scanner;

public class Main {
    static void solution() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        String[] dataSet = text.split("\\.");
        int yyyy = Integer.parseInt(dataSet[0]);
        int mm = Integer.parseInt(dataSet[1]);
        int dd = Integer.parseInt(dataSet[2]);
        System.out.printf("%04d.%02d.%02d", yyyy, mm, dd);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }
}

