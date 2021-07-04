//package etc.naver_webtoon.test2;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//class Solution {
//    public static void main(String[] args) {
//        String s = "abcxyasdfasdfxyabc";
////        String s = "abcxyqwertyxyabc";
////        String s = "abcdef";
////        String s = "llttaattll";
//        Solution solution = new Solution();
//        System.out.println(solution.solution(s));
//    }
//
//    public String[] solution(String s) {
//        List<String> leftAnswer = new ArrayList<>();
//        List<String> rightAnswer = new ArrayList<>();
//        List<String> answer = new ArrayList<>();
//
//        int index = 0;
//        int length = s.length();
//
//        for (; index < (s.length() / 2); ) {
//
//            for (int i = 1; i <= s.length() / 2; i++) {
//                if (s.substring(index, index + i).equals(s.substring(length - index - i, length - index))) {
//                    if (index != (length - index - i)) {
//                        leftAnswer.add(s.substring(index, index + i));
//                        rightAnswer.add(s.substring(length - index - i, length - index));
//                    } else {
//                        leftAnswer.add(s.substring(index, index + i));
//                    }
//                    s = s.substring(index + i, length - index - i);
//                    break;
//                }
//                if (i == s.length() / 2) {
//                    index += i;
//                    leftAnswer.add(s);
//                    break;
//                }
//            }
//        }
//
//
//        answer.addAll(leftAnswer);
//        Collections.reverse(rightAnswer);
//        answer.addAll(rightAnswer);
//
//        System.out.println(answer);
//        return answer.toArray(new String[0]);
//    }
//}
