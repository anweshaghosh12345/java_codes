package DP;

public class Climbing_Stairs {
    public int climbStairs(int n) {

        if(n<2)
            return 1;
        int[] ar=new int[n+1];
        ar[0]=1;
        ar[1]=1;
        for (int i = 2; i <=n ; i++) {
            ar[i]=ar[i-1]+ar[i-2];
        }
        return ar[n];
    }
}
