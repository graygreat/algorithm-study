package inflearn.최대_길이_연속부분수열;

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
        int k = countData[1];
        int[] inputData = Arrays.asList(br.readLine().split(" ")).stream()
                .mapToInt(Integer::parseInt).toArray();

        int count = 0;
        int pi, pj = 0;
        int answer = 0;
        for (pi = 0; pi < n; pi++) {
            if (inputData[pi] == 0) {
                count += 1;
            }
            while (count > k) {
                if (inputData[pj] == 0) {
                    count -= 1;
                }
                pj += 1;
            }
            answer = Math.max(answer, pi - pj + 1);
        }
        return answer;
    }
}
