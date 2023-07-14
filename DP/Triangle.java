package DP;

import java.util.List;

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] dp=new int[triangle.size()+1];

        for (int i =0 ; i<triangle.size() ; i++) {
            dp[i]+=triangle.get(triangle.size()-1).get(i);
        }
        for (int i = triangle.size()-2; i >=0 ; i--) {
            for (int j = 0; j < i+1; j++) {
                dp[j]=triangle.get(i).get(j) + Math.min(dp[j],dp[j+1]);
            }
        }
        return dp[0];
    }
}
