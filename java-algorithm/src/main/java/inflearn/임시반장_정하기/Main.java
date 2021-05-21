package inflearn.임시반장_정하기;

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
        int n = Integer.parseInt(br.readLine());
        int[][] inputData = new int[n][n];

        for (int i = 0; i < n; i++) {
            inputData[i] = Arrays.asList(br.readLine().split(" ")).stream()
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int maxValue = 0;
        int studentNo = 1;
        for (int i = 0; i < n; i++) {
            int value = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                for (int k = 0; k < 5; k++) {
                    if (inputData[i][k] == inputData[j][k]) {
                        value += 1;
                        break;
                    }
                }
            }
            if (maxValue < value) {
                maxValue = value;
                studentNo = i + 1;
            }
        }

        return studentNo;
    }
}
