package programmers.level1.두_개_뽑아서_더하기;
// https://programmers.co.kr/learn/courses/30/lessons/68644?language=java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sumNumbers = numbers[i] + numbers[j];
                if (list.indexOf(sumNumbers) < 0) {
                    list.add(sumNumbers);
                }
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};
        Solution solution = new Solution();
        int result[] = solution.solution(numbers);
        IntStream stream = Arrays.stream(result);
        stream.forEach(a -> System.out.println(a));
//        for (int i = 0; i < result.length; i++) {
//            System.out.println(result[i]);
//        }
    }
}
