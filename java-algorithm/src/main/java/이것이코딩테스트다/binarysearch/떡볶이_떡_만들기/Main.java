package 이것이코딩테스트다.binarysearch.떡볶이_떡_만들기;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }

    public void solution() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int start = 0;
        int end = (int) 1e9;
        int result = 0;

        while (start <= end) {
            int mid = (start + end) / 2;
            long total = 0;

            for (int i = 0; i < n; i++) {
                if (array[i] > mid) {
                    total += array[i] - mid;
                }
            }
            if (total < m) {
                end = mid - 1;
            } else {
                result = mid;
                start = mid + 1;
            }
        }
        System.out.println(result);
    }
}

/**
4 6
19 15 10 17
 */