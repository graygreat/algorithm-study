package 이것이코딩테스트다.binarysearch;

import java.util.Scanner;

public class BinarySearchByRecursion {

    public static int binarySearch(int[] array, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;

        if (array[mid] > target) {
            return binarySearch(array, target, start, mid - 1);
        } else if (array[mid] < target) {
            return binarySearch(array, target, mid + 1, end);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int target = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int result = binarySearch(array, target, 0, n - 1);
        if (result == -1) {
            System.out.println("원소가 존재하지 않습니다.");
        } else {
            System.out.println(result + 1);
        }
    }
}

/**
 * 10 6
 * 1 3 5 7 9 11 13 15 17 19
 */