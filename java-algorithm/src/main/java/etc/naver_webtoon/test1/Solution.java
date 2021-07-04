package etc.naver_webtoon.test1;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] prices = {13000, 88000, 10000};
        int[] discounts = {30, 20};

        Solution solution = new Solution();
        System.out.println(solution.solution(prices, discounts));
    }

    public int solution(int[] prices, int[] discounts) {
        int answer = 0;
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int priceLength = prices.length;
        int discountLength = discounts.length;

        for (int i = 0; i < discounts.length; i++) {
            answer += (prices[priceLength - 1 - i] * ((float) (100 - discounts[discountLength - 1 - i]) / 100));
        }

        for (int i = 0; i < priceLength - discountLength; i++) {
            answer += prices[i];
        }
        return answer;
    }
}