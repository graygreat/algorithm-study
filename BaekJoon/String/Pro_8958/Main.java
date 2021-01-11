package Pro_8958;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        scan.nextLine();
        int count[] = new int[num];

        for (int i = 0; i < num; i++) {
            String str = scan.nextLine();
            int okCount[] = new int[str.length()];
            if (str.charAt(0) == 'O') {
                count[i] += 1;
                okCount[0] = 1;
            }
            for (int j = 1; j < str.length(); j++) {
                if (str.charAt(j) == 'O' && str.charAt(j - 1) == 'O') {
                    okCount[j] += okCount[j - 1] + 1;
                    count[i] = count[i] + okCount[j];
                } else if (str.charAt(j) == 'O') {
                    count[i] += 1;
                    okCount[j] += 1;
                }
            }
        }

        for (int i = 0; i < num; i++) {
            System.out.println(count[i]);
        }
    }
}
