package 백준.배열합치기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] countData = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int n = countData[0];
        int m = countData[1];
        StringBuilder answer = new StringBuilder();

        int[][] list = new int[2][];
        for (int i = 0; i < 2; i++) {
            list[i] = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
        }

        int pi = 0, pj = 0;
        while (pi < n || pj < m) {
            if (pi == n) {
                answer.append(list[1][pj++] + " ");
                continue;
            }
            if (pj == m) {
                answer.append(list[0][pi++] + " ");
                continue;
            }
            if (list[0][pi] > list[1][pj]) {
                answer.append(list[1][pj++] + " ");
            } else {
                answer.append(list[0][pi++] + " ");
            }
        }

        System.out.println(answer.toString());
    }
}
