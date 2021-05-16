package inflearn.문자열_압축;

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
        String inputData = br.readLine();
        StringBuilder answer = new StringBuilder();
        answer.append(inputData.charAt(0));
        int count = 1;

        for (int i = 1; i < inputData.length(); i++) {
            if (inputData.charAt(i - 1) == inputData.charAt(i)) {
                count += 1;
            } else {
                if (count > 1) {
                    answer.append(count);
                }
                answer.append(inputData.charAt(i));
                count = 1;
            }
            if (i == inputData.length() - 1 && count > 1) {
                answer.append(count);
            }
        }
        return answer.toString();
    }
}
