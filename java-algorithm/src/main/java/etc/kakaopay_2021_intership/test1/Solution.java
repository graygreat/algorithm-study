package etc.kakaopay_2021_intership.test1;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(1000000000, 50, 99, 100000, 0, 6));
    }
    public int solution(int money, int minratio, int maxratio, int ranksize, int threshold, int months) {
        for (int month = 1; month <= months; month++) {
            int ownedMoney = (money / 100) * 100;
            if (ownedMoney < threshold) {
                continue;
            }
            int ratio = (ownedMoney - threshold) / ranksize + minratio;

            if (ratio > maxratio) {
                ratio = maxratio;
            }
            money = money - (ownedMoney / 100 * ratio);
        }
        return money;
    }
}
