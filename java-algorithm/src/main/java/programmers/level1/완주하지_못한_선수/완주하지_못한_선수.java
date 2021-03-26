package programmers.level1.완주하지_못한_선수;

import java.util.Arrays;

class Solution {
    static String[] participant = {"leo", "kiki", "eden"};
    static String[] completion = {"eden", "kiki"};

    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        return participant[participant.length - 1];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(participant, completion);
    }
}

