package inflearn.중복_확인;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        System.out.println(main.solution());
    }

    public String solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] inputData = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        List<Integer> favoriteNumber = new ArrayList<>();
        for (int data : inputData) {
            if (favoriteNumber.contains(data)) {
                return "D";
            }
            favoriteNumber.add(data);
        }
        return "U";
    }
}
