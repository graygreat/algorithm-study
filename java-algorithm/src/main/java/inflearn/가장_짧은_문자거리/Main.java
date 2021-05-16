package inflearn.가장_짧은_문자거리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputData = br.readLine().split(" ");
        int[] answer = new int[inputData[0].length()];
        int index = inputData[0].indexOf(inputData[1]);

        for (int i = 0; i < inputData[0].length(); i++) {
            int nextIndex = inputData[0].indexOf(inputData[1], i);
            int distance = Math.abs(index - i);
            int nextDistance = Math.abs(nextIndex - i);

            if (distance < nextDistance) {
                answer[i] = distance;
            } else {
                answer[i] = nextDistance;
                index = nextIndex;
            }
        }


        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
        System.out.println();
    }
}
