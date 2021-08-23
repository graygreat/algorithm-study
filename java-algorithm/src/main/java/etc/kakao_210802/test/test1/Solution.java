package etc.kakao_210802.test.test1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Solution solution = new Solution();
        System.out.println(solution.solution(s));
    }

    public int solution(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        Map<Character, Integer> locationMap = new HashMap<>();

        int length = s.length();
        int answer = length;

        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);

            if (!countMap.containsKey(ch)) {
                countMap.put(ch, 0);
                locationMap.put(ch, i + 1);
            }
            countMap.put(ch, countMap.get(ch) + 1);
        }

        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                continue;
            }

            int location = locationMap.get(entry.getKey());
            if (answer > location) {
                answer = location;
            }
        }

        if (answer == length) {
            answer = -1;
        }

        return answer;
    }
}
