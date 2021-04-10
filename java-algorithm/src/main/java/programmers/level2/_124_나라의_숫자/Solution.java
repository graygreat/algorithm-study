package programmers.level2._124_나라의_숫자;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(15));
    }
    public String solution(int n) {
        StringBuffer answer = new StringBuffer();
        int remainder = 0;
        while (n > 0) {
            remainder = n % 3;
            n = n / 3;
            if (remainder == 0) {
                remainder = 4;
                n -= 1;
            }
            answer.insert(0, remainder);
        }

        return answer.toString();
    }
}
