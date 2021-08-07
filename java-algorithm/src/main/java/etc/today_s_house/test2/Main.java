package etc.today_s_house.test2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        System.out.println(main.solution());
    }

    public int solution() throws IOException {
        Scanner scanner = new Scanner(System.in);

        int answer = 0;

        int n = scanner.nextInt();

        int[] speed = new int[n];

        for (int i = 0; i < n; i++) {
            speed[i] = scanner.nextInt();
        }

        Arrays.sort(speed);

        int count = speed.length;

        answer = cross(speed, count);

        return answer;
    }

    public int cross(int[] speed, int count) {
        int first, second;

        if (count == 1) {
            return speed[0];
        } else if (count == 2) {
            return speed[1];
        } else if (count == 3) {
            return speed[0] + speed[1] + speed[2];
        } else {
            first = speed[0];
            second = speed[1];
        }

        return cross(speed, count - 2) + first + (second * 2) + speed[count - 1];
    }
}
