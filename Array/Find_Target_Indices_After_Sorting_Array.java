package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_Target_Indices_After_Sorting_Array {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> arrayList=new ArrayList<>();
        int indx=bs(nums,target);
        if(indx==-1)
            return arrayList;
        int i=indx;
        int j=indx;
        while (-1<i && nums[i]==target){
            if(nums[i]==target){
                arrayList.add(0,i);
            }
            i--;
        }
        while (j<nums.length && nums[j]==target){
            if(nums[j]==target){
                arrayList.add(1,j);
            }
            j++;
        }
        return arrayList;
    }
    private static int bs(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int res = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] == target) {
                res = m;
                break;
            }
            if (nums[m] < target) {
                l = m + 1;
            } else
                r = m - 1;
        }
        return res;
    }
}
