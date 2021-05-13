package inflearn.유효한_팰린드롬;

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
        String inputData = br.readLine().toLowerCase(Locale.ROOT).replaceAll("[^a-z]", "");
        String tmp = new StringBuilder(inputData).reverse().toString();

        if (inputData.equals(tmp)) {
            return "YES";
        }
        return "NO";
    }

    /*
    public String solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputData = br.readLine().toLowerCase(Locale.ROOT);
        StringBuilder result = new StringBuilder();
        for (char c : inputData.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                result.append(c);
            }
        }
        int firstIndex = 0;
        int lastIndex = result.length() - 1;

        while (firstIndex < lastIndex) {
            char leftData = result.charAt(firstIndex);
            char rightData = result.charAt(lastIndex);

            if (leftData == rightData) {
                firstIndex += 1;
                lastIndex -= 1;
            } else {
                return "NO";
            }
        }
        return "YES";
    }

     */
}
