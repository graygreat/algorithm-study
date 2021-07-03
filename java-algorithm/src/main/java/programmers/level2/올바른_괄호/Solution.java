package programmers.level2.올바른_괄호;

public class Solution {

    public static void main(String[] args) {
        String s = "()()";
        Solution solution = new Solution();
        System.out.println(solution.solution(s));
    }

    public boolean solution(String s) {
        int answer = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                answer += 1;
            } else {
                answer -= 1;
                if (answer < 0) {
                    return false;
                }
            }
        }
        if (answer == 0) {
            return true;
        } else {
            return false;
        }
    }
}
