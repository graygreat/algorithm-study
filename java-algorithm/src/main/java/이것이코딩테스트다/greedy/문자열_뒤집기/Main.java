package 이것이코딩테스트다.greedy.문자열_뒤집기;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solution());
    }

    private int solution() {
        String dataSet = scanner.next();
        int count0 = 0;
        int count1 = 0;

        if (dataSet.charAt(0) == '1') {
            count0++;
        } else {
            count1++;
        }

        for (int i = 0; i < dataSet.length() - 1; i++) {
            if (dataSet.charAt(i) != dataSet.charAt(i + 1)) {
                if (dataSet.charAt(i + 1) == '1') {
                    count0++;
                } else {
                    count1++;
                }
            }
        }
        return Math.min(count0, count1);
    }
}
