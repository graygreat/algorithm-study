package programmers.level1.자연수_뒤집어_배열로_만들기;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        List<Integer> arrayList = new ArrayList<>();
        String[] convertedNum = Long.toString(n).split("");

        for (int i = convertedNum.length - 1; i >= 0; i--) {
            arrayList.add(Integer.parseInt(convertedNum[i]));
        }
        answer = arrayList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
