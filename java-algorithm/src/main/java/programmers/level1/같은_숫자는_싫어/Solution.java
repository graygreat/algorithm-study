package programmers.level1.같은_숫자는_싫어;

import java.util.ArrayList;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {
                continue;
            }
            arrayList.add(arr[i]);
        }

        answer = arrayList.stream()
                .mapToInt(i -> i)
                .toArray();

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {4, 4, 4, 3, 3};
        Solution solution = new Solution();
        System.out.println(solution.solution(arr));
    }
}