package 이것이코딩테스트다.implementation.시각;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solution());
    }

    private int solution() {
        int n = scanner.nextInt();
        int count = 0;
        String time = "";
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    time = String.valueOf(i) + String.valueOf(j) + String.valueOf(k);
                    if (time.contains("3")) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
