package programmers.level2.큰_수_만들기;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("1924", 2));
    }
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int length = number.length() - k;
        int index = 0;
        for (int i = length - 1; i >= 0; i--) {
            String substring = number.substring(index, number.length() - i);
            int subIndex = 0;
            int max = substring.charAt(0) - '0';
            for (int j = 1; j < substring.length(); j++) {
                if (max < substring.charAt(j) - '0') {
                    subIndex = j;
                    max = substring.charAt(j) - '0';
                }
            }
            index += subIndex + 1;
            answer.append(max);
        }
        return answer.toString();
    }
}
