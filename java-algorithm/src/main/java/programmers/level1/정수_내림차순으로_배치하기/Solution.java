package programmers.level1.정수_내림차순으로_배치하기;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(118372));
    }
    public long solution(long n) {
        long answer = 0;
        String[] convertedNum = Long.toString(n).split("");

        Arrays.sort(convertedNum, Comparator.reverseOrder());
        return Long.parseLong(String.join("", convertedNum));
    }
}