package 이것이코딩테스트다.greedy.문자열_뒤집기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solution());
    }

    public int solution() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int zeroCount = 0;
        int oneCount = 0;
        char flag = s.charAt(0);

        for (char c : s.toCharArray()) {
            if (flag == '1' && c == '0') {
                flag = '0';
                zeroCount += 1;
            } else if (flag == '0' && c == '1'){
                flag = '1';
                oneCount += 1;
            }
        }

        return Math.min(zeroCount, oneCount);
    }
}
