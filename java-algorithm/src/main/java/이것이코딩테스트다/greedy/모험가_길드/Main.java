package 이것이코딩테스트다.greedy.모험가_길드;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        Integer[] array = new Integer[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array, Collections.reverseOrder());

        for (int index = 0; index < n; ) {
            count += 1;
            index += array[index];
        }
        System.out.println(count);
    }

}

/**
5
2 3 1 2 2
 */
