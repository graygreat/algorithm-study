package inflearn.암호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        System.out.println(main.solution());
    }

    public String solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String inputData = br.readLine();
        StringBuilder result = new StringBuilder();
        StringBuilder answer = new StringBuilder();

        for (char c : inputData.toCharArray()) {
            if (c == '#') {
                result.append(1);
            } else {
                result.append(0);
            }

            if (result.length() % 7 == 0) {
                int num = Integer.parseInt(result.toString(), 2);
                answer.append((char) num);
                result.setLength(0);
            }
        }
        return answer.toString();
    }
}
