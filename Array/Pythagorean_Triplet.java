package Array;

import java.util.Arrays;

public class Pythagorean_Triplet {
    boolean checkTriplet(int[] arr, int n) {
        // code here
        for (int i = 0; i < n; i++) {
            arr[i]=arr[i]*arr[i];
        }
        Arrays.sort(arr);

        for (int i = 1; i <n ; i++) {
            int c=n-i;
            int a=0;
            int b=n-1-i;
            while (a<b){
                if(arr[a]+arr[b]==arr[c])
                    return true;
                else if(arr[a]+arr[b]<arr[c])
                    a++;
                else if(arr[a]+arr[b]>arr[c])
                    b--;
            }
        }
        return false;
    }
}
