package inflearn.숫자만_추출;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        System.out.println(main.solution());
    }

    public int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputData = br.readLine();
        StringBuilder answer = new StringBuilder();

        for (char c : inputData.toCharArray()) {
            if (Character.isDigit(c)) {
                answer.append(c);
            }
        }
        return Integer.parseInt(answer.toString());
    }
}
