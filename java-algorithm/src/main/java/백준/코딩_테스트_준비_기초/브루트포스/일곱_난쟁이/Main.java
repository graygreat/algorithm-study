package 백준.코딩_테스트_준비_기초.브루트포스.일곱_난쟁이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] inputData = new int[9];
        boolean check = false;
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            inputData[i] = Integer.parseInt(br.readLine());
            sum += inputData[i];
        }

        for (int i = 0; i < 9; i++) {
            if (check) {
                break;
            }
            for (int j = 0; j < 9; j++) {
                if (i == j) {
                    continue;
                }
                if (sum - inputData[i] - inputData[j] == 100) {
                    inputData[i] = 0;
                    inputData[j] = 0;
                    check = true;
                    break;
                }
            }
        }
        Arrays.sort(inputData);
        Arrays.stream(inputData)
                .filter(x -> x != 0)
                .forEach(x -> System.out.println(x));
    }
}

