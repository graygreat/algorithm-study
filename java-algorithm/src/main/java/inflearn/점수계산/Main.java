package inflearn.점수계산;

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
        int n = Integer.parseInt(br.readLine());
        int[] inputData = Arrays.asList(br.readLine().split(" ")).stream()
                .mapToInt(Integer::parseInt)
                .toArray();

        int count = 0;
        int answer = 0;
        for (int data : inputData) {
            if (data == 1) {
                count += 1;
                answer += data * count;
            } else {
                count = 0;
            }
        }
        return answer;
    }
}
