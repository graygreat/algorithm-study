package etc.skt.second.test3;

import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public static void main(String[] args) {
        String s = "TacoCat";
        Solution solution = new Solution();
        System.out.println(solution.solution(s));
    }
    public int solution(String S) {
        // write your code in Java SE 8
        int[] smallLetter = new int[26];
        int[] capitalLetter = new int[26];
        Map<Character, Integer> map = new HashMap<>();

        Arrays.fill(smallLetter, 0);
        Arrays.fill(capitalLetter, 0);

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if (c >= 65 && c <= 90) {
                capitalLetter[c - 65]++;
            } else if (c >= 97 && c <= 122) {
                smallLetter[c - 97]++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (smallLetter[i] != 0 && capitalLetter[i] == 0) {
                map.put((char) (i + 97), 1);
            } else if (capitalLetter[i] != 0 && smallLetter[i] == 0) {
                map.put((char) (i + 65), 1);
            }
        }

        Arrays.fill(smallLetter, 0);
        Arrays.fill(capitalLetter, 0);

        int start = -1;
        int end = -1;
        int location = 0;
        int index = 0;

        int minValue = Integer.MAX_VALUE;

        while (index < S.length()) {
            if (map.get(S.charAt(index)) != null) {
                while (location < index) {
                    char c = S.charAt(location);

                    if (c >= 65 && c <= 90) {
                        capitalLetter[c - 65]--;
                    } else if (c >= 97 && c <= 122) {
                        smallLetter[c - 97]--;
                    }
                    location += 1;
                }
                index += 1;
                location = index;
            } else {
                char c = S.charAt(index);

                if (c >= 65 && c <= 90) {
                    capitalLetter[c - 65]++;
                } else {
                    smallLetter[c - 97]++;
                }

                while (true) {
                    char cl = S.charAt(location);

                    if (cl >= 65 && cl <= 90 && capitalLetter[cl - 65] > 1) {
                        capitalLetter[cl - 65]--;
                        location += 1;
                    } else if (cl >= 97 && cl <= 122 && smallLetter[cl - 65] > 1) {
                        smallLetter[cl - 97]--;
                        location += 1;
                    } else {
                        break;
                    }
                }

                if (isBalanced(smallLetter, capitalLetter)) {
                    if (minValue > (index - location + 1)) {
                        minValue = index - location + 1;
                        start = location;
                        end = index;
                    }
                }
                index += 1;
            }
        }
        if (start == -1 || end == -1) {
            return -1;
        } else {
            String answer = "";
            for (int j = start; j <= end; j++) {
                answer += S.charAt(j);
            }
            return answer.length();
        }
    }

    private static boolean isBalanced(int smallLetter[], int capitalLetter[]) {
        for (int i = 0; i < 26; i++) {
            if (smallLetter[i] != 0 && (capitalLetter[i] == 0))
                return false;

            else if ((smallLetter[i] == 0) && (capitalLetter[i] != 0))
                return false;
        }
        return true;
    }
}