package inflearn.멘토링;

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
        int[] num = Arrays.asList(br.readLine().split(" ")).stream()
                .mapToInt(Integer::parseInt)
                .toArray();
        int n = num[0];
        int m = num[1];
        int[][] inputData = new int[m][n];
        int answer = 0;
        for (int i = 0; i < m; i++) {
            inputData[i] = Arrays.asList(br.readLine().split(" ")).stream()
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    continue;
                }
                int count = 0;
                int pi = 0;
                int pj = 0;
                for (int k = 0; k < m; k++) {
                    for (int s = 0; s < n; s++) {
                        if (inputData[k][s] == i) {
                            pi = s;
                        }
                        if (inputData[k][s] == j) {
                            pj = s;
                        }
                    }
                    if (pi < pj) {
                        count += 1;
                    }
                }

                if (count == m) {
                    answer += 1;
                }
            }
        }
        return answer;
    }
}
