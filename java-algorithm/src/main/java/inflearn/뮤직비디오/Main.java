package inflearn.뮤직비디오;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        System.out.println(main.solution());
    }

    public int countValue(int[] data, int capacity) {
        int count = 1;
        int sum = 0;

        for (int x : data) {
            if (sum + x > capacity) {
                count += 1;
                sum = x;
            } else {
                sum += x;
            }
        }
        return count;
    }

    public int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] countArray = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int n = countArray[0], m = countArray[1];
        int[] inputData = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int lt = Arrays.stream(inputData).max().getAsInt();
        int rt = Arrays.stream(inputData).sum();

        int answer = 0;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (countValue(inputData, mid) <= m) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        return answer;
    }
}
