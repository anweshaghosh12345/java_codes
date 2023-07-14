package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Find_First_and_Last_Position_of_Element {
    public int[] searchRange(int[] nums, int target) {

        int[] arr=new int[2];
        arr[0]=-1;
        arr[1]=-1;
        int indx=bs(nums,target);
        if(indx==-1){
            return arr;
        }

        int pos1=indx;
        int pos2=indx;

        while (-1<pos1 && nums[pos1]==target){
            if(nums[pos1]==target){
                arr[0]=pos1;
            }
            pos1--;
        }
        while (pos2<nums.length && nums[pos2] ==target){
            if(nums[pos2]==target){
                arr[1]=pos2;
            }
            pos2++;
        }

        return arr;

    }
    private static int bs(int[] nums, int target){
        int l=0,r=nums.length-1;
        int res=-1;
        while (l<=r){
            int m=l+(r-l)/2;
            if(nums[m]==target){
                res=m;
                break;
            }
            if(nums[m]<target){
                l=m+1;
            }
            else
                r=m-1;
        }
        return res;
    }
}
