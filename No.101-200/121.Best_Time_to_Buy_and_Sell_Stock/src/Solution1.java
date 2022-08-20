/**
 * @author Yu-Jing
 * @create 2022-08-10-PM 04:00
 */
public class Solution1 {
    public int maxProfit(int[] prices) {
        int buy_day = 0;
        int profit = 0;

        for (int k = 0; k < prices.length; k++) {
            if (prices[k] < prices[buy_day]) buy_day = k;
            profit = Math.max(profit, prices[k] - prices[buy_day]);

        }
        return profit;
    }
}
