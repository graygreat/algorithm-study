package programmers.level2.카카오프렌즈_컬러링북;

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

class Solution {
    private static int[] dx = {0, -1, 0, 1};
    private static int[] dy = {-1, 0, 1, 0};
    private static boolean[][] visited;
    private static int size = 0;

    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (picture[i][j] > 0 && !visited[i][j]) {
                    size = 1;
                    bfs(i, j, picture, m, n);
                    numberOfArea += 1;
                    if (maxSizeOfOneArea < size) {
                        maxSizeOfOneArea = size;
                    }
                }
            }
        }
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;

        return answer;
    }

    private void bfs(int x, int y, int[][] picture, int m, int n) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(x, y));
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            x = node.getX();
            y = node.getY();
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || ny < 0 || nx >= m || ny >= n) {
                    continue;
                }

                if (picture[nx][ny] == picture[x][y] && !visited[nx][ny]) {
                    queue.add(new Node(nx, ny));
                    visited[nx][ny] = true;
                    size += 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] picture = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
        Solution solution = new Solution();
        int answer[] = solution.solution(6, 4, picture);
        System.out.println(answer[0] + ", " + answer[1]);
    }
}
