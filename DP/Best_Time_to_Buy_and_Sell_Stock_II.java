package DP;

public class Best_Time_to_Buy_and_Sell_Stock_II {
    public int maxProfit(int[] prices) {
//        int minPrice=Integer.MAX_VALUE;
        int maxpro=0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i-1]<prices[i]){
                maxpro+=prices[i]-prices[i-1];
            }
        }
        return maxpro;
    }
}