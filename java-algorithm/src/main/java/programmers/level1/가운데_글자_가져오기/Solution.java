package programmers.level1.가운데_글자_가져오기;

class Solution {
    public String solution(String s) {
        int stringLength = s.length();
        int halfStringLength = stringLength / 2;

        if (stringLength % 2 == 0) {
            return s.substring(halfStringLength - 1, halfStringLength + 1);
        }
        return String.valueOf(s.charAt(halfStringLength));
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solution("qwer");
    }
}