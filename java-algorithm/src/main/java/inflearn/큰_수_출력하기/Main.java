package inflearn.큰_수_출력하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] inputData = br.readLine().split(" ");

        Integer[] data = new Integer[n];
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            data[i] = Integer.parseInt(inputData[i]);
        }

        answer.add(data[0]);
        for (int i = 1; i < n; i++) {
            if (data[i] > data[i - 1]) {
                answer.add(data[i]);
            }
        }

        System.out.println(answer.toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",", ""));

    }
}
