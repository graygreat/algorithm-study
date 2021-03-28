package programmers.level1.두_정수_사이의_합;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        } else {
            for (int i = a; i >= b; i--) {
                answer += i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(3, 3));
    }
}