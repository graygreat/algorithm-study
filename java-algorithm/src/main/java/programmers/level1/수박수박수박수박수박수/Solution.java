package programmers.level1.수박수박수박수박수박수;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(10));
    }
    public String solution(int n) {
        String waterMelon = "수박";
        StringBuilder answer = new StringBuilder();
        if (n == 1) {
            return "수";
        }
        if (n == 2) {
            return "수박";
        }
        int nByDivide = n / 2;
        if (n % 2 == 0) {
            for (int i = 0; i < nByDivide; i++) {
                answer.append(waterMelon);
            }
            return answer.toString();
        }
        for (int i = 0; i < n; i++) {
            answer.append(waterMelon);
        }
        answer.append("수");
        return answer.toString();
    }
}