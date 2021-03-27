package programmers.level1._2016년;

class Solution {
    public String solution(int a, int b) {
        int[] dayOfMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int day = 4;

        for (int i = 0; i < a - 1; i++) {
            day += dayOfMonth[i];
        }
        day += b;

        return days[day % 7];
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solution(5, 24);
    }
}