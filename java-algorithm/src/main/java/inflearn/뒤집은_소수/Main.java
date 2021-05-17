package inflearn.뒤집은_소수;

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
        int n = Integer.parseInt(br.readLine());

        String[] inputData = br.readLine().split(" ");

        for (String data : inputData) {
            data = new StringBuilder(data).reverse().toString();
            if (isPrime(Integer.parseInt(data))) {
                System.out.print(Integer.parseInt(data) + " ");
            }
        }
    }

    public boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
