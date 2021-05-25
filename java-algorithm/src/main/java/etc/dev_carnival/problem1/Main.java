package etc.dev_carnival.problem1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] countData = Arrays.asList(br.readLine().split(" ")).stream()
                .mapToInt(Integer::parseInt).toArray();
        int n = countData[0];
        int k = countData[1];
        int[] inputData = Arrays.asList(br.readLine().split(" ")).stream()
                .mapToInt(Integer::parseInt).toArray();

        int[] reData = new int[n];
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            reData[i] = inputData[(i + k - 1) % n];
        }
        
        for (int i = 0; i < n; i++) {
            int index = 0;
            int minValue = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (minValue > reData[j]) {
                    minValue = reData[j];
                    index = j + 1;
                }
            }
            int v = (index + k - 1) % n;
            if (v == 0) {
                v = n;
            }
            answer.add(v);
            reData[index - 1] = Integer.MAX_VALUE;
        }

        answer.stream().forEach(x -> System.out.print(x + " "));
    }
}
