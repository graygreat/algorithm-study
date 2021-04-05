package programmers.level1.비밀지도;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] arr1 = {9, 20, 28, 18, 11};
//        int[] arr2 = {30, 1, 21, 17, 28};
        int[] arr1 = {46, 33, 33, 22, 31, 50};
        int[] arr2 = {27, 56, 19, 14, 14, 10};
        solution.solution(6, arr1, arr2);
    }
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] stringArray1 = new String[n];
        String[] stringArray2 = new String[n];
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            stringArray1[i] = Integer.toBinaryString(arr1[i]);
            stringArray2[i] = Integer.toBinaryString(arr2[i]);

            if (stringArray1[i].length() != n) {
                int stringLengthDifference = n - stringArray1[i].length();
                for (int j = 0; j < stringLengthDifference; j++) {
                    stringArray1[i] = "0" + stringArray1[i];
                }
            }
//            System.out.println(stringArray1[i]);
            if (stringArray2[i].length() != n) {
                int stringLengthDifference = n - stringArray2[i].length();
                for (int j = 0; j < stringLengthDifference; j++) {
                    stringArray2[i] = "0" + stringArray2[i];
                }
            }

            answer[i] = "";
            for (int j = 0; j < n; j++) {
                if (stringArray1[i].charAt(j) == '1' || stringArray2[i].charAt(j) == '1') {
                    answer[i] += "#";
                } else {
                    answer[i] += " ";
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(answer[i]);
        }
        return answer;
    }
}
