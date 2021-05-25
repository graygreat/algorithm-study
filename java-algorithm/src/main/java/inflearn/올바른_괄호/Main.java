package inflearn.올바른_괄호;

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
        int count = 0;

        for (char c : inputData.toCharArray()) {
            if (c == '(') {
                count += 1;
            } else {
                if (count <= 0) {
                    return "NO";
                }
                count -= 1;
            }
        }

        if (count == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
