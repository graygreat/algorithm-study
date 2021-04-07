package programmers.level1.핸드폰_번호_가리기;

class Solution {
    public static void main(String[] args) {
        String phone_number = "01033334444";
        Solution solution = new Solution();
        System.out.println(solution.solution(phone_number));
    }
    public String solution(String phone_number) {
        String answer = "";
        int length = phone_number.length() - 4;
        for (int i = 0; i < length; i++) {
            answer += "*";
        }
        answer += phone_number.substring(length, length + 4);
        return answer;
    }
}
