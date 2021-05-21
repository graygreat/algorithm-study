package inflearn.봉우리;

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
            for (int j = 0; j < n; j++) {
                if (search(inputData, i, j, n)) {
                    answer += 1;
                }
            }
        }
        return answer;
    }

    public boolean search(int[][] data, int x, int y, int n) {
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        int value = data[x][y];

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx >= n || ny >= n) {
                continue;
            }

            if (value <= data[nx][ny]) {
                return false;
            }
        }
        return true;
    }
}
