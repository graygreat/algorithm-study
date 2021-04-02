package 이것이코딩테스트다.greedy.볼링공_고르기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solution2());
    }

    private int solution() {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int result = 0;
        List<Integer> arraylist = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arraylist.add(scanner.nextInt());
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arraylist.get(i) == arraylist.get(j)) {
                    continue;
                }
                result++;
            }
        }
        return result;
    }

    private int solution2() {
        int[] data = new int[11];
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int result = 0;

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            data[x]++;
        }

        for (int i = 1; i <= m; i++) {
            n -= data[i];
            result += n * data[i];
        }
        return result;
    }
}
