package programmers.level2.순위_검색;

import java.util.*;

class Solution {
    Map<String, Integer> wordMap = new HashMap<>();

    public static void main(String[] args) {
        String[] info = {
                "java backend junior pizza 150",
                "python frontend senior chicken 210",
                "python frontend senior chicken 150",
                "cpp backend senior pizza 260",
                "java backend junior chicken 80",
                "python backend senior chicken 50"
        };

        String[] query = {
                "java and backend and junior and pizza 100",
                "python and frontend and senior and chicken 200",
                "cpp and - and senior and pizza 250",
                "- and backend and senior and - 150",
                "- and - and - and chicken 100",
                "- and - and - and - 150"
        };

        Solution solution = new Solution();
        solution.solution(info, query);
    }

    public int[] solution(String[] info, String[] query) {
        List<List<Integer>> scoreList = new ArrayList<>();

        wordMap.put("-", 0);
        wordMap.put("cpp", 1);
        wordMap.put("java", 2);
        wordMap.put("python", 3);
        wordMap.put("backend", 1);
        wordMap.put("frontend", 2);
        wordMap.put("junior", 1);
        wordMap.put("senior", 2);
        wordMap.put("chicken", 1);
        wordMap.put("pizza", 2);

        for (int i = 0; i < 4 * 3 * 3 * 3; i++) {
            scoreList.add(new ArrayList<>());
        }

        for (String str : info) {
            String[] word = str.split(" ");
            int[] arr = {wordMap.get(word[0]), wordMap.get(word[1]), wordMap.get(word[2]), wordMap.get(word[3])};
            int score = Integer.parseInt(word[4]);
        }

        int[] answer = {};
        return answer;
    }
}
