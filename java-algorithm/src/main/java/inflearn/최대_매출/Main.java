package inflearn.최대_매출;

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
        int[] data = Arrays.asList(br.readLine().split(" ")).stream()
                .mapToInt(Integer::parseInt).toArray();
        int[] inputData = Arrays.asList(br.readLine().split(" ")).stream()
                .mapToInt(Integer::parseInt).toArray();
        int n = data[0];
        int k = data[1];
        int sumValue = 0;
        for (int i = 0; i < k; i++) {
            sumValue += inputData[i];
        }

        int maxValue = sumValue;
        for (int i = k; i < n; i++) {
            sumValue = sumValue + inputData[i] - inputData[i - k];

            maxValue = Math.max(sumValue, maxValue);
        }
        return maxValue;
    }
    /* 이중 for문 사용
    public int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] data = Arrays.asList(br.readLine().split(" ")).stream()
                .mapToInt(Integer::parseInt).toArray();
        int[] inputData = Arrays.asList(br.readLine().split(" ")).stream()
                .mapToInt(Integer::parseInt).toArray();
        int n = data[0];
        int k = data[1];
        int maxValue = 0;

        for (int i = 0; i < n - k; i++) {
            int sumValue = 0;
            for (int j = 0; j < k; j++) {
                sumValue += inputData[i + j];
            }
            if (sumValue > maxValue) {
                maxValue = sumValue;
            }
        }
        return maxValue;
    }
     */
}
