package Pro_11720;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        int N = scan.nextInt();
        String str = scan.next();
        for(int i = 0; i < N; i++){
            sum += (str.charAt(i) - '0');
        }
        System.out.println(sum);
    }
}
