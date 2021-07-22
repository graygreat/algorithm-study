package programmers.level2.조이스틱;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        solution.solution("JEROEN");
        System.out.println(solution.solution("JAZ"));
    }

    public int solution(String name) {
        int answer = 0;
        int length = name.length();

        int minMovement = length - 1;

        for (int i = 0; i < length; i++) {
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);

            int next = i + 1;
            while (next < length && name.charAt(next) == 'A') {
                next += 1;
            }
            minMovement = Math.min(minMovement, i + length - next + i);
        }

        answer += minMovement;

        return answer;
    }
}
