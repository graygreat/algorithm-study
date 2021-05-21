package inflearn.두_배열_합치기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] inputData1 = Arrays.asList(br.readLine().split(" ")).stream()
                .mapToInt(Integer::parseInt).toArray();
        int m = Integer.parseInt(br.readLine());
        int[] inputData2 = Arrays.asList(br.readLine().split(" ")).stream()
                .mapToInt(Integer::parseInt).toArray();

        List<Integer> answer = new ArrayList<>();
        int fi = 0;
        int si = 0;

        while (fi < n || si < m) {
            if (fi == n) {
                answer.add(inputData2[si]);
                si += 1;
                continue;
            }
            if (si == m) {
                answer.add(inputData1[fi]);
                fi += 1;
                continue;
            }
            if (inputData1[fi] <= inputData2[si]) {
                answer.add(inputData1[fi]);
                fi += 1;
            } else {
                answer.add(inputData2[si]);
                si += 1;
            }
        }

        answer.stream()
                .forEach(x -> System.out.print(x + " "));
    }
}
