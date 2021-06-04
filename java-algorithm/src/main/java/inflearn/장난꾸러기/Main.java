package inflearn.장난꾸러기;

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
        int[] inputData = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int[] temp = inputData.clone();
        Arrays.sort(temp);

        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (inputData[i] != temp[i]) {
                answer.add(i + 1);
            }
        }
        answer.stream()
                .forEach(x -> System.out.print(x + " "));
    }
}
