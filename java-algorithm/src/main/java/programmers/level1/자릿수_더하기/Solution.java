package programmers.level1.자릿수_더하기;

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String convertedNum = Integer.toString(n);
        for (int i = 0; i < convertedNum.length(); i++) {
            answer += Character.getNumericValue(convertedNum.charAt(i));
        }

        return answer;
    }
}