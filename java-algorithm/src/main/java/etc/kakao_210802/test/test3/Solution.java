package etc.kakao_210802.test.test3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static int solution(List<Integer> arr) {
        int answer = 0;
        int n = arr.size();

        if (n < 3) {
            return n;
        }

        boolean isIncreasing = false;
        int startIndex = 0;

        boolean isDuplicated = false;
        int duplicatedIndex = 0;

        for (int i = 0; i < n - 1; i++) {
            int currentItem = arr.get(i);
            int nextItem = arr.get(i + 1);

            if (currentItem > nextItem) {
                isDuplicated = false;
                isIncreasing = false;
            } else if (currentItem < nextItem) {
                if (!isIncreasing) {
                    int length = i - startIndex + 1;

                    if (isDuplicated) {
                        startIndex = duplicatedIndex;
                    } else {
                        startIndex = i;
                    }

                    if (answer < length) {
                        answer = length;
                    }
                }
                isDuplicated = false;
                isIncreasing = true;
            } else {
                if (!isDuplicated) {
                    duplicatedIndex = i;
                    isDuplicated = true;
                }
            }
        }
        int resultLength = (n - 1) - startIndex + 1;

        if (answer < resultLength) {
            answer = resultLength;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        int a = scanner.nextInt();

        for (int i = 0; i < a; i++) {
            arr.add(scanner.nextInt());
        }

        int solution = solution(arr);

        System.out.println(solution);
    }
}
