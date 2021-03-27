package programmers.level1.모의고사;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] answer = {0, 0, 0};
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < answers.length; i++) {
            if (one[i % one.length] == answers[i]) {
                answer[0]++;
            }
            if (two[i % two.length] == answers[i]) {
                answer[1]++;
            }
            if (three[i % three.length] == answers[i]) {
                answer[2]++;
            }
        }

        int maxValue = Arrays.stream(answer)
                .max()
                .getAsInt();

        for (int i = 0; i < answer.length; i++) {
            if (maxValue == answer[i]) {
                result.add(i + 1);
            }
        }

        int[] convertResult = new int[result.size()];
        for (int i = 0; i < convertResult.length; i++) {
            convertResult[i] = result.get(i).intValue();
        }

        return convertResult;
    }

    public static void main(String[] args) {
        int[] answers = {1, 3, 2, 4, 2};
        Solution sol = new Solution();
        sol.solution(answers);
    }
}