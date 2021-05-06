package programmers.level2.가장_큰_수;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public static void main(String[] args) {
//        int num[] = {6, 10, 2};
        int num[] = {3, 30, 34, 5, 9};
        Solution solution = new Solution();
        solution.solution(num);
    }
    public String solution(int[] numbers) {
        String[] result = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(result, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        if (result[0].equals("0")) {
            return "0";
        }

        String answer = "";
        for (int i = 0; i < result.length; i++) {
            answer += result[i];
        }
        return answer;
    }
}