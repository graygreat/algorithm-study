package 이것이코딩테스트다.greedy.모험가_길드;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solution());
    }

    private int solution() {
        int n = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arrayList.add(scanner.nextInt());
        }

        Collections.sort(arrayList);
        int result = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            count += 1;
            if (count >= arrayList.get(i)) {
                count = 0;
                result += 1;
            }
        }
        return result;
    }
}
