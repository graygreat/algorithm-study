package 이것이코딩테스트다.dfsAndBfs.음료수_얼려_먹기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private final int[] dx = {0, 0, -1, 1};
    private final int[] dy = {1, -1, 0, 0};
    private int[][] graph = new int[1001][1001];
    private int n, m;

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        System.out.println(main.solution());
    }

    public int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] inputData = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        n = inputData[0];
        m = inputData[1];

        for (int i = 0; i < n; i++) {
            String data = br.readLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = data.charAt(j) - '0';
            }
        }

        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(i, j)) {
                    answer += 1;
                }
            }
        }
        return answer;
    }

    private boolean dfs(int x, int y) {
        if (x < 0 || x >= n || y < 0 || y >= m) {
            return false;
        }
        if (graph[x][y] == 0) {
            graph[x][y] = 1;
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                dfs(nx, ny);
            }
            System.out.println(x + " : " + y);
            return true;
        }
        return false;
    }
}

/*
4 5
00110
00011
11111
00000
 */