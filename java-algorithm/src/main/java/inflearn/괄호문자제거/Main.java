package inflearn.괄호문자제거;

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

        int count = 0;
        for (char c : inputData.toCharArray()) {
            if (c == '(') {
                count += 1;
            } else if (c == ')'){
                count -= 1;
            } else if (count == 0){
                answer.append(c);
            }
        }

        return answer.toString();
    }
}
