package 이것이코딩테스트다.binarysearch.부품_찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }

    public void solution() throws IOException {
        List<String> answer = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] storeParts = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int m = Integer.parseInt(br.readLine());
        int[] guestParts = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        Arrays.sort(storeParts);

        for (int part : guestParts) {
            int result = binarySearch(storeParts, part, 1, n);
            if (result == -1) {
                answer.add("no");
            } else {
                answer.add("yes");
            }
        }
        answer.stream().forEach(x -> System.out.print(x + " "));
    }

    public int binarySearch(int[] array, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;

        if (array[mid] == target) {
            return mid;
        } else if (array[mid] > target) {
            return binarySearch(array, target, start, mid - 1);
        } else {
            return binarySearch(array, target, mid + 1, end);
        }
    }
}

/**
 * 5
 * 8 3 7 9 2
 * 3
 * 5 7 9
 */
