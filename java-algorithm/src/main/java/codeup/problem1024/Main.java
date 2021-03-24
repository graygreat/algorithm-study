package codeup.problem1024;

import java.util.Scanner;

public class Main {
    static void solution() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        String[] dataSet = text.split("");
        for (String data : dataSet) {
            System.out.printf("\'%s\'\n", data);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }
}

