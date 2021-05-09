package programmers.level1.신규_아이디_추천;

class Solution {
    public static void main(String[] args) {
        String new_id = "abcdefghijklmn.p";
        Solution solution = new Solution();
        System.out.println(solution.solution(new_id));
    }

    public boolean isValid(char c) {
        if (Character.isLetterOrDigit(c)) {
            return true;
        }
        if (c == '-' || c == '_' || c == '.') {
            return true;
        }
        return false;
    }

    public String solution(String new_id) {
        StringBuilder answer = new StringBuilder();

        boolean lastDot = false;
        for (char c : new_id.toCharArray()) {
            if (!isValid(c)) {
                continue;
            }
            if (c == '.') {
                if (answer.length() == 0|| lastDot) {
                    continue;
                }
                lastDot = true;
            } else {
                lastDot = false;
            }
            c = Character.toLowerCase(c);
            answer.append(c);
        }
        if (answer.length() == 0) {
            answer.append('a');
        }
        if (answer.length() >= 16) {
            answer.setLength(15);
        }
        if (answer.charAt(answer.length() - 1) == '.') {
            answer.deleteCharAt(answer.length() - 1);
        }

        if (answer.length() <= 2) {
            while (answer.length() < 3) {
                answer.append(answer.charAt(answer.length() - 1));
            }
        }
        return answer.toString();
    }
}
