package inflearn.공통원소_구하기;

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

        Arrays.sort(inputData1);
        Arrays.sort(inputData2);

        List<Integer> answer = new ArrayList<>();
        int fi = 0;
        int si = 0;

        for (int i = 0; i < n + m; i++) {
            if (fi == n) {
                si += 1;
                continue;
            }
            if (si == m) {
                fi += 1;
                continue;
            }
            if (inputData1[fi] < inputData2[si]) {
                fi += 1;
            } else if (inputData1[fi] > inputData2[si]) {
                si += 1;
            } else {
                answer.add(inputData1[fi]);
                fi += 1;
                si += 1;
            }
        }
        answer.stream()
                .forEach(x -> System.out.print(x + " "));
    }
}
