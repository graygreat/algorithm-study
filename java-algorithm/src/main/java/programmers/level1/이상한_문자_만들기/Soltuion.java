package programmers.level1.이상한_문자_만들기;

class Solution {
    public static void main(String[] args) {
        String s = "sp ace   ";
        Solution solution = new Solution();
        System.out.println(solution.solution(s));
    }
    public String solution(String s) {
        String answer = "";
        String[] splitString = s.split(" ", -1);

        for (int i = 0; i < splitString.length; i++) {
            for (int j = 0; j < splitString[i].length(); j++) {
                if (j % 2 == 0) {
                    answer += Character.toUpperCase(splitString[i].charAt(j));
                } else {
                    answer += Character.toLowerCase(splitString[i].charAt(j));
                }
            }
            if (i != (splitString.length - 1)) {
                answer += " ";
            }
        }
        return answer;
    }
}