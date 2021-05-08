package programmers.level1.다트_게임;

class Solution {
    public static void main(String[] args) {
        String dartResult = "1S2D*3T";
        Solution solution = new Solution();
        System.out.println(solution.solution(dartResult));
    }
    public int solution(String dartResult) {
        int answer = 0;
        int temp = 0;
        int previous = 0;

        for (int i = 0; i < dartResult.length(); i++) {
            char symbol = dartResult.charAt(i);
            if (Character.isDigit(symbol)) {
                temp = dartResult.charAt(i) - '0';
            } else {
                switch (symbol) {
                    case 'S':
                        temp = (int) Math.pow(temp, 1);
                        answer += temp;
                        break;
                    case 'D':
                        temp = (int) Math.pow(temp, 2);
                        answer += temp;
                        break;
                    case 'T':
                        temp = (int) Math.pow(temp, 3);
                        answer += temp;
                        break;
                    case '*':
                        answer -= previous - temp;
                        answer += (previous * 2) + (temp * 2);
                        break;
                    case '#':
                        answer += temp * -1;
                }
                System.out.println(answer);
            }
            if (i < dartResult.length() - 1 && !Character.isDigit(dartResult.charAt(i + 1))) {
                previous = temp;
            }
        }

        return answer;
    }
}
