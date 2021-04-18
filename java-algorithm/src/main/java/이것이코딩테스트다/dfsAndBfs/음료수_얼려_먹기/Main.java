package 이것이코딩테스트다.dfsAndBfs.음료수_얼려_먹기;

import java.util.Scanner;

public class Main {
    private static int n, m;
    private static int[][] graph = new int[1000][1000];
    private static int[] dx = {0, -1, 0, 1};
    private static int[] dy = {-1, 0, 1, 0};

    private static boolean dfs(int x, int y) {
        if (x < 0 || y < 0 || x >= n || y >= m) {
            return false;
        }
        if (graph[x][y] == 0) {
            graph[x][y] = 1;
            for (int i = 0; i < 4; i++) {
                dfs(x + dx[i], y + dy[i]);
            }
            System.out.println(x + " " + y);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        scanner.nextLine();
        int result = 0;

        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(i, j)) {
                    result += 1;
                }
            }
        }
        System.out.println(result);
    }
}

/*
4 5
00110
00011
11111
00000
 */