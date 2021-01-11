import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int result = 0;
        int X = scan.nextInt();

        if(X < 100){
            System.out.println(X);
        } else {
            result = 99;
            for(int i = 100; i <= X; i++){
                int arr[] = unitDiv(i);

                if(check(arr[0], arr[1], arr[2])){
                    result += 1;
                }
            }
            if(X == 1000){
                System.out.println(result - 1);
            } else {
                System.out.println(result);
            }

        }
    }

    public static int[] unitDiv(int num){
        int arr[] = new int[3];
        for(int i = 0; i < 3; i++){
            arr[i] = num % 10;
            num = num / 10;
        }
        return arr;
    }
    public static boolean check(int a, int b, int c){
        if((a - b) == (b - c))  return true;
        else return false;
    }
}
