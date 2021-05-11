package 백준.제로;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        System.out.println(main.solution());
    }

    public int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        List<Integer> answer = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < k; i++) {
            int num = Integer.parseInt(br.readLine());
            int size = answer.size();

            if (num == 0) {
                if (size == 0) {
                    continue;
                }
                answer.remove(size - 1);
                continue;
            }

            answer.add(num);
        }

        for (int num : answer) {
            sum += num;
        }

        return sum;
    }
}
