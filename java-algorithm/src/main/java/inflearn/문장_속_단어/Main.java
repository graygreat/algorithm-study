package inflearn.문장_속_단어;

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
        String[] inputData = br.readLine().split(" ");
        int maxLength = 0;
        String answer = "";

        for (String data : inputData) {
            if (data.length() > maxLength) {
                maxLength = data.length();
                answer = data;
            }
        }
        return answer;
    }
}
