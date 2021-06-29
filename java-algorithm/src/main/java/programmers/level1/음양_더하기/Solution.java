package programmers.level1.음양_더하기;

class Solution {
    public static void main(String[] args) {
        int[] absolutes = {1, 2, 3};
        boolean[] signs = {false, false, true};

        Solution solution = new Solution();
        System.out.println(solution.solution(absolutes, signs));
    }

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int length = absolutes.length;

        for (int i = 0; i < length; i++) {
            if (signs[i] == true) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        return answer;
    }
}
