package 백준.코딩_테스트_준비_기초.수학._4_약수의_합_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        System.out.println(main.solution());
    }

    public long solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long result = 0;

        for (int i = 1; i <= n; i++) {
            result += i * (n / i);
        }

        return result;
    }
}
