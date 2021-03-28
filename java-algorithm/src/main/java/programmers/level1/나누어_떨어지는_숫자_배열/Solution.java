package programmers.level1.나누어_떨어지는_숫자_배열;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] answer = {};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                arrayList.add(arr[i]);
            }
        }
        if (arrayList.size() == 0) {
            arrayList.add(-1);
        }

        answer = arrayList.stream()
                .mapToInt(i -> i)
                .toArray();

        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        int arr[] = {5, 9, 7, 10};
        int divisor = 5;
        Solution solution = new Solution();
        solution.solution(arr, divisor);
    }
}
