package inflearn.연속_부분수열;

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
        int[] countData = Arrays.asList(br.readLine().split(" ")).stream()
                .mapToInt(Integer::parseInt).toArray();
        int n = countData[0];
        int m = countData[1];
        int[] inputData = Arrays.asList(br.readLine().split(" ")).stream()
                .mapToInt(Integer::parseInt).toArray();

        int pi = 0;
        int pj = 0;
        int sumValue = 0;
        int answer = 0;
        for (int i = 0; i < n; i++) {
            while (sumValue < m) {
                if (pj >= n) {
                    break;
                }
                sumValue += inputData[pj];
                pj += 1;
            }
            if (sumValue == m) {
                answer += 1;
            }
            sumValue -= inputData[pi];
            pi += 1;
        }
        return answer;
    }
}
