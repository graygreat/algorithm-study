package programmers.level1.시저_암호;

class Solution {
    public static void main(String[] args) {
        String s = "ZzAa";
        int n = 25;
        Solution solution = new Solution();
        System.out.println(solution.solution(s, n));
    }
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char alphabet = s.charAt(i);
            if (alphabet == ' ') {
                answer.append(alphabet);
                continue;
            }
            if (alphabet >= 'A' && alphabet <= 'Z') {
                alphabet += n;
                if (alphabet > 'Z') {
                    alphabet -= 26;
                }
                answer.append((char) alphabet);
            }
            if (alphabet >= 'a' && alphabet <= 'z') {
                alphabet += n;
                if (alphabet > 'z') {
                    alphabet -= 26;
                }
                answer.append((char) alphabet);
            }
        }
        return answer.toString();
    }
}