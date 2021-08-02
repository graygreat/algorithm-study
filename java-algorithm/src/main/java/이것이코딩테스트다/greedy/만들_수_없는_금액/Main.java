package 이것이코딩테스트다.greedy.만들_수_없는_금액;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solution());
    }

    public int solution() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        int target = 1;

        for (int i : array) {
            if (target < i) {
                break;
            }
            target += i;
        }

        return target;
    }
}
