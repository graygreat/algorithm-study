package 이것이코딩테스트다.implementation.왕실의_나이트;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solution());
    }

    public int solution() {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.next();
        int column = data.charAt(0) - 'a';
        int row = data.charAt(1) - '1';

        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};

        int answer = 0;
        for (int i = 0; i < 8; i++) {
            int nx = row - dx[i];
            int ny = column - dy[i];
            if (nx < 0 || ny < 0 || nx >= 8 || ny >= 8) {
                continue;
            }
            answer += 1;
        }

        return answer;
    }
}
