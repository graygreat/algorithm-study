package programmers.level1.문자열을_정수로_바꾸기;

class Solution {
    public static void main(String[] args) {
        String s = "-1234";
        Solution solution = new Solution();
        System.out.println(solution.solution(s));
    }
    public int solution(String s) {
        return Integer.parseInt(s);
    }
}