package Greedy_Algo;

import java.util.ArrayList;
import java.util.Arrays;

public class Minimum_Platforms {
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int plat_no=1, res=1;
        int i=1,j=0;
        while (i<n && j<n){
            if(arr[i]<=dep[j]){
                plat_no++;
                i++;
            }
            else if(arr[i]>dep[j]){
                plat_no--;
                j++;
            }
            if(plat_no>res)
                res =plat_no;
        }
        return res;
    }
}
