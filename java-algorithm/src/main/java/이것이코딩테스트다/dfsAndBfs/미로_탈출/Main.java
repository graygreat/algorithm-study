package 이것이코딩테스트다.dfsAndBfs.미로_탈출;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    private int x;
    private int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class Main {

    private static int[][] graph;
    private static int n, m;
    private static int dx[] = {-1, 1, 0, 0};
    private static int dy[] = {0, 0, -1, 1};

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
        graph = new int[n + 1][m + 1];

        for (int i = 0; i < n; i++) {
            String row = br.readLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = row.charAt(j) - '0';
            }
        }

        return bfs(new Node(0, 0));
    }

    public int bfs(Node inputNode) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(inputNode);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            int x = node.getX();
            int y = node.getY();

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                    continue;
                }
                if (graph[nx][ny] == 0) {
                    continue;
                }
                if (graph[nx][ny] == 1) {
                    graph[nx][ny] = graph[x][y] + 1;
                    queue.offer(new Node(nx, ny));
                }
            }
        }
        return graph[n - 1][m - 1];
    }
}
/*
5 6
101010
111111
000001
111111
111111
 */