package programmers.level1.수박수박수박수박수박수;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(10));
    }
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                answer.append("수");
                continue;
            }
            answer.append("박");
        }
        return answer.toString();
    }
}