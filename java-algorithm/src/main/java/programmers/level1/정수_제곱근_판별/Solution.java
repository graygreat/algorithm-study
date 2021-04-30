package programmers.level1.정수_제곱근_판별;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(3));
    }
    public long solution(long n) {
        double answer = Math.sqrt(n);
        System.out.println(Double.toString(answer));
        String[] split = Double.toString(answer).split("\\.");
        if (Double.parseDouble(split[1]) > 0) {
            return -1;
        } else {
            answer += 1;
            answer = Math.pow(answer, 2);
        }
        return (long) answer;
    }

    public long solution2(long n) {
        if (Math.pow(Math.sqrt(n), 2) == n) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }
        return -1;
    }
}
