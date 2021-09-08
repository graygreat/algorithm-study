package etc.grepp.test;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static boolean[][] visited;

    public static void main(String[] args) {
//        String[] card = {"ABACDEFG", "NOPQRSTU", "HIJKLKMM"};
//        String[] word = {"GPQM", "GPMZ", "EFU", "MMNA"};
        String[] card = {"AABBCCDD", "KKKKJJJJ", "MOMOMOMO"};
        String[] word = {"AAAKKKKKMMMMM", "ABCDKJ"};
        Solution solution = new Solution();
        String[] solution1 = solution.solution(card, word);
        for (String so : solution1) {
            System.out.println(so);
        }
    }

    public String[] solution(String[] card, String[] word) {
        String[] answer = {};
        List<String> answerList = new ArrayList<>();

        for (int i = 0; i < word.length; i++) {
            visited = new boolean[3][8];
            int count = 0;
            for (int j = 0; j < word[i].length(); j++) {
                char c = word[i].charAt(j);
                if (find(card, c)) {
                    count += 1;
                } else {
                    break;
                }
            }
            if (count == word[i].length() && rowCheck(visited)) {
                answerList.add(word[i]);
            }
        }

        answer = new String[answerList.size()];
        if (answerList.isEmpty()) {
            return new String[]{"-1"};
        }
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }

    public boolean find(String[] card, char c) {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                if (card[i].charAt(j) == c && visited[i][j] == false) {
                    visited[i][j] = true;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean rowCheck(boolean[][] visited) {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                if (visited[i][j] == true) {
                    count += 1;
                    break;
                }
            }
        }
        if (count == 3) {
            return true;
        }
        return false;
    }
}
