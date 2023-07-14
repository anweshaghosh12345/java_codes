package Array;

public class Search_in_Rotated_Sorted_Array_II {
    public boolean search(int[] nums, int target) {
        int strt=0,end=nums.length;
        while (strt<end){
            int  mid=strt+(end-strt)/2;
            if(nums[mid]==target)
                return true;
            if(nums[mid]>nums[strt]){
                if(nums[mid]>target && nums[strt]<=target)
                    end=mid-1;
                else {
                    strt=mid+1;
                }
            }
            else if(nums[mid]<nums[strt]){
                if(nums[mid]<target && nums[strt]>target)
                    strt=mid+1;
                else {
                    end=mid-1;
                }
            }
            else {
                strt++;
            }
        }
        return false;
    }
}
