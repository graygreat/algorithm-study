package 이것이코딩테스트다.greedy.큰_수의_법칙;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solution());
    }

    public int solution() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        int[] data = new int[n];

        for (int i = 0; i < n; i++) {
            data[i] = scanner.nextInt();
        }

        Arrays.sort(data);

        int count = 0;
        int answer = 0;
        for (int i = 0; i < m; i++) {
            if (count == k) {
                answer += data[n - 2];
                System.out.println(data[n - 2]);
                count = 0;
            } else {
                answer += data[n - 1];
                System.out.println(data[n - 1]);
            }
            count += 1;
        }
        return answer;
    }
}

/**
 5 8 3
 2 4 5 4 6
 */