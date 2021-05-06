package programmers.level2.튜플;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution("{{1,2,3},{2,1},{1,2,4,3},{2}}");
    }
    public int[] solution(String s) {
        s = s.substring(2, s.length() - 2).replace("},{", "-");
        String[] arr = s.split("-");
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        List<Integer> list = new ArrayList<>();
        for (String data : arr) {
            String[] unit = data.split(",");

            for (int i = 0; i < unit.length; i++) {
                int num = Integer.parseInt(unit[i]);

                if (!list.contains(num)) {
                    list.add(num);
                }
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}