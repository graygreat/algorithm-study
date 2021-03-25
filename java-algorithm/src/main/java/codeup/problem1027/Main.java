package codeup.problem1027;

import java.util.Scanner;

public class Main {
    static void solution() {
        Scanner scanner = new Scanner(System.in);
        String time = scanner.next();
        String[] timeData = time.split("\\.");
        System.out.printf("%s-%s-%s\n", timeData[2], timeData[1], timeData[0]);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }
}
