package etc.skt.first.test1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        String s = "aaaa";
        Solution solution = new Solution();
        System.out.println(solution.solution(s));
    }
    public int solution(String S) {
        // write your code in Java SE 8
        Map<Character, Integer> map = new HashMap<>();
        int answer = 0;

        for (char c : S.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                answer += 1;
            }
        }

        return answer;
    }
}
