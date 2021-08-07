package hackerrank.java_stdin_stdout;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        double second = scanner.nextDouble();
        scanner.nextLine();
        String third = scanner.nextLine();

        System.out.println("String: " + third);
        System.out.println("Double: " + second);
        System.out.println("Int: " + first);
    }
}
