package inflearn.가위바위보;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] a = br.readLine().split(" ");
        String[] b = br.readLine().split(" ");
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int result = Integer.parseInt(a[i]) - Integer.parseInt(b[i]);

            if (result == 1 || result == -2) {
                answer.add("A");
            } else if (result == -1 || result == 2) {
                answer.add("B");
            } else {
                answer.add("D");
            }
        }

        answer.stream()
                .forEach(x -> System.out.println(x));
    }
}
