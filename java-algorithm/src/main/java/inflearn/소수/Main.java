package inflearn.소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        System.out.println(main.solution());
    }

    public int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] data = new int[n + 1];
        int count = 0;

        for (int i = 2; i <= n; i++) {
            if (data[i] == 0) {
                count += 1;
                for (int j = i; j <= n; j += i) {
                    data[j] = 1;
                }
            }
        }
        return count;
    }
}
