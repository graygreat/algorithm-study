package 이것이코딩테스트다.greedy.거스름돈;

public class Main {
    public int solution(int n) {
        int count = 0;
        int[] coinTypes = {500, 100, 50, 10};

        for (int i = 0; i < coinTypes.length; i++) {
            count += n / coinTypes[i];
            n %= coinTypes[i];
        }

        return count;
    }
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solution(1260));
    }
}
