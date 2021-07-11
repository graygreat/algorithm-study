package programmers.level2.메뉴_리뉴얼;

import java.util.*;

class Solution {
    private List<Map<String, Integer>> foodMaps = new ArrayList<>();
    int[] maxCount = new int[11];

    public String[] solution(String[] orders, int[] course) {
        for (int i = 0; i < 11; i++) {
            foodMaps.add(new HashMap<>());
        }

        for (String order : orders) {
            char[] arr = order.toCharArray();
            Arrays.sort(arr);
            combination(arr, 0, new StringBuilder());
        }

        List<String> answerList = new ArrayList<>();
        for (int length : course) {
            for (Map.Entry<String, Integer> entry : foodMaps.get(length).entrySet()) {
                if (entry.getValue() >= 2 && entry.getValue() == maxCount[length]) {
                    answerList.add(entry.getKey());
                }
            }
        }
        Collections.sort(answerList);

        String[] answer = new String[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }

    public void combination(char[] str, int position, StringBuilder candidate) {
        if (position >= str.length) {
            int length = candidate.length();
            if (length >= 2) {
                int count = foodMaps.get(length).getOrDefault(candidate.toString(), 0) + 1;
                foodMaps.get(length).put(candidate.toString(), count);
                maxCount[length] = Math.max(maxCount[length], count);
            }
            return;
        }
        combination(str, position + 1, candidate.append(str[position]));
        candidate.setLength(candidate.length() - 1);
        combination(str, position + 1, candidate);
    }
}