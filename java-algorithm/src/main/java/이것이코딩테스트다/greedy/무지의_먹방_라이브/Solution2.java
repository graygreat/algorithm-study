package 이것이코딩테스트다.greedy.무지의_먹방_라이브;

import java.util.Arrays;

class Solution2 {
    public static void main(String[] args) {
        int[] foodTimes = {1, 1, 1, 1};
        long k = 4;
//        int[] foodTimes = {4, 2, 3, 6, 7, 1, 5, 8};
//        long k = 16;
        Solution2 sol = new Solution2();
        System.out.println(sol.solution(foodTimes, k));
    }
    private boolean zeroCheck(int[] foodTimes) {
        if (Arrays.stream(foodTimes).sum() == 0) {
            return true;
        }
        return false;
    }
    public int solution(int[] foodTimes, long k) {
        int index = 0;
        while (k >= 0) {
            index = index % foodTimes.length;
            if (foodTimes[index] == 0) {
                if (zeroCheck(foodTimes)) {
                    return -1;
                }
                index += 1;
                continue;
            }
            foodTimes[index] -= 1;
            index += 1;
            k -= 1;
        }
        return index;
    }
}
