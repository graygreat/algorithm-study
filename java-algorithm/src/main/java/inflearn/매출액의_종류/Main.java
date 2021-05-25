package inflearn.매출액의_종류;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] countData = Arrays.asList(br.readLine().split(" ")).stream()
                .mapToInt(Integer::parseInt).toArray();
        int n = countData[0];
        int k = countData[1];
        int[] inputData = Arrays.asList(br.readLine().split(" ")).stream()
                .mapToInt(Integer::parseInt).toArray();
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> answer = new ArrayList<>();

        /**
         * 내 방식
         */
        /*
        for (int i = 0; i < n; i++) {
            map.put(inputData[i], map.getOrDefault(inputData[i], 0) + 1);

            if (i >= k - 1) {
                if (i >= k) {
                    map.put(inputData[i - k], map.get(inputData[i - k]) - 1);
                    if (map.get(inputData[i - k]) == 0) {
                        map.remove(inputData[i - k]);
                    }
                }
                answer.add(map.size());
            }
        }
         */
        for (int i = 0; i < k - 1; i++) {
            map.put(inputData[i], map.getOrDefault(inputData[i], 0) + 1);
        }

        int lt = 0;
        for (int rt = k - 1; rt < n; rt++) {
            map.put(inputData[rt], map.getOrDefault(inputData[rt], 0) + 1);
            answer.add(map.size());
            map.put(inputData[lt], map.get(inputData[lt]) - 1);
            if (map.get(inputData[lt]) == 0) {
                map.remove(inputData[lt]);
            }
            lt += 1;
        }

        answer.stream()
                .forEach(x -> System.out.print(x + " "));
    }
}
