package etc.skt.first.test3;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public static void main(String[] args) {
        String[] board = {"...", "...", "..."};
        String moves = "DDURRR";
        Solution solution = new Solution();
        int[] result = solution.solution(board, moves);

        System.out.println(result[0] + " " + result[1]);
    }

    public int[] solution(String[] board, String moves) {
        // write your code in Java SE 8
        int n = board.length;
        int m = board[0].length();
        char[] moveTypes = {'L', 'R', 'U', 'D'};
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        int x = 0, y = 0;
        int nx = -1, ny = -1;
        int[] answer = new int[2];

        for (Character move : moves.toCharArray()) {
            for (int i = 0; i < 4; i++) {
                if (moveTypes[i] == move) {
                    nx = x + dx[i];
                    ny = y + dy[i];
                    break;
                }
            }
            if (nx >= n || ny >= m || nx < 0 || ny < 0 || board[nx].charAt(ny) == '#') {
                continue;
            }
            x = nx;
            y = ny;
        }
        answer[0] = x;
        answer[1] = y;

        return answer;
    }
}