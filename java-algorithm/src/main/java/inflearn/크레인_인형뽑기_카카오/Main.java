package inflearn.크레인_인형뽑기_카카오;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        System.out.println(main.solution());
    }

    public int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[n][n];

        for (int i = 0; i < n; i++) {
            board[i] = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
        }

        int m = Integer.parseInt(br.readLine());
        int[] moves = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        for (int move : moves) {
            int doll = -1;
            for (int i = 0; i < n; i++) {
                if (board[i][move - 1] != 0) {
                    doll = board[i][move - 1];
                    board[i][move - 1] = 0;
                    break;
                }
            }
            if (!stack.isEmpty() && stack.peek() == doll) {
                stack.pop();
                answer += 2;
            } else if (doll == -1){
                continue;
            } else {
                stack.push(doll);
            }
        }
        return answer;
    }
}
