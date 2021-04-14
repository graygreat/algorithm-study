package 이것이코딩테스트다.implementation.럭키_스트레이트;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solution());
    }
    public String solution() {
        String n = scanner.next();
        int halfOfLength = n.length() / 2;
        int summary = 0;

        for (int i = 0; i < halfOfLength; i++) {
            summary += n.charAt(i);
        }

        for (int i = halfOfLength; i < n.length(); i++) {
            summary -= n.charAt(i);
        }

        if (summary == 0) {
            return "LUCKY";
        }
        return "READY";
    }
}
