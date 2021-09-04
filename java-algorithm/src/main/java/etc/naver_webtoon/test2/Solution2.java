package etc.naver_webtoon.test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution2 {
    public static void main(String[] args) {
//        String s = "abcxyasdfasdfxyabc";
//        String s = "abcxyqwertyxyabc";
//        String s = "abcdef";
        String s = "llttaattll";
        Solution2 solution = new Solution2();
        System.out.println(solution.solution(s));
    }

    public String[] solution(String s) {
        List<String> leftAnswer = new ArrayList<>();
        List<String> rightAnswer = new ArrayList<>();
        List<String> answer = new ArrayList<>();

        int index = 0;
        int length = s.length();

        for (; index < length / 2; ) {
            int i = 1;
            for ( ; i <= length / 2; i++) {
                String left = s.substring(index, index + i);
                String right = s.substring(length - index - i, length - index);

                if (left.equals(right)) {
                    leftAnswer.add(left);
                    rightAnswer.add(right);
                    s = s.substring(index + i, length - index - i);
                    length = s.length();
                    break;
                }
            }

            if (!s.isEmpty() && i > length / 2) {
                leftAnswer.add(s);
                break;
            }
        }

        answer.addAll(leftAnswer);
        Collections.reverse(rightAnswer);
        answer.addAll(rightAnswer);
        System.out.println(answer);
        return answer.toArray(new String[0]);
    }
}
