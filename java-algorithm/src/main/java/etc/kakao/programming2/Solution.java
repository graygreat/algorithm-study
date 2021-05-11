package etc.kakao.programming2;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        String[][] places = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
                {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
                {"PXOPX", "OXOXP", "OXPXX", "OXXXP", "POOXX"},
                {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
                {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};

        Solution solution = new Solution();
        int[] solution1 = solution.solution(places);
        System.out.println(Arrays.toString(solution1));
    }

    public int check(String[] places) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (places[i].charAt(j) == 'P') {
                    if (places[i].charAt(j + 1) == 'X' && places[i + 1].charAt(j) == 'X') {
                        System.out.println(i + " " + j);
                        continue;
                    }
                    if (places[i].charAt(j + 1) == 'P' || places[i + 1].charAt(j) == 'P' || places[i + 1].charAt(j + 1) == 'P') {
                        return 0;
                    }
                }
            }
        }
        return 1;
    }

    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        for (int i = 0; i < 5; i++) {
            answer[i] = check(places[i]);
        }
        return answer;
    }
}