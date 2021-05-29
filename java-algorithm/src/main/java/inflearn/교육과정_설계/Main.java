package inflearn.교육과정_설계;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        System.out.println(main.solution());
    }

    public String solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String necessary = br.readLine();
        String subject = br.readLine();

        Queue<Character> queue = new LinkedList<>();

        for (char data : necessary.toCharArray()) {
            queue.offer(data);
        }

        for (char data : subject.toCharArray()) {
            if (queue.contains(data)) {
                if (data != queue.poll()) {
                    return "NO";
                }
            }
        }
        if (!queue.isEmpty()) {
            return "NO";
        }
        return "YES";
    }
    /*
    public String solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String necessary = br.readLine();
        String subject = br.readLine();

        int pj = 0;
        int count = 0;
        for (int pi = 0; pi < subject.length(); pi++) {
            if (necessary.charAt(pj) == subject.charAt(pi)) {
                if (pj < necessary.length() - 1) {
                    pj += 1;
                }
                count += 1;
            }
        }
        if (count == necessary.length()) {
            return "YES";
        }
        return "NO";
    }

     */
}
