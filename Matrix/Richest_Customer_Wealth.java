package Matrix;

public class Richest_Customer_Wealth {
    public int maximumWealth(int[][] accounts) {

        int max=accounts[0][0];
        int r=accounts.length;
        int c=accounts[0].length;

        for (int i = 0; i < r; i++) {
            int sum=0;
            for (int j = 0; j < c; j++) {
                sum+=accounts[i][j];
                if(j==c-1)
                {
                    max=Math.max(sum,max);
                }
            }

        }
        return max;
    }
}
