package programmers.level2.최댓값과_최솟값;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        String s = "-1 -2 -3 -4";
        Solution solution = new Solution();
        System.out.println(solution.solution(s));
    }
    public String solution(String s) {
        String[] data = s.split(" ");
        int[] intData = Arrays.stream(data).mapToInt(Integer::parseInt).toArray();

        int min = Arrays.stream(intData).min().getAsInt();
        int max = Arrays.stream(intData).max().getAsInt();

        String answer = min + " " + max;
        return answer;
    }
}