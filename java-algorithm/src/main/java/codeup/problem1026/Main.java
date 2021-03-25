package codeup.problem1026;

import java.util.Scanner;

public class Main {
    static void solution() {
        Scanner scanner = new Scanner(System.in);
        String time = scanner.next();
        String[] timeData = time.split(":");
        System.out.printf("%01d\n", Integer.parseInt(timeData[1]));
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }
}
