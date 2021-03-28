package programmers.level1._3진법_뒤집기;

class Solution {
    public int solution(int n) {
        String answer = "";
        int index = 0;
        int result = 0;

        while (n > 0) {
            answer += (n % 3);
            n /= 3;
        }

        for (int i = answer.length() - 1; i >= 0; i--) {
            result += ((answer.charAt(i) - '0') * (int) Math.pow(3, index));
            index++;
        }

        return result;

    }

    public static void main(String[] args) {
        int n = 45;
        Solution solution = new Solution();
        System.out.println(solution.solution(n));
    }
}