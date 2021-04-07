package programmers.level1.문자열_다루기_기본;

class Solution {
    public static void main(String[] args) {
        String s = "123 ";
        Solution solution = new Solution();
        System.out.println(solution.solution(s));
    }

    public boolean solution(String s) {

        if (s.length() == 4 || s.length() == 6) {
            try {
                int x = Integer.parseInt(s);
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }
}