package 백준.코딩_테스트_준비_기초.수학._3_약수;

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
        int[] inputData = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int minValue = Arrays.stream(inputData).min().getAsInt();
        int maxValue = Arrays.stream(inputData).max().getAsInt();

        return maxValue * minValue;
    }
}
