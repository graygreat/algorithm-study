package etc.dev_carnival.problem2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

public class Main {
    private static int[] dx = {1, 0, -1, 0};
    private static int[] dy = {0, 1, 0, -1};
    private static int n;
    private static List<String> graph;
    private static int[] locate;
    private static boolean[][] visited;
    private static int count;
    private static int answer;

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }

    public int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String arr = br.readLine();
            graph.add(arr);
        }

        locate = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (graph.get(i).charAt(j) == '.' || graph.get(i).charAt(j) == 'D'
                        || !visited[i][j]) {
                    Node node1 = new Node(locate[0], locate[1]);
                    dfs(node1);
                    Node node2 = new Node(locate[2], locate[3]);
                    dfs(node2);
                }
            }
        }
        return answer;
    }

    private static void dfs(Node node) {
        int x = node.getX();
        int y = node.getY();


        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[x];
            int ny = y + dy[y];

            if (nx < 0 || ny < 0 || nx >= x || ny >= y) {
                continue;
            }

            if (graph.get(nx).charAt(ny) == '.' || graph.get(nx).charAt(ny) == 'D'
                    || !visited[nx][ny]) {
                count += 1;
                answer = Math.max(count, answer);
                dfs(new Node(nx, ny));
            }
        }
    }
}
