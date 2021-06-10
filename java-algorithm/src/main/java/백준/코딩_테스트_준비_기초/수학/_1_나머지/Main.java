package 백준.코딩_테스트_준비_기초.수학._1_나머지;

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
        int[] inputData = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        System.out.println((inputData[0] + inputData[1]) % inputData[2]);
        System.out.println(((inputData[0] % inputData[2]) + (inputData[1] % inputData[2])) % inputData[2]);
        System.out.println((inputData[0] * inputData[1]) % inputData[2]);
        System.out.println(((inputData[0] % inputData[2]) * (inputData[1] % inputData[2])) % inputData[2]);
    }
}
