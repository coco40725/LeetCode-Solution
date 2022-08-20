/**
 * @author Yu-Jing
 * @create 2022-08-10-PM 03:29
 */
public class Solution {
    public static void main(String[] args) {
        int[] prices = new int[]{7,6,4,3,1};
        int n = new Solution().maxProfit(prices);
        System.out.println(n);
    }
    public int maxProfit(int[] prices) {
        int buy_day = 0;
        int sell_day = 0;
        int profit = 0;

        for (int k = 0; k < prices.length ; k++){
            // update buy_day
            if (prices[buy_day] > prices[k]){
                buy_day = k;
                if (k == prices.length - 1) {
                    sell_day = k;
                }else{
                    sell_day = k + 1;
                }

            }
            // update sell_day
            if (prices[sell_day] < prices[k]){
                sell_day = k;
            }
            // update  profit
            if (prices[sell_day] - prices[buy_day] > profit) profit = prices[sell_day] - prices[buy_day];


        }
        return profit;

    }
}
