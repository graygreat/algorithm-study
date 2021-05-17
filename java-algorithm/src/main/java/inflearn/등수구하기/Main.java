package inflearn.등수구하기;

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
        int n = Integer.parseInt(br.readLine());
        int[] inputData = Arrays.asList(br.readLine().split(" ")).stream()
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = 0; j < n; j++) {
                if (inputData[i] < inputData[j]) {
                    count += 1;
                }
            }
            answer[i] = count;
        }

        Arrays.stream(answer)
                .forEach(x -> System.out.print(x + " "));
    }
}
