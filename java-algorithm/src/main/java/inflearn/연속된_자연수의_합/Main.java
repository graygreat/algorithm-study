package inflearn.연속된_자연수의_합;

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
        int[] data = new int[n];

        for (int i = 0; i < n; i++) {
            data[i] = i + 1;
        }

        int pi = 0, pj = 0, sumValue = 0;
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (pj >= n) {
                break;
            }
            while (sumValue < n) {
                sumValue += data[pj++];
            }
            if (sumValue == n) {
                answer += 1;
            }
            sumValue -= data[pi++];
        }
        return answer;
    }
}
