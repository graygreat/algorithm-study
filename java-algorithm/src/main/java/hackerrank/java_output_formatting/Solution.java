package hackerrank.java_output_formatting;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String first = scanner.next();
            int second = scanner.nextInt();

            System.out.println(String.format("%-15s", first) + String.format("%03d", second));
        }
        System.out.println("================================");
    }
}
