package inflearn.중복문자제거;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        System.out.println(main.solution());
    }

    public String solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputData = br.readLine();
        List<Character> answer = new ArrayList<>();
        StringBuilder result = new StringBuilder();

        for (char c : inputData.toCharArray()) {
            if (!answer.contains(c)) {
                answer.add(c);
            }
        }

        for (Character c : answer) {
            result.append(c);
        }

        return result.toString();
    }
}
