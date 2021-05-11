package etc.kakao.programming1;

class Solution {
    public static void main(String[] args) {
        String s = "one4seveneight";
        Solution solution = new Solution();
        System.out.println(solution.solution(s));
    }
    public int solution(String s) {
        StringBuilder answer = new StringBuilder();
        int index = 0;

        for ( ; index < s.length(); ) {
            char c = s.charAt(index);
            if (Character.isDigit(c)) {
                answer.append(c);
                index += 1;
                continue;
            }
            if (c == 'z') {
                index += 4;
                answer.append(0);
            } else if (c == 'o') {
                index += 3;
                answer.append(1);
            } else if (c == 't') {
                char temp = s.charAt(index + 1);
                if (temp == 'w') {
                    index += 3;
                    answer.append(2);
                } else if (temp == 'h') {
                    index += 5;
                    answer.append(3);
                }
            } else if (c == 'f') {
                char temp = s.charAt(index + 1);
                if (temp == 'o') {
                    index += 4;
                    answer.append(4);
                } else if (temp == 'i') {
                    index += 4;
                    answer.append(5);
                }
            } else if (c == 's') {
                char temp = s.charAt(index + 1);
                if (temp == 'i') {
                    index += 3;
                    answer.append(6);
                } else if (temp == 'e') {
                    index += 5;
                    answer.append(7);
                }
            } else if (c == 'e') {
                index += 5;
                answer.append(8);
            } else {
                index += 4;
                answer.append(9);
            }
        }

        return Integer.parseInt(answer.toString());
    }
}