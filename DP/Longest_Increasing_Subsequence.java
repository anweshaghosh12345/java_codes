package DP;

import java.util.Arrays;

public class Longest_Increasing_Subsequence {
    public static int recursion(int indx, int prev,int[]nums,int[][] dp){
        if(indx>=nums.length)
            return 0;
        if(dp[indx][prev+1]!=-1)
            return dp[indx][prev+1];
        int len= recursion(indx + 1, prev, nums,dp);

        if(prev==-1 || nums[indx]>nums[prev])
            len=Math.max(len,1+recursion(indx+1,indx,nums,dp));

        return dp[indx][prev+1]=len;
    }
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[][] dp=new int[n][n+1];
        for(int row[] :dp){
            Arrays.fill(row,-1);
        }
        return recursion(0,-1,nums,dp);
    }
}
/*
 public static int recursion(int indx, int prev,int[]nums){
        if(indx>=nums.length)
            return 0;
        int nottake=0+recursion(indx+1,prev,nums);
        int take =-1;
        if(prev==-1 || nums[indx]>nums[prev])
            take=1+recursion(indx+1,indx,nums);

        return Math.max(take,nottake);
    }
    public int lengthOfLIS(int[] nums) {
        return recursion(0,-1,nums);
    }
 */
