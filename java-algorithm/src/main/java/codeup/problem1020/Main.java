package codeup.problem1020;

import java.util.Scanner;

public class Main {
    static void solution() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        String[] dataSet = text.split("-");
        String result = "";
        for (String data : dataSet) {
            result += data;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }
}
