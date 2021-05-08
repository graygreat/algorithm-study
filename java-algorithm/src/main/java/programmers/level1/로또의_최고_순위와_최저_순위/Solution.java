package programmers.level1.로또의_최고_순위와_최저_순위;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] lottos = {1, 2, 3, 4, 5, 6};
        int[] win_nums = {7, 8, 9, 10, 11, 12};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(lottos, win_nums)));
    }
    public int[] solution(int[] lottos, int[] win_nums) {
        int count = 0;
        int zeroCount = 0;
        for (int lotto : lottos) {
            if (lotto == 0) {
                zeroCount += 1;
            }
        }

        for (int num : win_nums) {
            for (int i = 0; i < 6; i++) {
                if (num == lottos[i]) {
                    count += 1;
                    break;
                }
            }
        }
        int[] answer = new int[2];
        answer[0] = 7 - (count + zeroCount);
        answer[1] = 7 - count;
        if (answer[0] > 6) {
            answer[0] = 6;
        }
        if (answer[1] > 6) {
            answer[1] = 6;
        }
        return answer;
    }
}
