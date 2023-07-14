package DP;

public class Unique_Paths {
    public int uniquePaths(int m, int n) {
     double count=1;
       int upper=m+n-2;
       int lower=m-1;
        for (int i = 1; i <=lower ; i++) {
            count=count*(upper-lower+i)/i;
        }
     return (int)count;
    }

}
