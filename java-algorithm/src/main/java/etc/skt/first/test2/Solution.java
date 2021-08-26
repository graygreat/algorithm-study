package etc.skt.first.test2;

class Solution {

    public static void main(String[] args) {
        int N = -5000;
        Solution solution = new Solution();
        System.out.println(solution.solution(N));
    }
    public int solution(int N) {
        // write your code in Java SE 8
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(N);
        boolean flag = false;
        int answer = -999996;

        for (int i = 0; i < stringBuilder.length(); i++) {
            char data = stringBuilder.charAt(i);
            if (data == '5') {
                flag = true;
                StringBuilder stringData = stringBuilder.deleteCharAt(i);
                answer = Math.max(answer, Integer.parseInt(stringData.toString()));
                stringBuilder.insert(i, data);
            }
        }

        if (!flag && answer == -999996) {
            answer = N;
        }
        return answer;
    }
}

