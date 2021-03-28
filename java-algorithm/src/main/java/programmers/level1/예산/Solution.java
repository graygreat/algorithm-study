package programmers.level1.예산;

import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int sumBudget = 0;
        int count = 0;

        for (int i = 0; i < d.length; i++) {
            sumBudget += d[i];
            if (sumBudget <= budget) {
                count++;
            } else {
                return count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] d = {2, 2, 3, 3};
        Solution solution = new Solution();
        System.out.println(solution.solution(d, 10));
    }
}