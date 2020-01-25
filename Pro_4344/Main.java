package Pro_4344;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> avg = new ArrayList<>();

        int c = scan.nextInt();

        for (int i = 0; i < c; i++) {
            double count = 0;
            int n = scan.nextInt();
            double sum = 0;
            int score[] = new int[n];

            for (int j = 0; j < n; j++) {
                score[j] = scan.nextInt();
                sum += score[j];
            }

            for (int k = 0; k < n; k++) {
                if ((sum / n) < score[k]) {
                    count++;
                }
            }
            avg.add((count / n) * 100);

        }

        for (int i = 0; i < c; i++) {
            System.out.printf("%.3f", avg.get(i));
            System.out.println("%");
        }

    }
}