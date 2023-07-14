package Array;

import java.util.ArrayList;

public class Rearrange_Array_Elements_by_Sign {
    public int[] rearrangeArray(int[] nums) {
        int[] res= new int[nums.length];
        //j is for even indices and k is for odd indices
        //Iterate through the array and if the element is even fill it in even index and increase index by 2
        //else fill in odd index and increase index by 2
        int j=0,k=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                res[j]=nums[i];
                j+=2;
            }else{
                res[k]=nums[i];
                k+=2;
            }
        }
        return res;
    }
}