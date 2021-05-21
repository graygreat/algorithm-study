package 백준.단지번호붙이기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};
    private static int n;
    private static int[][] graph;
    private static boolean[][] visited;
    private static int[] apartment;
    private static int complex = 0;

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        graph = new int[n][n];
        visited = new boolean[n][n];
        apartment = new int[n * n];

        for (int i = 0; i < n; i++) {
            graph[i] = Arrays.asList(br.readLine().split("")).stream()
                    .mapToInt(Integer::parseInt).toArray();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (graph[i][j] == 1 && !visited[i][j]) {
                    complex += 1;
                    dfs(i, j);
                }
            }
        }

        Arrays.sort(apartment);
        System.out.println(complex);

        Arrays.stream(apartment)
                .filter(x -> x > 0)
                .forEach(x -> System.out.println(x));
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;
        apartment[complex] += 1;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx >= n || ny >= n) {
                continue;
            }

            if (graph[nx][ny] == 1 && !visited[nx][ny]) {
                dfs(nx, ny);
            }
        }
    }
}
