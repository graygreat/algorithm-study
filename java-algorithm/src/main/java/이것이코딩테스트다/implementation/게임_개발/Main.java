package 이것이코딩테스트다.implementation.게임_개발;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static int n, m, x, y, direction;
    private static int[][] graph = new int[50][50];

    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solution());
    }
    private static void turnLeft() {
        direction -= 1;
        if (direction == -1) {
            direction = 3;
        }
    }

    private int solution() {
        n = scanner.nextInt();
        m = scanner.nextInt();

        x = scanner.nextInt();
        y = scanner.nextInt();
        direction = scanner.nextInt();
        graph[x][y] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }

        int count = 1;
        int turnTime = 0;
        while (true) {
            turnLeft();
            int nx = x + dx[direction];
            int ny = y + dy[direction];

            if (graph[nx][ny] == 0) {
                graph[nx][ny] = 1;
                x = nx;
                y = ny;
                count += 1;
                turnTime = 0;
                continue;
            } else {
                turnTime += 1;
            }

            if (turnTime == 4) {
                nx = x - dx[direction];
                ny = y - dy[direction];
                if (graph[nx][ny] == 0) {
                    x = nx;
                    y = ny;
                } else {
                    break;
                }
            }
        }
        return count;
    }
}
