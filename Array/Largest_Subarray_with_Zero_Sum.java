package Array;

import java.util.*;

public class Largest_Subarray_with_Zero_Sum {
    int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
            if(sum==0)
                max=i+1;
            else {
                if(map.get(sum)!=null){
                    max=Math.max(max,i-map.get(sum));
                }else {
                    map.put(sum,i);
                }
            }
        }
        return max;
    }
}
