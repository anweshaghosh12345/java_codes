package Array;

import java.util.ArrayList;
import java.util.Collections;

public class Leaders_in_array {
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> ar=new ArrayList<>();
//        int[] maxx=new int[n];
//        maxx=arr[n-1];
        ar.add(arr[n-1]);
        int max=arr[n-1];
        for (int i =n-2 ; i >=0 ; i--) {

            if(max<=arr[i]){
                ar.add(arr[i]);
                max=arr[i];
            }

        }
        Collections.reverse(ar);
        return ar;


    }
}
