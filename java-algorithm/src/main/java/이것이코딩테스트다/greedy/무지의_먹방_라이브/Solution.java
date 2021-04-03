package 이것이코딩테스트다.greedy.무지의_먹방_라이브;

import java.util.*;

class Food implements Comparable<Food> {
    private int time;
    private int index;

    public Food(int time, int index) {
        this.time = time;
        this.index = index;
    }

    public int getTime() {
        return time;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public int compareTo(Food other) {
        return Integer.compare(this.time, other.time);
    }
}

public class Solution {
    public static void main(String[] args) {
        int[] foodTimes = {3, 1, 2};
        int k = 5;
        Solution sol = new Solution();
        System.out.println(sol.solution(foodTimes, k));
    }

    public int solution(int[] food_times, long k) {
        long summary = 0;

        /**
         * 섭취해야 할 음식이 없는 경우 체크
         */
        for (int i = 0; i < food_times.length; i++) {
            summary += food_times[i];
        }
        if (summary <= k) {
            return -1;
        }

        /**
         * time, index 순으로 priorityQueue에 삽입
         */
        PriorityQueue<Food> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < food_times.length; i++) {
            priorityQueue.offer(new Food(food_times[i], i + 1));
        }

        summary = 0;
        long previous = 0;
        long length = food_times.length;

        while (summary + ((priorityQueue.peek().getTime() - previous) * length) <= k) {
            int now = priorityQueue.poll().getTime();

            summary += (now - previous) * length;
            length -= 1;
            previous = now;
        }

        /**
         * 남은 음식 중에 몇 번째를 섭취할 것인지 계산하는 로직
         */
        List<Food> result = new ArrayList<>();
        while (!priorityQueue.isEmpty()) {
            result.add(priorityQueue.poll());
        }

        Collections.sort(result, new Comparator<Food>() {
            @Override
            public int compare(Food o1, Food o2) {
                return Integer.compare(o1.getIndex(), o2.getIndex());
            }
        });

        return result.get((int) ((k - summary) % length)).getIndex();
    }
}
