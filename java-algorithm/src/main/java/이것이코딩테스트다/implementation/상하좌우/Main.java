package 이것이코딩테스트다.implementation.상하좌우;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }

    public void solution() throws IOException {
        char[] moveTypes = {'L', 'R', 'U', 'D'};
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        int x = 1, y = 1;
        int nx = -1, ny = -1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] direction = br.readLine().split(" ");

        for (String move : direction) {
            for (int i = 0; i < 4; i++) {
                if (moveTypes[i] == move.charAt(0)) {
                    nx = x + dx[i];
                    ny = y + dy[i];
                    break;
                }
            }
            if (nx > 5 || ny > 5 || nx < 1 || ny < 1) {
                continue;
            }
            x = nx;
            y = ny;
        }

        System.out.println(x + " " + y);
    }
}
