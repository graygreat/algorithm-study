package inflearn.보이는_학생;

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
        int n = Integer.parseInt(br.readLine());
        String[] inputData = br.readLine().split(" ");
        int min = 0;
        int count = 0;

        for (String data : inputData) {
            int height = Integer.parseInt(data);
            if (height > min) {
                count += 1;
                min = height;
            }
        }
        return count;
    }
}
