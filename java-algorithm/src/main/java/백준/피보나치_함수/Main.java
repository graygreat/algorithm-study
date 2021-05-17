package 백준.피보나치_함수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] zero = new int[41];
        int[] one = new int[41];

        zero[0] = 1;
        zero[1] = 0;
        one[0] = 0;
        one[1] = 1;

        for (int i = 2; i < 41; i++) {
            zero[i] = zero[i - 1] + zero[i - 2];
            one[i] = one[i - 1] + one[i - 2];
        }

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(zero[n] + " " + one[n]);
        }
    }
}
