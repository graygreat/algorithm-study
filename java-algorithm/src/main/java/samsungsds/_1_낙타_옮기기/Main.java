package samsungsds._1_낙타_옮기기;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }

    public void solution() {
        BufferedReader reader;
        String filename = "/Users/bennie/SourceCode/Algorithm/Algorithm/java-algorithm/src/main/java/samsungsds/_1_낙타_옮기기/sample_input.txt";
        try {
            reader = new BufferedReader(new FileReader(filename));
            int t = Integer.parseInt(reader.readLine());

            for (int i = 0; i < t; i++) {
                int n = Integer.parseInt(reader.readLine());
                int[] array = Arrays.stream(reader.readLine().split(" "))
                        .mapToInt(Integer::parseInt).toArray();
                Arrays.sort(array);

                int time = move(array, n);

                System.out.println("#" + (i + 1) + " " + time);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int move(int[] array, int n) {
        if (n < 3) {
            return array[n - 1];
        }
        if (n == 3) {
            return array[0] + array[1] + array[2];
        }
        return move(array, n - 2) + Math.min(array[n - 1] + array[n - 2] + 2 * array[0], array[0] + array[n - 1] + 2 * array[1]);
    }
}
