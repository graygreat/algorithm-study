package programmers.level1.제일_작은_수_제거하기;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length <= 1) {
            return new int[]{-1};
        }
        int minValue = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(i -> i != minValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        Solution solution = new Solution();
        solution.solution(arr);
    }
}
