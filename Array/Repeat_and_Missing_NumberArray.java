package Array;

import java.util.*;

public class Repeat_and_Missing_NumberArray {
    int[] findTwoElement(int arr[], int n) {
        // code here

       int [] res=new int[2];
       boolean present[]=new boolean[n+1];
       int a=0,b = 0;
       Arrays.fill(present,false);
        for (int i = 0; i < n; i++) {
            if(present[arr[i]])
                a=arr[i];
            present[arr[i]]=true;
        }
        for (int i = 1; i <=n ; i++) {
            if(!present[i])
            {
                b=i;
                break;
            }
        }
        res[0]=a;
        res[1]=b;
        return res;
    }
}