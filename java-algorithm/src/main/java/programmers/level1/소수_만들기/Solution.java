package programmers.level1.소수_만들기;

class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        Solution solution = new Solution();
        System.out.println(solution.solution(nums));
    }
    public boolean isPrime(int num) {
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        int numsLength = nums.length;
        for (int i = 0; i < numsLength - 2; i++) {
            for (int j = i + 1; j < numsLength - 1; j++) {
                for (int k = j + 1; k < numsLength; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    if (isPrime(sum)) {
                        answer += 1;
                    }
                }
            }
        }
        return answer;
    }
}