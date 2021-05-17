package inflearn.격자판_최대합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        System.out.println(main.solution());
    }

    public int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] inputData = new int[n][n];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            inputData[i] = Arrays.asList(br.readLine().split(" ")).stream()
                    .mapToInt(Integer::parseInt).toArray();
        }
        for (int i = 0; i < n; i++) {
            int horizontalSum = 0;
            int verticalSum = 0;

            for (int j = 0; j < n; j++) {
                horizontalSum += inputData[i][j];
                verticalSum += inputData[j][i];

            }

            answer = Math.max(answer, horizontalSum);
            answer = Math.max(answer, verticalSum);
        }

        int diagonalSum1 = 0;
        int diagonalSum2 = 0;

        for (int i = 0; i < n; i++) {
            diagonalSum1 += inputData[i][i];
            diagonalSum2 += inputData[i][n - i - 1];
        }

        answer = Math.max(answer, diagonalSum1);
        answer = Math.max(answer, diagonalSum2);

        return answer;
    }
}
