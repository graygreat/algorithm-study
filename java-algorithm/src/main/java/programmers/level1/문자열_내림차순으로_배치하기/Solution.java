package programmers.level1.문자열_내림차순으로_배치하기;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String[] data = s.split("");
        Arrays.sort(data, Collections.reverseOrder());
        return String.join("", data);
    }

    public static void main(String[] args) {
        String s = "Zbcdefg";
        Solution solution = new Solution();
        System.out.println(solution.solution(s));
    }
}
