package programmers.level1.서울에서_김서방_찾기;

class Solution {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        Solution solution = new Solution();
        System.out.println(solution.solution(seoul));
    }
    public String solution(String[] seoul) {
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                return "김서방은 " + i + "에 있다";
            }
        }
        return "";
    }
}
