package etc.naver_webtoon.test3;

public class Solution {
    public static void main(String[] args) {
        String s = "aabcbcd";
        String t = "abc";

        Solution solution = new Solution();
        System.out.println(solution.solution(s, t));
    }

    public int solution(String s, String t) {
        int result = 0;
        StringBuffer stringBuffer = new StringBuffer(s);

        while (stringBuffer.length() > 0) {
            if (stringBuffer.indexOf(t) >= 0) {
                stringBuffer.replace(stringBuffer.indexOf(t), stringBuffer.indexOf(t) + t.length(), "");
            } else {
                break;
            }
            result += 1;
        }
        return result;
    }
}