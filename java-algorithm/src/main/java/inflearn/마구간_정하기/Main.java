package inflearn.마구간_정하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        System.out.println(main.solution());
    }

    public int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] countData = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int n = countData[0], c = countData[1];
        int[] inputData = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        Arrays.sort(inputData);

        int lt = inputData[1] - inputData[0];
        int rt = inputData[n - 1] - inputData[0];
        int mid = 0;
        int answer = 0;
        while (lt <= rt) {
            mid = (lt + rt) / 2;
            if (countValue(inputData, mid) >= c) {
                answer = mid ;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }
        return answer;
    }

    public int countValue(int[] inputData, int value) {
        int count = 1;
        int first = inputData[0];
        for (int i = 1; i < inputData.length; i++) {
            if (inputData[i] - first >= value) {
                count += 1;
                first = inputData[i];
            }
        }
        return count;
    }
}
