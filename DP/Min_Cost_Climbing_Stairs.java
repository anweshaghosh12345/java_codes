package DP;

public class Min_Cost_Climbing_Stairs {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length];
        int n=cost.length;
        dp[n-1]=0;
        for (int i = n-2; i >=0 ; i--) {
            dp[i]=cost[i]+ Math.min(dp[i+2],dp[i+1]);
        }
        return Math.min(dp[0],dp[1]);
    }
}
