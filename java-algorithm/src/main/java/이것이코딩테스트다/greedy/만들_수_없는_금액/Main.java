package 이것이코딩테스트다.greedy.만들_수_없는_금액;

import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solution());
    }

    private int solution() {
        int n = scanner.nextInt();
        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arrayList.add(scanner.nextInt());
        }

        Collections.sort(arrayList, Comparator.reverseOrder());

        int target = 1;
        for (int i = 0; i < n; i++) {
            if (target < arrayList.get(i)) {
                break;
            }
            target += arrayList.get(i);
        }
        return target;
    }
}
