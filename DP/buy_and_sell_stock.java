package DP;

public class buy_and_sell_stock {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxpro=0;
        for (int i = 0; i <prices.length ; i++) {
           minPrice=Math.min(minPrice,prices[i]);
           maxpro=Math.max(maxpro,prices[i]-minPrice);
        }
        return maxpro;
    }
}
