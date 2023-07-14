package Array;

import java.util.Arrays;

public class Swapping_pairs_make_sum_equal {
    long findSwapValues(long A[], int n, long  B[], int m)
    {
        // Your code goes here
        long sum1=0,sum2=0;
        for(long a:A){
            sum1+=a;
        }
        for(long b:B){
            sum2+=b;
        }
        if(sum1==sum2)
            return 1;
        long target=(sum1-sum2)/2;
        int i=0,j=0;
//        boolean f=false;
        Arrays.sort(A);
        Arrays.sort(B);
        while (i<n && j<m){
            if(A[i]-B[j]==target)
                return 1;
            else if(A[i]-B[j]<target)
                i++;
            else
                j++;
        }
        return 0;
    }
}
