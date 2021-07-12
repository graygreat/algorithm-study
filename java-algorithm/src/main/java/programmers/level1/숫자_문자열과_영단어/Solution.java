package programmers.level1.숫자_문자열과_영단어;

class Solution {
    public static void main(String[] args) {
        String s = "23four5six7";
        Solution solution = new Solution();
        System.out.println(solution.solution(s));
    }

    /*
    public int solution(String s) {
        StringBuilder answer = new StringBuilder();

        int index = 0;
        for (; index < s.length(); ) {
            char data = s.charAt(index);
            if (data == 'z') {
                answer.append(0);
                index += 4;
            } else if (data == 'o') {
                answer.append(1);
                index += 3;
            } else if (data == 't') {
                index += 1;
                if (s.charAt(index) == 'w') {
                    answer.append(2);
                    index += 2;
                } else {
                    answer.append(3);
                    index += 4;
                }
            } else if (data == 'f') {
                index += 1;
                if (s.charAt(index) == 'o') {
                    answer.append(4);
                } else {
                    answer.append(5);
                }
                index += 3;
            } else if (data == 's') {
                index += 1;
                if (s.charAt(index) == 'i') {
                    answer.append(6);
                    index += 2;
                } else {
                    answer.append(7);
                    index += 4;
                }
            } else if (data == 'e') {
                answer.append(8);
                index += 5;
            } else if (data == 'n') {
                answer.append(9);
                index += 4;
            } else {
                answer.append(data);
                index += 1;
            }
        }
        return Integer.parseInt(answer.toString());
    }

     */

    public int solution(String s) {
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < 10; i++) {
            s = s.replaceAll(words[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
}
