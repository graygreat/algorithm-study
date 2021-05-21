package inflearn.최대_길이_연속부분수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }

    public int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] countData = Arrays.asList(br.readLine().split(" ")).stream()
                .mapToInt(Integer::parseInt).toArray();
        int n = countData[0];
        int k = countData[1];
        int[] inputData = Arrays.asList(br.readLine().split(" ")).stream()
                .mapToInt(Integer::parseInt).toArray();

        return 0;
    }
}
