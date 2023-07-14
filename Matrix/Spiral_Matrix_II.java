package Matrix;

public class Spiral_Matrix_II {
    public int[][] generateMatrix(int n) {
        int[][] ans=new int[n][n];
        if(n==1)
            ans[0][0]=1;

        int val=1;
        for (int i = 0; i < (n+1)/2; i++) {
            for (int j = i; j <n-i ; j++) {
                ans[i][j]=val++;
            }
            for (int j = i+1; j <n-i ; j++) {
                ans[j][n-i-1]=val++;
            }
            for (int j = i+1; j <n-i ; j++) {
                ans[n-i-1][n-j-1]=val++;
            }
            for (int j = i+1; j <n-i-1 ; j++) {
                ans[n-j-1][i]=val++;
            }
        }
        return ans;
    }
}