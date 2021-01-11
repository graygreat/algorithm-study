package Pro_15596;

import java.util.Arrays;

class Main{
    public static void main(String args[]){
        boolean result[] = new boolean[10001];
        Arrays.fill(result, false);

        for(int i = 1; i <=  10000; i++){
            int N = NotSelfNumber(i);
            if(N <= 10000)  result[N] = true;
        }

        for(int i = 1; i <= 10000; i++){
            if(result[i] == false) {
                System.out.println(i);
            }
        }
    }

    // 생성자 있는 숫자를 반환
    static int NotSelfNumber(int num){
        int sum = num;
        while(true){
            if(num == 0)    break;
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}
