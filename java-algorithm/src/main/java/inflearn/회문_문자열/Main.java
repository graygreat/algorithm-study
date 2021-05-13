package inflearn.회문_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        System.out.println(main.solution());
    }

    public String solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputData = br.readLine();
        inputData = inputData.toLowerCase(Locale.ROOT);
        int firstIndex = 0;
        int lastIndex = inputData.length() - 1;

        while (firstIndex < lastIndex) {
            if (inputData.charAt(firstIndex) == inputData.charAt(lastIndex)) {
                firstIndex += 1;
                lastIndex -= 1;
            } else {
                return "NO";
            }
        }
        return "YES";
    }
}
