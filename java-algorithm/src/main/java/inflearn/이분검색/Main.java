package inflearn.이분검색;

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

        int[] countArray = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int n = countArray[0];
        int k = countArray[1];
        int[] inputArray = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        Arrays.sort(inputArray);

        int lt = 0, rt = n - 1;
        while (true) {
            int mid = (lt + rt) / 2;
            if (inputArray[mid] == k) {
                return mid + 1;
            } else if (inputArray[mid] > k) {
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
    }
    /*
    public int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] countArray = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int[] inputArray = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int answer = 0;
        Arrays.sort(inputArray);

        for (int i = 0; i < countArray[0]; i++) {
            if (countArray[1] == inputArray[i]) {
                answer = i + 1;
            }
        }
        return answer;
    }

     */
}
