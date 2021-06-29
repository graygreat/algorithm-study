package programmers.level1.크레인_인형뽑기_게임;

import java.util.Stack;

class Solution {

    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        Solution solution = new Solution();
        System.out.println(solution.solution(board, moves));
    }

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int length = board.length;
        Stack<Integer> stack = new Stack<>();

        for (int move : moves) {
            for (int i = 0; i < length; i++) {
                if (board[i][move - 1] != 0) {
                    if (stack.size() > 0 && stack.peek() == board[i][move - 1]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[i][move - 1]);
                    }
                    board[i][move - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}