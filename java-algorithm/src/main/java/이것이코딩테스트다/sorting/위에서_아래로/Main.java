package 이것이코딩테스트다.sorting.위에서_아래로;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }

    public void solution() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] array = new Integer[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array, Collections.reverseOrder());

        Arrays.stream(array)
                .forEach(x -> System.out.print(x + " "));
    }
}
