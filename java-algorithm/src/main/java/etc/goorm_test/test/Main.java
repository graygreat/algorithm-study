package etc.goorm_test.test;

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
        int answer = 1;

        if (n == 1) {
            return 1;
        }
        n = n - 1;
        k = k - 1;
        if (n % k == 0) {
            return n / k;
        } else {
            return n / k + 1;
        }
    }
}

