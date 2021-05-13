package inflearn.문자_찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        System.out.println(main.solution());
    }

    public int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        s = s.toLowerCase(Locale.ROOT);
        char c = br.readLine().charAt(0);
        c = Character.toLowerCase(c);
        int answer = 0;

        /*
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                answer += 1;
            }
        }
         */
        for (char x : s.toCharArray()) {
            if (x == c) {
                answer += 1;
            }
        }
        return answer;
    }
}
