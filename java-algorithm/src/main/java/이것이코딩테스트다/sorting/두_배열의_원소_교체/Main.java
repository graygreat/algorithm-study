package 이것이코딩테스트다.sorting.두_배열의_원소_교체;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solution());
    }

    public int solution() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] aArray = new int[n];
        int[] bArray = new int[n];

        for (int i = 0; i < n; i++) {
            aArray[i] = scanner.nextInt();
        }
        Arrays.sort(aArray);
        for (int i = 0; i < n; i++) {
            bArray[i] = scanner.nextInt();
        }
        Arrays.sort(bArray);

        for (int i = 0; i < k; i++) {
            if (aArray[i] < bArray[n - i - 1]) {
                aArray[i] = bArray[n - i - 1];
            }
        }

        return Arrays.stream(aArray).sum();
    }
}
