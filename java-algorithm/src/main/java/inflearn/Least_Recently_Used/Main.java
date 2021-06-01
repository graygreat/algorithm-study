package inflearn.Least_Recently_Used;

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
        int[] countData = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int s = countData[0];
        int n = countData[1];
        int[] inputData = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        List<Integer> cacheList = new ArrayList<>();
        for (int i = 0; i < s; i++) {
            cacheList.add(0);
        }

        for (int data : inputData) {
            if (!cacheList.contains(data)) {
                cacheList.remove(s - 1);
                cacheList.add(0, data);
                continue;
            }
            cacheList.remove(cacheList.indexOf(data));
            cacheList.add(0, data);
        }

        cacheList.stream()
                .forEach(x -> System.out.print(x + " "));
    }
}
