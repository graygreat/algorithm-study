package programmers.level1.폰켓몬;

import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int halfLength = nums.length / 2;
        HashSet<Integer> numberSet = new HashSet<>();

        for (int num : nums) {
            numberSet.add(num);
        }

        if (halfLength < numberSet.size()) {
            return halfLength;
        }

        return numberSet.size();
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3};
        Solution solution = new Solution();
        solution.solution(nums);
    }
}
