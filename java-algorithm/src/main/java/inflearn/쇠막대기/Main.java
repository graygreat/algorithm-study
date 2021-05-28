package inflearn.쇠막대기;

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

        int count = 0;
        int answer = 0;
        char previous = ' ';
        for (char data : inputData.toCharArray()) {
            if (data == '(') {
                previous = '(';
                count += 1;
            } else {
                count -= 1;
                if (previous == ')') {
                    answer += 1;
                } else {
                    answer += count;
                }
                previous = ')';
            }
        }
        return answer;
    }
}
