package programmers.level1.문자열_내_p와_y의_개수;

class Solution {
    boolean solution(String s) {
        int count = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') {
                count++;
            }
            if (s.charAt(i) == 'y') {
                count--;
            }
        }
        if (count == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "pPoooyY";
        Solution solution = new Solution();
        System.out.println(solution.solution(s));
    }
}